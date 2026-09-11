package Arrays;

public class ReturningArrayFromMethods {

    // Returns a reference to an array allocated on the heap
    public static int[] getArray() {
        return new int[]{10, 20, 30, 40, 50};
    }

    public static void main(String[] args) {
        int[] arr = getArray();

        // Traversing and printing elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
