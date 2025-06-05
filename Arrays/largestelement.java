public class largestelement {
    public static void main (String []args){
        int [] array={78,12,55,45,65,99,28};
        int largest_num=Integer.MIN_VALUE;

        for (int i=0; i<array.length; i++){
            if (array[i]>largest_num){
                largest_num=array[i];
            }
        }
        System.out.println("largest number in the array "+largest_num);
    }
}
