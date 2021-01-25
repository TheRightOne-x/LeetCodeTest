import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import java.util.*;
import sun.plugin.dom.core.Node;


import java.util.Stack;

class Listnode{
    int val;
    Listnode next;
}
public class StackTest {
    Listnode top = null;
    Listnode pre = null;
    int size = 0;
    StackTest(){
        Listnode head = new Listnode();
        this.top = pre = head;
    }
    public void push(Object obj){
        Listnode node = (Listnode) obj;
        node.next = top;
    }
    //        String s = "";
    //        Stack<Character> stack = new Stack<>();
    //        for(char i:s.toCharArray()){
    //            if(i == '(') stack.push(')');
    //            else if(i == '[') stack.push(']');
    //            else if(i == '{') stack.push('}');
    //            else if(stack.empty() || i != stack.pop()) return false;
    //        }
    //        return stack.isEmpty();
    public static void main(String[] args){
        String s = "";
        Stack<Character> stack = new Stack<>();
        String tempS = "";
        String numS = "";
        Stack<Character> stack1 = new Stack<>();
        String sum = "";
        // 3[2[a]]
        for(char c:s.toCharArray()){
            if (c != ']'){
                stack.push(c);
            }
            else if(c == ']'){
                tempS = "";
                numS = "";
                while(stack.peek() != '['){
                    stack1.push(stack.pop());
                }
                stack.pop();
                while(true){
                    numS += stack.pop();
                    if(stack.isEmpty() || stack.peek()<'0' || stack.peek() >'9'){
                        break;
                    }
                }
                int n = Integer.parseInt(numS);
                while(!stack1.isEmpty()){
                    for(char j: tempS.toCharArray()){

                    }
                    tempS += stack1.pop();
                }
                for(int i = 0;i<n;i++){
                    sum += tempS;
                }
            }
        }
        System.out.println("hello");
    }
}
