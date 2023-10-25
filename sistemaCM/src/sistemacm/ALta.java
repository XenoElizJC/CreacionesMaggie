package sistemacm;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ALta extends javax.swing.JFrame {

    fondoPanel fondo = new fondoPanel();
    
    public ALta() {
        
        this.setContentPane(fondo);
        initComponents();
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
        textoContraseña = new javax.swing.JTextField();
        etiquetaDireccion = new javax.swing.JLabel();
        textoDireccion = new javax.swing.JTextField();
        etiquetaTelefono = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JTextField();
        botonAlta = new javax.swing.JButton();
        fondoAlta = new fondoPanel2();
        etiquetaArea = new javax.swing.JLabel();
        comboAreas = new javax.swing.JComboBox<>();

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

        textoContraseña.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

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
        comboAreas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAreasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaDireccion)
                    .addComponent(etiquetaContraseña)
                    .addComponent(etiquetaCorreo)
                    .addComponent(presentacionAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNombre)
                    .addComponent(textoCorreo)
                    .addComponent(textoContraseña)
                    .addComponent(etiquetaTelefono)
                    .addComponent(textoDireccion)
                    .addComponent(etiquetaArea)
                    .addComponent(textoTelefono)
                    .addComponent(comboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(botonAlta)
                        .addContainerGap(139, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fondoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(presentacionAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaArea)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(fondoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDireccionActionPerformed

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAltaActionPerformed

    private void comboAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAreasActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaCorreo;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JPanel fondoAlta;
    private javax.swing.JLabel presentacionAlta;
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
}
