
import Arrays.CyclicRotation;
import Iterations.BinaryGap;
import Arrays.OddOccurancesInArray;
import TimeComplexity.FrogJmp;
import TimeComplexity.PermMissingElem;
import TimeComplexity.TapeEquilibrium;
import CountingElements.FrogRiverOne;
import CountingElements.MissingInteger;
import CountingElements.PermCheck;
import PrefixSums.CountDiv;
import PrefixSums.PassingCars;

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

        TapeEquilibrium difference=new TapeEquilibrium();
        difference.solution6(new int[]{3,1,2,4,3});

        FrogRiverOne time=new FrogRiverOne();
        System.out.println(time.solution7(4,new int[]{1,3,1,4,2,3,5,4}));

        MissingInteger missing=new MissingInteger();
        System.out.println("Najmniejsza brakująca wartość to:"+missing.solution8(new int[]{1,3,6,4,2}));

        PermCheck permutation=new PermCheck();
        System.out.println("Check:"+permutation.solution9(new int[]{4,1,3}));

        CountDiv number=new CountDiv();
        System.out.println("Liczba podzielnych liczb wynosi:"+number.solution10(6,11,2));

        PassingCars pairs=new PassingCars();
        System.out.println("Liczba mijających się par to: "+pairs.solution11(new int[]{0,1,0,1,1}));
    }
}
