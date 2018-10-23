
package objetos;

import java.util.*;
import java.io.*;
//area y perimetro
public class cuadrado extends Objetos{
    int area;
    int perimetro;        
        public void calcularArea(int lado){
            
    area = lado * lado;
    System.out.println("El area es: " + area);
        }
        
        public void calcularPerimentro(int lado){
            
    perimetro = lado + lado + lado + lado;
    System.out.println("El perimetro es: " + perimetro);
        }

    }

