package challanges2;

public class CutAndAppendStringProcessor {
    public static void main (String[] args){
        String str1 = "welcome";
        String str2 = "home";
        System.out.println(cutAndAppend(str1, str2));
    }

    public static String cutAndAppend(String str1, String str2){
        StringBuilder sb = new StringBuilder();
        if(str1.length() > str2.length()){
            int difference = str1.length() - str2.length();
            str1 = str1.substring(difference);
            sb.append(str1);
            sb.append(str2);
        } else if (str1.length() < str2.length()){
            int difference = str2.length() - str1.length();
            str2 = str2.substring(difference);
            sb.append(str1);
            sb.append(str2);
        } else {
            sb.append(str1);
            sb.append(str2);
        }

        return sb.toString();
    }
}
