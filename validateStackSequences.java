/* Program to validate push and pop sequence for stack in O(N) time and O(N) space.
Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4), pop() -> 4,
push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 */
import java.util.Stack;

public class validateStackSequences {
    static boolean validateSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();

        int j=0;

        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        if(stack.isEmpty()==true){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] push = {1,2,3,4,5};
        int[] pop1  = {4,3,5,1,2};
        int[] pop2 = {4,5,3,2,1};
        System.out.println(validateSequences(push,pop1));
        System.out.println(validateSequences(push,pop2));
    }
}
