public class rotatearraybykelements{
    public static void rotate(int [] nums, int k){
        int n = nums.length;
        k = k%n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    public staticvoid reverse(int [] nums, int start, int end ){
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public static void main (String [] args){
        int [] array={1,2,3,4,5,6,7};
        int k=3;

        for (int num: array){
            System.out.println(num+" ")
        }
    }
}