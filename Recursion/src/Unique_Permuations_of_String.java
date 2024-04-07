public class Unique_Permuations_of_String {
    public static void main(String[] args) {
        String str = "abca";
        permuatation(str, "");

    }

    public static void permuatation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return ;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean val = true;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    val = false;
                    break;
                }
            }
            if (val == true) {
                String s1 = str.substring(0, i);
                String s2 = str.substring(i + 1);
                permuatation(s1 + s2, ans + ch);
            }
        }

    }

}
