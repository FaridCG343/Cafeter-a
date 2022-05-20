/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria;

/**
 *
 * @author 701
 */
public class Capuchino extends Vaso{
    private Tamanio tamanio;
    private Extras extras;
    private Leches leches;

    public Capuchino(Tamanio tamanio, Extras extras, Leches leches) {
        this.tamanio = tamanio;
        this.extras = extras;
        this.leches = leches;
    }

    

    public Capuchino() {
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public Extras getExtras() {
        return extras;
    }

    public void setExtras(Extras extras) {
        this.extras = extras;
    }

    public Leches getLeches() {
        return leches;
    }

    public void setLeches(Leches leches) {
        this.leches = leches;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCapuchino" + "\nTamaño:" + tamanio + "\nExtras: " + extras + "\n:Leches=" + leches;
    }
    
}
