/*
 * Copyright 2022 Andrés Cosín Zamarreño - cousin11-1996@hotmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Andrés Cosín Zamarreño
 */
public class UtilesFecha {

    public static final String mostrarFechaEnTexto(String msg) {
        Date d = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        return sdf1.format(d);
    }

    public static final String mostrarHoraEnTexto(String msg) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        return sdf.format(d);
    }

    public static final void mostrarFechaElegida(int dia, int mes, int ano) {
        GregorianCalendar cal = new GregorianCalendar(ano, mes, dia);
        dia = cal.get(Calendar.DAY_OF_MONTH);
        mes = cal.get(Calendar.MONTH) + 1;
        ano = cal.get(Calendar.YEAR);
        System.out.printf("Fecha.....: %02d/%02d/%02d%n", dia, mes, ano);
    }
    
    //Mostrar el dia de la semana
    public static final int calcularDiaSemana(int dia) {
        GregorianCalendar cal = new GregorianCalendar();
        
        dia = cal.get(Calendar.DAY_OF_WEEK);
        
        return dia;
    }

    public static final void mostrarFecha(String msg) {
        Date d = new Date();
        System.out.printf("Tiempo .........: %1$td/%1$tm/%1$ty%n", d);
    }

    public static final void mostrarHora(String msg) {
        Date d = new Date();
        System.out.printf("Hora ...........: %1$tH:%1$tM:%1$tS%n", d);
    }

    public static final boolean validarBisiesto(int ano) {
        boolean bisOk = ano % 400 == 0 || ano % 100 != 0 && ano % 4 == 0;
        return bisOk;
    }

    public static final boolean validarDia(int dia, int mes, int ano) {
        boolean diaOk;

        if (mes < 1 || mes > 12) {
            diaOk = false;
        } else {
            diaOk = dia >= 1 && dia <= calcularDiasMes(mes, ano);
        }

        return diaOk;
    }

    public static final int calcularDiasMes(int mes, int ano) {
        // Dias Calculados
        int dias;

        // Discriminación
        if (mes == 1 || mes == 3 || mes == 5
                || mes == 7 || mes == 8 || mes == 10
                || mes == 12) {
            dias = 31;
        } else if (mes == 4 || mes == 6
                || mes == 9 || mes == 11) {
            dias = 30;
        } else if (mes == 2 && validarBisiesto(ano)) {
            dias = 29;
        } else if (mes == 2) {
            dias = 28;
        } else {
            dias = 0;
        }

        // Retorno
        return dias;
    }

    public static final int calcularDiasEntreMismoMes(int diaIni, int diaFin, int mes, int ano) {

        int dias;

        if (!validarDia(diaIni, mes, ano)) {
            dias = 0;

        } else if (!validarDia(diaFin, mes, ano)) {
            dias = 0;
        } else if (diaFin <= diaIni) {
            dias = 0;
        } else {
            dias = diaFin - diaIni;
        }

        return dias;
    }

    public static final int calcularDiasRestantesMes(int dia, int mes, int ano) {
        int dias;

        if (!validarDia(dia, mes, ano)) {
            dias = 0;
        } else if (calcularDiasMes(mes, ano) == 0) {                                  //lo mismo que -> (mes < 1 || mes > 12)
            dias = 0;
        } else {
            dias = calcularDiasMes(mes, ano) - 1;
        }

        return dias;
    }

    public static final int calcularDiasMesesAdyacentes(int diaIni, int diaFin, int mes, int ano) {
        int dias;

        if (!validarDia(diaIni, mes, ano)) {
            dias = 0;
        } else if (!validarDia(diaFin, mes, ano)) {
            dias = 0;
        } else if (mes < 1 || mes > 12) {
            dias = 0;
        } else {
            dias = calcularDiasRestantesMes(diaIni, mes, ano) + diaFin;
        }
        return dias;
    }

    public static final int calcularDiasEntreMesesCompletos(int mesIni, int mesFin, int ano) {
        int dias = 0;

        if (mesIni < 1 || mesIni > 12) {
            dias = 0;
        } else if (mesFin < 1 || mesFin > 12) {
            dias = 0;
        } else if (mesFin - mesIni < 1) {
            dias = 0;
        } else {
            for (int mes = mesIni; mes <= mesFin; mes++) {
                dias = dias + calcularDiasMes(mes, ano);
            }
        }

        return dias;
    }

    public static final int calcularDiasEntreMesesNoAdyacentes(int diaIni, int diaFin, int mesIni, int mesFin, int ano) {
        int dias = calcularDiasRestantesMes(diaIni, mesIni, ano);
        if (mesFin > mesIni + 1) {
            dias = dias + calcularDiasEntreMesesCompletos(mesIni + 1, mesFin - 1, ano);
        }
        dias = dias + diaFin;
        return dias;
    }

    public static final int calcularDiasRestantesAno(int dia, int mes, int ano) {
        int dias = calcularDiasEntreMesesNoAdyacentes(dia, 31, mes, 12, ano);
        return dias;
    }

    public static final int calcularDiasTranscurridosAno(int dia, int mes, int ano) {
        int dias = calcularDiasEntreMesesNoAdyacentes(1, dia, 1, mes, ano) + 1;
        return dias;
    }

    public static final int calcularDiasAnosAdyacentes(int diaIni, int diaFin, int mesIni, int mesFin, int ano) {
        int diasIni = calcularDiasRestantesAno(diaIni, mesIni, ano);
        int diasFin = calcularDiasTranscurridosAno(diaFin, mesFin, ano + 1);
        int totalDias = diasIni + diasFin;
        return totalDias;
    }
    
    public static final int calcularDiferenciaDiaAnosCompletos(int anoIni, int anoFin){
        int dias = 0;
        for (int ano = anoIni; ano <= ano; ano++) {
            if (ano % 400 == 0 || ano % 100 != 0 && ano % 4 == 0) {
                dias = dias + 366;
            } else {
                dias = dias + 365;
            }
        }
        return dias;
    }

    public static final int calcularDiasAnosNoAdyacentes(int diaIni, int diaFin, int mesIni, int mesFin, int anoIni, int anoFin) {
        int dias;
        
        if (anoIni == anoFin) {
            dias = calcularDiasAnosAdyacentes(diaIni, diaFin, mesIni, mesFin, anoFin);
        } else {
            int diasIni = calcularDiasRestantesAno(diaIni, mesIni, anoIni);
            int diasMed = calcularDiferenciaDiaAnosCompletos(anoIni + 1, anoFin - 1);
            int diasFin = calcularDiasTranscurridosAno(diaFin, mesFin, anoFin);
            
            dias = diasIni + diasMed + diasFin;
        }
        
        return dias;
    }
}
