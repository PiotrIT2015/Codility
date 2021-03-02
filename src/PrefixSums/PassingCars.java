package PrefixSums;

public class PassingCars {
    public int solution11(int[] A){
        int east=0, west=0, count=0;

        for(int i=0;i<=A.length-1;i++){
            if(A[i]==0)
                east=east+1;
            if(A[i]==1)
                west=west+1;
        }

        if(A.length>1000000000)
            count=-1;
        else
            count=west+east;

        return count;
    }
}
