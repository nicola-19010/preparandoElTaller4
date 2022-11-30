package dato;

import modelo.Jugador;
import modelo.Seleccion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class DatosSelecciones {
    public  static void leerArchivoSelecciones(ArrayList<Seleccion> selecciones, String direccionArchivo){
        String textoArchivo;


        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            ArrayList<Jugador> jugadores;
            //DatosJugadores.leerArchivoJugadores(jugadores, );
            while ((textoArchivo = br.readLine()) != null){
                String[] data = textoArchivo.split(";");
                //selecciones.add(new Seleccion(data[0], data[1],data[2], ));
            }

        } catch (Exception e) {
            System.out.println("Documento no disponible");
        }
    }
}
