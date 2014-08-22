/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Oscar
 */
public class NodoFactory<T> {
    
    
    public Nodo<T> getClass(String tipoNodo){
        switch(tipoNodo){
            case "Simple":
                return new NodoSimple<T>();
            case "Doble":
                return new NodoDoble<T>();
            case "Circular":
                return new NodoCircular<T>();
        }
        return null;
    }
    
}
