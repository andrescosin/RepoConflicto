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
public final class UtilesMensaje {

    public static final void saludar() {
        System.out.println("Hola Mundo Modular");
    }

    public static final void saludar(int n) {
        for (int i = 0; i < n; i++) {
            saludar();
        }
    }

    public static final void saludar(String msg) {
        System.out.println(msg);
    }
}
