import java.util.Scanner;
public class searchinarray {
    public static void main (String []args ){
        Scanner sc= new Scanner(System.in);
        int [] array={2,65,63,98,75,17};

        System.out.println("ENTER THE NUMBER TO BE SEARCHED");
        int search=sc.nextInt();
        boolean found=false;
        int i=0;
        for (; i< array.length; i++){
            if (array[i]==search) {
                found = true;
                break;
            }
        }

        if (found){
            System.out.println(search+" found at index "+i);
        }
        else{
            System.out.println(search+" not found");
        }
    }
}
