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
public class ListaCircular<T> extends Lista<T> {
    private boolean isEmpty;
    public ListaCircular(){
        isEmpty = true;
    }
    @Override
    public void Agregar(Object valor) {
        NodoCircular<T> _newNodo = new NodoCircular(valor);

       
        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
            _newNodo.setCabeza(true);
            
        }
        else{
            NodoActual.setSiguiente(_newNodo);
            _newNodo.setAnterior(NodoActual);
            NodoActual = _newNodo;
            

        }
    }

    @Override
    public Nodo Eliminar(Object valor) {
        Nodo temp = new NodoCircular();
        Nodo fin = new NodoCircular();
        temp = Cabeza;
        if (temp.compareTo(valor)==0){
            ((NodoCircular)temp.getSiguiente()).setCabeza(true);
            ((NodoCircular)temp.getSiguiente()).setAnterior(((NodoCircular)temp).getAnterior());
             return temp;
        }
        return null;
    }

    @Override
    public void push(T valor) {
        NodoCircular<T> _newNodo = new NodoCircular(valor);
        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
            _newNodo.setCabeza(true);
            isEmpty = false;
        }
        else{
            NodoActual.setSiguiente(_newNodo);
            _newNodo.setAnterior(NodoActual);
            NodoActual = _newNodo;
            

        }    
    }

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
    
    
}
