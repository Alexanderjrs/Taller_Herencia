/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Principal.Portati;
import Principal.Sobremesa;

/**
 *
 * @author acer
 */
public class Test {
     public static void main(String[] args) {
        Portati P = new Portati(3, 2565, 2400000);
        System.out.println(P.RetornoDatos());
         System.out.println("------------------------------------------");
        Sobremesa SM = new Sobremesa("Sencilla", 5485, 5000000);
        System.out.println(SM.RetornoDatos());
    }
}
