package app.test.algorithm;


// Java implementation of recursive Binary Search
class BinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int left, int right, int key) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == key)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > key)
                return binarySearch(arr, left, mid - 1, key);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, right, key);
        }

        // We reach here when element is not present
        //  in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch2(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " +
                    result);
    }


    int binarySearch2(int arr[], int left, int right, int key) {
        if (right >= left) {
            int middle = left + (right - 1) / 2;
            if (key == arr[middle]) {
                return middle;
            }

            if (key > arr[middle])
                return binarySearch(arr, middle + 1, right, key);
            else
                return binarySearch(arr, left, middle - 1, key);
        }
        return -1;
    }


}
