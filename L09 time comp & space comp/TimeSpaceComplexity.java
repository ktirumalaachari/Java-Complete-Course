// TimeSpaceComplexity.java
// ------------------------------------
// This file explains Time Complexity and Space Complexity in Java
// with examples, code, and output.
// ------------------------------------

public class TimeSpaceComplexity {

    // --------------------------
    // 1. TIME COMPLEXITY
    // --------------------------
    // Time complexity is the measure of how the runtime of an algorithm 
    // increases as the size of input (n) grows.
    //
    // Common complexities:
    // O(1)      -> Constant time
    // O(log n)  -> Logarithmic time
    // O(n)      -> Linear time
    // O(n log n)-> Linearithmic time
    // O(n^2)    -> Quadratic time
    // O(2^n)    -> Exponential time
    // O(n!)     -> Factorial time

    // Example of O(1) - Constant time
    public static void constantTimeExample(int[] arr) {
        System.out.println("O(1): First element is " + arr[0]);
    }

    // Example of O(n) - Linear time
    public static void linearTimeExample(int[] arr) {
        System.out.print("O(n): Elements are ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Example of O(log n) - Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Example of O(n^2) - Nested loops
    public static void quadraticTimeExample(int n) {
        System.out.println("O(n^2): Printing pairs");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }

    // Example of O(n log n) - Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // --------------------------
    // 2. SPACE COMPLEXITY
    // --------------------------
    // Space complexity is the measure of how much extra memory an algorithm uses
    // relative to the input size.
    //
    // Example:
    // - O(1): Uses constant extra space (e.g., swapping two numbers)
    // - O(n): Uses linear space (e.g., recursion, extra arrays)
    // - O(log n): Recursive calls in divide & conquer algorithms like Merge Sort.

    // Example of O(1) space - swapping numbers
    public static void swapNumbers() {
        int a = 5, b = 10;
        System.out.println("Before swap: a=" + a + " b=" + b);
        int temp = a;  // constant extra space
        a = b;
        b = temp;
        System.out.println("After swap: a=" + a + " b=" + b);
    }

    // Example of O(n) space - recursion (Factorial)
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);  // each call adds to call stack
    }

    // --------------------------
    // MAIN METHOD
    // --------------------------
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // O(1)
        constantTimeExample(arr);

        // O(n)
        linearTimeExample(arr);

        // O(log n) -> Binary Search
        int index = binarySearch(arr, 4);
        System.out.println("O(log n): Element 4 found at index " + index);

        // O(n^2)
        quadraticTimeExample(3);

        // O(n log n) -> Merge Sort
        int[] arr2 = {5, 2, 9, 1, 6};
        System.out.println("Before Merge Sort: ");
        for (int num : arr2) System.out.print(num + " ");
        System.out.println();
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println("After Merge Sort: ");
        for (int num : arr2) System.out.print(num + " ");
        System.out.println();

        // O(1) Space
        swapNumbers();

        // O(n) Space (Factorial recursion)
        int fact = factorial(5);
        System.out.println("O(n) Space: Factorial of 5 = " + fact);
    }
}

/*
--------------------------
EXPECTED OUTPUT:
--------------------------
O(1): First element is 1
O(n): Elements are 1 2 3 4 5 
O(log n): Element 4 found at index 3
O(n^2): Printing pairs
(0,0) (0,1) (0,2) 
(1,0) (1,1) (1,2) 
(2,0) (2,1) (2,2) 
Before Merge Sort: 
5 2 9 1 6 
After Merge Sort: 
1 2 5 6 9 
Before swap: a=5 b=10
After swap: a=10 b=5
O(n) Space: Factorial of 5 = 120
*/
