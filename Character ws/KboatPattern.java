public class KboatPattern
{
    public static void main(String args[]) {
        for (int i = 65; i < 70; i++) {
            for (int j = 65; j <= i; j++) {
                if (i % 2 == 0)
                    System.out.print((char)(j+32));
                else
                    System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
