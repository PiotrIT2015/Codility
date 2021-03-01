package PrefixSums;

public class CountDiv {

    public int solution10(int A, int B, int K){
        int count=0;

        for(int i=A;i<=B;i++){
            if((i%K)==0)
                count=count+1;
        }

        return count;
    }
}
