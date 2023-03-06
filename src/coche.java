public class coche {
    int puertasCoche;
    //crear una funcion que incrementa en numero de puertas
public void incrementarPuertas(){
        puertasCoche++;
    }
//crear un objeto llamado miCoche  y añadirle una puerta con la funcion incrementarPuertas
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertasCoche);
    }

}
