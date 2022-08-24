class Triangle{
 public static void main(String ar [])
 {
   Triangle obj=new Triangle();
    obj.Rightprint();
    obj.Leftprint();
    obj.Triangles();
}
public void Rightprint()
{
  for(int row=1; row<=5; row++){

  for(int colm=1; colm<=row; colm++){
   System.out.print("*");

   }//colm
System.out.println();
  }//row
 }//method

public void Leftprint()
{
 for(int row=1; row<=5; row++)
   {
    for(int space=4; space>=row; space--){
     System.out.print(" ");}
    for(int star=1; star<=row; star++){
      System.out.print("*");}

System.out.println();
}//row


}//method

public void Triangles()
{
 for(int row=1; row<=5; row++)
   {
    for(int space=4; space>=row; space--){
     System.out.print(" ");}
    for(int star=1; star<=row; star++){
      System.out.print("*");}
    for(int star=1; star<row; star++){//colm
       System.out.print("*");}
System.out.println();
}
}//method
}

