package Embarcacion;

public class Embarcacion {
    protected String capitan;
    protected double precioBase;
    protected  double valorAdicional;
    protected  int añoFabricacion;
    protected  double eslora;
    public  Embarcacion (String capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora, int cantidadMastiles){
        super();
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.añoFabricacion = añoFabricacion;
        this.eslora = eslora;

    }

    public double calcularPrecioAlquiler () {
        double monto = precioBase;
        if (añoFabricacion > 2020 ){
            monto +=20000;
        }
        return monto;
    }

    @Override
    public String toString() {
        return "Embarcacion {" +
                "capitan='" + capitan + '\'' +
                ", precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", añoFabricacion=" + añoFabricacion +
                ", eslora=" + eslora +
                '}';
    }
}

