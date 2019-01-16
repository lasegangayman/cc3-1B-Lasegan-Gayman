import java.util.Scanner;
public class cc31b_Lasegan_Gayman {
    
        public static void main(String[] args) {
           
            
        Scanner in=new Scanner (System.in);
            System.out.println("Enter size of the array: ");
        int size = in.nextInt();
        int num[]=new int[size];
        int mean=0;
        int i=0;
        int sum=0;

        for (i=0;i<num.length;i++) {
            System.out.print("enter a number: ");
            num[i]=in.nextInt();

        }
        System.out.println(mean(num));

    }
    //create a mean method here
        static double mean(int []array){
           //create mean here

            double counter = 0;
            for(int i = 0; i < array.length; i++){
                counter+=array[i];
                //+= counter = counter + array[i]
            }
            return counter/array.length;
            
        }

public static double modeCalc(double[] numRead, int num) {
    double maxValue = numRead[0];
    double lastValue = maxValue;
    int count = 1;
    int maxCount = 1;
    for (int i = 1; i < num; i++) {
        if (numRead[i] == lastValue) {
            count++;
        } else {
            count = 1;
            lastValue = numRead[i];
        }
        if (count > maxCount) {
            maxCount = count;
            maxValue = lastValue;
        }
    }
    return maxValue;
}
}