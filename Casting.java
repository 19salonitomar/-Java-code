public class Casting {
    public static void main(String[] args){
        //1.ImplicitCasting 
        double price = 100.00;
        double finalprice = price + 18.99;
         
        System.out.println(finalprice);

        //2.ExplicitCasting ------------------------
        int p =100;
        int fp = p+ (int)18.99; //() must given for Explicit Casting
        
        System.out.println(fp);


        // -----------------Constat -------------
          //We use final keyword and in Capital Form to
        
          int age = 90;
          age = 39;
          System.out.println(age);
          
          final float PI = 3.14F;
          System.out.println( PI);

    }

}

