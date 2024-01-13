
//import java.util.*;

public class JavaArray {
    public static void main(String[]args){
    //1-D Array
    int[] marks = new int[3];
    marks[0] = 99;  //1-D Array 
    marks[1] = 98;
    marks[2] = 95; 
    
    //Length
    System.out.println(marks.length);

    //Sort
    System.out.println(marks[0]);
    java.util.Arrays.sort(marks);
    System.out.println(marks[0]);

    //2-D Array
    int[][] finalMarks ={{99, 87, 85}, {94, 88,96}};
    System.out.println(finalMarks[0][2]);
    System.out.println(finalMarks[1][1]);

    //String Array
    
    String Names[] = {"Amay","Vihan","Rituu","Kiva","Divyanka","Siya","Krishna","Ravi","Khush","Geetika","Kanishka"};
    System.out.println("The Original Order");
    for(int i = 0; i < Names.length;i++){
        System.out.println(i + ":" + Names[i] + " ");

    }
    java.util.Arrays.sort(Names);
    System.out.println("\nThe new order:");
    for (int i = 0; i < Names.length; i++) {
        System.out.println(i + ": " + Names[i] + " ");
    }
    System.out.println();

    }
    
}
