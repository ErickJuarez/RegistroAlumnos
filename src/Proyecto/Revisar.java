package Proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick
 */
public class Revisar extends javax.swing.JFrame {

    static ArrayList<Alumnos> lAlumnos = new ArrayList();
    static Guardar guardar = new Guardar();
    Ingresar ingresar = new Ingresar();
    Object[] datos = new Object[4];

    public Revisar() {
        initComponents();
        rellenar();
        this.btnActualizar.addActionListener(this.botones);
        this.btnBorrar.addActionListener(this.botones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Boleta", "Nombre", "Examen", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblAlumnos);

        btnActualizar.setText("Actualizar");

        btnBorrar.setText("Borrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnBorrar))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ActionListener botones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            DefaultTableModel modelo = (DefaultTableModel) Revisar.this.tblAlumnos.getModel();
            if (ae.getSource() == Revisar.this.btnActualizar) {
                System.out.println(Revisar.this.tblAlumnos.getSelectedRow());
                System.out.println(Revisar.this.tblAlumnos.getSelectedColumn());
                System.out.println(Revisar.this.tblAlumnos.getSelectedRows());
                System.out.println(modelo.getValueAt(Revisar.this.tblAlumnos.getSelectedRow(), Revisar.this.tblAlumnos.getSelectedColumn()).toString());
                switch (Revisar.this.tblAlumnos.getSelectedColumn()) {
                    case 1:
                        Revisar.this.ingresar.actualizarAlumnos(Integer.parseInt(modelo.getValueAt(Revisar.this.tblAlumnos.getSelectedRow(), 0).toString()), modelo.getValueAt(Revisar.this.tblAlumnos.getSelectedRow(), Revisar.this.tblAlumnos.getSelectedColumn()).toString());
                        break;
                    case 2:
                        Revisar.this.ingresar.actualizarAlumnos(Integer.parseInt(modelo.getValueAt(Revisar.this.tblAlumnos.getSelectedRow(), 0).toString()), Integer.parseInt(modelo.getValueAt(Revisar.this.tblAlumnos.getSelectedRow(), Revisar.this.tblAlumnos.getSelectedColumn()).toString()));
                }
            }
            if (ae.getSource() == Revisar.this.btnBorrar) {
                int lista = Revisar.this.tblAlumnos.getSelectedRow();
                ingresar.borrarAlumnos((double)lista);
                modelo.removeRow(lista);
            }
        }
    };

    void rellenar() {
        DefaultTableModel modelo = (DefaultTableModel) this.tblAlumnos.getModel();
        lAlumnos = guardar.leerAlumno();
        for (int i = 0; i < lAlumnos.size(); i++) {
            this.datos[0] = Integer.valueOf(((Alumnos) lAlumnos.get(i)).getBoleta());
            this.datos[1] = ((Alumnos) lAlumnos.get(i)).getNombre();
            this.datos[2] = Integer.valueOf(((Alumnos) lAlumnos.get(i)).getCalCuest());
            this.datos[3] = Integer.valueOf(((Alumnos) lAlumnos.get(i)).getCalTot());
            modelo.addRow(this.datos);
        }
        this.tblAlumnos.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlumnos;
    // End of variables declaration//GEN-END:variables
}
