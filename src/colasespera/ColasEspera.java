/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasespera;

/**
 *
 * @author danie
 */
public class ColasEspera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Colas de esperaaaa
            Una cola de espera son elementos ordenados
        para eliminar o insertar los elementos por un
        orden de prioridad...
        Las colas funcionan por la metodologia FIFO(First
        In First Out).
        
            Algunos ejemplos en la vida reaal son las:
                Lineas aereas
                Lineas de autobusess
                Colas de espera en los supermercados
                Colas de espera en los bancos
                etc, etc, etc...
        */
        /*
        Cola <Integer> cola=new Cola<Integer>();
        for(int i=0; i<10; i++){
            cola.inserta(i);
            cola.imprime();
        }
        System.out.println("");
        try{
             for(int i=0; i<10; i++){
                 Integer elemento = cola.elimina();
                 System.out.println("Elemento eliminado de la"
                         + " cola: "+ elemento);
                 cola.imprime();
             }
        }catch(ExcepcionEDVacia e){
            e.printStackTrace();
        }
        
        */
        ColaAscendente<Integer> colaAscendente = new ColaAscendente<Integer>();
        colaAscendente.inserta(1); colaAscendente.imprime();
        colaAscendente.inserta(8); colaAscendente.imprime();  
        colaAscendente.inserta(3); colaAscendente.imprime();  
        colaAscendente.inserta(6); colaAscendente.imprime();  
        colaAscendente.inserta(5); colaAscendente.imprime();  
        colaAscendente.inserta(4); colaAscendente.imprime();
        colaAscendente.inserta(7); colaAscendente.imprime();
        colaAscendente.inserta(2); colaAscendente.imprime();
        colaAscendente.inserta(9); colaAscendente.imprime();
        
        colaAscendente.imprime();
        try{
             for(int i=0; i<9; i++){
                 Integer elemento = colaAscendente.elimina();
                 System.out.println("Elemento eliminado de la"
                         + " cola: "+ elemento);
                 colaAscendente.imprime();
             }
        }catch(ExcepcionEDVacia e){
            e.printStackTrace();
        }
        
    }

    
}
