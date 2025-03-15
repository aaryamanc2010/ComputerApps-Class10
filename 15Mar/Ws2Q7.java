public class Ws2Q7 {
    public void main() {
        int x[]={5,-3,-2,1,0,12,14,16,25,13};
        int y[]={6,5,10,15,18,20,22,30};
        int z[]=new int[18];
        int j=0;
        for(int i=0;i<16;i+=2) {
            z[i]=x[j];
            j++;
        }
        int k=0;
        for(int i=1;i<16;i+=2) {
            z[i]=y[k];
            k++
        }
        z[16]=x[8];
        z[17]=x[9];
        for(int i=1;i<10;i+=2) {
            System.out.println(
        }
    }
}