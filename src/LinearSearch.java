import java.util.Random;

public class LinearSearch {
    private LinearSearch() {
    }

    public static void main(String[] args) {
        Random random = new Random();
        Integer[] ints = new Integer[5];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(50);

        }
        int i = search(ints, 33);
        System.out.println(i);
        Student[] students = new Student[]{new Student("qsy", "1"), new Student("sjx", "2"), new Student("g", "23")};
        int qsy = search(students, new Student("qsy", "1"));
        System.out.println(qsy);
    }

    private static <E> int search(E[] ints, E target) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
