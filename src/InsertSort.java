import java.util.Arrays;

public class InsertSort {
    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            E t = arr[i];
            int j= i ;
            for (; j > 0 && t.compareTo(arr[j-1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[j] = t;
        }
    }
    public static <E extends Comparable<E>> void resort(E[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            E t = arr[i];
            int j = i;
            for (; j < arr.length - 1 && t.compareTo(arr[j+1]) < 0; j++) {
                arr[j] =arr [j +1];
            }
            arr[j] = t;
        }
    }

    public static void main(String[] args) throws Exception {
        Student[] students = {new Student("qsy", "0"), new Student("sjx", "7"),
                new Student("gt", "5")};
//        SortHelper.sortTest(InsertSort.class, students);
        Integer[] in = new Integer[]{2,3,5,12,4,4,23,1,34};
        resort(in);
        System.out.println(Arrays.toString(in));

        System.out.println("SortHelper.isSorted(students) = " + SortHelper.isSorted(in));
    }
}
