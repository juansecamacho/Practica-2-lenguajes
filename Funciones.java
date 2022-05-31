
import java.util.*;
import java.io.*;

public class Funciones {

    static String archivoFinal;

    public static String convertirMayus(String archivoInicial) {
        try {
            FileReader reader = new FileReader(archivoInicial + ".txt");
            String result = "";
            int data;
            int data2;
            while ((data = reader.read()) != -1) {
                data2 = Character.toUpperCase(data);
                result += (char) data2;
            }
            reader.close();
            archivoFinal = (archivoInicial + "Convertido.txt");
            FileWriter writer = new FileWriter(archivoFinal);
            writer.write(result);
            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return archivoFinal;
    }

    public static void LeerArchivo(String archivoFinal, String palabraBuscar) {
        int totalCoincidencias = 0;

        try {
            boolean flag = false;
            Scanner sc2 = new Scanner(new FileInputStream(archivoFinal));

            while (sc2.hasNextLine()) {
                String line = sc2.nextLine();
                String[] partes = line.replace(",", "").replace(".", "").split(" ");

                for (int i = 0; i < partes.length; i++) {
                    if (partes[i].contains(palabraBuscar)) {
                        flag = true;
                        totalCoincidencias = totalCoincidencias + 1;
                    }
                }
            }
            sc2.close();
            if (flag) {
                System.out.println("La palabra ingresada (" + palabraBuscar + ") se ha encontrado " + totalCoincidencias + " veces" + " en el archivo " + archivoFinal);

            } else {
                System.out.println("No se encontró la palabra ingresada (" + palabraBuscar + ") en el archivo " + archivoFinal);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int buscarFrases(String archivoConvertido, String palabraBuscar) {
        int count = 0;
        try {
            boolean flag = false;
            Scanner sc2 = new Scanner(new FileInputStream(archivoFinal));

            while (sc2.hasNextLine()) {
                String line = sc2.nextLine();
                if (line.contains(palabraBuscar)) {
                    count++;
                    flag = true;
                }
            }
            sc2.close();
            if (flag) {
                System.out.println("La frase ingresada (" + palabraBuscar + ") se ha encontrado " + count + " veces" + " en el archivo " + archivoFinal);

            } else {
                System.out.println("No se encontró la frase ingresada (" + palabraBuscar + ") en el archivo " + archivoFinal);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return count;
    }

}
