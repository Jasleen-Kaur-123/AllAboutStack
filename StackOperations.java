import java.util.Scanner;
import java.util.Stack;
public class smallStack{
    public static Stack<Integer> runningStack(int arr[]){
        Stack<Integer> st = new Stack<>();
        for(int nums : arr){
            st.push(nums);
        }
        return st;
    }
    public static void stackOpertations(Stack<Integer> st){
        System.out.println("This program perform following operation on Stack Choose One: \n1.push() \n2.pop() \n3.search() \n4.isEmpty()");
        System.out.print("Choose one option to perform operation on Stack : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
        case 1:
                System.out.println("Enter number to push in stack");
                int p = sc.nextInt();
                st.push(p);
                System.out.println("After push current stack is :"+st);
                break;
        case 2:
                if(!(st.isEmpty())){
                int popped =  st.pop();
                System.out.println("Popped Element"+popped);
                System.out.println("After pop current stack is :"+st);
                }
                else{
                    System.out.println("Enter is already Empty");
                }
                break;
        case 3: 
                System.out.println("Enter element to search in Stack");
                int s = sc.nextInt();
                int search = st.search(s);
                    if(search != -1) {
                        System.out.println("Not present in element");
                    }
                    else{
                        System.out.println("Present in stack");
                    }
                break;
        case 4:
                if(st.isEmpty()){
                    System.out.println("Stack is Empty");
                }
                else{
                    System.out.println("Stack is not Empty");
                }
                break;
        default: System.out.println("Enter invalid option.");
        }
    }
    public static void main(String[] args){
        int arr[] = {2,9,8,5,1,0};
        Stack<Integer> st = runningStack(arr);
        stackOpertations(st);
    }
}