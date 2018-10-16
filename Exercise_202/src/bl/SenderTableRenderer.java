/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Dominik
 */
public class SenderTableRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int column) {
            Sender s = (Sender) o;
            JLabel label = new JLabel();
            label.setOpaque(true);
            if(s.getBand().equals("FM")){
                label.setBackground(Color.red);
            }else{
                label.setBackground(Color.blue);
            }
            
            switch(column){
                case 0: label.setText(s.getSender());break;
                case 1: label.setText(String.valueOf(s.getFrequenz()));break;
                case 2: label.setText(s.getBand());break;
            }
            return label;
    }
    
}
