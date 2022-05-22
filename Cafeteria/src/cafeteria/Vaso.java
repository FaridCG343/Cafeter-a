/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafeteria;

/**
 *
 * @author farid
 */
public abstract class Vaso {

    protected static int numVaso;
    protected int numVaso1;
    protected int refill;

    public Vaso() {
        this.refill = 0;
        numVaso++;
        this.numVaso1 = numVaso;
    }

    public String Refill() {
        String temp;
        refill++;
        if (this.refill <=3) {
            temp = "\nDifruta tu refill =D\nRefil restantes: " + (3 - this.refill);
        } else {
            temp = "\nLo sentimos pero ya no te quedan refill";
        }
        return temp;
    }

    public String Refillr() {
        String temp;
        if (this.refill < 4) {
            temp = "\nDifruta tu refill =D\nRefil restantes: " + (3 - this.refill);
        } else {
            temp = "\nLo sentimos pero ya no te quedan refill";
        }
        return temp;
    }

    public int getNumVaso1() {
        return numVaso1;
    }

    abstract double Precio();

    @Override
    public String toString() {
        return "Numero de vaso:" + numVaso;
    }
}
