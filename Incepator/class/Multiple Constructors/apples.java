class apples{
    public static void main (String [] args){
       mars marsObject = new mars();
       mars marsObject2 = new mars(5);
       mars marsObject3 = new mars(5,13);
       mars marsObject4 = new mars(5,13,43);
       
       System.out.printf("%s\n", marsObject.toMilitary());
       System.out.printf("%s\n", marsObject2.toMilitary());
       System.out.printf("%s\n", marsObject3.toMilitary());
       System.out.printf("%s\n", marsObject4.toMilitary());
    }
}
