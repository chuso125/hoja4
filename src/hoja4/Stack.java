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
        for(int i =tamanoArreglo-1;i>=0;i--){
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
    
    public String evaluar(Stack stack){
        String pop,prueba1,prueba2;
        int num1,num2,cont;
        do{
           prueba1 = (String)stack.pop();
           prueba2 = (String)stack.pop();
           if(prueba2!=null){
                stack.push(prueba2);
                stack.push(prueba1);

                num1 = Integer.parseInt((String) stack.pop());

                num2 = Integer.parseInt((String)stack.pop());

                pop = (String)stack.pop();

                switch (pop){
                    case "+":{
                        num1 = num1+num2;
                        stack.push(Integer.toString(num1));
                        break;
                    }
                    case "-":{
                        num1 = num1-num2;
                        stack.push(Integer.toString(num1));
                        break;
                    }
                    case "*":{
                        num1 = num1*num2;
                        stack.push(Integer.toString(num1));
                        break;
                    }
                    case "/":{
                        if(num2!=0){
                             num1 = num1+num2;
                             stack.push(Integer.toString(num1));
                        }
                        break;
                    }
                }
           }
        }while(prueba2!=null);
        return prueba1;
    }
    
}
