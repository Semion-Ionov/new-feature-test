import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumUtilsTest {

    @Test
    public void getSumTest() {
        assertEquals(6, NumUtils.getSum(1, 2, 3));
    }
}