package interviewTut.binarysearchTut;

public class SearchElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        System.out.println(new SearchElement().search(arr, target));
    }

    int search(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }

}
