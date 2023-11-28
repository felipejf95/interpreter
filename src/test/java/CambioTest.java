import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CambioTest {

    @Test
    void deveConverterRealParaDolar(){
        Pessoa pessoa = new Pessoa();
        pessoa.setReal(48.7);
        pessoa.setDolar(4.87);
        assertEquals(10, pessoa.converter());
    }

}