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
        int cantClintes = teclado.nextInt();
        cola1.add(20);
        cola1.add(30);
        cola1.add(40);
        System.out.println("la cola es: " + cola1.poll() + cola1.poll() + cola1.poll() + cola1.poll() + cola1.poll());
    }
    
}
