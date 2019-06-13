package competitive_programming;

public class FindMinDifferenceBTW_ArrElement_2 {

    int max = 100001;


     int getMinDiff(int arr[], int n)
    {
        int freq[] = {0};
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        if(freq[arr[i]]> 1)
            return 0;
        }


        return 1;
    }

    public static void main(String[] args) {

        int arr[] = {3, 5, 9, 11, 0, 7, 1};
         int n = 7;
        FindMinDifferenceBTW_ArrElement_2 findMinDifferenceBTW_arrElement_2 = new FindMinDifferenceBTW_ArrElement_2();
        int value = findMinDifferenceBTW_arrElement_2.getMinDiff(arr, n);
        System.out.println(value);

    }
}
