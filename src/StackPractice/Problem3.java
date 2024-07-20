package StackPractice;
import java.util.Stack;
import java.util.List;
public class Problem3 {
    //reverse string using stack
    public static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray()){
            stack.push(c);
        }
        char[] reversedArr = new char[str.length()];
        for(int i =0; i < reversedArr.length; i++){
            reversedArr[i] = stack.pop();
        }
        return new String(reversedArr);


    }
    public static void main(String[] args){
        String str1 = "abcdefg";
        String str2 = "stacks";
        String str3 = "test";
        String reversed1 = reverse(str1);
        String reversed2 = reverse(str2);
        String reversed3 = reverse(str3);
        System.out.println(reversed1 + "\n" + reversed2 + "\n" + reversed3);

    }
}
