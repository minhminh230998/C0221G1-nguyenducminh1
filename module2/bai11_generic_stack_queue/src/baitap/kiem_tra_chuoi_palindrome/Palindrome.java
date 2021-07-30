package baitap.kiem_tra_chuoi_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {


    public static void main(String[] args) {
        String palindrome = ("Able was I ere I saw Elba").toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < palindrome.length(); i++) {
            stack.push(palindrome.charAt(i));
            queue.add(palindrome.charAt(i));
        }
        int dem=0;
        for (int i = 0; i < queue.size(); i++) {
            if (queue.contains(stack.get(i))) {
                dem++;
            }
        }
        if(dem>0){
            System.out.println("đây là chuổi palindrome");
        }

        System.out.println(stack);
        System.out.println(queue);
    }
}
