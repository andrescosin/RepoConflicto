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

import java.util.Random;

/**
 *
 * @author Andrés Cosín Zamarreño
 */
public final class UtilesAleatorio {
    
    public static final Random RND = new Random();
    
    public static final boolean sacarBooleanAleatorio(String msg) {
        boolean valor = RND.nextBoolean();
        return valor;
    }
    
    public static final int sacarEnteroAleatorio(String msg) {
        int valor = RND.nextInt();
        return valor;
    }
    
    public static final int sacarEnteroAleatorioRango(String msg, int min, int max) {
        int valor = RND.nextInt(max - min + 1) + min;
        return valor;
    }
    
    public static final double sacarRealAleatorio(String msg) {
        double valor = RND.nextDouble();
        return valor;
    }
    
     public static final double sacarRealAleatorioRango(String msg, double min, double max) {
        double valor = RND.nextDouble(max - min) + min;
        return valor;
    }
     
     public static final char sacarCaracterAleatorioRango(String msg, char min, char max) {
        char valor = (char)(RND.nextInt(max - min + 1) + min);
        return valor;
    }
}
