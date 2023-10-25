
package sistemacm;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Inicio extends javax.swing.JFrame {
    
    fondoPanel fondo = new fondoPanel();
    
    
    public static String correo,contraseña;
    public static int roles_id;
    public SistemaCM conexion = new SistemaCM();       
    public PreparedStatement  prepared;
    public ResultSet result;
    
    
    

    public Inicio() {
        
        this.setContentPane(fondo);
        
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoInicio = new fondoPanel2();
        etiquetaCorreo = new javax.swing.JLabel();
        textoCorreo = new javax.swing.JTextField();
        etiquetaContraseña = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();
        textoContraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout fondoInicioLayout = new javax.swing.GroupLayout(fondoInicio);
        fondoInicio.setLayout(fondoInicioLayout);
        fondoInicioLayout.setHorizontalGroup(
            fondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );
        fondoInicioLayout.setVerticalGroup(
            fondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        etiquetaCorreo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        etiquetaCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaCorreo.setText("Correo");

        textoCorreo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        textoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCorreoActionPerformed(evt);
            }
        });

        etiquetaContraseña.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        etiquetaContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaContraseña.setText("Contraseña");

        botonIngresar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        textoContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoContraseñaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fondoInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoCorreo)
                    .addComponent(etiquetaContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoContraseña)
                    .addComponent(etiquetaCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(botonIngresar)))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(fondoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonIngresar)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCorreoActionPerformed
        
        
    }//GEN-LAST:event_textoCorreoActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        correo=textoCorreo.getText();
        contraseña=textoContraseña.getText();
        
        try {
            Connection conectar = conexion.getConnection();
            prepared=conectar.prepareStatement("SELECT * FROM personas Where correo = ?");
            prepared.setString(1, String.valueOf(correo));
            result = prepared.executeQuery();
            
                if(result.next()){
                    
                   roles_id = result.getInt("roles_id");
                   String Aux = result.getString("Contraseña");
                   
                   if(contraseña.equals(Aux)){
                   
                   
                   switch(roles_id){
                       
                       case 1 -> {
                           new Administrador().setVisible(true);
                           this.setVisible(false);
                    }
                           
                       case 2 -> {
                           new Finanzas().setVisible(true);
                           this.setVisible(false);
                    }
                           
                           
                        case 3 -> {
                            new RecursosHumanos().setVisible(true);
                            this.setVisible(false);
                    }
                   }
                   }else{
                    JOptionPane.showMessageDialog(null, "¡Contraseña incorrecta!");
                    conectar.close();
                }
                 
            }else{
                JOptionPane.showMessageDialog(null, "¡El usuario no existe!");
            }
                
            conectar.close();
        }catch (Exception e) {
            System.err.println("Error"+e);
        } 
        
        
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void textoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoContraseñaActionPerformed

        
        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaCorreo;
    private javax.swing.JPanel fondoInicio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField textoContraseña;
    private javax.swing.JTextField textoCorreo;
    // End of variables declaration//GEN-END:variables

    class fondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/Flor.jpg")).getImage();
            
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
            imagen2 = new ImageIcon(getClass().getResource("/imagenes/Creaciones.png")).getImage();
            
            g.drawImage(imagen2, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
    
}

