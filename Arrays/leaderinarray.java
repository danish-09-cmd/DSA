import java.util.*;
public class leaderinarray {
    public static ArrayList<Integer> findLeaders (int [] array){
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = array.length;

        int maxFromRight = array [n-1];
        leaders.add(maxFromRight);

        for (int i=n-2; i>=0; i--){
            if (array[i]>maxFromRight){
                maxFromRight = array[i];
                leaders.add(maxFromRight);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
    public static void main (String[] args ){
        int [] array = {16,17,4,3,5,2,6};
        ArrayList<Integer> result = findLeaders(array);

        System.out.println("Leaders in the array");
        for (int leader: result){
            System.out.println(leader+"");
        }
    }
}
