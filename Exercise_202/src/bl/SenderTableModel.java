/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dominik
 */
public class SenderTableModel extends AbstractTableModel{
    private static String[] colNames = {"Sender", "Frequenz", "Band"};
    private ArrayList<Sender> sender = new ArrayList<>();
    
    public void add(Sender s){
        sender.add(s);
        fireTableRowsInserted(sender.size()-1, sender.size()-1);
    }
    
    @Override
    public int getRowCount() {
        return sender.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return sender.get(i);
    }
    
}
