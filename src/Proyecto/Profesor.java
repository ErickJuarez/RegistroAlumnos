package Proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Erick
 */
public class Profesor extends javax.swing.JFrame {

    int opc;

    public Profesor() {
        initComponents();
        ButtonGroup radioG = new ButtonGroup();
        this.btnAceptar.addActionListener(this.botones);
        this.btnRegresar.addActionListener(this.botones);
        this.btnAltas.addChangeListener(this.radios);
        this.btnExamen.addChangeListener(this.radios);
        this.btnLista.addChangeListener(this.radios);
        radioG.add(this.btnAltas);
        radioG.add(this.btnExamen);
        radioG.add(this.btnLista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExamen = new javax.swing.JRadioButton();
        btnLista = new javax.swing.JRadioButton();
        btnAltas = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnExamen.setText("Hacer Examen");

        btnLista.setText("Registro");

        btnAltas.setText("Alumnos");

        btnAceptar.setText("Aceptar");

        btnRegresar.setText("Regresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAltas)
                    .addComponent(btnLista)
                    .addComponent(btnExamen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(28, 28, 28)
                .addComponent(btnRegresar)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnExamen)
                .addGap(18, 18, 18)
                .addComponent(btnLista)
                .addGap(18, 18, 18)
                .addComponent(btnAltas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnRegresar))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ChangeListener radios = new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent ce) {
            if (Profesor.this.btnExamen.isSelected()) {
                Profesor.this.opc = 1;
            }
            if (Profesor.this.btnLista.isSelected()) {
                Profesor.this.opc = 2;
            }
            if (Profesor.this.btnAltas.isSelected()) {
                Profesor.this.opc = 3;
            }
        }
    };
    ActionListener botones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == Profesor.this.btnAceptar) {
                switch (Profesor.this.opc) {
                    case 1:
                        new hacerCuestionario().setVisible(true);
                        break;
                    case 2:
                        new Revisar().setVisible(true);

                        break;
                    case 3:
                        new Calificaciones().setVisible(true);
                }
            }
            if (ae.getSource() == Profesor.this.btnRegresar) {
                Profesor.this.dispose();
                new Examen().setVisible(true);
            }
        }
    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JRadioButton btnAltas;
    private javax.swing.JRadioButton btnExamen;
    private javax.swing.JRadioButton btnLista;
    private javax.swing.JButton btnRegresar;
    // End of variables declaration//GEN-END:variables
}
