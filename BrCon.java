public class BrCon {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            if(i==5){
                i =i+1;
                continue;
            }
            System.out.print(i);
            i = i+1;
            if(i>10){
                break;
            }
        }
    }
    
}
