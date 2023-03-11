
package com.mycompany.akinator;
import java.lang.String;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arbol {
    
    Scanner entrada = new Scanner(System.in);  
    private Nodo nodo = null;
    
    public Arbol(){}
    public Arbol(Nodo n){
    }
    
    public void setNodo(Nodo n){
        this.nodo = n;
    }
    
    public Nodo getNodo(){
        return nodo;
    }
    
    public Nodo AgregarNodo(Nodo raiz){
        if(raiz == null){
            raiz = new Nodo(agregar_Personaje_Pregunta(1));
        }else{
            raiz.setNodo_iz(new Nodo(raiz.getPersonaje()));
            raiz.setPersonaje(agregar_Personaje_Pregunta(0));
            raiz.setNodo_dr(new Nodo(agregar_Personaje_Pregunta(1)));
        }
        return raiz;
    }
    
    public String agregar_Personaje_Pregunta(int tipo){
        entrada.nextLine();
        String personaje = "";
        if(tipo == 1){
            System.out.print("que personaje estas pensado? \n");
        }else{
            System.out.print("que de diferente tiene? \n");
        }
        personaje = entrada.next();
        return personaje;
    } 
    
    public Nodo buscar (Nodo n){
        int op;
        entrada.nextLine();
        if(n != null){
            if(n.getNodo_dr() == null || n.getNodo_iz() == null){
                System.out.print("tu personaje es: " + n.getPersonaje() + " ?");
                op = entrada.nextInt();
                if(op == 0){
                    n = AgregarNodo(n);
                }else{
                    System.out.print("Ahuevo perro: \n");
                }
            }else{
                System.out.print("Es: " + n.getPersonaje() + " ?");
                op = entrada.nextInt();
                if(op == 0){
                    buscar(n.getNodo_iz());
                }else{
                    buscar(n.getNodo_dr());
                }
            }
        }else{
            n = AgregarNodo(n);
            System.out.print("Agregado: " + n.getPersonaje() + "\n");
        }
        return n;
    }
    
    public void imprimir(Nodo n){
        if(n.getNodo_iz() != null){
            imprimir(n.getNodo_iz());
        }else if(n.getNodo_dr() != null){
            imprimir(n.getNodo_dr());
        }else{
            System.out.print("Acabo: " + n.getPersonaje() + "\n");
        }
    }
}