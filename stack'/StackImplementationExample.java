import java.util.Scanner;

public class StackImplementationExample {
    
    static int stack[];
    static int top=-1;

    static void push(int ele)
    {
        if(top==stack.length)
        {
            System.err.println("Stack is Full");
            return;
        }

        top++;
        stack[top]=ele;
        System.out.println("Data inserted into the stack!");
    }

    static void pop(){
        if(top==-1){
            System.err.println("Stack is empty");
            return;
        }
        top--;
        System.out.println("Topmost element deleted successfully!");
    }

    static void peek()
    {
        if(top==-1){
            System.err.println("No element is present in stack");
            return;
        }
        System.out.println("Element at topmost index: "+stack[top]);
    }

    static void size()
    {
        System.out.println("Size of stack: "+(top+1));
    }

    static void isEmpty()
    {
        if(top==-1){
            System.err.println("Stack is Empty");
            return;
        }
        System.out.println("Stack is not empty");   
    }

    static void isFull(){
        if(top==stack.length-1){
            System.out.println("Stack is Full");
            return;
        }
        System.out.println("Stack is not Full");

    }


    static void display(){
        if(top==-1){
            System.err.println("Stack is empty");
        }
        for(int i=top;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
    }

    static void search(int ele)
    {
        boolean found=false;
        for(int i=top;i>=0;i--)
        {
            if(stack[i]==ele){
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.err.println("Element is not found");
        }
    }

    static void clear()
    {
        if(top==-1)
        {
            System.out.println("Stack is Already Empty");
            return;
        }

        top=-1;
        System.out.println("Stack got cleared !");
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack");
        int size = sc.nextInt();
        System.out.println("Stack size is: " + size);
        stack=new int[size];

        while (true) {
            System.out.println("-------------Choose any one Option----------------------");
            System.out.println("1.push\n2.pop\n3.peek\n4.size\n5.isEmpty\n6.isFull\n7.display\n8.search\n9.clear\n10.exit");
            System.out.println("--------------------------------------------------------");

            int opt = sc.nextInt();
            switch (opt) 
            {
                case 1:
                    System.out.println("Enter ele");
                    int ele=sc.nextInt();
                    push(ele);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    size();
                    break;

                case 5:
                    isEmpty();
                    break;

                case 6:
                    isFull();
                    break;
                case 7:
                    display();
                    break;
                case 8:
                    System.out.println("Enter element to be searching..");
                    int e=sc.nextInt();
                    search(e);
                    break;

                case 9:
                    clear();
                    break;
                    
                case 10:
                    System.out.println("Exit!");
                    System.exit(0);
                    break;

                 default:{
                    System.out.println("Choose valid option");
                 }   
                    
            }
        }

    }

}