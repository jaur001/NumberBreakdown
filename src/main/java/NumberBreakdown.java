import java.util.stream.IntStream;

public class NumberBreakdown {

    public static final int ZERO = 0;
    public static final int LIMIT = 4000;
    private int number;

    public NumberBreakdown(int number) {
        this.number = number;
    }

    public int[][] breakDown() {
        if(isIncorrectNumber()) return new int[][]{{}};
        return IntStream.range(0, numberLength()).boxed()
                .map(this::breakPosition)
                .filter(this::isNotZero)
                .toArray(int[][]::new);
    }

    private boolean isNotZero(int[] number) {
        return number[0] != 0;
    }

    private int[] breakPosition(int i) {
        return new int[]{getValueOf(i),numberLength()-i-1};
    }

    private int getValueOf(int i) {
        return stringToInt(getString().substring(i,i+1));
    }

    private boolean isIncorrectNumber() {
        return number < ZERO || number >= LIMIT;
    }

    private int numberLength() {
        return getString().length();
    }

    private int stringToInt(String num) {
        return Integer.parseInt(num);
    }

    private String getString() {
        return String.valueOf(number);
    }
}
