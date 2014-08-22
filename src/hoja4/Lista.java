/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Oscar
 */
public abstract class Lista<T> extends Stack<T>{
    
    protected Nodo<T> Cabeza;
    protected Nodo<T> NodoActual;
    
  
    
    public void Lista(){
        NodoActual = Cabeza;

    }

    abstract public void push(T valor);
    abstract public T pop();
    abstract public void Agregar(T valor);
    abstract public Nodo Eliminar(T valor);
    public String toString(){
        Nodo Inicio = Cabeza;
        String strLista = "";
        StringBuilder _sb = new    StringBuilder();

        if (Inicio != null){        
            while (Inicio.getSiguiente() != null)
            {
                _sb.append(Inicio.getValor());
                _sb.append("  -> ");            
                Inicio = Inicio.getSiguiente();
            }
        }

        _sb.append(" null");

        return _sb.toString();
    }


}
