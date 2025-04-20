public class BirthdayCandle {
    public int countMaxHeightCandles(int[] alturas) {
        int max = 0;
        int contagem = 0;
        for (int altura : alturas) {
            if (altura > max) {
                max = altura;
                contagem = 1;
            } else if (altura == max) {
                contagem++;
            }
        }
        return contagem;
    }
}
