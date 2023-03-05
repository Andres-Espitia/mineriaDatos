import java.util.Scanner;

public class NumeroRandom {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /* int numAle, numIngresado, intentos = 0;
        numAle = (int) (Math.random()*100)+1;
        System.out.println(numAle);

        while(intentos < 5){
            intentos++;
            do{
                System.out.println("Ingrese el numero que cree que es el correcto:");
                numIngresado = teclado.nextInt();
            }while(numIngresado < 1 && numIngresado > 100);
            if(numIngresado == numAle){
                System.out.println("Felicitaciones el numero es: " + numAle + " adivinaste el numeor oculto en el intento: " + intentos);
                intentos = 5;
            }else if (numIngresado > numAle){
                System.out.println("Intento numero: " + intentos + " el numero que ingresaste es mayor que el numero oculto.");
            }else if(numIngresado < numAle){
                System.out.println("Intento numero: " + intentos + " el numero que ingresaste es menor que el numero oculto.");
            }

        }*/

        //1 piedra
        //2 papel
        //3 tiejras
        int numJ1, numJ2, ganador = 0, contador = 0, win1 = 0, win2 = 0, empate = 0;

        while (win1 < 3 && win2 < 3) {
            do {
                contador++;
                numJ1 = (int) (Math.random() * 3) + 1;
                numJ2 = (int) (Math.random() * 3) + 1;

                if (numJ1 == 1 && numJ2 == 2) {
                    System.out.println("Jugador 1 piedra, jugador 2 papel");
                    System.out.println("numero de rondas jugadas: " + contador + " el ganador es el jugador numero 2");
                    ganador = 1;
                    win2++;
                } else if (numJ1 == 1 && numJ2 == 3) {
                    System.out.println("Jugador 1 piedra, jugador 2 tijeras");
                    System.out.println("numero de rondas jugadas: " + contador + " el ganador es el jugador numero 1");
                    ganador = 1;
                    win1++;
                } else if (numJ1 == 2 && numJ2 == 1) {
                    System.out.println("Jugador 1 papel, jugador 2 piedra");
                    System.out.println("numero de rondas jugadas: " + contador + " el ganador es el jugador numero 1");
                    ganador = 1;
                    win1++;
                } else if (numJ1 == 2 && numJ2 == 3) {
                    System.out.println("Jugador 1 papel, jugador 2 tijeras");
                    System.out.println("numero de rondas jugadas: " + contador + " el ganador es el jugador numero 2");
                    ganador = 1;
                    win2++;
                } else if (numJ1 == 3 && numJ2 == 1) {
                    System.out.println("Jugador 1 tiejras, jugador 2 piedra");
                    System.out.println("numero de rondas jugadas: " + contador + " el ganador es el jugador numero 2");
                    ganador = 1;
                    win2++;
                } else if (numJ1 == 3 && numJ2 == 2) {
                    System.out.println("Jugador 1 tijeras, jugador 2 papel");
                    System.out.println("numero de rondas jugadas: " + contador + " el ganador es el jugador numero 1");
                    ganador = 1;
                    win1++;
                } else if (numJ1 == numJ2) {
                    System.out.println("Empate!!!");
                    empate++;
                }
                System.out.println("El jugador numero 1 lleva ganadas: " + win1 + " jugador numero dos lleva gandas: " + win2 + " empates: " + empate);
            } while (ganador != 1);
        }

    }
}