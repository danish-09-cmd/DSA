import java.util.*;
public class insertelement{
    public static void main (String [] args ){
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the number of elements in the array");
        int size=sc.nextInt();

        int [] array= new int [size+1];

        System.out.println("Enter "+size+" elements:");

        for (int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }

        System.out.println("Enter the element to Insert");
        int element=sc.nextInt();

        System.out.println("Enter the position to insert(0 to "+(size+1)+"):");
        int position=sc.nextInt();

        if (position<1 || position>size+1){
            System.out.println("INVALID POSITION");

        }
        else{
            for (int i=size; i>=position; i--){
                array[i]=array[i-1];
            }
        }

        array[position-1]=element;

        System.out.println("Array after Insertion");
        for (int i=0; i<size+1; i++){
            System.out.println(array[i]+" ");
        }

    }
}
