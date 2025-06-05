import java.util.HashSet;

public class TwoSumCheck{
    public static String hasPairWithSum(int [] array, int target){
        HashSet<Integer> seen = new HashSet<>();
        for (int num: array){
            int complement = target-num;

            if (seen.contains(complement)){
                return "yes";
            }
            seen.add(num);
        }
        return "no";
    }
    public static void main (String [] args ){
        int [] array = {2,7,11,15,19};
        int target = 9;

        System.out.println(hasPairWithSum(array, target));
    }
}
