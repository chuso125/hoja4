/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

import java.util.Scanner;

/**
 *
 * @author manuelgomez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op1,op2,resultado;
        StackFactory sFactory = new StackFactory();
        ListaFactory lFactory = new ListaFactory();
        Stack stack;
        String expresion;
        Lectura postfix = new Lectura();
        expresion = postfix.leer();
        Scanner ingreso  = new Scanner(System.in);
        System.out.println("Elija su opcion de stack: ");
        System.out.println("1. Vector");
        System.out.println("2. Lista");
        System.out.println("3. ArrayList");                
        System.out.println("Número de opción: ");
        op1 = ingreso.nextInt();
        
        switch(op1){
            case 1:{
               stack = sFactory.getClass("vector");
               stack.insertar(expresion, stack);
               resultado = stack.evaluar(stack);
                System.out.println("Resultado: " + resultado);
                break;
            }
            case 2:{
                stack = sFactory.getClass("Lista");
                System.out.println("Elija su opcion de lista: ");
                System.out.println("1. Simple");
                System.out.println("2. Circular");
                System.out.println("3. Doble");                
                System.out.println("Número de opción: ");
                op2 = ingreso.nextInt();
                switch(op2){
                    case 1:{
                        stack = lFactory.getClass("Simple");
                        stack.insertar(expresion, stack);
                        resultado = stack.evaluar(stack);
                        System.out.println("Resultado: " + resultado);
                        break;
                    }
                    case 2:{
                        stack = lFactory.getClass("Circular");
                        stack.insertar(expresion, stack);
                        resultado = stack.evaluar(stack);
                        System.out.println("Resultado: " + resultado);
                        break;
                    }
                    case 3:{
                        stack = lFactory.getClass("Doble");
                        stack.insertar(expresion, stack);
                        resultado = stack.evaluar(stack);
                        System.out.println("Resultado: " + resultado);
                        break;
                    }
                    
                }
            }
        }
        
    }
    
}
