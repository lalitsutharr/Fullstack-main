public class pallindrome {
    public static void main(String[] args){
        String str = "ABCBA";
        int n=str.length();
        boolean ok=true;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                ok=false;
                break;
            }
        }
        if(ok) {
            System.out.print("yes");
        }
        else{
            System.out.print("No");
        }
    }
}
