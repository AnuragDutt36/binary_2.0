public class PrintEvenElements {
    public static void main(String[] args) {
        int[] arr1 = {34, 21, 54, 65, 43};
        int[] arr2 = {4, 3, 6, 7, 1};

        System.out.print("Output 1: ");
        printEvenElements(arr1);

        System.out.print("Output 2: ");
        printEvenElements(arr2);
    }

    // Time complexity : O(n)
    // Space complexity : O(1)
    public static void printEvenElements(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
