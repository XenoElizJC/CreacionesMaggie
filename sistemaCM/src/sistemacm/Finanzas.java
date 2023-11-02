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

public class Finanzas extends javax.swing.JFrame {
    
    fondoPanel fondo = new fondoPanel();
    
    public SistemaCM conexion = new SistemaCM(); 
    public PreparedStatement  prepared;
    public ResultSet result;
    
    public Finanzas() {
        
        this.setContentPane(fondo);
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaFinanzas = new fondoPanel2();
        presentacionFinanzas = new javax.swing.JLabel();
        botonVentas = new javax.swing.JButton();
        botonGanancias = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        finanzaTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout etiquetaFinanzasLayout = new javax.swing.GroupLayout(etiquetaFinanzas);
        etiquetaFinanzas.setLayout(etiquetaFinanzasLayout);
        etiquetaFinanzasLayout.setHorizontalGroup(
            etiquetaFinanzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        etiquetaFinanzasLayout.setVerticalGroup(
            etiquetaFinanzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        presentacionFinanzas.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        presentacionFinanzas.setText("Finanzas");

        botonVentas.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonVentas.setText("Ventas");
        botonVentas.setToolTipText("");
        botonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVentasActionPerformed(evt);
            }
        });

        botonGanancias.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonGanancias.setText("Compras");
        botonGanancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGananciasActionPerformed(evt);
            }
        });

        finanzaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cliente", "Unidades", "Total"
            }
        ));
        jScrollPane1.setViewportView(finanzaTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(presentacionFinanzas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaFinanzas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(305, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonGanancias)
                            .addComponent(botonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(presentacionFinanzas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaFinanzas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(botonVentas)
                        .addGap(32, 32, 32)
                        .addComponent(botonGanancias))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVentasActionPerformed
        try {
            
            Connection conectar= conexion.getConnection();
            prepared = conectar.prepareStatement("SELECT * FROM ventas v "
                    + "LEFT JOIN personas p ON v.persona_id = p.id "
                    + "LEFT JOIN inventarios i ON v.inventario_id = i.id "
                    + "WHERE v.Soft_Delete = ?");
           
            prepared.setString(1,"Activo");
            result = prepared.executeQuery();

            DefaultTableModel model = (DefaultTableModel) finanzaTabla.getModel();

            
            model.setRowCount(0);

            
            while (result.next()) {
                Object[] fila = new Object[5]; 
                fila[0] = result.getString("i.nombre");
                fila[1] = result.getString("p.nombre");
                fila[2] = result.getString("v.cantidad");
                fila[3] = result.getString("v.precio");
  
                model.addRow(fila);
            }
            conectar.close();
            // Cierra la conexión
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botonVentasActionPerformed

    private void botonGananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGananciasActionPerformed
        try {
            
            Connection conectar= conexion.getConnection();
            prepared = conectar.prepareStatement("SELECT * FROM inventarios WHERE Soft_Delete = ? AND tipo = ?");
           
            prepared.setString(1,"Activo");
            prepared.setString(2,"Material");
            result = prepared.executeQuery();

            DefaultTableModel model = (DefaultTableModel) finanzaTabla.getModel();

            
            model.setRowCount(0);

            
            while (result.next()) {
                Object[] fila = new Object[5]; 
                fila[0] = result.getString("nombre");
                fila[1] = result.getString("tipo");
                fila[2] = result.getString("numero_existencia");
                fila[3] = result.getString("precio");
  
                model.addRow(fila);
            }
            conectar.close();
            // Cierra la conexión
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botonGananciasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(this, "¿Desea salir de la Aplicación?", "Seleccione una opción", WIDTH);
       
       if(result == JOptionPane.YES_OPTION){
           setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
           
    }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finanzas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGanancias;
    private javax.swing.JButton botonVentas;
    private javax.swing.JPanel etiquetaFinanzas;
    private javax.swing.JTable finanzaTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel presentacionFinanzas;
    // End of variables declaration//GEN-END:variables
    class fondoPanel extends JPanel
    {
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
            imagen2 = new ImageIcon(getClass().getResource("/imagenes/Dolar.png")).getImage();
            
            g.drawImage(imagen2, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

}
