import java.util.Arrays;

public class Sort {
    public int[] selectionSort(int[] arr) {
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

    public int[] insertionSort(int[] arr) {
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

    public void merge(int[] arr, int lowerBound, int intermediateBound, int upperBound ) {
        int endFirstArray = intermediateBound - lowerBound + 1;
        int endSecondArray = upperBound - intermediateBound + 1;

        int[] firstArray = new int[endFirstArray];
        for (int i = 0; i < firstArray.length - 1; i++) {
            firstArray[i] = arr[lowerBound + i];
        }
        firstArray[endFirstArray - 1] = (int)10e7;

        int[] secondArray = new int[endSecondArray];
        for (int i = 0; i < secondArray.length - 1; i++) {
            secondArray[i] = arr[intermediateBound + i];
        }
        secondArray[endSecondArray - 1] = (int)10e7;

//        System.out.println(Arrays.toString(firstArray) + endFirstArray);
//        System.out.println(Arrays.toString(secondArray) + endSecondArray);

        int i = 0;
        int j = 0;
        for (int m = lowerBound; m < upperBound ; m++) {
            if(firstArray[i] <= secondArray[j]) {
                arr[m] = firstArray[i];
                i++;
            } else {
                arr[m] = secondArray[j];
                j++;
            }
        }
    }


    private void mergeSortPrivate(int[] arr, int lowerBound, int upperBound) {
        int middleBound = (lowerBound + upperBound) / 2;
        if (lowerBound < upperBound) {
            mergeSortPrivate(arr, lowerBound, middleBound);
            mergeSortPrivate(arr, middleBound + 1, upperBound);
            merge(arr, lowerBound, middleBound, upperBound);
        }
    }

    public int[] mergeSort(int[] arr) {
        int[] newArray = new int[arr.length];;
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        mergeSortPrivate(newArray, 0, newArray.length);
        return newArray;
    }
}
