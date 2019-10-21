public class BubbleSort {
    static void bubbleSort(int[] A) {
        int n = A.length;
        int i;

        for (;n > 1; --n) {
            for (i = 0; i < n - 1; ++i) {
                if (A[i] > A[i + 1]) {
                    A[i] = A[i + 1];
                }
            }
        }
    }

    public static void main(String[] args) {
            int[] A = {0, 9, 4, 6, 2, 8, 5, 1, 7, 3};
            bubbleSort(A);
            for (int value : A) System.out.print(value + " ");
    }
}
