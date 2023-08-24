package Embarcacion;

import Embarcacion.Capitan;
import Embarcacion.Velero;
import Embarcacion.Yate;
import Embarcacion.Embarcacion;

public class Main {

    public static void main(String[] args) {
        Capitan capitanJorge = new Capitan("JORGE","SUAREZ", "M789456AS");
        Capitan capitanTonny = new Capitan("TONNY","SUAREZ", "M123456ZX");

       Velero velero1 = new Velero("capitanJorge",200000,0,2016,5,3);
       Velero velero2 = new Velero("capitanTonny",500000,20000,2022,15,8);
       Yate yate1 = new Yate("capitanTonny",500000,0,2018,10,5);
       Yate yate2 = new Yate("capitanJorge",800000,20000,2023,22,9);



        System.out.println(capitanJorge);
        System.out.println(capitanTonny);

        System.out.println( "********************************************");

        System.out.println(velero1)  ;
        System.out.println("El valor del velero 1 es :" + velero1.calcularPrecioAlquiler());
        System.out.println("El velero es grande: " + velero1.esGrande());


        System.out.println(velero2);
        System.out.println( "El valor del velero 2 es : " + velero2.calcularPrecioAlquiler());
        System.out.println("El velero es grande: " + velero2.esGrande());

        System.out.println("**********************************************");

        System.out.println(yate1);
        System.out.println("El valor del Yate 1 es :" + yate1.calcularPrecioAlquiler());
        System.out.println("El yate es lujoso: " + yate1.esYateLujoso());
        System.out.println("vendido" + yate1.comprar());


        System.out.println(yate2);
        System.out.println( "El valor del Yate 2 es : " + yate2.calcularPrecioAlquiler());
        System.out.println("El yate es lujoso: " + yate2.esYateLujoso());
        System.out.println(yate2.comprar());
        System.out.println( "El yate ha sido vendido " );
    }
}

