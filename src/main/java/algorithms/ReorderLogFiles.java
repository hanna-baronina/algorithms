package algorithms;


import java.util.ArrayList;
import java.util.List;


public class ReorderLogFiles {
    public static void main(String[] args) {
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        List<String> digitLogs = new ArrayList<String>();
        List<String> letterLogs = new ArrayList<String>();

        for (String log : logs) {
            if (Character.isDigit(log.charAt(log.indexOf(" ") + 1))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        for (int i = 0; i < letterLogs.size() - 1; i++) {
            for (int j = 0; j < letterLogs.size() - i - 1; j++) {
                int compareResult = letterLogs.get(j).substring(letterLogs.get(j).indexOf(" ") + 1).compareTo(
                        letterLogs.get(j + 1).substring(letterLogs.get(j + 1).indexOf(" ") + 1));
                if (compareResult > 0) {
                    swap(letterLogs, j);
                }
                if (compareResult == 0) {
                    if (letterLogs.get(j).compareTo(letterLogs.get(j + 1)) > 0) {
                        swap(letterLogs, j);
                    }
                }
            }
        }

        letterLogs.addAll(digitLogs);
        letterLogs.toArray(new String[0]);

        for (String log : letterLogs) {
            System.out.println(log);
        }
    }

    static void swap(List<String> letterLogs, int j) {
        String temp1 = letterLogs.get(j);
        String temp2 = letterLogs.get(j + 1);
        letterLogs.remove(j);
        letterLogs.add(j, temp2);
        letterLogs.remove(j + 1);
        letterLogs.add(j + 1, temp1);
    }
}
