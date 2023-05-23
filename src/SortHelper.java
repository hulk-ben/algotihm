import java.lang.reflect.Method;

public class SortHelper {
    private SortHelper() {

    }

    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(Class<?> Sort, E[] arr) throws Exception {
        Method sort = Sort.getMethod("sort", Comparable[].class);
//        for (Class<?> parameterType : sort.getParameterTypes()) {
//            System.out.println(sort.getName()+parameterType.getName());
//        }
//        Integer[] a = {1,3,315,124,3};
//        sort.setAccessible(true);
//        Comparable[] arrs = (Comparable[]) arr;
//        sort.invoke(null,(Object) arrs);

        long startTime = System.nanoTime();
        sort.invoke(null, (Object) arr);
        long endTIme = System.nanoTime();
        double time = (endTIme - startTime) / 1000000000.0;
        if (!isSorted(arr)) {
            throw new RuntimeException("Sort err");
        }
        System.out.println("time = " + time + "s");
    }
}
