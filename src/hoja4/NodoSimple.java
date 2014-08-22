/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

/**
 *
 * @author Oscar
 */
public class NodoSimple<T> extends Nodo<T> implements Comparable{
 
   
    NodoSimple(){
        _valor = null;
        _siguiente = null;
    }    

    public NodoSimple(T valor){
        _valor = valor;
        _siguiente = null;
    }
    
    
    public NodoSimple(T valor, Nodo siguiente){
        _valor = valor;
        _siguiente = siguiente;
    }


    @Override
    public void setValor(T valor) {
        this._valor = valor;
    }

    @Override
    public void setSiguiente(Nodo siguiente) {
        _siguiente = siguiente;
    }

    @Override
    public T getValor() {
        return _valor;
    }

    @Override
    public Nodo getSiguiente() {
        return _siguiente;
    }

    @Override
    public String toString() {
        return  _valor.toString() ;
    }

    @Override
    public boolean Equals(Object other) {
        return this._valor == ((Nodo)other).getValor();
    }

    @Override
    public int compareTo(Object other) {
        return ((Comparable) _valor).compareTo(other);
    }
}
