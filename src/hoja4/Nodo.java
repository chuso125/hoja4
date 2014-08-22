/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

/**
 *
 * @author Oscar
 * @param <T>
 */
public  abstract class Nodo<T> implements Comparable {
    protected T _valor;
    protected Nodo _siguiente;
    
    public Nodo(){
        _valor = null;
        _siguiente = null;
    }    

    public Nodo(T valor){
        _valor = valor;
        _siguiente = null;
    }

    public  Nodo(T valor, Nodo siguiente){
        _valor =valor;
        _siguiente = siguiente;
    } 

    abstract public void setValor(T valor);


    abstract public void setSiguiente(Nodo siguiente);

    abstract public T getValor();


    abstract public Nodo getSiguiente();

    abstract public String toString ();

    abstract public boolean  Equals(Object other);

    @Override
    abstract public int compareTo(Object other);

    void setAnterior(Nodo anterior) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


