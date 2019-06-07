import java.util.EnumSet;

class apples{
    public static void main(String[] args){
       for(mars people : mars.values())
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
    
            System.out.println("\nAnd now for the range of constants!!!\n");        
        
            for( mars people: EnumSet.range(mars.ioana, mars.maria))
            	        System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
    
    }
}
