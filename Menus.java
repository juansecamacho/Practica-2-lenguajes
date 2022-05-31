import java.util.*;
public class Menus
{ 
    
    public static void MenuPrincipal(){
        System.out.println("Bienvenido, por favor ingresa el numero del metadata que quieras usar:\n 1. Año: 2004 \n 2. Palabra: Pandemia \n 3. Frase: El aborto en Colombia");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion){
            case 1: Menus.Menu1();
                break;
            case 2: Menus.Menu2();
                break;
            case 3: Menus.Menu3();
                break;
            default: System.out.println("Muchas gracias y vuelve pronto :)");
                break;
        }

    }
    
        public static void Menu1(){
        String metadata = "Metadata ano";
        String archivoConvertido = Funciones.convertirMayus(metadata);
        System.out.println("Ingresa 1 para ingresar una palabra \n Ingresa 2 para ingresar una frase \nIngresa cualquier otro numero para regresar");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion){
            case 1: System.out.println("Ingresa la palabra que te gustaria buscar");
                String palabraBuscar = sc.next();
                palabraBuscar = palabraBuscar.toUpperCase();
                Funciones.LeerArchivo(archivoConvertido,palabraBuscar);
                Menu1();
                break;
            case 2: System.out.println("Ingresa la frase que te gustaria buscar");
                String fraseBuscar = sc.next();
                fraseBuscar = fraseBuscar.toUpperCase();
                Funciones.buscarFrases(archivoConvertido,fraseBuscar);
                Menu1();
                break;
            default: Menus.MenuPrincipal();
        }
    }

        public static void Menu2(){
        String metadata = "Metadata Palabra";
        String archivoConvertido = Funciones.convertirMayus(metadata);
        System.out.println("Ingresa 1 para ingresar una palabra \n Ingresa 2 para ingresar una frase \nIngresa cualquier otro numero para regresar");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion){
            case 1: System.out.println("Ingresa la palabra que te gustaria buscar");
                String palabraBuscar = sc.next();
                palabraBuscar = palabraBuscar.toUpperCase();
                Funciones.LeerArchivo(archivoConvertido,palabraBuscar);
                Menu1();
                break;
            case 2: System.out.println("Ingresa la frase que te gustaria buscar");
                String fraseBuscar = sc.next();
                fraseBuscar = fraseBuscar.toUpperCase();
                Funciones.buscarFrases(archivoConvertido,fraseBuscar);
                Menu1();
                break;
            default: Menus.MenuPrincipal();
        }
    }

        public static void Menu3(){
        String metadata = "Metadata Frase";
        String archivoConvertido = Funciones.convertirMayus(metadata);
        System.out.println("Ingresa 1 para ingresar una palabra \n Ingresa 2 para ingresar una frase \nIngresa cualquier otro numero para regresar");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion){
            case 1: System.out.println("Ingresa la palabra que te gustaria buscar");
                String palabraBuscar = sc.next();
                palabraBuscar = palabraBuscar.toUpperCase();
                Funciones.LeerArchivo(archivoConvertido,palabraBuscar);
                Menu1();
                break;
            case 2: System.out.println("Ingresa la frase que te gustaria buscar");
                String fraseBuscar = sc.next();
                fraseBuscar = fraseBuscar.toUpperCase();
                Funciones.buscarFrases(archivoConvertido,fraseBuscar);
                Menu1();
                break;
            default: Menus.MenuPrincipal();
        }
    }
    
}
