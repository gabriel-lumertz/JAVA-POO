package com.mycompany.aula03;

/**
 *
 * @author gabriel@lumertz.dev
 */
public class Aula03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "azul";
//        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
//        c1.rabiscar = true;
        c1.status();
    }
}
