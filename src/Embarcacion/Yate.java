package Embarcacion;

public class Yate  extends  Embarcacion {
    private static int cantidadCamarotes;
    private  boolean vendido;
    public  Yate(String capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, añoFabricacion, eslora, cantidadCamarotes);
        this.cantidadCamarotes = cantidadCamarotes;
        this.vendido = false;
    }


    public boolean esYateLujoso() {return cantidadCamarotes < 7;}

    public boolean comprar(){
        vendido = vendido ;
        vendido  = true;
        return false;
    }

    @Override
    public String toString() {
        return "Yate{" +
                ", capitan='" + capitan + '\'' +
                ", precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", añoFabricacion=" + añoFabricacion +
                ", eslora=" + eslora +
                "vendido=" + vendido +
                '}';
    }
}

