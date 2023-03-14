package com.mycompany.projectbarberia;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {

    public static void main(String[] args) {
        Queue<Integer> cola1 = new LinkedList<Integer>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad e barberos");
        int cantBarberos = teclado.nextInt();
        System.out.println("ingrese la cantidad de clientes");
        int cantClientes = teclado.nextInt();
        for(int i=1; i <= cantClientes; i++){
            cola1.add(i);
        }
        for(int i=1; i <= cantClientes; i++){
            System.out.println("Cliente: " + cola1.poll());
        }
    }
    
}
