package Tarea;
//15-ago-25

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ManejoDeArchivosDeDatos {
    public static void main(String[] args) {
        FileReader fr = null;

        try (java.io.FileReader fileReader = fr = new FileReader("codigos_postales_hmo.csv")){

            BufferedReader br = new BufferedReader(fr);
            String line = null;

            String cpString = null;
            int contador=1;
            int lastCP= 0;
            int currentCP = 0;

            while ( (line = br.readLine()) != null ){

                cpString = line.substring(0,5);
                currentCP= Integer.parseInt(cpString);
                if(lastCP == currentCP){
                contador++;
            }else {
                System.out.println(lastCP + " " + contador);
                contador = 1;
                lastCP = currentCP;
            }
        }
        if( lastCP ==currentCP ){
            System.out.println(lastCP + " " + contador);
        }

    }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
}}
