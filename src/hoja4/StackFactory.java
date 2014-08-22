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
public class StackFactory<T> {
    public Stack<T> getClass(String tipo){
        switch(tipo){
            case "vector":
                    return new StackVector<T>();
            case "arrayList":
                    return new StackArrayList<T>();
        }
        return null;
    }
}
