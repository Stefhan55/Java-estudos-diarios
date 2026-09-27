package ExerciciosdeNivelamento;

public class AnaliseVetor {
    static void main(String[] args) {

        int [] numeros = {12,5,-3,20,8,20,15,-1};
        double soma = 0;
        int maior = numeros[0];
        int menor = numeros[0];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length ; i++) {
            soma = soma + numeros[i];
            System.out.println("Valores no Array");
            System.out.println(numeros[i]);

            if (numeros[i] % 2 == 0){
                pares++;

            } else {

                impares++;

            }

            if (numeros[i]> maior){
               maior = numeros[i];
           } else if (numeros[i]< menor) {
               menor = numeros[i];

           }


        }
        double media = soma / numeros.length;
        System.out.println(" a soma total é: " + soma);
        System.out.println(" a média é: " + media);
        System.out.println(" o maior numero é: " + maior);
        System.out.println(" o menor numero é: " + menor);
        System.out.println(" a quantidade de pares é: " + pares);
        System.out.println(" a quantidade de impares é: " + impares);

        int[]invertido = new int [numeros.length];
        for (int i = numeros.length-1; i >=0 ; i--) {
            System.out.println("Valores no Array Invertido");
            System.out.println(numeros[i]+"");
        }

    }
}
