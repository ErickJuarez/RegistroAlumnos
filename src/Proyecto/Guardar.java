package Proyecto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Erick
 */
public class Guardar {

    ArrayList<Alumnos> ListaRecuperadaAlumno = new ArrayList();
    ArrayList<Cuestionario> ListaRecuperadaCuestionario = new ArrayList();

    ArrayList<Alumnos> leerAlumno() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Alumnos.dat"));
            this.ListaRecuperadaAlumno = ((ArrayList) in.readObject());
        } catch (Exception e) {
            System.out.println("No se ha leido");
        }
        return this.ListaRecuperadaAlumno;
    }

    ArrayList<Cuestionario> leerCuestionario() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Cuestionario.dat"));
            this.ListaRecuperadaCuestionario = ((ArrayList) in.readObject());
        } catch (Exception e) {
            System.out.println("No se ha leido");
        }
        return this.ListaRecuperadaCuestionario;
    }

    void serializarAlumnos(ArrayList<Alumnos> ListaSeriarAlumnos) {
        try {
            FileOutputStream out = new FileOutputStream("Alumnos.dat");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(ListaSeriarAlumnos);
            objOut.close();
            out.close();
        } catch (Exception e) {
        }
    }

    void serializarCuestionario(ArrayList<Cuestionario> ListaSeriarCuestionario) {
        try {
            FileOutputStream out = new FileOutputStream("Cuestionario.dat");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(ListaSeriarCuestionario);
            objOut.close();
            out.close();
        } catch (Exception e) {
        }
    }
}
