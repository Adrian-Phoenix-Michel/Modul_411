import java.sql.SQLOutput;

public class InsertionSort {

    void insertionSort(int A[]) {
        int n = A.length;
        int i = 0;
        int j = 0;
        int value = A[i];

        for (i = 1; i < n; ++i) {
            value = A[i];
            j = i - 1;
            while (j >= 0 && A[j] > value) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;

        }
    }

    private static void printArray(int A[])
    {
        int n = A.length;
        for (int i = 0; i < n; ++i)
            System.out.print(A[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int A[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.insertionSort(A);

        printArray(A);
    }
}
