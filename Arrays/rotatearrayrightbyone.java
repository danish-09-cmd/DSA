public class rotatearrayrightbyone{
    public static void main(String[] args) {
        int[] array = {56, 24, 56, 79, 37, 73, 69, 96};

        System.out.println("Array before rotating:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        if (array.length <= 1) {
            System.out.println("Array can't be rotated.");
        } else {
            int lastElement = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = lastElement;
        }

        System.out.println("Array after rotating to the right by one:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

