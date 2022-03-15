public class Arrays {
    Arrays(){};

    public static int[] directSorting(int[] arr){
        for(int i = 0; i < arr.length - 1; i++)
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int buf = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buf;
                }
        }
        return arr;
    }

    public static int[] reverseSorting(int[] arr){
        for(int i = 0; i < arr.length - 1; i++)
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int buf = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buf;
                }
            }
        return arr;
    }

    public static int getMin(int[] arr){
        // для теста исключения не проверяю на заполненность массива
        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
            if(arr[i] < min) min = arr[i];
        return min;
    }

    public static int getMax(int[] arr){
        // для теста исключения не проверяю на заполненность массива
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
            if(arr[i] > max) max = arr[i];
        return max;
    }
}
