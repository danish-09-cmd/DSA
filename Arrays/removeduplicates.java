import java.util.*;
public class removeduplicates {
    public static void main (String [] args){
        int [] array = {7,5,4,3,8,7,6,7,7,9,5,5,4};

        HashSet <Integer> set = new HashSet<>();
        for (int num:array){
            set.add(num);
        } 

        int [] uniquearray = new int  [set.size()];
        int i=0;
        for (int num:set){
            uniquearray[i++] = num;
        }

        System.out.println("Array after removing duplicates");
        for (int num:uniquearray){
            System.out.println(num+" ");
        }
    }
}
