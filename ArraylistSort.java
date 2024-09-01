import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSort {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("practice.geeksforgeeks.org");
        al.add("www.geeksforgeeks.org");
        al.add("code.geeksforgeeks.org");
 
        // Sorts ArrayList in ascending order
        Collections.sort(al);
        System.out.println("Modified ArrayList : \n" + al);
 
        // Sorts arr[] in descending order
        Collections.sort(al, Collections.reverseOrder());
 
        System.out.println("Modified ArrayList : \n" + al);
    }
}
    

