import java.util.Arrays;

public class myMath {

    public int calculateArraySum(int[]arr)
    {
        int sum = 0;
        for(int a : arr)
            sum += a;
        return sum;
    }
}
