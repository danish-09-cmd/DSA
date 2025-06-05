public class unionoftwosortedarrays {
    public static int[] union(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] temp = new int[n1 + n2]; // max possible size
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (array1[i] < array2[j]) {
                if (k == 0 || temp[k - 1] != array1[i]) {
                    temp[k++] = array1[i];
                }
                i++;
            } else if (array1[i] > array2[j]) {
                if (k == 0 || temp[k - 1] != array2[j]) {
                    temp[k++] = array2[j];
                }
                j++;
            } else {
                if (k == 0 || temp[k - 1] != array1[i]) {
                    temp[k++] = array1[i];
                }
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (k == 0 || temp[k - 1] != array1[i]) {
                temp[k++] = array1[i];
            }
            i++;
        }

        while (j < n2) {
            if (k == 0 || temp[k - 1] != array2[j]) {
                temp[k++] = array2[j];
            }
            j++;
        }

        // Copy result into an array of actual size k
        int[] result = new int[k];
        System.arraycopy(temp, 0, result, 0, k);
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {2, 5, 6};

        int[] union = union(array1, array2);
        System.out.print("Union: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}
