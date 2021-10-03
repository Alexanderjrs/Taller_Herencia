/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author acer
 */
public class Portati extends Ordenadores {
    private int Peso;

    public Portati() {
        super();
    }

    public Portati(int Peso, int Codigo, int Precio) {
        super(Codigo, Precio);
        this.Peso = Peso;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    @Override
    public String RetornoDatos() {
        return "Portatil. " + " Peso: " + this.Peso + "\n"+
               super.RetornoDatos()+"\n"+
               "Ideal para sus viajes.";
    }
}
