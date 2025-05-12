import java.util.*;
public class searchelement {
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        int [] array={56,36,30,87,45,11};

        System.out.println("Enter the number to be searched");
        int search=sc.nextInt();
        boolean found=false;
        int i=0;

        for (; i< array.length; i++){
            if (array[i]==search){
                found=true;
                break;
            }
        }

        if (found){
            System.out.println("search found at index "+i);
        }
        else{
            System.out.println("search not found");
        }
    }
}
