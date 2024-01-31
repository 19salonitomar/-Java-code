public class Swap {
    public static void main(String[] args){
        int a = 19 , b = 18 ;
        // Without using third Variable 
        a = a - b;
        b = a + b;
        a = b - a;
      
        System.out.println(a);
        System.out.println(b);

         // With using third Variable 
         System.out.println("Swap using Third Variable/n");
         int  num1 = 19 , num2 = 18 , c = 0;
         c = num1;
         num1 = num2;
         num2 = c;
         
       
         System.out.println(num1);
         System.out.println(num2);


    }
}
