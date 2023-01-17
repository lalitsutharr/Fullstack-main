public class reverseuniversity{
 public static void main(String[] args) {
        String name  =  "university";
        System.out.println("Original string: "+name);
        StringBuilder reverseString = new StringBuilder(name);
           reverseString.reverse();  
           String result = reverseString.toString();
              System.out.println("Reversed string: "+result); 


   }

}
