package Proyecto;

import javax.swing.ImageIcon;

/**
 *
 * @author Erick
 */
public class Proyecto {

    PantallaCargando screen;

    Proyecto() {
        inicioPantalla();
        screen.velocidadDeCarga();
    }

    private void inicioPantalla() {
        ImageIcon myImage = new ImageIcon("Softfly.png");
        screen = new PantallaCargando(myImage);
        screen.setLocationRelativeTo(null);
        screen.setProgresoMax(100);
        screen.setVisible(true);
    }

    public static void main(String[] args) {
        new Proyecto();
        new Examen().setVisible(true);
    }
}
