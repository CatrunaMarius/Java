public enum mars{
   marius("nice", "25"),
   ioana("cutie", "10"),
   maria("bigmistake", "12");
   
   private final String desc;
   private final String year;
   
   mars(String description, String birthday){
           desc = description;
           year = birthday;
   
   }
   
   public String getdesc(){
        return desc;
   }
   
   public String getYear(){
        return year;
   }
}
