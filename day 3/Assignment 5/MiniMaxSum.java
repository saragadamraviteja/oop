/**.
 * Given an array of elements, return the String that has two values separated
 * by commans. The first value is the sum of all the elements except minimum
 * and the second value is the sum of all the elements except the maximum.
 *
 * Input : {1,2,3,4,5};
 * Output : 14,10
 *
 * Input : {1,2}
 * Output : 2,1
 *
 * @author Siva Sankar
 */

public final class MiniMaxSum {
    private MiniMaxSum() {
    }

    /**.
     * This method returns the minimum element in the array.
     * @param arr contains the elements in arr.
     * @return the minimum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int min(final int[] arr) {
        //  Your code goes here...
        int mini = arr[0];
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < mini) {
                    mini = arr[i];
                }
            }
            return mini;
        } else {
            return -1;
        }
    }

    /**.
     * This method returns the maximum element in the array.
     * @param arr contains the elements in arr.
     * @return the maximum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int max(final int[] arr) {
        //  Your code goes here...
        int maxi = arr[0];
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxi) {
                    maxi = arr[i];
                }
            }
            return maxi;
        } else {
            return -1;
        }
    }

    /**.
     * This method returns the sum of all the elements in the array.
     * @param arr contains the elements in arr.
     * @return the sum of all the elements in the arr. returns -1 if there are
     * no elements.
     */
    public static int sum(final int[] arr) {
        //  Your code goes here...
        int sums = 0;
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                sums += arr[i];
            }
            return sums;
        } else {
        return -1;
        }
    }
    /**.
     * Make use of the functions defined for finding the
     * minimum element, maximum element and the sum of all the elements of teh
     * array arr.
     *
     * @param arr the input array.
     * @return the string version of maxSum and minSum separated by commas.
     */
    public static String miniMaxSum(final int[] arr) {
        //  Your code goes here...
        int maxim = 0;
        int minim = 0;
        int minni = min(arr);
        int maxxi = max(arr);
        int summs = sum(arr);
        maxim = summs - minni;
        minim = summs - maxxi;
        return maxim + "," + minim;
    }
}

