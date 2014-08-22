/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

import hoja4.Lista;

/**
 *
 * @author Oscar
 */
public class ListaSimple<T> extends Lista<T>{
    private boolean isEmpty;
    public ListaSimple(){
        isEmpty=true;
    }
    @Override
    public void Agregar(Object valor) {
        NodoSimple<T> _newNodo = new NodoSimple(valor);
        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
        }
        else{
            NodoActual.setSiguiente(_newNodo);
            NodoActual = _newNodo;
        }  
    }
    
    @Override
    public Nodo Eliminar(Object valor){
        Nodo temp = new NodoSimple();
        Nodo fin = new NodoSimple();
        temp = Cabeza;
        if (temp.compareTo(valor)==0){
            Cabeza=Cabeza.getSiguiente();
             return temp;
        }
        while(temp.getSiguiente().compareTo(valor)!=0)
            temp = temp._siguiente;
        fin = temp.getSiguiente();
        temp.setSiguiente(temp._siguiente.getSiguiente());
        return fin; 
    }    

    @Override
    public void push(T valor) {
        NodoSimple<T> _newNodo = new NodoSimple(valor);
        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
            isEmpty = false;
        }
        else{
            NodoActual.setSiguiente(_newNodo);
            NodoActual = _newNodo;
        } 
    }

    @Override
    public T pop() {
        NodoSimple<T> temp = new NodoSimple();
        temp = (NodoSimple<T>) Cabeza;
        T temp2;
        if(!isEmpty){
            if(temp.getSiguiente()==null){
                Cabeza = null;
                isEmpty = true;
                return temp.getValor();
            }
            else{
                while(temp.getSiguiente().getSiguiente()!=null)
                    temp = (NodoSimple<T>) temp.getSiguiente();
                NodoActual = temp;
                temp2 = (T) (temp.getSiguiente().getValor());
                NodoActual.setSiguiente(null);
                return temp2;
            }
        }
        else
            return null;
    }
}
