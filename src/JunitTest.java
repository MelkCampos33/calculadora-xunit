import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

    public class JunitTeste {

        private Calculadora calc;

        @BeforeEach
        public void init() {
            calc = new Calculadora();
        }

        @Test
        public void testSoma() {
            assertEquals(9, calc.somar(4, 5));
        }

        @Test
        public void testSubtracao() {
            assertEquals(1, calc.subtrair(5, 4));
        }

        @Test
        public void testMultiplicacao() {
            assertEquals(20, calc.multiplicar(4, 5));
        }

        @Test
        public void testDivisao() {
            assertEquals(2, calc.dividir(10, 5));
        }

        @Test
        public void testDivisaoPorZero() {
            assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
        }

        @Test
        public void testPotencia() {
            assertEquals(8, calc.potencia(2, 3));
        }
    }


