package Array1;

public class Array9066_ex2 {
    public static void main(String[] args) {
        char a = 64;
        char[] array = new char[26];

        for(int i = 0; i < 26; i++){
            a++;
            array[i] = a;
        }
        for(int i=25;i>=0;i--){
            System.out.printf("%s ",array[i]);
        }
    }
}
