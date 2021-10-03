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
public class Ordenadores {
    private int Codigo;
    private int Precio;

    public Ordenadores() {
    }

    public Ordenadores(int Codigo, int Precio) {
        this.Codigo = Codigo;
        this.Precio = Precio;
    }

    public int getCodigo() {
        return Codigo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    
    public String RetornoDatos() {
        return "Codigo:" + this.Codigo + "\n"+
               "Precio:" + this.Precio ;
    }
}
