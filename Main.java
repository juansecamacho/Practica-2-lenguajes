import java.util.*;
import java.io.*;

public class Main extends Funciones {

    public static void main(String[] args) {
        //variable para guardar el txt convertido todo en mayuscula
        String archivoConvertido;

        System.out.println("Bienvenido, por favor ingresa la palabra,número o conjunto de palabras a buscar. ");
        Scanner scannerObject = new Scanner(System.in);
        String palabraBuscar = scannerObject.nextLine();
        // palabra ingresada se convierte en mayuscula para poder realizar la busqueda exacta
        palabraBuscar = palabraBuscar.toUpperCase();
        
        // se inicia con el txt Metadata Ano.txt
        String metadata = "Metadata Ano";
        archivoConvertido = convertirMayus(metadata);
        LeerArchivo1(archivoConvertido,palabraBuscar);

        // se continua con el txt Metadata Palabra.txt
        metadata = "Metadata Palabra";
        archivoConvertido = convertirMayus(metadata);
        LeerArchivo1(archivoConvertido,palabraBuscar);

        // se continua con el txt Metadata Frase.txt
        metadata = "Metadata Frase";
        archivoConvertido = convertirMayus(metadata);
        buscarFrases(archivoConvertido,palabraBuscar);
    }
}