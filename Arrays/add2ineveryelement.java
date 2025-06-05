import java.util.*;
public class add2ineveryelement {
    public static void main (String [] args ){

        int [] array={89,25,45,64,10,36};
        for (int i=0; i< array.length; i++) {
            array[i]=array[i]+2;
        }
        System.out.println("Array after adding 2 in every element of the array");

        for (int elements:array){
            System.out.println(elements);
        }
    }
}
