public class tar3 {
    public static void main(String[] args) {
        System.out.println(suma(1,2,3));
        car miCoche = new car();
        miCoche.sumar_puertas();
        miCoche.sumar_puertas();
        System.out.println("El numero de puertas es: " + miCoche.puerta);
    }
    public static int suma(int a, int b , int c){
        return a+b+c;
    }

}
class car {
    public int puerta =4;
    public void sumar_puertas(){
        this.puerta=puerta+1;
    }
}