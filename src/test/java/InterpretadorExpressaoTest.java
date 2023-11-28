import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpretadorExpressaoTest {

    @Test
    void deveCalcularSoma(){
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("10 + 5");
        assertEquals(15, interpretador.interpretar());
    }

    @Test
    void deveCalcularSubtracao(){
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("10 - 5");
        assertEquals(5, interpretador.interpretar());
    }

    @Test
    void deveCalcularMultiplicacao(){
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("10 * 5");
        assertEquals(50, interpretador.interpretar());
    }

    @Test
    void deveCalcularDivisao(){
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("10 / 5");
        assertEquals(2, interpretador.interpretar());
    }

    @Test
    void deveRetornarExcecaoElementoInvalido(){
        try{
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("10 # 5");
            assertEquals(2, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Expressão com elemento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoExpressaoInvalida(){
        try{
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("10 +");
            assertEquals(2, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Expressão     inválida", e.getMessage());
        }
    }
}