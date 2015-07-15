import ru.ncedu.java.tasks.Employee;
import ru.ncedu.java.tasks.EmployeeImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        EmployeeImpl q=new EmployeeImpl();
	// write your code here
        int[] a=new int[3];
        String s="fgh";
        char[] w=s.toCharArray();
        System.out.println(w.length);
        StringBuilder str=new StringBuilder();
        for(int i=w.length-1;i>-1;--i){
            str.append(w[i]);
        }
        s=str.toString();
        System.out.println(s);
        System.out.println();

    }
}
