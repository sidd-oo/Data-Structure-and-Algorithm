import java.util.*;
public class genericTreeConstruction{

public static class Node{
    int data;
    ArrayList<Node> children = new ArrayList<>();
}

public static Node construct(int input[]){
    Node root = null;
    Stack<Node> stack = new Stack <>();
    for(int i = 0; i < input.length; i++){
        if(input[i] == -1){
            stack.pop();
        }else{
            Node newNode = new Node();
            newNode.data = input[i];
            if(stack.size() != 0){
                Node parent = stack.peek();
                parent.children.add(newNode);
            }else{
                root = newNode;
            }
            stack.push(newNode);
        }
    }
    return root;
}
public static void main(String[] args) {

    int input[] = {10,20,50,-1,-1,30,70,-1,80,-1,-1,40,60,90,-1,-1,-1,-1};
    construct(input);

 }
}