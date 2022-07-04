import java.util.ArrayList;

public class StackArray implements Stack {
    ArrayList array;
    int capacity;
    int top;
    public StackArray(int capacity){
        this.capacity = capacity;
        this.array = new ArrayList();
        this.top = -1;
    }
    @Override
    public void push(Object item) {
        if (this.isFull()){
            System.out.println("Stack is Full. Can not Push");
        }
        else{
            array.add(top+1, item);
            top++;
        }

    }

    @Override
    public Object pop() {
        if (this.isEmpty()){
            System.out.println("Stack is Empty. Can not Pop");
            return null;
        }
        else{
            Object item = array.remove(top);
            top--;
            return item;
        }
    }

    @Override
    public boolean isEmpty() {
        if (array.size() == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (array.size() == capacity){
            return true;
        }
        return false;
    }

    @Override
    public Object peak() {
        return array.get(top);
    }

    @Override
    public void print() {
        for (int i = array.size()-1; i>= 0; i--){
            System.out.println(array.get(i));
        }
    }
}