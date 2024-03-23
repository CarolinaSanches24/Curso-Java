import java.util.Stack;
public class Main {
    public static void main(String[] args) {
    Stack <String> myStack = new Stack<>();

        System.out.println("Is my stack empty?" + myStack.empty());
        //return value boolean true or false

        myStack.push("Orange Ball");
        myStack.push("Violet Ball");
        myStack.push("Green Ball");

        System.out.println("Elements in Stack: "+myStack);
        System.out.println("Is my stack empty?" +myStack.empty());

//Em resumo, o código está esvaziando a pilha e exibindo os elementos
// remanescentes em cada iteração, além de verificar se a pilha está
// vazia após cada remoção de elemento.

        while(!myStack.isEmpty()){
            myStack.pop();
            System.out.println("Elements in Stack:"+myStack);
            System.out.println("Is my stack empty?"+myStack.empty());
        }

    }
}