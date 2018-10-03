
package codigoMorse;

/**
 *
 * @author Ceshia Kedusha Mendoza Torres
 * correo: torres.ceshia@gmail.com
 * 
 */
import java.util.*;
import java.io.*;

public class cMorse {
public static void main(String args[]) throws IOException{
    
    System.out.println("Bienvenido al traductor de codigo morse");
    System.out.println("Introduza el numero de opción que desea.");
    System.out.println("1.Texto a codigo morse");
    System.out.println("2.Codigo morse a texto");
    
    int opcion;
    opcion = 0;
    String texto = " ";
    String resp1 = " ";
    String resp2 = " ";
    char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
             'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
             'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };   

    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----"};    
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
    opcion = sc.nextInt();
    switch(opcion) {
        case 1: {
        System.out.println("Introduzca el texto a traducir");
        texto = br.readLine();
        texto = texto.toLowerCase(); 
        char[] morseC = texto.toCharArray();
        for(int i = 0; i < morseC.length;i++) {
            for(int j = 0;j<alfabeto.length;j++) {
                if(alfabeto[j] == morseC[i]) { 
                    resp1 = resp1 + morse[j] + " ";   
                }   
            }
        }
        System.out.println("La traduccion es:  " + resp1);
        break;
    }
        case 2: {
        System.out.println("Introduzca el código morse a traducir ");
        texto = br.readLine();
        String[] morseC = texto.split(" ");    
        for(int i = 0;i < morseC.length;i++) {      
            for(int j = 0;j < morse.length;j++){
                if(morse[j].equals(morseC[i]))   {
                    resp2 = resp2 + alfabeto[j]; 
                }
            }
        }
        System.out.println("La traducción es:  " + resp2);
        break;
    }
    }
    }
    }

