package algorithms;

import java.util.*;

public class ReorderLogFilesComparator {
    public static void main (String[] args){
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};

        List<String> digitLogs = new ArrayList<String>();
        List<String> letterLogs = new ArrayList<String>();
        for(String log : logs){
            int index = log.indexOf(" ")+ 1;
            char character = log.charAt(index);
            if(Character.isDigit(character)){
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        Collections.sort(letterLogs, new Comparator<String>() {
            public int compare(String o1, String o2) {
                int compareResult = o1.substring(o1.indexOf(" ") + 1).compareTo(o2.substring(o2.indexOf(" ") + 1));
                if(compareResult == 0){
                    return o1.compareTo(o2);
                } else {
                    return compareResult;
                }
            }
        });

        letterLogs.addAll(digitLogs);

        for(String log : letterLogs){
            System.out.println(log);
        }

    }
}
