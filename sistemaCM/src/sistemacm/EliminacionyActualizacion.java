
package sistemacm;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EliminacionyActualizacion extends javax.swing.JFrame {
    
    fondoPanel fondo = new fondoPanel();
    
    public int id;
    public SistemaCM conexion = new SistemaCM();       
    public PreparedStatement  prepared;
    public ResultSet result;
    public String nombre;
    
    
    
    llenarComboBox re = new llenarComboBox();

    public EliminacionyActualizacion() {

        this.setContentPane(fondo);
        
        initComponents();
        
         re.rellenarComboBox("personas", "nombre", nombreCombo);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombreCombo = new javax.swing.JComboBox<>();
        labelNombre = new javax.swing.JLabel();
        botonSeleccion = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        textoCorreo = new javax.swing.JTextField();
        textoDireccion = new javax.swing.JTextField();
        textoContraseña = new javax.swing.JTextField();
        textoTelefono = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAutoRequestFocus(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 38)); // NOI18N
        jLabel1.setText("Actualización y Eliminación");
        jLabel1.setToolTipText("");

        nombreCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        nombreCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreComboActionPerformed(evt);
            }
        });

        labelNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelNombre.setText("Nombre");

        botonSeleccion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        botonSeleccion.setText("Seleccionar");
        botonSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionActionPerformed(evt);
            }
        });

        BotonActualizar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        textoCorreo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        textoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCorreoActionPerformed(evt);
            }
        });

        textoDireccion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        textoContraseña.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        textoTelefono.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        textoNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("Dirección");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setText("Teléfono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BotonActualizar)
                            .addGap(54, 54, 54)
                            .addComponent(botonEliminar)
                            .addGap(266, 266, 266)
                            .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelNombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(nombreCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(129, 129, 129)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonSeleccion)
                            .addGap(393, 393, 393)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSeleccion)
                    .addComponent(textoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonActualizar)
                    .addComponent(botonEliminar)
                    .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int resultado;
        
        try {
            Connection conectar= conexion.getConnection();
            prepared = conectar.prepareStatement("UPDATE personas SET Soft_Delete = ?, correo = ?"
                    + "WHERE id = ?");
            
            
            
            prepared.setString(1, null);
            prepared.setString(2, "Baja@bajaAJSHDNEINAS.com");
            prepared.setInt(3, id);
            
            resultado = prepared.executeUpdate();
            
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "La persona se eliminó");
                Limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "No fue posible eliminar a la persona");
            }
            
            conectar.close();
        } catch (Exception e) {
            
            System.err.println("ERROR: "+e);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void textoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCorreoActionPerformed
        
    }//GEN-LAST:event_textoCorreoActionPerformed

    private void nombreComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreComboActionPerformed
        
    }//GEN-LAST:event_nombreComboActionPerformed

    private void botonSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionActionPerformed
        
        
        nombre = nombreCombo.getSelectedItem().toString();
        
        try {
            Connection conectar= conexion.getConnection();
            prepared=conectar.prepareStatement("SELECT * FROM personas WHERE nombre =? AND Soft_Delete = ?");
            prepared.setString(1, nombre);
            prepared.setString(2, "Activo");
            result = prepared.executeQuery();
            
                if(result.next()){
                id=result.getInt("id");
                textoNombre.setText(result.getString("nombre"));
                textoContraseña.setText(result.getString("contraseña"));
                textoDireccion.setText(result.getString("direccion"));
                textoCorreo.setText(result.getString("correo"));
                textoTelefono.setText(result.getString("telefono"));
     
            }else{
                JOptionPane.showMessageDialog(null, "¡El ID no existe!");
            }
           
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
        
        
    }//GEN-LAST:event_botonSeleccionActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        int resultado;
        
        try {
            Connection conectar= conexion.getConnection();
            prepared = conectar.prepareStatement("UPDATE personas SET nombre=?,correo=?,contraseña=?,direccion=?,telefono=?"
                    + "WHERE id = ?");
            
            
            
            prepared.setString(1, textoNombre.getText());
            prepared.setString(2, textoCorreo.getText());
            prepared.setString(3, textoContraseña.getText());
            prepared.setString(4, textoDireccion.getText());
            prepared.setString(5, textoTelefono.getText());
            prepared.setInt(6, id);
            
            resultado = prepared.executeUpdate();
            
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "La persona se actualizó");
                Limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "No fue posible actualizar a la persona");
            }
            
            conectar.close();
        } catch (Exception e) {
            
            System.err.println("ERROR: "+e);
        }
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminacionyActualizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonSeleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JComboBox<String> nombreCombo;
    private javax.swing.JTextField textoContraseña;
    private javax.swing.JTextField textoCorreo;
    private javax.swing.JTextField textoDireccion;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
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
            imagen2 = new ImageIcon(getClass().getResource("/imagenes/Trabajador.png")).getImage();
            
            g.drawImage(imagen2, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

    public void Limpiar(){
       
       textoNombre.setText(null);
       textoContraseña.setText(null);
       textoDireccion.setText(null);
       textoCorreo.setText(null);
       textoTelefono.setText(null);
        
    }

}
