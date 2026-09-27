package ExerciciosdeNivelamento;

public class CaixaEletronico {

    static void main(String[] args) {
        int valor = 386;

        int notas100 =  valor /100;
        int resto = valor % 100;

        int notas50 = resto / 50;
        resto = resto % 50;
        int notas20 = resto / 20;
        resto = resto % 20;
        int notas10 = resto / 10;
        resto = resto % 10;
        int notas5 = resto / 5;
        resto = resto % 5;
        int notas2 = resto / 2;
        resto = resto % 2;
        System.out.println("Notas de 100 reais usada:" + notas100);
        System.out.println("Notas de 50 reais usada:" + notas50);
        System.out.println("Notas de 20 reais usada:" + notas20);
        System.out.println("Notas de 10 reais usada:" + notas10);
        System.out.println("Notas de 5 reais usada:" + notas5);
        System.out.println("Notas de 2 reais usada:" + notas2);
        if (resto>0){
            System.out.println("o valor restante nao pode ser entregue com as notas disponiveis");
            System.out.println("R$:"+ resto);
        }
    }
}
