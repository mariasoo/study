package String2;

import java.util.Arrays;
import java.util.Scanner;

public class String9127_ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = new String[5];

        System.out.println("단어 5개를 입력하세요.");

        for(int i = 0; i<5; i++){
            words[i] = scan.nextLine();
        }

        Arrays.sort(words);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
