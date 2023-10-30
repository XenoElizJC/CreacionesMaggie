package sistemacm;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ALta extends javax.swing.JFrame {

    fondoPanel fondo = new fondoPanel();
  
    public int n;
    public SistemaCM conexion = new SistemaCM();       
    public PreparedStatement  prepared;
    public ResultSet result;
    
    Connection conectar= conexion.getConnection();
    
    llenarComboBox re = new llenarComboBox();
    
    public ALta() {
        this.setContentPane(fondo);
        initComponents();
        
        re.rellenarComboBox("areas", "area", comboAreas);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        presentacionAlta = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        etiquetaCorreo = new javax.swing.JLabel();
        textoCorreo = new javax.swing.JTextField();
        etiquetaContraseña = new javax.swing.JLabel();
        etiquetaDireccion = new javax.swing.JLabel();
        textoDireccion = new javax.swing.JTextField();
        etiquetaTelefono = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JTextField();
        botonAlta = new javax.swing.JButton();
        fondoAlta = new fondoPanel2();
        etiquetaArea = new javax.swing.JLabel();
        comboAreas = new javax.swing.JComboBox<>();
        etiquetaConfirmar = new javax.swing.JLabel();
        textoContraseña = new javax.swing.JPasswordField();
        textoConfirmar = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        presentacionAlta.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        presentacionAlta.setText("Ingrese los datos del empleado");

        etiquetaNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        etiquetaNombre.setText("Nombre:");

        textoNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });

        etiquetaCorreo.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        etiquetaCorreo.setText("Correo");

        textoCorreo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        etiquetaContraseña.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        etiquetaContraseña.setText("Contraseña");

        etiquetaDireccion.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        etiquetaDireccion.setText("Dirección");

        textoDireccion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        textoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDireccionActionPerformed(evt);
            }
        });

        etiquetaTelefono.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        etiquetaTelefono.setText("Teléfono");

        textoTelefono.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        botonAlta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        botonAlta.setText("Alta de usuario");
        botonAlta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoAltaLayout = new javax.swing.GroupLayout(fondoAlta);
        fondoAlta.setLayout(fondoAltaLayout);
        fondoAltaLayout.setHorizontalGroup(
            fondoAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        fondoAltaLayout.setVerticalGroup(
            fondoAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        etiquetaArea.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        etiquetaArea.setText("Área");

        comboAreas.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        comboAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAreasActionPerformed(evt);
            }
        });

        etiquetaConfirmar.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        etiquetaConfirmar.setText("Confirmar Contraseña");

        textoContraseña.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        textoConfirmar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaDireccion)
                    .addComponent(etiquetaContraseña)
                    .addComponent(etiquetaCorreo)
                    .addComponent(presentacionAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNombre)
                    .addComponent(textoCorreo)
                    .addComponent(etiquetaTelefono)
                    .addComponent(textoDireccion)
                    .addComponent(etiquetaArea)
                    .addComponent(textoTelefono)
                    .addComponent(comboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaConfirmar)
                    .addComponent(textoConfirmar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(botonAlta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(fondoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(presentacionAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(etiquetaNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaContraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(etiquetaConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(etiquetaDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fondoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        
    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDireccionActionPerformed

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
       
       int resultado;
       String contraseña, aux;
       contraseña = textoContraseña.getText();
       aux = textoConfirmar.getText();
       
       Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
       
       String correo=textoCorreo.getText();
 
       Matcher mather = pattern.matcher(correo);
       
    if(textoContraseña.getText().length()<6)
    {
        JOptionPane.showMessageDialog(null, "¡Contraseña muy corta!");
        textoContraseña.setText(null);
    }else if(textoContraseña.getText().length()>15){
        JOptionPane.showMessageDialog(null, "¡Contraseña muy larga!");
        textoContraseña.setText(null);
    }else if (mather.find() != true) {
        JOptionPane.showMessageDialog(null, "¡Correo incorrecto!");
        textoCorreo.setText(null);
    }else if(contraseña.equals(aux)){
        
        try {
            
            prepared = conectar.prepareStatement("INSERT INTO personas(id,rol_id, nombre, correo, contraseña, direccion,telefono,area_id,Soft_Delete)"
                    + " VALUES (?, ?, ?, ?, ?, ?,?,?,?)");
            
            prepared.setString(1, null);
            prepared.setString(2, "2");
            prepared.setString(3, textoNombre.getText());
            prepared.setString(4, textoCorreo.getText());
            prepared.setString(5, textoContraseña.getText());
            prepared.setString(6, textoDireccion.getText());
            prepared.setString(7, textoTelefono.getText());
            
            switch(comboAreas.getSelectedItem().toString()){
                case "Recursos Humanos":
                    prepared.setInt(8, 1);
                    break;
                
                case "Operaciones":
                    prepared.setInt(8, 2);
                    break;
                    
                case "Finanzas":
                    prepared.setInt(8, 3);
                    break;
            }
            
            prepared.setString(9,"Activo");
            
            resultado = prepared.executeUpdate();
            
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "La persona fue registrada");
                Limpiar();
                
            }else{
                JOptionPane.showMessageDialog(null, "No fue posible ingresar a la persona");
            }
            
            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e+ "Datos ingresados incorrectos. Favor de verificar los datos");
            System.err.println("ERROR: "+e);
            Limpiar();
        }
        
    }else{
        JOptionPane.showMessageDialog(null, "¡Las contraseñas son distintas!");
        textoContraseña.setText(null);
        textoConfirmar.setText(null);
        
               }
    }//GEN-LAST:event_botonAltaActionPerformed

    private void comboAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAreasActionPerformed
       
    }//GEN-LAST:event_comboAreasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlta;
    private javax.swing.JComboBox<String> comboAreas;
    private javax.swing.JLabel etiquetaArea;
    private javax.swing.JLabel etiquetaConfirmar;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaCorreo;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JPanel fondoAlta;
    private javax.swing.JLabel presentacionAlta;
    private javax.swing.JPasswordField textoConfirmar;
    private javax.swing.JPasswordField textoContraseña;
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
       textoConfirmar.setText(null);
       textoDireccion.setText(null);
       textoCorreo.setText(null);
       textoTelefono.setText(null);
        
    }

}
