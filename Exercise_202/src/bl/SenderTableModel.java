/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.ArrayList;
import java.util.Collections;
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
    public String getColumnName(int column) {
        return colNames[column];
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
    
    public void numCols(int numCols){
        colNames = new String[numCols];
//        for (int i = 0; i < numCols; i++) {
//            colNames[i] = colNames[i];
//        }
        if(numCols==2){
            colNames[0] = "Sender";
            colNames[1] = "Frequenz";
        }
        else{
            colNames[0] = "Sender";
            colNames[1] = "Frequenz";
            colNames[2] = "Band";
        }
        fireTableStructureChanged();
    }
    
    public void sort(){
        Collections.sort(sender);
        fireTableRowsUpdated(0,sender.size()-1);
    }
    
}
