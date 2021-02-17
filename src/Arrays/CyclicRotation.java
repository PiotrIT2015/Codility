package Arrays;

import java.lang.Math;
import java.util.Random;

public class CyclicRotation {

    public int[] solution(int[] A, int K){

        int B[]=new int[A.length];

        for(int i=0;i<A.length;i++){
            B[(i+K)%A.length]=A[i];
        }

        return B;
    }

    public static void main(String[] args) {

        int N = (int) (Math.random() * (100 - 0));
        int K = (int) (Math.random() * (100 - 0));
        Random random=new Random();
        int j = random.nextInt(1000+1000)-1000;
        int A[]=new int[N];

        for(int i=0;i<A.length;i++){
            A[i]=j;
        }

        CyclicRotation rotation=new CyclicRotation();

        rotation.solution(A,K);
    }
}
