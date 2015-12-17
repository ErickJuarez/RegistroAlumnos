package Proyecto;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author Erick
 */
public class Examen extends javax.swing.JFrame {

    public Examen() {
        initComponents();
        this.btnAlumno.addActionListener(this.botones);
        this.btnProfesor.addActionListener(this.botones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlumno = new javax.swing.JButton();
        btnProfesor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAlumno.setText("Alumno");

        btnProfesor.setText("Profesor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnProfesor)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlumno)
                    .addComponent(btnProfesor))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
ActionListener botones = new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == Examen.this.btnAlumno) {
                Examen.this.dispose();
                new Alumno().setVisible(true);
            }
            if (ae.getSource() == Examen.this.btnProfesor) {
                Examen.this.dispose();
                new InicioSesion().setVisible(true);
            }
        }
    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumno;
    private javax.swing.JButton btnProfesor;
    // End of variables declaration//GEN-END:variables
}
