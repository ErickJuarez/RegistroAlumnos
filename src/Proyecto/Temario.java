package Proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Erick
 */
public class Temario extends javax.swing.JFrame {

    static ArrayList<Cuestionario> lCuestionario = new ArrayList();
    static Guardar guardar = new Guardar();
    Ingresar ingresar = new Ingresar();
    int puntaje = 0;
    int pregunta = 0;
    int boleta;
    String respuesta;

    public Temario(int boleta) {
        this.boleta = boleta;
        initComponents();
        this.btnSiguiente.addActionListener(this.botones);
        preguntas(this.pregunta);
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(this.btnA);
        grupo.add(this.btnB);
        grupo.add(this.btnC);
        grupo.add(this.btnD);
        this.btnA.addChangeListener(this.radios);
        this.btnB.addChangeListener(this.radios);
        this.btnC.addChangeListener(this.radios);
        this.btnD.addChangeListener(this.radios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPregunta = new javax.swing.JTextArea();
        btnA = new javax.swing.JRadioButton();
        btnB = new javax.swing.JRadioButton();
        btnC = new javax.swing.JRadioButton();
        btnD = new javax.swing.JRadioButton();
        lblOpcA = new javax.swing.JLabel();
        lblOpcB = new javax.swing.JLabel();
        lblOpcC = new javax.swing.JLabel();
        lblOpcD = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Pregunta");

        txtPregunta.setColumns(20);
        txtPregunta.setRows(5);
        jScrollPane1.setViewportView(txtPregunta);

        btnA.setText("A)");

        btnB.setText("B)");

        btnC.setText("C)");

        btnD.setText("D)");

        btnSiguiente.setText("Siguiente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSiguiente)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblOpcD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblOpcC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblOpcA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblOpcB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnA)
                    .addComponent(lblOpcA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnB)
                    .addComponent(lblOpcB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC)
                    .addComponent(lblOpcC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnD)
                    .addComponent(lblOpcD, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSiguiente)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ChangeListener radios = new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent ce) {
            if (Temario.this.btnA.isSelected()) {
                Temario.this.respuesta = "A";
            }
            if (Temario.this.btnB.isSelected()) {
                Temario.this.respuesta = "B";
            }
            if (Temario.this.btnC.isSelected()) {
                Temario.this.respuesta = "C";
            }
            if (Temario.this.btnD.isSelected()) {
                Temario.this.respuesta = "D";
            }
        }
    };
    ActionListener botones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            Temario.lCuestionario = Temario.guardar.leerCuestionario();
            if (ae.getSource() == Temario.this.btnSiguiente) {
                if (((Cuestionario) Temario.lCuestionario.get(Temario.this.pregunta)).getOpcCorrecta().equals(Temario.this.respuesta)) {
                    Temario.this.puntaje += 1;
                }
                Temario.this.pregunta += 1;
                Temario.this.preguntas(Temario.this.pregunta);
            }
        }
    };

    void preguntas(int pregunta) {
        lCuestionario = guardar.leerCuestionario();
        if (pregunta < lCuestionario.size()) {
            this.txtPregunta.setText(((Cuestionario) lCuestionario.get(pregunta)).getPregunta());
            this.lblOpcA.setText(((Cuestionario) lCuestionario.get(pregunta)).getOpcA());
            this.lblOpcB.setText(((Cuestionario) lCuestionario.get(pregunta)).getOpcB());
            this.lblOpcC.setText(((Cuestionario) lCuestionario.get(pregunta)).getOpcC());
            this.lblOpcD.setText(((Cuestionario) lCuestionario.get(pregunta)).getOpcD());
        } else {
            JOptionPane.showMessageDialog(null, "Has Finalizado el Cuestionario", "Fin", 1);
            this.ingresar.actualizarAlumnos(this.boleta, this.puntaje);
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnA;
    private javax.swing.JRadioButton btnB;
    private javax.swing.JRadioButton btnC;
    private javax.swing.JRadioButton btnD;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOpcA;
    private javax.swing.JLabel lblOpcB;
    private javax.swing.JLabel lblOpcC;
    private javax.swing.JLabel lblOpcD;
    private javax.swing.JTextArea txtPregunta;
    // End of variables declaration//GEN-END:variables
}
