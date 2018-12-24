package  com.stackroute;
public class StringRepeat {
    public String Repeat(String s,int n) {
        String s1 = new String("");
        String s2 = "";
        int len = s.length();
        int count = n;
        for (int i = len-1; i > n+1; i--) {
            s1 = s1 + s.charAt(i);
        }
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        for (int i = 0; i < count; i++) {
            s = s + s2;
        }
        return s;
    }
}