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
public class NodoDoble<T> extends NodoSimple {
    protected Nodo _anterior;
    
    
    NodoDoble(){
        _valor = null;
        _siguiente = null;
        _anterior = null;
    }
    public NodoDoble(T valor){
        _valor = valor;
        _siguiente = null;
        _anterior = null;
    }
    
    
    public NodoDoble(T valor, Nodo siguiente){
        _valor = valor;
        _siguiente = siguiente;
    }
    public NodoDoble(T valor, Nodo siguiente, Nodo anterior){
        _valor = valor;
        _siguiente = siguiente;
        _anterior = anterior;
    }
    
    public void setAnterior(Nodo anterior) {
        _siguiente = anterior;
    }
    
    public Nodo getAnterior() {
        return _anterior;
    }
    
}
