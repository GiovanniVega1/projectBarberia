package com.mycompany.projectbarberia;

import java.util.LinkedList;
import java.util.Queue;

public class Barber {
    public Queue ClienteBarbero(int cantClientes, int cantBarberos){
         Queue<Integer> colaCli = new LinkedList<Integer>();
        for(int i=1; i <= cantClientes; i++){
            colaCli.add(i);
        }
        return colaCli;
    }
}
