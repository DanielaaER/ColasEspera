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
public class Cola<T> {

    protected NodoG<T> inicio;
    protected NodoG<T> fin;
    protected String nombre;

    public Cola() {
        this("Cola de espera");

    }

    public Cola(String n) {
        nombre = n;
        inicio = fin = null;
    }

    //Insertar datos en la cola de espera
    public void inserta(T elemento) {
        if (estaVacia()) { // Se verifica que la cola este vacia
            /*Si lo esta entonces creacmos un nuevo nodo que contiene
            a ELEMENTO y se hace que el incio y fin hagan referencia
            a el nuevo nodoo*/
            inicio = fin = new NodoG<T>(elemento);
        } else {
            /*Si no lo esta entonces se creara un nuevo nodoo y se
            agregara al final de la Cola, y se va a establecer que fin
            haga referencia a el nuevo nodo*/
            fin.estableceSiguiente(new NodoG<T>(elemento));
            fin = fin.obtenSiguiente();
        }
    }

    //Metodo de eliminacion de datos de la cola de espera
    public T elimina() throws ExcepcionEDVacia {
        if (estaVacia()) { //Se verifica si la cola esta vacia
            /* Si esta vacia entonces arrojara una Excpeciion de
            que la cola se encuentra vacia*/
            throw new ExcepcionEDVacia(nombre);
        }
        /*Si la cola tiene elementos entonces prosegira con la ejecucion 
        del codigo*/
        
            /*Hay que recordar que la cola es de tipo FIFO, por lo cual
        el primer elemento en entrar sera el primero en ser despachado
        Por ello a elemento le asignaremos el valor de el dato que se 
        encuentra en nuestra variable inicio
        */
            T elemento = inicio.obtenDato();

            //actualiza referencias para inicio y fiin
            if (inicio == fin) { //Comprobara si inicio y fin tienen un valor null
                /*En caso de que nuestro inicio y fin sea igual
                entonces procedemos a dejar vacia la cola al
                asignarle valores nulos*/
                inicio = fin = null; 
            } else {
                /*En caso de que nuestros datos de inicio y fin sean distintos
                entonces a nuestra variable inicio se le asiganara el valor
                de el siguiente datoo en la Cola*/
                inicio = inicio.obtenSiguiente();
            }
            
            //Retornamos el elemento que eliminamos de la Cola
            return elemento;
        
    }

    //Metodo de verificacion de espera esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }

    //Metodo de impresion de los elementos almacenados en la cola de espera
    public void imprime() {
        if (estaVacia()) {
            System.out.println("Vacia: " + nombre);  
        } else {
            
            System.out.print("La " + nombre + " es :");
        }
        /*
        Asignaa a el nodo actual el valor de nuestro
        nodo de iniciooooooo
        */
        NodoG<T> actual = inicio;

        while (actual != null) {  //Comprueba que el nodo tenga un valor diferente a null
            System.out.print(actual.obtenDato() + "");
            actual = actual.obtenSiguiente();
        }
        System.out.println();
    }

}
