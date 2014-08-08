public class Node<T> { 
final T payload; 
Node<T> next; 
Node<T> prev; 

public Node(T payload) { this.payload = payload; } 

public Node<T> getNext() { return next; } 
public void setNext(Node<T> next) { this.next = next; } 
public Node<T> getPrev() { return prev; } 
public void setPrev(Node<T> prev) { this.prev = prev; } 

public static void main(String[] args) {
    Node<Widget> node = new Node<>(new SubWidget());
    node.setNext(new Node<Widget>(new Widget()));
    node.setPrev(new Node<Widget>(new SubWidget()));
  }
}

class Widget {
  
}

class SubWidget extends Widget {
  
}