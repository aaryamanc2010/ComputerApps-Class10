public class BoardWsQ1 {
    public void main(double sub1[], double sub2[], double sub3[]) {
        double avg[] = new double[sub1.length];
        for(int i=0; i<=sub1.length-1; i++) {
            avg[i]=(sub1[i]+sub2[i]+sub3[i]) /3.0;
        }
        System.out.println("Roll no. \t Subject 1 \t Subject 2 \t Subject 3 \t Average");
        for(int i=0; i<sub1.length-1;i++) {
            System.out.println((i+1)+ "\t\t"+(sub1[i]) + "\t\t" + (sub2[i]) + "\t\t" + (sub3[i]) + "\t\t" + (avg[i]));
        }
        System.out.println("---Students with average marks over 80---");
        for(int i=0; i<sub1.length-1;i++) {
            if(avg[i]>80) {
                System.out.println(i+1 + "\t");
                System.out.println(avg[i]);
            }
        }
        System.out.println("---Failures---");
        for(int i=0; i<sub1.length-1;i++) {
            if(avg[i]<40) {
                System.out.println(i+1 + "\t");
                System.out.println(avg[i]);
            }
        }
        }
    }