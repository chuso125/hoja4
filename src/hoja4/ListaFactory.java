/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

/**
 *
 * @author manuelgomez
 */
public class ListaFactory<T> {
        
    public  Lista<T>getClass(String tipoNodo){
        switch(tipoNodo){
            case "Simple":
                return new ListaSimple<T>();
            case "Doble":
                return new ListaDoble<T>();
            case "Circular":
                return new ListaCircular<T>();
        }
        return null;
    }
}
