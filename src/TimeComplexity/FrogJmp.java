package TimeComplexity;

public class FrogJmp {

    public int solution4(int X, int Y, int D){
        int start_position=X;
        int end_position=Y;
        int jump_distance=D;
        int jumps_amount;

        if(end_position==start_position){
            jumps_amount=0;
        }else if((end_position-start_position)<jump_distance) {
            jumps_amount = 1;
        }else if((end_position-start_position)%jump_distance==0) {
            jumps_amount = (end_position - start_position) / jump_distance;
        }else{
            jumps_amount = ((end_position - start_position) / jump_distance)+1;
        }
        return jumps_amount;
    }
}
