import static org.junit.jupiter.api.Assertions.*;

class myMathTest {
    private myMath math = new myMath();

    private int calRes(int[]numbers)
    {
        return math.calculateSum(numbers);
    }
    @org.junit.jupiter.api.Test
    void calculateSum_ThreeMem() {
       assertEquals(6,calRes(new int[]{1,2,3}));
    }
    @org.junit.jupiter.api.Test
    void calculateSum_EmptyArr() {
        assertEquals(0,calRes(new int[]{}));
    }
}