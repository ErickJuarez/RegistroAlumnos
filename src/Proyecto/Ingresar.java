package Proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class Ingresar {
    static ArrayList<Cuestionario> lCuestionario = new ArrayList();
  static ArrayList<Alumnos> lAlumnos = new ArrayList();
  static Guardar guardar = new Guardar();
  
  public boolean buscarAlumnos(int boleta)
  {
    lAlumnos = guardar.leerAlumno();
    for (int i = 0; i < lAlumnos.size(); i++) {
      if (boleta == ((Alumnos)lAlumnos.get(i)).getBoleta())
      {
        System.out.println("Encontro un Registro");
        JOptionPane.showMessageDialog(null, "Ya existe ese registro", "Duplicado", 0);
        return true;
      }
    }
    System.out.println("No encontro Registro");
    return false;
  }
  
  public int buscarAlumnos(String boletaAux)
  {
    int boleta = Integer.parseInt(boletaAux);
    lAlumnos = guardar.leerAlumno();
    for (int i = 0; i < lAlumnos.size(); i++) {
      if (boleta == ((Alumnos)lAlumnos.get(i)).getBoleta()) {
        return i;
      }
    }
    System.out.println("No encontro Registro");
    return -1;
  }
  
  public void actualizarAlumnos(int boleta, int calCuest)
  {
    lAlumnos = guardar.leerAlumno();
    for (int i = 0; i < lAlumnos.size(); i++) {
      if (boleta == ((Alumnos)lAlumnos.get(i)).getBoleta())
      {
        ((Alumnos)lAlumnos.get(i)).setBoleta(boleta);
        ((Alumnos)lAlumnos.get(i)).setCalCuest(calCuest);
        guardar.serializarAlumnos(lAlumnos);
        JOptionPane.showMessageDialog(null, "Se ha Actualizado correctamente", "Exito", 1);
      }
    }
  }
  
  public void actualizarAlumnos(int boleta, String nombre)
  {
    lAlumnos = guardar.leerAlumno();
    for (int i = 0; i < lAlumnos.size(); i++) {
      if (boleta == ((Alumnos)lAlumnos.get(i)).getBoleta())
      {
        ((Alumnos)lAlumnos.get(i)).setBoleta(boleta);
        ((Alumnos)lAlumnos.get(i)).setNombre(nombre);
        guardar.serializarAlumnos(lAlumnos);
        JOptionPane.showMessageDialog(null, "Se ha Actualizado correctamente", "Exito", 1);
      }
    }
  }
  
  public void actualizarAlumnos(int boleta, String nombre, String apellidoP, String apellidoM, int cal1, int cal2, int cal3, int calCuest, int calTot, String observaciones)
  {
    lAlumnos = guardar.leerAlumno();
    for (int i = 0; i < lAlumnos.size(); i++) {
      if (boleta == ((Alumnos)lAlumnos.get(i)).getBoleta())
      {
        ((Alumnos)lAlumnos.get(i)).setBoleta(boleta);
        ((Alumnos)lAlumnos.get(i)).setNombre(nombre);
        ((Alumnos)lAlumnos.get(i)).setApellidoM(apellidoM);
        ((Alumnos)lAlumnos.get(i)).setApellidoP(apellidoP);
        ((Alumnos)lAlumnos.get(i)).setCal1(cal1);
        ((Alumnos)lAlumnos.get(i)).setCal2(cal2);
        ((Alumnos)lAlumnos.get(i)).setCal3(cal3);
        ((Alumnos)lAlumnos.get(i)).setCalCuest(calCuest);
        ((Alumnos)lAlumnos.get(i)).setCalTot(calTot);
        ((Alumnos)lAlumnos.get(i)).setObservaciones(observaciones);
        guardar.serializarAlumnos(lAlumnos);
        JOptionPane.showMessageDialog(null, "Se ha Actualizado correctamente", "Exito", 1);
      }
    }
  }
  
  public void ingresarAlumnos(int boleta, String nombre, String apellidoP, String apellidoM, int cal1, int cal2, int cal3, int calCuest, int calTot, String observaciones)
  {
    if (!buscarAlumnos(boleta))
    {
      Alumnos alum = new Alumnos();
      lAlumnos = guardar.leerAlumno();
      alum.setBoleta(boleta);
      alum.setNombre(nombre);
      alum.setApellidoP(apellidoP);
      alum.setApellidoM(apellidoM);
      alum.setCal1(cal1);
      alum.setCal2(cal2);
      alum.setCal3(cal3);
      alum.setCalCuest(calCuest);
      alum.setCalTot(calTot);
      alum.setObservaciones(observaciones);
      lAlumnos.add(alum);
      guardar.serializarAlumnos(lAlumnos);
      JOptionPane.showMessageDialog(null, "Se ha registrado", "Exito", 1);
    }
  }
  
  public void borrarAlumnos(int boleta)
  {
    lAlumnos = guardar.leerAlumno();
    for (int i = 0; i < lAlumnos.size(); i++) {
      if (boleta == ((Alumnos)lAlumnos.get(i)).getBoleta())
      {
        System.out.println("Encontro un Registro");
        lAlumnos.remove(i);
        guardar.serializarAlumnos(lAlumnos);
        JOptionPane.showMessageDialog(null, "Se ha borrado", "Exito", 1);
      }
    }
    System.out.println("No encontro Registro");
  }
  
  public void borrarAlumnos(double lista)
  {
    lAlumnos = guardar.leerAlumno();
    lAlumnos.remove((int)lista);
    guardar.serializarAlumnos(lAlumnos);
    JOptionPane.showMessageDialog(null, "Se ha borrado", "Exito", 1);
    System.out.println("No encontro Registro");
  }
  
  public void ingresarPreguntas(String pregunta, String opcA, String opcB, String opcC, String opcD, String opcCorrecta)
  {
    Cuestionario cuest = new Cuestionario();
    lCuestionario = guardar.leerCuestionario();
    cuest.setPregunta(pregunta);
    cuest.setOpcA(opcA);
    cuest.setOpcB(opcB);
    cuest.setOpcC(opcC);
    cuest.setOpcD(opcD);
    cuest.setOpcCorrecta(opcCorrecta);
    lCuestionario.add(cuest);
    guardar.serializarCuestionario(lCuestionario);
  }
}
