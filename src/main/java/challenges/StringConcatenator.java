package challenges;

public class StringConcatenator {
    public static void main(String[] args) {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";
        //String str3 = str1 + str2;
        String str3 = str1.concat(str2);
        System.out.println(str3);
    }
}
