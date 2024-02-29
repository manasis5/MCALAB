//29-02-2024
import java.util.*;
public class manipulate{
    public static void main(String[] args) {
        System.out.println("Enter The String 1 and string 2");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Length of String = "+str1.length());
        System.out.println("Character at First position  = "+str1.charAt(1));
        System.out.println("String Contains 'Col' sequence :"+str1.contains("a"));
        System.out.println("String ends with e : "+str1.endsWith("e"));
        System.out.println("Replace'a' with 'b' : "+str1.replaceAll("a","b"));
        System.out.println("LOWERCASE : "+str1.toLowerCase());
        System.out.println("UPPERCASE : "+str1.toUpperCase());
        System.out.println("Concat:"+str1.concat(str2));
        System.out.println("Index of character 'S': " + str2.indexOf('S'));
        System.out.println("Comparing " + str1 + " and "+ str2 + " : "+ str1.equals(str2)); 
}
}
