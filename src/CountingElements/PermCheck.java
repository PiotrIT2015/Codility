package CountingElements;

import java.util.HashSet;

public class PermCheck {

    public int solution9(int[] A){
        HashSet<Integer> perm=new HashSet();
        int check=0;

        for(int i=0;i<A.length;i++) {
            perm.add(A[i]);
            System.out.println("Element: " + A[i]);
            if(perm.contains(i))
                check=1;
            else
                check=0;
        }
        return check;
    }
}
