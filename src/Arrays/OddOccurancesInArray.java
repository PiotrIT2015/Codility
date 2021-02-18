package Arrays;

public class OddOccurancesInArray {

    public int solution3(int[] A){
        int count=0, odd_num=0;
        for (int i = 0; i < A.length; i++) {
            count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j])
                    count++;
            }
            if (count % 2 != 0)
                odd_num=A[i];
        }
        return odd_num;
    }

}
