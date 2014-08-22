/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

import java.util.Vector;

/**
 *
 * @author manuelgomez
 */
public class StackVector<T> extends Stack<T> {
    private Vector vector;
    private int puntero;
    public StackVector(){
        puntero = 0;
        vector = new Vector(getTamanoArreglo());
    }
    @Override 
    public void push(T valor){
            puntero++;
            vector.set(puntero, valor);
        
    }

    @Override
    public T pop() {
       T dato;
       dato= (T)vector.get(puntero);
       puntero--;
       return dato;
   }
}
