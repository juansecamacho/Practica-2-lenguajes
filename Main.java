import java.util.*;
import java.io.*;
public class Main extends Año {

    public static void main(String[]args){
        Main.MenuPrincipal();
    }

    public static void MenuPrincipal(){
        System.out.println("Bienvenido, por favor ingresa el numero del metadata que quieras usar:\n 1. Año: 2004 \n 2. Palabra: Pandemia \n 3. Frase: El aborto en Colombia");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion){
            case 1: Main.Menu1();
                break;
            case 2: Main.Menu2();
                break;
            case 3: Main.Menu3();
                break;
            default: System.out.println("Muchas gracias y vuelve pronto :)");
                break;
        }

    }

    public static void Menu1(){
        System.out.println("ingresa un 1 para avanzar o cualquier otra tecla para devolverte");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion){
            case 1: Año.LeerArchivo1();
                break;
            default: Main.MenuPrincipal();
                break;
        }
    }

    public static void Menu2(){
        System.out.println("ingresa un 1 para avanzar o cualquier otra tecla para devolverte");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion){
            case 1: Año.LeerArchivo2();
                break;
            default: Main.MenuPrincipal();
                break;
        }
    }

    public static void Menu3(){
        System.out.println("ingresa un 1 para avanzar o cualquier otra tecla para devolverte");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion){
            case 1: Año.LeerArchivo3();
                break;
            default: Main.MenuPrincipal();
                break;
        }
    }
}
