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

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrés Cosín Zamarreño
 */
public final class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final int leerEntero(String msg) {
        int num = 0;
        boolean introOk = false;
        do {
            try {
                System.out.print(msg);
                num = SCN.nextInt();
                introOk = true;

            } catch (Exception e) {
                System.out.println("---");
                System.out.println("ERROR: Entrada incorrecta");
            } finally {
                System.out.println("---");
                SCN.nextLine();
            }
        } while (!introOk);
        return num;
    }

    public static final int leerEnteroRango(String msg, int min, int max) {
        int num;
        boolean rangoOk;
        do {
            num = leerEntero(msg);
            rangoOk = num >= min && num <= max;
            if (!rangoOk) {
                System.out.println("ERROR: Número fuera de rango");
                System.out.println("---");
            }

        } while (!rangoOk);
        return num;
    }

    public static final char leerCaracter(String msg) {
        char car = 0;
        boolean introOk = false;
        do {
            try {
                System.out.print(msg);
                car = SCN.nextLine().charAt(0);
                introOk = true;
                System.out.println("---");
            } catch (Exception e) {
                System.out.println("---");
                System.out.println("ERROR: Entrada incorrecta");
                System.out.println("---");

            }
        } while (!introOk);
        return car;
    }

    public static final char leerCaracterRango(String msg, char min, char max) {
        char car;
        boolean rangoOk;
        do {
            car = leerCaracter(msg);
            rangoOk = car >= min && car <= max;
            if (!rangoOk) {
                System.out.println("ERROR: Carácter fuera de rango");
                System.out.println("---");
            }

        } while (!rangoOk);
        return car;
    }
    
    public static final double leerReal(String msg) {
        double numRe = 0;
        boolean introOk = false;
        do {
            try {
                System.out.print(msg);
                numRe = SCN.nextDouble();
                introOk = true;
                System.out.println("---");
            } catch (Exception e) {
                System.out.println("---");
                System.out.println("ERROR: Entrada incorrecta");
                System.out.println("---");

            }
        } while (!introOk);
        return numRe;
    }
    
    public static final double leerRealRango(String msg, double min, double max) {
        double numRe;
        boolean rangoOk;
        do {
            numRe = leerReal(msg);
            rangoOk = numRe >= min && numRe <= max;
            if (!rangoOk) {
                System.out.println("ERROR: Número fuera de rango");
                System.out.println("---");
            }

        } while (!rangoOk);
        return numRe;
    }
    
    public static final String leerTexto(String msg) {
        String texto = "";
        boolean introOk = false;
        do {
            try {
                System.out.print(msg);
                texto = SCN.nextLine();
                introOk = true;
                System.out.println("---");
            } catch (Exception e) {
                System.out.println("---");
                System.out.println("ERROR: Entrada incorrecta");
                System.out.println("---");

            }
        } while (!introOk);
        return texto;
    }
    
    //como hacer un  string con minimo y máximo de palabras (rango)
    
    
    public static final boolean leerBoolean(String msg) {
        boolean ok = false;
        boolean introOk = false;
        do {
            try {
                System.out.print(msg);
                ok = SCN.nextBoolean();
                introOk = true;
                System.out.println("---");
            } catch (Exception e) {
                System.out.println("---");
                System.out.println("ERROR: Entrada incorrecta");
                System.out.println("---");

            }
        } while (!introOk);
        return ok;
    }
    
    
    
    
    //  ; UtilesFecha foto de clase switch metodo: obtenerNombreMes.
}
