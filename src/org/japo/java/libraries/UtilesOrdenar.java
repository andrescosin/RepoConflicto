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

/**
 *
 * @author theCOUSIN
 */
public class UtilesOrdenar {
    
    public static final void ordenarEnteros(int[] lista) {
        int n = lista.length;
        for (int i = 1; i <= n - 1; i++) {
            int aux = lista[i];
            int j = i - 1;
            while (j >= 0 && aux < lista[j]) {
                lista[j + 1] = lista[j];
                j = j - 1;
            }
            lista[j + 1] = aux;
        }
    }
    
    
    public static final void desordenarEnteros(int[] pass) {
        for (int i = 0; i < pass.length; i++) {
            int pos = UtilesAleatorio.sacarEnteroAleatorioRango("", 0, pass.length - 1);
            
            //intercambio
            int aux = pass[pos];
            pass[pos] = pass[i];
            pass[i] = aux;
        }
    }
    
}
