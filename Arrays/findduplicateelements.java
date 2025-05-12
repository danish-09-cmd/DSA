import java.util.Scanner;
import java.util.HashSet;

public class findduplicateelements {
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);

        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int [] array=new int [size];

        System.out.println("Enter "+size+" elements of the array");
        for (int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
        HashSet <Integer> seen=new HashSet<>();
        HashSet <Integer> duplicate=new HashSet<>();

        for (int num: array){
            if (!seen.add(num)){
                duplicate.add(num);
            }
        }
        if (duplicate.isEmpty()){
            System.out.println("no duplicate elements found ");
        }
        else{
            System.out.println("duplicate elements in the array are:");
            for (int num:duplicate){
                System.out.println(num);
            }
        }
    }
}
