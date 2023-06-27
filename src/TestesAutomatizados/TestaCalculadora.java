package TestesAutomatizados;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestaCalculadora {

    //todo metodo de teste é SEM retorno

    // o nome do metodo deve ser extremamente descritivo
    @Test
    public void deveriaSomarDoisNumerosInteiros(){

        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(3,7);

        Assertions.assertEquals(10, soma);

    }


}
