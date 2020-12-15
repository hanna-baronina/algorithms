package challenges;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArrayConverter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        Integer[] array = new Integer[list.size()];
        list.toArray(array);
    }

    public static Integer[] convertArrayListToArray(List<Integer> list) {
        Integer[] array = new Integer[list.size()];
        return list.toArray(array);
    }

    public static Object[] convertArrayListToArray2(List<Integer> list) {
        return list.toArray();
    }

}
