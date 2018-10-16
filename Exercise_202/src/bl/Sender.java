/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author Dominik
 */
public class Sender implements Comparable<Sender>{
    private String sender;
    private double frequenz;
    private String band;

    public Sender(String sender, double frequenz, String band) {
        this.sender = sender;
        this.frequenz = frequenz;
        this.band = band;
    }

    public String getSender() {
        return sender;
    }

    public double getFrequenz() {
        return frequenz;
    }

    public String getBand() {
        return band;
    }
    
    public int getColValue(int col){
        return col;
    }

    @Override
    public int compareTo(Sender t) {
        if(this.frequenz>t.frequenz){
            return 1;
        }
        else{
            return -1;
        }
    }
}
