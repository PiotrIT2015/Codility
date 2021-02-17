
import Arrays.CyclicRotation;
import Iterations.BinaryGap;

public class Box {

    public static void main(String[] args) {

        BinaryGap maxbingap=new BinaryGap();
        System.out.println("Największa przerwa wynosi:"+maxbingap.solution1(529));

        CyclicRotation rotation=new CyclicRotation();
        int B[]=rotation.solution2(new int[]{3,8,9,7,6},3);
        System.out.println("Tablica [3,8,9,7,6]");
        for(int i=0;i<B.length;i++)
            System.out.println("po rotacji:"+B[i]);
    }
}
