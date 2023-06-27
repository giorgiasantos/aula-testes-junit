package TestesManuais;

public class TestaCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        // TESTES MANUAIS
         int soma = calculadora.soma(3, 7);
         System.out.println(soma);

         soma = calculadora.soma(3 , 0);
         System.out.println(soma);

        soma = calculadora.soma(3 , -1);
        System.out.println(soma);
    }
}
