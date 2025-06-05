import java.util.Scanner;
public class deleteelement {
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int [] array=new int [size];

        System.out.println(size+"elements are:");
        for (int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the index to delete (0 to"+(size-1)+"):");
        int index=sc.nextInt();

        if (index>=size || index<0 ){
            System.out.println("Invalid Index");
        }
        else{
            for (int i=index; i<size-1; i++){
                array[i]=array[i+1];
            }
        }
        System.out.println("array after deletion");
        for (int i=0; i<size-1; i++){
            System.out.println(array[i]);
        }
    }
}
