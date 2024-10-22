
class Stack{
    int max;
    int[] stack;
    int current = -1;

    public Stack(int maxg){
        max =maxg;
        stack = new int[max];
        System.err.println(max);
    }

    public int isEmpty(){
        if (stack.length ==0){
            return 1;
        }
        return 0;
    }

    public int isFull(){
        if (max == current+1){
            return 1;
        }
        return 0;
    }

    public int addElem(int element){
        if(isFull()==1){
            System.out.println("X");
            return 0;
        }
        stack[++current] = element;
        System.out.println("The elem : "+element);
        System.out.println("The index: " + current);
        return 1;
    }

    public int removeElem(){
        if(isEmpty()==1){
            return 0;
        }
        return stack[current--];

    }

    public void viewTop(){
        // if(isEmpty() ==1){
        //     return 0;
        // }
        System.out.println(stack[current]) ;
    }

    


}


public class StackImp {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.addElem(10);
        stack.addElem(20);
        stack.addElem(30);
        stack.addElem(40);
        stack.addElem(50);
        stack.addElem(60);
        stack.viewTop();
        stack.removeElem();
        stack.removeElem();
        stack.viewTop();
        stack.addElem(480);
        stack.viewTop();


    }
}
