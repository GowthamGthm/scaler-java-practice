package corejava;

public class Palindrome {

    public static void main(String[] args) {
        int num = 1221221;

//        System.out.println(num);

        palindromeCheckUsingString(num);
        palindromeCheckUsingNumber(num);

    }

    private static void palindromeCheckUsingNumber(int num) {
        //121
        
        int numCopy = num;
        int reversed = 0;
        while(num > 0 ) {
            int rem = num %10;  
            reversed = reversed * 10 + rem;    
            num = num/10; 
        }
        
        boolean palindrome = false;
        if (numCopy == reversed) {
            palindrome = true;
        }
        
        System.out.println("Number " + numCopy + " and " + reversed +  " is  palindrome ?  " + palindrome);
    }

    private static void palindromeCheckUsingString(int num) {

        String reversedString = new StringBuffer(String.valueOf(num)).reverse().toString();

        boolean palindrome = false;
        if (reversedString.equals(String.valueOf(num))) {
            palindrome = true;
        }

        System.out.println("Number " + num + " and " + reversedString +  " is  palindrome ?  " + palindrome);
    }

}
