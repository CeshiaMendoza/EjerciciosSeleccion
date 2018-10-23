
package objetos;

import java.io.*;
import java.util.*;
public class cubo extends Objetos {
    /*
    public cubo(int lado) throws IOException{
   
    int volumen;
    int perimetro;
    
    volumen = lado * lado * lado;
    System.out.println("El volumen es: " + volumen);
    
    perimetro = lado * 12;
    System.out.println("El perimetro es: " + perimetro);
    */
    
    int volumen;
    int perimetro;
    
        public void calcularVolumen(int lado){
            
    volumen = lado * lado * lado;
    System.out.println("El volumen es: " + volumen);
        }
        
        public void calcularPerimentro(int lado){
            
    perimetro = lado * 12;
    System.out.println("El perimetro es: " + perimetro);
        }
    }

