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
public class Sobremesa extends Ordenadores{
     private String TipoTorre;

    public Sobremesa() {
        super();
    }

    public Sobremesa(String TipoTorre, int Codigo, int Precio) {
        super(Codigo, Precio);
        this.TipoTorre = TipoTorre;
    }

    public String getTipoTorre() {
        return TipoTorre;
    }

    public void setTipoTorre(String TipoTorre) {
        this.TipoTorre = TipoTorre;
    }

    @Override
    public String RetornoDatos() {
        return "Sobremesa.  TipoTorre: " + this.TipoTorre +"\n"+
               super.RetornoDatos()+"\n"+
               "Es el que más pesa, pero el que menos cuesta." ;
    }
    
}
