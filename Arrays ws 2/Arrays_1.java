// WAP to accept 10 students marks in one array and their corresponding array.
// Print the name and the marks of the highest scorer
import java.util.*;
public class Arrays_1 {
    public void main () {
        int m[]={0,0,0,0,0,0,0,0,0,0};
        String n[]={"","","","","","","","","","",};
        Scanner sc= new Scanner(System.in);
        for(int c=0; c<=9; c++) {
            System.out.println("Enter the name of student: ");
            n[c]=sc.nextLine();
            System.out.println("Enter the marks of student no. " + n[c] + ": ");
            m[c]=sc.nextInt();
        }
        }
    public void Highest(String n[], int mks[]) {
        int index=0, max=0;
        for(int i=0;i<n.length;i++){
            if(mks[i]>max)
            max=mks(i);
            index=i;
        }  
    }       
}
