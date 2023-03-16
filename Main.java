public class Main {
    public static void main(String[] args) {
        // Non-Primitive types
        // 1.Concatenate
        String name1 = "Appu";
        String name2 = "Akku";
        String name3 = name1 + " And " + name2;
        System.out.println(name3);

        //2.charAt "for index" ->
        String name4 = "Index";
        System.out.println(name4.charAt(2));

        //3.String 'Length'
        String name5 = "Length";
        System.out.println(name5.length());

        //4.String 'replace'
        String name6 = "replace";
        String name = name6.replace('a', '@');
        System.out.println(name);
        System.out.println(name6);

        //5.substring
        String name7 = "substring Of String";
        System.out.println(name7.substring(3, 9));
    }    
}
