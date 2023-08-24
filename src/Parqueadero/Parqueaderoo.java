package Parqueadero;

public class Parqueaderoo {
    private static Carro[][] espacios;
    private static double tarifaHora;

         public Parqueaderoo() {
            espacios = new Carro[4][4];
            tarifaHora = 8000;
        }

       public boolean ParqueoCarro (Carro carro, int fila, int colunma) {
        if (fila < 0 || fila >= espacios.length || colunma < 0 || colunma >= espacios[0].length) {
            return false;
        }
        if (espacios[fila][colunma] == null) {
            espacios[fila][colunma] = carro;
            return true;
        } else {
            return false;
        }
    }
        public static double cobrarPorTiempos(Carro carro, int horas){
        return tarifaHora * horas;
         }
    public static void estadoDelParqueadero(){
        for (int fila = 0; fila< espacios.length; fila++){
            for (int columna =0; columna<espacios[0].length; columna++){
                if (espacios[fila][columna] == null ) {
                    System.out.println("Espacio esta libre " + " " );
                }else {
                    System.out.println("Espacio esta ocupado " + " X ");
                }
                System.out.println("**************************");

            }
        }
    }


}