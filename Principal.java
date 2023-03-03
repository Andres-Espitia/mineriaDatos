import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.0");
        int opc;
        System.out.println("Que desa calcular");
        System.out.println("1. Indice de masa corporal");
        System.out.println("2. Promedio de notas de programación");
        System.out.println("Digite el número de una opción");
        opc = teclado.nextInt();
        while(opc != 1 || opc != 2){
            System.out.println("Opción no válida, pofavor digite otra opción");
            opc = teclado.nextInt();
        }

        if(opc == 1 ){
            double peso, altura, imc;
            System.out.println("Por favor ingrese su peso en kilogramos");
            peso = teclado.nextDouble();
            while (peso < 25 && peso > 635){
                System.out.println("Peso no valido, por favor ingrese de nuevo su peso:");
                peso = teclado.nextDouble();
            }
            System.out.println("Por favor ingrese su altura en metros");
            altura = teclado.nextDouble();
            while(altura < 0.63 && altura > 2.43){
                System.out.println("Altura no valida, por favor ingrese de nuevo su altura: ");
                altura = teclado.nextDouble();
            }

            imc = peso/Math.pow(altura,2);
            if(imc < )



        }else {

        int numeroEstudiantes;
        double primeraNota, segundaNota, terceraNota, promedio;

        do{
            System.out.println("Digite el numero de estudiantes:");
            numeroEstudiantes = teclado.nextInt();
        }while(numeroEstudiantes < 0);

        for (int i = 1; i <= numeroEstudiantes; i++){
            do{
                System.out.println("Estuandte numero: " + i + " Digite su primera Nota");
                primeraNota = teclado.nextDouble();
            }while(primeraNota >= 0 && primeraNota <= 5.0);
            do{
                System.out.println("Estuandte numero: " + i + " Digite su segunda Nota");
                segundaNota = teclado.nextDouble();
            }while(segundaNota >= 0 && segundaNota <= 5.0 );
            do {
                System.out.println("Estuandte numero: " + i + " Digite su tercera Nota");
                terceraNota = teclado.nextDouble();
            }while(terceraNota >= 0 && terceraNota <= 5.0);

            promedio = (primeraNota * 0.3) + (segundaNota * 0.35) + (terceraNota * 0.35);
            promedio = Double.parseDouble(formato.format(promedio));
            if(promedio >= 0 && promedio <= 2.9){
                System.out.println("Su promedio es: " + i + " por lo cual su rendimiento es insiuficiente");
            } else if (promedio >= 3.0 && promedio < 4.0) {
                System.out.println("Su promedio es: " + i + " por lo cual usted es un esetudiante promedio");
            } else if (promedio >= 4.0) {
                System.out.println("Su promedio es: " + i + " por lo cual su rendimiento es sobresaliente");
            }
        }

        }


    }
}
