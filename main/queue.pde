   //link(demo.head.getContent());
class Queue {
  // declare instance variables here
  Song head;
  Song tail;
  int size;

  Queue() {
    // constructor
    head = null;
    tail = null;
    size = 0;
  }
  //methods here
  void enqueue(Song n) {
    if (head == null) {
      head = n;
      tail = n;
    } else {
      tail.setNextNode(n);
      tail = n;
    }
    size = size++;
  }

  Song dequeue() {
    head = head.getNextNode();
    return head;
  }

  Song peek() {
    return head;
  }

  int getLength() {
    return size;
  }

  boolean isEmpty() {
    if (head==null) {
      return true;
    } else {
      return false;
    }
  }
}

