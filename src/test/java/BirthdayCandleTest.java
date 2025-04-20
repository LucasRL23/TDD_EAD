import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BirthdayCandleTest {

    @Test
    public void deveApagarDuasVelasMaisAltas() {
        BirthdayCandle candle = new BirthdayCandle();
        int[] alturas = {4, 4, 1, 3};
        int resultado = candle.countMaxHeightCandles(alturas);
        assertEquals(2, resultado);
    }
}
