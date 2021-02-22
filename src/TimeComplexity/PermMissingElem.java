package TimeComplexity;

public class PermMissingElem {

    public int solution5(int[] A){
        int missing_elem=0;

        if(A.length==0)
            return 1;

        for (int i = 0; i < A.length-1; i++) {
            System.out.println("Liczba:"+A[i]);
            for (int j = 0; j < A.length; j++) {
                System.out.println("Następne:"+A[j]);
                if(A[i]==(A[j]+1))
                    missing_elem=A[i]+1;
            }
        }

        return missing_elem;
    }
}
