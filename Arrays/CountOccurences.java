import java.util.Scanner;
public class CountOccurences {
    public static void main (String[] args ){
        Scanner sc=new Scanner (System.in);
        int [] array={5,36,1,78,54,5,45,5,69,2,47,5,5};

        int count=0;
        System.out.println("Enter the number to count ");
        int target=sc.nextInt();

        for (int i=0; i< array.length; i++){
            if (array[i]==target){
                count++;
            }
        }
        System.out.println(target+" occurs "+count+" times in the array");
    }
}
