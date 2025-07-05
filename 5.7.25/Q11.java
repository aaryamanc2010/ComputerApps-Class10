import java.util.*;
public class q11 { 
    public void main(String s) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        s=sc.next();
        String s1=s.toLowerCase();
        String s2=s1.replace('a', 'b');
        String s3=s2.replace('e', 'f');
        String s4=s3.replace('i', 'j');
        String s5=s4.replace('o', 'p');
        String s6=s5.replace('u', 'v');
        System.out.println(s6);
    }
}
