/*You will be given two integers x and y as input, you have to compute x/y. If x and y are 
not 32 bit signed integers or if y is zero, exception will occur and you have to report
Read sample Input/Output to know what to report in case of exceptions.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaExceptionHanldingTryCatch {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        try{
        try{
            int x = new Integer(sc.nextInt());
            int y = new Integer(sc.nextInt());
            System.out.println(""+(x/y));
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}