class apples{
    public static void main(String[] args){
    int array [] = {21,16,86,21,3};
    int sum =0;
    
    for (int counter =0; counter<array.length;counter++){
          sum+=array[counter];
    }
    
    System.out.println("The sum of these numbers is: " +sum);
  }
}
