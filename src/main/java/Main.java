import utils.ComputerTool;

public class Main {
    /**
     * 主方法入口
     * @param args
     */
    public static void main(String[] args) {
        Fraction fraction = Fraction.builder().numerator(5).denominator(10).build();
        System.out.println(fraction.getDenominator());
    }
}
