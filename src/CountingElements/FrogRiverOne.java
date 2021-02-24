package CountingElements;

import java.util.HashSet;

public class FrogRiverOne {

    public int solution7(int X, int[] A){
        HashSet<Integer> leaf_present=new HashSet();
        for(int i=0;i<A.length;i++){
            if(A[i]<=X)
                leaf_present.add(A[i]);
            if(leaf_present.size()==X)
                return i;
        }
        return -1;
    }
}
