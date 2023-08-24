package Embarcacion;

public class Velero extends Embarcacion {
    private  int cantidadMastiles;
    public Velero(String Capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora, int cantidadMastiles) {
        super(Capitan, precioBase, valorAdicional, añoFabricacion, eslora, cantidadMastiles);
        this.cantidadMastiles = cantidadMastiles;
    }
    public boolean esGrande() {
        return cantidadMastiles > 5;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "capitan='" + capitan + '\'' +
                ", precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", añoFabricacion=" + añoFabricacion +
                ", eslora=" + eslora +
                '}';
    }
}
