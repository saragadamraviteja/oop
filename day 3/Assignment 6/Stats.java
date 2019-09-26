/**.
 * Given an array of integers Find the mean, median, mode, standard deviation
 * and variance.
 *
 * Mean
 * Input : [1,2,3,4,5]
 * Output : 3.0
 *
 * Median
 * Input : [1,2,3,4,5]
 * Output : 3.0
 *
 * Mode
 * Input : [1,1,2,2,3]
 * Output : [1,2]
 *
 * Variance
 * Input : [1,2,3,4,5]
 * Output : 2.0
 *
 * Standard Deviation
 * Input : [1,2,3,4,5]
 * Output : 1.41421356
 *
 * @author Siva Sankar
 */

import java.util.*;
import java.lang.*;
public final class Stats {
    private Stats() {
    }

    /**.
     * This method should return the mean of the elements of the array.
     * If the arr is empty (length is 0), return the mean as 0.
     * @param arr the input array contians elements.
     * @return the mean of the array.
     */
    public static double mean(final int[] arr) {
        //  Your code goes here....
        double sums = 0.0;
        double means = 0.0;
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
             sums += arr[i];
             }
            means =  sums / arr.length;
            return means;
        } else {
            return 0.0;
        }
    }

    /**.
     * This method returns the median of the elements of the array.
     * Prerequisite : The array should be sorted to find the median.
     *
     * Hint : Arrays.sort(arr) sorts the elements of the array.
     *
     * @param arr the input array contains random elements (not in sorted order)
     * @return the median of the elements of the array.
     */
    public static double median(final int[] arr) {
        //  Your code goes here...
        double medians = 0.0;
        int first = 0;
        int second = 0;
        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            first = arr[(arr.length / 2) - 1];
            second = arr[((arr.length / 2))];
            medians = (first + second) / 2.0;
            return medians;
         } else {
            medians = (double) arr[(arr.length / 2)];
            return medians;
        }
    }

    /**.
     * This method returns the mode of the array. If there is no mode, then
     * it returns
     * 0 as the mode.
     *
     * @param arr the input array.
     * @return the mode of the array, 0 otherwise if there is no mode.
     */
    public static int mode(final int[] arr) {
        //  Your code goes here....
        int maxm = 0;
        int mode = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
            }
            if (count > maxm) {
                maxm = count;
                mode = arr[i];
            }
        }
        if (maxm == 1) {
            return 0;
        } else {
            return mode;
        }
    }

    /**.
     * This method returns the variance of the input array.
     * Make use of the mean functon which has already written.
     *
     * @param arr the input array
     * @return the variance of the array.
     */
    public static double variance(final int[] arr) {
        //  Your code goes here....
        double vari = 0.0;
        for (int i = 0; i < arr.length; i++) {
            vari += (Math.pow((arr[i] - mean(arr)), 2));
        }
        vari = vari / arr.length;
        return vari;
    }

    /**.
     * This method returns the standard deviation of the array.
     * Hint : You can find the square root using Math.sqrt() method.
     * @param arr the input array
     * @return the standard deviation of the input array.
     */
    public static double standardDeviation(final int[] arr) {
        //  Your code goes here....
        double standardDeviation = 0.0;
        standardDeviation = Math.sqrt(variance(arr));
        return standardDeviation;
    }
}

