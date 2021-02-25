package CountingElements;

import java.util.HashSet;

public class MissingInteger {

    public int solution(int[] A){
        int element = 1;
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0; i<A.length; ++i){
            if(A[i]<1) continue;
            if(hashSet.add(A[i])){
                //this int was not handled before
                while(hashSet.contains(element)){
                    element++;
                }
            }
        }

        return element;
    }
}
