/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafeteria;

/**
 *
 * @author farid
 */
public class Mokaccino extends Vaso {

    private Tamanio tamanio;
    private Extras extra1;
    private Extras extra2;
    private Extras extra3;
    private Leches leches;

    public Mokaccino(Tamanio tamanio, Extras extra1, Extras extra2, Extras extra3, Leches leches) {
        this.tamanio = tamanio;
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
        this.leches = leches;
    }

    public Mokaccino() {
        this.extra1 = null;
        this.extra2 = null;
        this.extra3 = null;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public Extras getExtra1() {
        return extra1;
    }

    public void setExtra1(Extras extra1) {
        this.extra1 = extra1;
    }

    public Extras getExtra2() {
        return extra2;
    }

    public void setExtra2(Extras extra2) {
        this.extra2 = extra2;
    }

    public Extras getExtra3() {
        return extra3;
    }

    public void setExtra3(Extras extra3) {
        this.extra3 = extra3;
    }

    public Leches getLeches() {
        return leches;
    }

    public void setLeches(Leches leches) {
        this.leches = leches;
    }

    @Override
    public double Precio() {
        double precio = 30;
        switch (this.tamanio) {
            case Chico -> {
                precio += 10;
            }
            case Mediano -> {
                precio += 15;
            }
            case Grande -> {
                precio += 20;
            }
        }
        if (this.leches == Leches.Nutrileche) {
            precio += 10;
        } else {
            precio += 15;
        }
        if (extra1 != null) {
            switch (extra1) {
                case Galleta -> {
                    precio += 10;
                }
                case Dona -> {
                    precio += 15;
                }
                case Azucar -> {
                    precio += 5;
                }
                case Chocolate -> {
                    precio += 10;
                }
            }
        }
        if (extra2 != null) {
            switch (extra1) {
                case Galleta -> {
                    precio += 10;
                }
                case Dona -> {
                    precio += 15;
                }
                case Azucar -> {
                    precio += 5;
                }
                case Chocolate -> {
                    precio += 10;
                }
            }
        }
        if (extra3 != null) {
            switch (extra1) {
                case Galleta -> {
                    precio += 10;
                }
                case Dona -> {
                    precio += 15;
                }
                case Azucar -> {
                    precio += 5;
                }
                case Chocolate -> {
                    precio += 10;
                }
            }
        }
        return precio;
    }

    @Override
    public String toString() {
        String e;
        if (extra1 == null) {
            e = "Ninguno";
        } else if (extra2 == null) {
            e = extra1.toString();
        } else if (extra3 == null) {
            e = extra1.toString() + ", " + extra2.toString();
        } else {
            e = extra1.toString() + ", " + extra2.toString() + ", " + extra3.toString();
        }
        return super.toString() + "\nMokaccino" + "\nTamaño:" + tamanio + "\nExtras: " + e + "\nLeches=" + leches;
    }
}