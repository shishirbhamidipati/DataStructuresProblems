package StackPractice;
import java.util.Stack;
import java.util.List;
public class Problem4 {
    //check for a palindrome
    public static boolean isPalindrome(String str){
        boolean palindrome = true;
        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray()){
            stack.push(c);
        }
        char[] reversedArr = new char[str.length()];
        for(int i =0; i < reversedArr.length; i++){
            reversedArr[i] = stack.pop();
        }

        for(int i =0; i  < reversedArr.length; i++){
            if(reversedArr[i] != str.charAt(i)){
                palindrome = false;
            }
        }
        return palindrome;
    }
    public static void main(String[] args){
        String str1 = "level";
        String str2 = "mom";
        String str3 = "test";
        boolean palindrome1 = isPalindrome(str1);
        boolean palindrome2 = isPalindrome(str2);
        boolean palindrome3 = isPalindrome(str3);
        System.out.println(palindrome1 + "\n" + palindrome2 + "\n" + palindrome3);
    }
}
