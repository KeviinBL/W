package Parqueadero;
import Parqueadero.Parqueaderoo;
import Parqueadero.Carro;
public class Main {
    public static void main (String[] args){

        Parqueaderoo parqueadero = new Parqueaderoo();

        Carro carro1 = new Carro("JGO617", "TOYOTA","FRONTIER" );
        Carro carro2 = new Carro("ASD426","KIA", "CERATO");
        Carro carro3 = new Carro("ZXC159","HYUNDAY","TUCKSON");
        Carro carro4 = new Carro("QWE753", "FORD","FIESTA" );
        Carro carro5 = new Carro("ABC852","CHEVROLET", "SONIC");
        Carro carro6 = new Carro("POI123","JEEP","GRANCHE");

        parqueadero.ParqueoCarro(carro1,5,6);
        parqueadero.ParqueoCarro(carro2,1,3);
        parqueadero.ParqueoCarro(carro3,2,4);
        parqueadero.ParqueoCarro(carro4,3,3);
        parqueadero.ParqueoCarro(carro5,4,2);
        parqueadero.ParqueoCarro(carro6,2,1);

        System.out.println( "El estado del parqueadero es : "); Parqueaderoo.estadoDelParqueadero();

        System.out.println("****************************");


        System.out.println("Costo de estacionamiento para " + carro1 + ": $" + parqueadero.cobrarPorTiempos(carro1, 3));
        System.out.println("Costo de estacionamiento para " + carro2 + ": $" + parqueadero.cobrarPorTiempos(carro2, 2));
        System.out.println("Costo de estacionamiento para " + carro3 + ": $" + parqueadero.cobrarPorTiempos(carro3, 5));
        System.out.println("Costo de estacionamiento para " + carro4 + ": $" + parqueadero.cobrarPorTiempos(carro4, 3));
        System.out.println("Costo de estacionamiento para " + carro5 + ": $" + parqueadero.cobrarPorTiempos(carro5, 2));
        System.out.println("Costo de estacionamiento para " + carro6 + ": $" + parqueadero.cobrarPorTiempos(carro6, 5));
    }

}






