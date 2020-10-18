import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    public static int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = (int) 10e6;
            int j = i;
            for (int v = i; v < arr.length - 1; v++) {
                if (min > arr[v]) {
                    min = arr[v];
                    j = v;
                }
            }
            final int aux = arr[i];
            arr[i] = min;
            arr[j] = aux;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while(j >= 1 && arr[j] < arr[j - 1]) {
                int aux = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = aux;
                j--;
            }
        }
        return arr;
    }

    public static void sortFiveElements(int arr[]) {
        int t;
        // firstly by three swaps we find sor the smallest item
        if (arr[4] < arr[0]) {
            t = arr[4];
            arr[4] = arr[0];
            arr[0] = t;
        }

        if (arr[3] < arr[1]) {
            t = arr[3];
            arr[3] = arr[1];
            arr[1] = t;
        }

        if (arr[1] < arr[0]) {
            t = arr[1];
            arr[1] = arr[0];
            arr[0] = t;
        }

        // now: arr[0] <= arr[4]. arr[0] <= arr[1] <=  arr[3]
        // insert arr[2] into arr[0] <= arr[1] <= arr[3]

        if (arr[2] < arr[1]) {
            t = arr[2];
            arr[2] = arr[1];
            if (t < arr[0]) {
                arr[1] = arr[0];
                arr[0] = t;
            } else {
                arr[1] = t;
            }
        } else if (arr[3] < arr[2]) {
            t = arr[2];
            arr[2] = arr[3];
            arr[3] = t;
        }

        // now arr[0] <= arr[4], arr[0] <= arr[1] <= arr[2] <= arr[3]
        // insert arr[4] into arr[0] <= arr[1] <= arr[2] <= arr[3]
        if (arr[4] < arr[2]) {
            t = arr[4];
            arr[4] = arr[3];
            arr[3] = arr[2];
            if(t < arr[1]){
                arr[2] = arr[1];
                arr[1] = t;
            }
        } else if(arr[4] < arr[3]) {
            t = arr[4];
            arr[4] = arr[3];
            arr[3] = t;
        }
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


    public static void mergeSort(int[] arr, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] l = new int[mid];
        int[] r = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < length; i++) {
            r[i - mid] = arr[i];
        }

        mergeSort(l, mid);
        mergeSort(r, length - mid);
        merge(arr, l, r, mid,  length - mid);
    }

    public static int[] mergeSort(int[] arr) {
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        mergeSort(newArr, newArr.length);
        return newArr;
    }

    private void swap(int arr[], int first, int second) {
        int aux = first;
        first = second;
        second = aux;
    }

    private int[] sortByItem(int[] arr, int number) {
        if (number == 0) {
            return arr;
        }
        if (arr[number] > number) {
            swap(arr, number, number);
            return sortByItem(arr, --number);
        }
        return  sortByItem(arr, --number);
    }

    public <T> T concatecate(T a, T b) {
        if (!a.getClass().isArray() || !b.getClass().isArray()) {
            throw new IllegalArgumentException("Please provide two arrays");
        }
        Class<?> resCompType;
        Class<?> aCompType = a.getClass().getComponentType();
        Class<?> bCompType = b.getClass().getComponentType();

        System.out.println(aCompType + " "  + bCompType);
        if(aCompType.isAssignableFrom(bCompType)) {
            resCompType = aCompType;
        } else if(bCompType.isAssignableFrom(aCompType)) {
            resCompType = bCompType;
        } else {
            throw new IllegalArgumentException("Types cannot be assigned");
        }

        int aLen = Array.getLength(a);
        int bLen = Array.getLength(b);

        @SuppressWarnings("unchecked")
                T result = (T) Array.newInstance(resCompType, aLen + bLen);
                System.arraycopy(a, 0, result, 0, aLen);
                System.arraycopy(b, 0, result, aLen, bLen);
        return result;
    }

    public int[] quickSort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int[] left = new int[arr.length / 2];
        final int length = arr.length % 2 == 0 ? arr.length / 2 : (arr.length + 1) / 2;
        int[] right = new int[length];
        System.arraycopy(arr, 0, left, 0, arr.length / 2 - 1);
        System.arraycopy(arr, 0, right, length, arr.length - 1);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        int[] leftRes = sortByItem(left, left.length);
        int[] rightRes = sortByItem(right, right.length);
        return concatecate(quickSort(leftRes), quickSort(rightRes));
    }
}
