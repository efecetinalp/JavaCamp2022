public class Main {
    public static void main(String[] args) {
        WomanGamerCalculator womanGamerCalculator = new WomanGamerCalculator();
        womanGamerCalculator.calculate();
        womanGamerCalculator.gameOver();

        GameCalculator gameCalculator = new ManGamerCalculator();
        gameCalculator.calculate();
        gameCalculator.gameOver();
    }
}
