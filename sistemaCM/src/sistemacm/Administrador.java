package sistemacm;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Administrador extends javax.swing.JFrame {
    
    fondoPanel fondo = new fondoPanel();
    public SistemaCM conexion = new SistemaCM();       
    public PreparedStatement  prepared;
    public ResultSet result;

    
    
    Connection conectar = conexion.getConnection();

    public Administrador() {
        this.setContentPane(fondo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienvenidaAdministrador = new javax.swing.JLabel();
        nombreAdministrador = new javax.swing.JLabel();
        botonClientes = new javax.swing.JButton();
        botonVentas = new javax.swing.JButton();
        botonEmpleados = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bienvenidaAdministrador.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        bienvenidaAdministrador.setText("Bienvenido ");

        nombreAdministrador.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N

        botonClientes.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonClientes.setText("Lista de Clientes");
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });

        botonVentas.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonVentas.setText("Mostrar ventas");

        botonEmpleados.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonEmpleados.setText("Mostrar empleados");

        botonAgregar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonActualizar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonActualizar.setText("Actualizar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAgregar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botonClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonEmpleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(115, 115, 115)
                        .addComponent(botonActualizar)
                        .addGap(222, 222, 222)
                        .addComponent(botonEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bienvenidaAdministrador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bienvenidaAdministrador)
                    .addComponent(nombreAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(botonClientes)
                .addGap(42, 42, 42)
                .addComponent(botonVentas)
                .addGap(44, 44, 44)
                .addComponent(botonEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonActualizar)
                    .addComponent(botonEliminar))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed

    }//GEN-LAST:event_botonClientesActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
            new ALta().setVisible(true);
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        
    }//GEN-LAST:event_botonEliminarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenidaAdministrador;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonClientes;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonEmpleados;
    private javax.swing.JButton botonVentas;
    private javax.swing.JLabel nombreAdministrador;
    // End of variables declaration//GEN-END:variables

        class fondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/Fondo2.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

}
