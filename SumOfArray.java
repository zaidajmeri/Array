package Arrays;

public class SumOfArray {

    // Pure function: Takes input, returns calculated value
    public static int calculateSum(int[] arr) {
        if (arr == null) return 0;
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int total = calculateSum(arr);

        System.out.println("sum of array is : " + total);
    }
}
