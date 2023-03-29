/*
 * Copyright 2022 theCOUSIN.
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
public class UtilesDNI {

    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static final int DNI_MIN = 10000000;
    public static final int DNI_MAX = 99999999;

    public static final int calcular(int num) {
        int letraDNI = LETRAS.charAt(num % 23);
        return letraDNI;
    }

    public static final boolean validar(int num, char ctr) {
        boolean valido = calcular(num) == ctr;
        return valido;
    }

}
