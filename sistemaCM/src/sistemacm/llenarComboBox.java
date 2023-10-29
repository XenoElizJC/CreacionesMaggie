
package sistemacm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class llenarComboBox {
    
    public SistemaCM conexion = new SistemaCM();       
    public PreparedStatement  prepared;
    public ResultSet result;
    
    Connection conectar= conexion.getConnection();
    
    public void rellenarComboBox(String tabla, String valor, JComboBox combo){
    try {
            Connection conectar = conexion.getConnection();
            prepared=conectar.prepareStatement("SELECT * FROM "+tabla);
            result = prepared.executeQuery();
            
            while(result.next())
                combo.addItem(result.getString(valor));
            
            conectar.close();
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    
}
}
