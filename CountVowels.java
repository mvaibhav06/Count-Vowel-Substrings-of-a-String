import java.util.HashSet;
import java.util.Set;

public class CountVowels {
    public static long countVowels(String s) {
        long out = 0;
        Set<Character> vow = new HashSet<>();
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');

        for(int i=0; i<s.length(); i++){
            String temp = "";
            int counter = 0;
            for(int j=0; j<=i; j++){
                char ch = s.charAt(j);
                if(vow.contains(ch)){
                    counter++;
                }
                temp += ch;
            }
            out += counter;

            for(int j=i+1; j<s.length(); j++){
                char ch = s.charAt(j);
                if(vow.contains(temp.charAt(0))){
                    counter--;
                }
                if(vow.contains(ch)){
                    counter++;
                }
                temp = temp.substring(1) + ch;
                out += counter;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("ltcd"));
    }
}
