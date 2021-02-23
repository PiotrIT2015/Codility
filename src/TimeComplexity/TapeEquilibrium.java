package TimeComplexity;

import java.lang.Math;
import java.util.Collections;
import java.util.ArrayList;

public class TapeEquilibrium {

    public int solution6(int[] A){
        int sum1=0, sum2=0, sum=0, min_difference=0;
        ArrayList<Integer> difference=new ArrayList();

        for(int i=0;i<A.length;i++) {
            sum = sum + A[i];
        }
        for(int p=0; p<A.length-1; p++) {
            sum1 += A[p];
            sum2 = sum - sum1;
            difference.add(Math.abs(sum1 - sum2));
            min_difference=Collections.min(difference);
        }

        return min_difference;
    }
}
