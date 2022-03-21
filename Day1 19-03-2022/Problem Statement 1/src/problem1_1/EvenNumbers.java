package problem1_1;

public class EvenNumbers {

  public static void main(String args[]) {

int n = 50;

System.out.println("Even Numbers from 1 to "+n+" are: ");

for (int i = 1; i <= n; i++) {

   //if number%2 == 0 its an even number

   if (i % 2 == 0) {

 System.out.println(i + " ");

   }

}

  }

}