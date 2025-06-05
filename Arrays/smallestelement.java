public class smallestelement {
    public static void main(String[] args) {
        int[] array = {78, 12, 55, 45, 65, 99, 28};
        int smallest_num = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest_num) {
                smallest_num = array[i];
            }
        }
        System.out.println("smallest number in the array" + smallest_num);
    }
}



