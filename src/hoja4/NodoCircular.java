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
public class NodoCircular<T> extends NodoDoble<T> {
    protected Boolean _esCabeza;
    
    NodoCircular(){
        _valor = null;
        _siguiente = null;
        _anterior = null;
        _esCabeza = false;
    }
    public NodoCircular(T valor){
        _valor = valor;
        _siguiente = null;
        _anterior = null;
        _esCabeza = false;
    }
    
    
    public NodoCircular(T valor, Nodo siguiente){
        _valor = valor;
        _siguiente = siguiente;
        _esCabeza = false;
    }
    public NodoCircular(T valor, Nodo siguiente, Nodo anterior){
        _valor = valor;
        _siguiente = siguiente;
        _anterior = anterior;
        _esCabeza = false;
    }
    
    public NodoCircular(T valor, Nodo siguiente, Nodo anterior, boolean esCabeza){
        _valor = valor;
        _siguiente = siguiente;
        _anterior = anterior;
        _esCabeza = esCabeza;
    }
    
    public void setCabeza(boolean esCabeza) {
        _esCabeza  = esCabeza;
    }
    
    public boolean esCabeza() {
        return _esCabeza;
    }
}
