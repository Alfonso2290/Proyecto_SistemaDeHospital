package JTableColor;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer
{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int fila, int columna) 
    {
        if( fila %2 == 0)
        {
            setBackground(Color.ORANGE); // para cabiar fondo de la fila
            setForeground(Color.BLACK);   // Para cambiar la letra de la fila
             
        }
        else // en caso no se cumpla la restriccion la cual usamos para que se alternen las filas y los colores
        {
            setBackground(Color.yellow); 
            setForeground(Color.BLACK);  
        }
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, fila, columna); //To change body of generated methods, choose Tools | Templates.
    }
    
}
