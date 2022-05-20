/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria;

/**
 *
 * @author 701
 */
public class Vaso {
    protected static int numVaso1=0;
    protected int refill=0;

    public Vaso() {
        this.refill=0;
        numVaso1++;
    }

    @Override
    public String toString() {
        return "Numero de vaso:"+numVaso1+"\nRefill:" + refill;
    }
    
    
}
