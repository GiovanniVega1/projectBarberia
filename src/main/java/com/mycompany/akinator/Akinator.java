
package com.mycompany.akinator;

import java.util.Scanner;


public class Akinator {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);    
        System.out.println("Hello World!");
        
        Nodo n = new Nodo();
        Arbol arr = new Arbol(n);
        int op = 1;
        
        do{
            arr.setNodo(arr.buscar(arr.getNodo()));
            arr.buscar(arr.getNodo());
            
            System.out.print("continuar? 0-no 1-si: \n");
            op = entrada.nextInt();
        }while(op != 0);
    }
}
