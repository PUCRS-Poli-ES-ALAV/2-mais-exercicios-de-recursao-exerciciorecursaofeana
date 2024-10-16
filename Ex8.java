import java.util.ArrayList;

public class Ex8 {
    static int findBiggest(ArrayList<Integer> ar){
        if(ar.isEmpty()){
            return -1;
        }
        return findBiggestRec(ar, 0, ar.get(0));
    }

    private static int findBiggestRec(ArrayList<Integer> ar, int n, int max){
        
        if(n == ar.size()){
            return max;
        }
        
        if(ar.size() == 1){
            return ar.get(0);
        }

        if(max < ar.get(n)){
            max = ar.get(n);
        }

        return findBiggestRec(ar, n+1, max);
    }


    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(4);
        ar.add(2);
        ar.add(8);
        ar.add(5);
        ar.add(5);
        System.out.println(findBiggest(ar));
    }
}
