public class mars {
   private String name;
   private data birthday;
   
   public mars (String theName, data theDate){
         name = theName;
         birthday = theDate;
   
   }
   
   public String toString(){
         return String.format("My name is %s, my birthday is %s", name, birthday);
   }

}
