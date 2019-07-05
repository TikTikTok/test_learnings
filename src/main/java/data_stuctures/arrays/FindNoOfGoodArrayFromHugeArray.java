package data_stuctures.arrays;

public class FindNoOfGoodArrayFromHugeArray {

    static int next = 0;

    public static void main(String[] args) {

        int arr[] = {0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 1, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 0, 1, 10, 0, 0, 1, 11, 6, 7, 8, 9, 10,1};
        int res[] = new int[arr.length];
        int k = 5;
        int isGoodArray = 0;
        int noOfGoodArray = 0;
        int oldState = 0;
        int removed = 0;

        for (int i = 0; i < res.length; i++) {

            isGoodArray = getGoodArray(arr, res, k, next);

            if ((isGoodArray - oldState) % 5 == 0) {
                noOfGoodArray = ++noOfGoodArray;
            } else {
                int chars = isGoodArray - oldState;
                removed = removed + chars;
            }

            oldState = isGoodArray;
            next = isGoodArray;

            if (next == arr.length) {
                break;
            }
        }
        System.out.println(" No of Good Array is : " + noOfGoodArray);
        System.out.println(" No of characters to be removed " + removed);
    }

    private static int getGoodArray(int[] arr, int[] res, int k, int next) {
        int first;
        int count = 0;
        int i;
        int repearCounter = 0;

        if (next == 0) {
            first = arr[0];
            count = 0;
        } else {
            first = arr[next];
            count = 0;
        }

        for (i = next; i < arr.length; i++) {

            if (i == arr.length - 1) {
                res[i] = arr[i];
                count++;
                if (count % k == 0) {
                    return count + next;
                }
                break;
            } else {
                if (first + 1 == arr[i + 1]) {
                    res[i] = first;
                    repearCounter++;
                    if (repearCounter > 1) {
                        count++;
                        break;
                    }
                    count++;
                } else {
                    if (arr[i] + 1 == arr[i + 1]) {
                        res[i] = arr[i];
                        count++;
                    } else {
                        res[i] = arr[i];
                        count++;
                        break;
                    }
                }
            }
        }
        return count + next;
    }
}
