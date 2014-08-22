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
        puntero = getTamanoArreglo()-1;
        vector = new Vector();
        vector.setSize(getTamanoArreglo());
    }
    @Override 
    public void push(T valor){
           vector.addElement(valor); 
           System.out.println("tamano "+vector.size());
    }

    @Override
    public T pop() {
        if (vector.size()>0){
            T e;
            e=(T) vector.get(vector.size()-1);
            vector.removeElementAt(vector.size()-1);
            //vector.setSize(vector.size()-1);
            System.out.println("tamano "+vector.size());
            return e;   
        }
        else
            return null;
   }
}
