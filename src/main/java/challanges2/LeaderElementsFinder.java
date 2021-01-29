package challanges2;

public class LeaderElementsFinder {
    public static void main(String[] args){
        int[] array = {1,0,2,5,4,2,3};
        printLeaderElements(array);
    }

    public static void printLeaderElements(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            boolean leaderElement = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    leaderElement = false;
                }
            }
            if (leaderElement){
                System.out.println(array[i]);
            }
        }
    }
}
