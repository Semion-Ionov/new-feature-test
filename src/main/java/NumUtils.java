import java.util.Arrays;

public class NumUtils {
    public static Double getSum(Number... nums) {
        return Arrays.stream(nums).map(Number::doubleValue).reduce(0d, Double::sum);
    }
}
