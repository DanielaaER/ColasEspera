/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasespera;

/**
 *
 * @author danie
 * @param <T>
 */

/* La clase nos permite la creacion (instanciacion) de 
objetos de tipo generico (T) para que asi nosotros podamos
crear nodos de ADT*/
public class NodoG<T> {

    private T dato;
    private NodoG<T> siguiente;

    NodoG(T d) {
        this(d, null);
    }

    NodoG(T d, NodoG<T> nodo) {
        dato = d;
        siguiente = nodo;
    }

    public void estableceDato(T d) {
        dato = d;
    }

    public T obtenDato() {
        return dato;
    }

    public void estableceSiguiente(NodoG<T> n) {
        siguiente = n;
    }

    NodoG<T> obtenSiguiente() {
        return siguiente;
    }

}
