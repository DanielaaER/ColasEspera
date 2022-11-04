/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasespera;

/**
 *
 * @author danie
 */
public class ExcepcionEDVacia extends RuntimeException {

    public ExcepcionEDVacia() {
        this("Estructura de datos");
    }

    public ExcepcionEDVacia(String s) {
        super(s + " vacia");
    }
}
