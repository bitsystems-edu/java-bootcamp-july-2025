package DAY23.org.bitsystems.String;

public class StringExample {
    public void StringMethods(String s) {
        System.out.println("Trim: "+s.trim());
        System.out.println("Is Blank : "+s.isBlank());
        System.out.println("Is Empty : "+s.isEmpty());
        System.out.println("To Lower Case : "+s.toLowerCase());
        System.out.println("To Upper Case : "+s.toUpperCase());
        System.out.println("Char At : "+s.charAt(3));
        System.out.println("Concat : "+s.concat(" Java"));
        System.out.println("Index of : "+s.indexOf("s"));
        System.out.println("Replace : "+s.replace('t', 'm'));
        System.out.println("Split : " + s.split(" "));
    }

    //Reverse a string
    public String reverseString(String S) {
        char[] stringChar = S.toCharArray();
        int start = 0;
        int end = S.length()-1;
        while(start < end) {
            char temp = stringChar[start];
            stringChar[start] = stringChar[end];
            stringChar[end] = temp;
            start++;
            end--;
        }
        return new String(stringChar);
    }
}
