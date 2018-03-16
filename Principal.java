
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] aMeses = {"Enero", "Febrero", "Marzo", "Abril"
        ,"Mayo", "Junio","Julio","Agosto", "Septiembre", "Octubre"
        ,"Noviembre", "Diciembre"};
        int[] aDias ={31,28,31,30,31,30,31,31,30,31,30,31};//# dias que tiene cada mes
        
        //Equivalente a:
        /*
        String[] aMeses = new String[12];
        aMeses[0] = "Enero";
        aMeses[1] = "Febrero";
        ...
        */
        //Preguntamos al usuario
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Introduce el numero de mes(entre 1 y 12): ");
        int iMes = sCaptu.nextInt();
        //Imprimir el mes
        //Restamos 1 al numero que introduce el usuario, los arreglos inician desde 0
        System.out.println("El mes solicitado es: " + aMeses[iMes-1] + " y tiene: " + aDias[iMes-1] + " dias.");
        
        
        
        
    }
    
}
