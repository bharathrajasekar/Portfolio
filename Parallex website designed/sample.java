public class sample{
    public static void main(String[] args) {
        class Solution {
            int missingNumber(int array[], int n) {
                // variable to store the sum of numbers from 1 to n
                int total;
                // calculating the sum using the formula
                total = (n + 1) * (n) / 2;
                // subtracting each number in the array from the total
                for (int i = 0; i < n-1; i++)
                    total -= array[i];
                // returning the missing number
               
            }
            System.out.print(total);
        }
    }
}