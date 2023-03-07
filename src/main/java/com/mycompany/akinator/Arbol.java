
package com.mycompany.akinator;
import java.lang.String;
import java.util.Scanner;

public class Arbol {
    
    Scanner entrada = new Scanner(System.in);    
    public Arbol(){}
    
    public void AgregarNodo(Nodo raiz){
        Nodo nuevo;
        
        if(raiz == null){
            raiz = new Nodo(agregar_Personaje_Pregunta(1));
        }else{
            raiz.setNodo_iz(raiz);
            raiz.setPersonaje(agregar_Personaje_Pregunta(2));
            nuevo = new Nodo(agregar_Personaje_Pregunta(1));
            raiz.setNodo_dr(nuevo);
        }
    }
    
    String agregar_Personaje_Pregunta(int tipo){
        String personaje = "";
        if(tipo == 1){
            System.out.print("que personaje estas pensado?");
        }else{
            System.out.print("que de diferente tiene?");
        }
        personaje = entrada.nextLine();
        return personaje;
    } 
}