import java.util.Scanner;
public class IT24103227Lab6Q3{
public static void main(String[] args){

    int number,SumOfSquares,count;
    double mean,rms;

    count=0;
    SumOfSquares=0;

    System.out.println("Enter Positive integers (terminate input with-99)");
    Scanner input=new Scanner(System.in);

    while(true){
       System.out.print("Enter a number: ");
               number=input.nextInt();

       if (number==-99){
           break;
               }
           if (number>0) {
           SumOfSquares +=Math.pow(number,2);
           count++;
                  }

           else{
           System.out.println("Invalid Input. Please enter a positive integer or -99 to terminate");
           }
      }
      if(count>0){
          mean=SumOfSquares/count;
          rms=Math.sqrt(mean);
          System.out.println("The Root Mean square (RMS) is : "+rms);
          }

  }
}