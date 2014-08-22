/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

import hoja4.Nodo;
import hoja4.Lista;

/**
 *
 * @author Oscar
 */
public class ListaDoble<T> extends Lista<T>{
    private boolean isEmpty;

    public ListaDoble() {
        NodoActual = Cabeza;
        isEmpty = true;
    }

    @Override
    public void Agregar(Object valor) {
        
        NodoDoble<T> _newNodo = new NodoDoble(valor);

        

        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
            
        }
        else{
            NodoActual.setSiguiente(_newNodo);
            _newNodo.setAnterior(NodoActual);
            NodoActual = _newNodo;

        }
    }    

    @Override
    public void push(T valor) {  
        NodoDoble<T> _newNodo = new NodoDoble(valor);
        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
     
        }
        else{
            NodoActual.setSiguiente(_newNodo);
            _newNodo.setAnterior(NodoActual);
            NodoActual = _newNodo;

        }}

    @Override
    public T pop() {
        NodoCircular<T> temp;
        if(!isEmpty){
            if(NodoActual == Cabeza){
                temp = (NodoCircular<T>) NodoActual;
                Cabeza = null;
                isEmpty = true;
                return (T) temp.getValor();
            }
            else{
                temp = (NodoCircular<T>) NodoActual;
                temp.getAnterior().setSiguiente(temp.getSiguiente());
                temp.getSiguiente().setAnterior(temp.getAnterior());
                NodoActual = temp.getAnterior();
                return (T) temp.getValor();
            }
        }
        else
            return null;
    }

    @Override
    public Nodo Eliminar(T valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
