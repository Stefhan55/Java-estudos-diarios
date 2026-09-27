package ExerciciosdeNivelamento;

public class calculadoradeFolha{

     public static void main(String[] args) {
        int horas = 220;
        double valorhora = 10.44;
        double salarioBruto = valorhora*horas;
        double impostoDerenda = 0.0;
        if (salarioBruto <=2000.f){
            impostoDerenda = 0.0;
            System.out.println("isento");
        } else if (salarioBruto <= 4000.f) {
            impostoDerenda = salarioBruto * 0.10;
        }else{
            impostoDerenda = salarioBruto * 0.20;
        }
        double inss = salarioBruto * 0.08;
        double salarioLiquido = salarioBruto-impostoDerenda-inss;
        System.out.printf("Salario Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Desconto IR: R$ %.2f\n", impostoDerenda);
        System.out.printf("Desconto INSS: R$ %.2f\n",inss);
        System.out.printf("Salario Líquido: R$ %.2f\n",salarioLiquido);
    }
}

