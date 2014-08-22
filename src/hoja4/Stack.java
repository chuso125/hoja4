/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

/**
 *
 * @author manuelgomez
 */
public abstract class Stack<T> implements iStack<T> {
    private int tamanoArreglo;
    
    abstract public void push(T nodo);
    abstract public T pop(); 
    
    public void Stack(int t){
        tamanoArreglo=t;
    }
        
    public int getTamanoArreglo(){
        return tamanoArreglo;
    }
    
    public void insertar(String expresion,Stack stack){
        tamanoArreglo =expresion.length();
        for(int i =tamanoArreglo;i>=0;i--){
            switch(expresion.charAt(i)){
                case '0': stack.push("0");break;
                case '1': stack.push("1");break;
                case '2': stack.push("2");break;
                case '3': stack.push("3");break;
                case '4': stack.push("4");break;
                case '5': stack.push("5");break;
                case '6': stack.push("6");break;
                case '7': stack.push("7");break;
                case '8': stack.push("8");break;
                case '9': stack.push("9");break; 
                case '+': stack.push("+");break;
                case '-': stack.push("-");break;
                case '*': stack.push("*");break;
                case '/': stack.push("/");break;            
            }
        }
    }
    
    public int evaluar(Stack stack){
        String pop;
        do{
           pop = (String) stack.pop();
           switch(pop){
               case "1","2":
           }
        }while(pop!=null);
    }
    
}
