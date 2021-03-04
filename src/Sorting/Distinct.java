package Sorting;

import java.util.Arrays;

public class Distinct {

    public int solution12(int[] A){

        int distinct=0, unique=0, a=0;
        int[] uniques=Arrays.stream(A).distinct().toArray();
        for(int j=0;j<uniques.length-1;j++) {
            if (uniques[j]!=uniques[j+1]){
                unique=unique+1;
            }
            for(int i=0;i<A.length;i++){
                if(A[i]!=uniques[j]){
                    A[i]=1;
                    a=A[i];
                }
            }
        }

        distinct=unique+a;

        return distinct;
    }
}
