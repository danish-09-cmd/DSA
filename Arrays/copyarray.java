public class copyarray {
    public static void main (String [] args ){
        int [] original_array={45,78,69,37,86,45,21};
        int [] copied_array= new int [original_array.length];

        for (int i=0; i< original_array.length; i++){
            copied_array[i]=original_array[i];
        }
        System.out.println("COPIED ARRAY ELEMENTS");
        for (int elements:copied_array){
            System.out.println(elements+" ");
        }
    }
}
