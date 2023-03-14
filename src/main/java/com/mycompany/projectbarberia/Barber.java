package com.mycompany.projectbarberia;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Scanner;


public class Barber {
    public ArrayDeque<Integer> Barberos(int cantBarberos){
          ArrayDeque<Integer> Barb = new ArrayDeque<Integer>();
        for (int i = 1; i <= cantBarberos; i++) {
            Barb.add(i);
        }
        return Barb;
    }
    
    public int[] Cliente(int cantClientes){
          int[] clients = new int[cantClientes];
        for (int i = 0; i < cantClientes; i++) {
            clients[i] = i + 1;
        }
        return clients;
    }
}
