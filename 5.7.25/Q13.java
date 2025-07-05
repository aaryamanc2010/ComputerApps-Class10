import java.util.Scanner;
public class q13
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = in.next();
        str = str.toUpperCase();
        int len = str.length();
        
        if (str.charAt(0) == str.charAt(len - 1)) {
            boolean isPalin = true;
            for (int i = 1; i < len / 2; i++) {
                if (str.charAt(i) != str.charAt(len - 1 - i)) {
                    isPalin = false;
                    break;
                }
            }
            
            if (isPalin) {
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Special");
            }
        }
        else {
            System.out.println("Neither Special nor Palindrome");
        }
        
    }
}
