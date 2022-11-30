package dato;

import modelo.Jugador;
import modelo.Seleccion;

import java.io.*;
import java.util.ArrayList;

public class DatosSelecciones {
    public  static void leerArchivoSelecciones(Seleccion seleccion, String direccionArchivo){
        String textoArchivo;


        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while ((textoArchivo = br.readLine()) != null){
                String[] data = textoArchivo.split(";");
                seleccion.getJugadores().add(new Jugador(data[0],data[1],data[2]));
            }

        } catch (Exception e) {
            System.out.println("Documento no disponible");
        }
    }

    public static void main(String[] args) {
        var jugadores = new ArrayList<Jugador>();
        Seleccion seleccion = new Seleccion("Chile", "XD", jugadores);
        leerArchivoSelecciones(seleccion, "./src/main/resources/chi.txt");



    }
}
