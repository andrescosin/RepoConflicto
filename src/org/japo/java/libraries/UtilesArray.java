/*
 * Copyright 2023 theCOUSIN.
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

import static org.japo.java.libraries.UtilesAleatorio.RND;

/**
 *
 * @author theCOUSIN
 */
public class UtilesArray {

    // Ordenación - Burbuja
    public static final void ordenarBurbuja(int[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - i - 1; j++) {
                // Actual > Siguiente
                if (lista[j] > lista[j + 1]) {
                    // Intercambiar
                    int aux = lista[j + 1];
                    lista[j + 1] = lista[j];
                    lista[j] = aux;
                }
            }
        }
    }

    // Ordenación - Inserción
    public static final void ordenarInsercion(int[] lista) {
        for (int i = 1; i <= lista.length - 1; i++) {
            // Elemento Actual
            int aux = lista[i];

            // Hacer Hueco a Izquierda
            int j = i - 1;
            while (j >= 0 && aux < lista[j]) {
                lista[j + 1] = lista[j];
                j = j - 1;
            }

            // Insertar Elemento Actual en Hueco
            lista[j + 1] = aux;
        }
    }

    // Ordenación - Selección
    public static final void ordenarSeleccion(int[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            // Posición de Mínimo
            int pos = i;

            // Seleccionar Posición de Minimo a Derecha
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[pos]) {
                    pos = j;
                }
            }

            // Intercambiar
            int aux = lista[i];
            lista[i] = lista[pos];
            lista[pos] = aux;
        }
    }

    // Desordenar Lista - caracter
    public static final char[] desordenar(char[] lista) {
        for (int i = 0; i < lista.length; i++) {
            int posRnd = RND.nextInt(lista.length);
            
            char aux = lista[posRnd];
            lista[posRnd] = lista[i];
            lista[i] = aux;
        }
        
        return lista;
    }

    // Desordenar Lista - entero
    public static final int[] desordenar(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            int posRnd = RND.nextInt(lista.length);
            
            int aux = lista[posRnd];
            lista[posRnd] = lista[i];
            lista[i] = aux;
        }
        
        return lista;
    }

    // Desordenar - real
    public static final double[] desordenar(double[] lista) {
        for (int i = 0; i < lista.length; i++) {
            int posRnd = RND.nextInt(lista.length);
            
            double aux = lista[posRnd];
            lista[posRnd] = lista[i];
            lista[i] = aux;
        }
        
        return lista;
    }

    // Desordenar - boolean
    public static final boolean[] desordenar(boolean[] lista) {
        for (int i = 0; i < lista.length; i++) {
            int posRnd = RND.nextInt(lista.length);
            
            boolean aux = lista[posRnd];
            lista[posRnd] = lista[i];
            lista[i] = aux;
        }
        
        return lista;
    }

    // Desordenar - String
    public static final String[] desordenar(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            int posRnd = RND.nextInt(lista.length);
            
            String aux = lista[posRnd];
            lista[posRnd] = lista[i];
            lista[i] = aux;
        }
        
        return lista;
    }

    //igualar a 0 array int[]
    public static final int[] igualarCero(int[] votos) {
        for (int i = 0; i < votos.length; i++) {
            votos[i] = 0;
        }
        
        return votos;
    }

    //Pasar secuencia String -> Array[] ,con un separador determinado en la secuencia
    public static final String[] convertir(String secuencia, String separador) {
        return secuencia.split(separador);
    }

//    //Pasar de un Array[] -> secuencia String
//    public static final String convertir(String[] cadena, String separador) {
//        return convertir(cadena, separador);
//    }
    //Obtener el valor máximo de int[]
    public static final int obtenerMax(int[] lista) {
        
        int posicion = 0;
        
        for (int actual = 1; actual < lista.length; actual++) {
            posicion = lista[actual] > lista[posicion] ? actual : posicion;
        }
        
        return posicion;
    }

    //Obtener el valor máximo de double[]
    public static final int obtenerMax(double[] lista) {
        
        int posicion = 0;
        
        for (int actual = 1; actual < lista.length; actual++) {
            posicion = lista[actual] > lista[posicion] ? actual : posicion;
        }
        
        return posicion;
    }

    //String contiene char
    public static final boolean contiene(String lista, char car) {
        
        return lista.contains(car + "");
    }
    
}
