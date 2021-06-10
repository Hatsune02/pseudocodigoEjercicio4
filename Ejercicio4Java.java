import java.util.Scanner;

public class Ejercicio4Java{

    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int edad;
        int mayor = 0;
        int menor = 100;
        
        for(int i=0;i<20;i++){
            edad = getInt("Escriba una edad");
            if(edad >= mayor){
                mayor = edad;
            }
            if(edad <= menor){
                menor = edad;
            }
        }

        System.out.println("La edad mayor es de "+mayor+" y la menor edad es de "+menor);
    }

    public static int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }
}