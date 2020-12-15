package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayListConverter {
    public static void main(String[] args) {
        Integer[] a = {10, 20, 30, 40};
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, a);
    }

    public static List<Integer> convertToArrayList(Integer[] a) {
        List<Integer> list = Arrays.asList(a);
        return list;
    }

    public static List<Integer> convertToArrayList2(Integer[] a) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, a);
        return list;
    }

}
