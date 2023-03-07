package com.mycompany.akinator;

public class Nodo {
    
    private String personaje;
    private Nodo nodo_derecha = null;
    private Nodo nodo_izquierda = null;
    private int altura;
    
    public Nodo(){}
    
    public Nodo(String personaje){
        this.nodo_izquierda = null;
        this.nodo_derecha = null;
        setPersonaje(personaje);
    }
     
    /*
    void setNodoes_null(){
        this.nodo_derecha = null;
        this.nodo_izquierda = null;
    }
    */
    
    void setNodo_dr(Nodo nodo_dr){
        this.nodo_derecha = nodo_dr;
    }
    
    void setNodo_iz(Nodo nodo_iz){
        this.nodo_izquierda = nodo_iz;
    }
    
    void setPersonaje(String personaje){
        this.personaje = personaje;
    }
    
    Nodo getNodo_dr(){ return nodo_derecha;}
    Nodo getNodo_iz(){ return nodo_izquierda;}
    String getPersonaje(){ return personaje;}
    
    /*
    public void insertar(Nodo nodo_dr, Nodo nodo_iz, String personaje){
        nodo_dr = null;
        nodo_iz = null;
    }
    */
}
