public class tar4 {
    public static void main(String[] args) {
        int numeroIf=10;
        System.out.println("Uso de condicional if");
        if(numeroIf > 0){
            System.out.println("El numero es par");
        }else if (numeroIf == 0) {
            System.out.println("El numero es 0");
        }else {
            System.out.println("El numero es impar");
        }
        System.out.println("Uso de condicinal while");

        int numeroWhile=1;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("Uso de condicinal do while");
        int numeroDoWhile=1;
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile < 3);

        System.out.println("Uso de la condicional for");
        //int numeroFor=0;
        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }
        String estacion="Verano";
        switch (estacion){
            case "Verano":
                System.out.println("Estamos en la estacion de: "+estacion);
                break;
            case "Invierno":
                System.out.println("Estamos en la estacion de: "+estacion);
                break;
            case "Otoño":
                System.out.println("Estamos en la estacion de: "+estacion);
                break;
            case "Primavera":
                System.out.println("Estamos en la estacion de: "+estacion);
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}
