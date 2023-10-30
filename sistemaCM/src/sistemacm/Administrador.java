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
    public int n;
    public SistemaCM conexion = new SistemaCM();       
    public PreparedStatement  prepared;
    public ResultSet result;
    

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
        jScrollPane1 = new javax.swing.JScrollPane();
        textoTabla = new javax.swing.JTable();

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
        botonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVentasActionPerformed(evt);
            }
        });

        botonEmpleados.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonEmpleados.setText("Mostrar empleados");
        botonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleadosActionPerformed(evt);
            }
        });

        botonAgregar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonActualizar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonActualizar.setText("Actualizar o Eliminar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        textoTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "correo", "telefono", "area_id"
            }
        ));
        jScrollPane1.setViewportView(textoTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEmpleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bienvenidaAdministrador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAgregar)
                .addGap(130, 130, 130)
                .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bienvenidaAdministrador)
                    .addComponent(nombreAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonClientes)
                        .addGap(42, 42, 42)
                        .addComponent(botonVentas)
                        .addGap(44, 44, 44)
                        .addComponent(botonEmpleados))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonActualizar))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        n=1;    
        
        try {
            Connection conectar= conexion.getConnection();
            
            prepared = conectar.prepareStatement("SELECT * FROM personas WHERE rol_id=?");
            prepared.setString(1,"3");
            result = prepared.executeQuery();

            DefaultTableModel model = (DefaultTableModel) textoTabla.getModel();

            
            model.setRowCount(0);

            
            while (result.next()) {
                Object[] fila = new Object[5]; 
                fila[0] = result.getInt("id");
                fila[1] = result.getString("nombre");
                fila[2] = result.getString("correo");
                fila[3] = result.getString("telefono");
                fila[4] = result.getString("area_id");
                
                model.addRow(fila);
            }

            // Cierra la conexión
            conectar.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botonClientesActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
            new ALta().setVisible(true);
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        switch(n){
            case 1:
                break;
            case 2:
                break;
            case 3:
                new EliminacionyActualizacion().setVisible(true);
                break;
            default:
                JOptionPane.showConfirmDialog(null, "Seleccione alguna de las opciones");
                break;
        }
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleadosActionPerformed
        n=3;
        
        try {
            Connection conectar= conexion.getConnection();
            prepared = conectar.prepareStatement("SELECT * FROM personas WHERE rol_id=? AND Soft_Delete = ?");
            prepared.setString(1,"2");
            prepared.setString(2,"Activo");
            result = prepared.executeQuery();

            DefaultTableModel model = (DefaultTableModel) textoTabla.getModel();
            
            model.setRowCount(0);
          
            while (result.next()) {
                Object[] fila = new Object[5]; 
                fila[0] = result.getInt("id");
                fila[1] = result.getString("nombre");
                fila[2] = result.getString("correo");
                fila[3] = result.getString("telefono");
                fila[4] = result.getString("area_id");
                
                model.addRow(fila);
            }

            // Cierra la conexión
            conectar.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botonEmpleadosActionPerformed

    private void botonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVentasActionPerformed
        n = 2;
    }//GEN-LAST:event_botonVentasActionPerformed

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
    private javax.swing.JButton botonEmpleados;
    private javax.swing.JButton botonVentas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreAdministrador;
    private javax.swing.JTable textoTabla;
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
