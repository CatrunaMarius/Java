import java.util.Scanner;

class scanner{
     public static void main(String args[]){
          Scanner mars = new Scanner (System.in);
          double fnum, snum, answer;
          System.out.println("Entre first num: ");
          fnum = mars.nextDouble();
          System.out.println("Entre second num: ");
          snum = mars.nextDouble();
          answer = fnum + snum;
          System.out.println(answer);
          }
 }         
