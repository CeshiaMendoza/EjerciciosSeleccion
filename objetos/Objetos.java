package objetos;

import java.io.*;
import java.util.*;
       
public class Objetos {
    public static void main(String[] args) throws IOException{
       int lado=0;
       int opcion=4;
        while(opcion ==4){
            Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la medida de un lado");
        lado = sc.nextInt();
        
        System.out.println("Introduzca el numero de la opcion deseada");
        System.out.println("1.-Calcular como cuadrado: area y perimetro");
        System.out.println("2.-Calcular como cubo: area y volumen ");
        System.out.println("3.-Salir");
        System.out.println("4.-Regresar");
        opcion = sc.nextInt();
        }
            switch(opcion){
                case 1: {
           cuadrado Cuadrado = new cuadrado();
           Cuadrado.calcularArea(lado);
           Cuadrado.calcularPerimentro(lado);
           
        break;
                }
        case 2: {
            cubo Cubo = new cubo();
            Cubo.calcularVolumen(lado);
            Cubo.calcularPerimentro(lado);
        break;}

        case 3: {
            break;}
        default:{
            System.out.println("Error");
            break;}
            }
        }
}


