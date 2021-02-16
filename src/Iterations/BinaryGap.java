package Iterations;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class BinaryGap {

    public int solution(int N){
        int gap1=0, gap2=0, maxgap=0;
        ArrayList<Integer> gaps=new ArrayList();

        char binar[]=Integer.toBinaryString(N).toCharArray();
        System.out.println(binar);
        for(int i=0;i<=binar.length-3;i++){
            if(binar[i]=='0'){
                gap1=gap1+1;
                gaps.add(gap1);
            }
            if(binar[i+1]=='1')
                break;
            if(binar[i+2]=='0'){
                gap2=gap2+1;
                gaps.add(gap2);
            }
        }

        maxgap=Collections.max(gaps);
        return maxgap;
    }

    public static void main(String[] args) {

        int N = (int) (Math.random() * (2147483647 - 1));
        BinaryGap maxbingap=new BinaryGap();
        System.out.println("Największa przerwa wynosi:"+maxbingap.solution(N));

    }
}
