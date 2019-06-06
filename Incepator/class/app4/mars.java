public class mars{
   private String girlName;
    
   public mars (String name){
       girlName= name;
   }
   
   public void setName(String name){
        girlName=name;
   }
   
   public String getName(){
         return girlName;
   }
   
   public void Saying (){
        System.out.printf("Your first gf was %s\n", getName());
    }
 }
