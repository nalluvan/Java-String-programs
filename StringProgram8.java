package practise123;

import java.util.Iterator;

//Input:a6b3c3
//Output:aaaaaabbbccc
public class StringProgram8 {
    public static void main(String[] args) {
        String str = "a6b3c3";
        char[] ch = str.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            if (Character.isAlphabetic(ch[i])) {
                char ch1 = ch[i];
                i++;
                
                StringBuilder sb = new StringBuilder();
                while (i < ch.length && Character.isDigit(ch[i])) {
                    sb.append(ch[i++]);
                }
                i--;
                
                int num = Integer.parseInt(sb.toString());
                for (int j = 0; j < num; j++) {
                    System.out.print(ch1);
                }
            }
        }
    }
}
