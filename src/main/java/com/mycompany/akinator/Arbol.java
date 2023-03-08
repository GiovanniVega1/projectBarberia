
package com.mycompany.akinator;
import java.lang.String;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
    
    public String agregar_Personaje_Pregunta(int tipo){
        String personaje = "";
        if(tipo == 1){
            System.out.print("que personaje estas pensado?");
        }else{
            System.out.print("que de diferente tiene?");
        }
        personaje = entrada.nextLine();
        return personaje;
    } 
    
    public void /*Nodo*/ buscar (Nodo n){
        int op;
        if(n.getNodo_dr() == null || n.getNodo_iz() == null){
            System.out.print("tu personaje es: " + n.getPersonaje() + " ?");
            op = entrada.nextInt();
            if(op == 0){
                AgregarNodo(n);
            }else{
                JOptionPane.showMessageDialog(null, "Ahuevo");
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
    }
}