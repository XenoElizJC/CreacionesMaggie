package sistemacm;

import java.awt.Graphics;
import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Inventarios extends javax.swing.JFrame {
    
    fondoPanel fondo = new fondoPanel();
    public SistemaCM conexion = new SistemaCM();       
    public PreparedStatement  prepared;
    public ResultSet result;
    Connection conectar= conexion.getConnection();
            
    
    public Inventarios() {
        
        this.setContentPane(fondo);
        initComponents();
              
        try {
            
            prepared = conectar.prepareStatement("SELECT * FROM inventarios WHERE Soft_Delete = ?");
            prepared.setString(1,"Activo");
            result = prepared.executeQuery();

            DefaultTableModel model = (DefaultTableModel) productoTabla.getModel();

            
            model.setRowCount(0);

            
            while (result.next()) {
                Object[] fila = new Object[5]; 
                fila[0] = result.getString("nombre");
                fila[1] = result.getString("precio");
                fila[2] = result.getString("tamaño");
                fila[3] = result.getString("numero_existencia");
                fila[4] = result.getString("tipo");
                
                
                model.addRow(fila);
            }

            // Cierra la conexión
            conectar.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaInventarios = new fondoPanel2();
        presentacionInventarios = new javax.swing.JLabel();
        botonAñadir = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productoTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout etiquetaInventariosLayout = new javax.swing.GroupLayout(etiquetaInventarios);
        etiquetaInventarios.setLayout(etiquetaInventariosLayout);
        etiquetaInventariosLayout.setHorizontalGroup(
            etiquetaInventariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        etiquetaInventariosLayout.setVerticalGroup(
            etiquetaInventariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        presentacionInventarios.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        presentacionInventarios.setText("Inventarios");

        botonAñadir.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonAñadir.setText("Añadir");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        botonActualizar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonActualizar.setText("Actualizar o Eliminar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        productoTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "nombre", "precio", "tamaño ", "existencia", "tipo"
            }
        ));
        jScrollPane1.setViewportView(productoTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAñadir)
                    .addComponent(botonActualizar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(presentacionInventarios))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(botonAñadir)
                        .addGap(42, 42, 42)
                        .addComponent(botonActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(presentacionInventarios)
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        new InventariosActElim().setVisible(true);
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
    new AñadirInventario().setVisible(true);
    }//GEN-LAST:event_botonAñadirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(this, "¿Desea salir de la Aplicación?", "Seleccione una opción", WIDTH);
       
       if(result == JOptionPane.YES_OPTION){
           setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
           
    }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JPanel etiquetaInventarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel presentacionInventarios;
    private javax.swing.JTable productoTabla;
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
    
    class fondoPanel2 extends JPanel
    {
        private Image imagen2;
        
        @Override
        public void paint(Graphics g){
            imagen2 = new ImageIcon(getClass().getResource("/imagenes/Inventario.png")).getImage();
            
            g.drawImage(imagen2, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

}
