
import Arrays.CyclicRotation;
import Iterations.BinaryGap;
import Arrays.OddOccurancesInArray;
import TimeComplexity.FrogJmp;
import TimeComplexity.PermMissingElem;

public class Box {

    public static void main(String[] args) {

        BinaryGap maxbingap=new BinaryGap();
        System.out.println("Największa przerwa wynosi:"+maxbingap.solution1(529));

        CyclicRotation rotation=new CyclicRotation();
        int B[]=rotation.solution2(new int[]{3,8,9,7,6},3);
        System.out.println("Tablica [3,8,9,7,6]");
        for(int i=0;i<B.length;i++)
            System.out.println("po rotacji:"+B[i]);

        OddOccurancesInArray elements=new OddOccurancesInArray();
        System.out.println("Nieparzysty element to:"+elements.solution3(new int[]{9,3,9,3,9,7,9}));

        FrogJmp jump=new FrogJmp();
        System.out.println("Minimalna ilość skoków to:"+jump.solution4(10,85,35));

        PermMissingElem missing_elem = new PermMissingElem();
        System.out.println("Brakujący element to:"+missing_elem.solution5(new int[]{2,3,1,5}));
    }
}
