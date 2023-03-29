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

/**
 *
 * @author Andrés Cosín Zamarreño
 */
public final class UtilesOperaciones {

    public static final int sumar() {
        return 2 + 5;
    }

    public static final int sumar(int n1, int n2) {
        return n1 + n2;
    }
    
    public static int calcularCuadrado(int n) {
        int cuadrado = n * n;
        return cuadrado;
    }
    
    public static int calcularElevado(int numero, int exponente) {
        
        int resultado = 1;
        if(numero > 0 && exponente == 0) {
            return resultado;
        } else if (numero == 0 && exponente >= 1) {
            return 0;
        } else {
            for(int i = 1; i <= exponente; i++) {
                resultado = resultado * numero;
            }
        }
        
        
        return resultado;
    }
}
