package Arrays;

import java.lang.Math;
import java.util.Random;

public class CyclicRotation {

    public int[] solution2(int[] A, int K){

        int B[]=new int[A.length];

        for(int i=0;i<A.length;i++){
            B[(i+K)%A.length]=A[i];
        }

        return B;
    }

}
