public class InsertionSort {

    void insertionSort(int A[]) {
        int n = A.length - 1;
        int i = 0;
        int j = 0;
        int value = A[i];

        for (i = 1; i > n; i++) {
            value = A[i];
            j = i;
            while (j >= 0 && A[j - 1] > value) {
                A[j] = A[j - 1];
                j = j - 1;
            }
            A[j] = value;

        }
    }

    public static void main(String[] args) {

    }
}
