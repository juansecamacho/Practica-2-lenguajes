import java.util.*;
import java.io.*;
public class Año {

    public static void LeerArchivo1(){
       int totalCoincidencias = 0;
       File archivo = new File("Metadata Ano.txt");
       Scanner sc = new Scanner(System.in);
       System.out.println("¿Que palabra te gustaria buscar?");
       String palabraBuscar = sc.next();
       try{
           if(archivo.exists()){
               BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));
               String lineaLeida;
               while((lineaLeida = archivoLeer.readLine()) !=null){
                   String[] partes = lineaLeida.split(" ");
                   for(int i = 0;i < partes.length;i++){
                       if(partes[i].equals(palabraBuscar)){
                           totalCoincidencias = totalCoincidencias + 1;
                       }
                   }
               }
               archivoLeer.close();
           }
           System.out.println("La palabra que preguntase esta "+ totalCoincidencias +" veces");
       }
       catch(Exception e){
          System.out.println(e.getMessage());
       }
    }

    public static void LeerArchivo2(){
        int totalCoincidencias = 0;
        File archivo = new File("Metadata Palabra.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que palabra te gustaria buscar?");
        String palabraBuscar = sc.next();
        try{
            if(archivo.exists()){
                BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));
                String lineaLeida;
                while((lineaLeida = archivoLeer.readLine()) !=null){
                    String[] partes = lineaLeida.split(" ");
                    for(int i = 0;i < partes.length;i++){
                        if(partes[i].equals(palabraBuscar)){
                            totalCoincidencias = totalCoincidencias + 1;
                        }
                    }
                }
                archivoLeer.close();
            }
            System.out.println("La palabra que preguntase esta "+ totalCoincidencias +" veces");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void LeerArchivo3(){
        int totalCoincidencias = 0;
        File archivo = new File("Metadata Frase.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que palabra te gustaria buscar?");
        String palabraBuscar = sc.next();
        try{
            if(archivo.exists()){
                BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));
                String lineaLeida;
                while((lineaLeida = archivoLeer.readLine()) !=null){
                    String[] partes = lineaLeida.split(" ");
                    for(int i = 0;i < partes.length;i++){
                        if(partes[i].equals(palabraBuscar)){
                            totalCoincidencias = totalCoincidencias + 1;
                        }
                    }
                }
                archivoLeer.close();
            }
            System.out.println("La palabra que preguntase esta "+ totalCoincidencias +" veces");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
