import java.util.Random;

class apples{
     public static void main(String[] args) {
        random dice = new Random();
        int number;
        
        for (int counter=1; counter<=10; counter++){
             number = dice.nextInt(6);
             System.out.println(number + " ");
          }
     }
}
               
