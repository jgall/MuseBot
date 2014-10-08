void setup() {
  PrinterQueue demo = new PrinterQueue();
  Song job1 = new Song("Job1");
  Song job2 = new Song("Job2");
  Song job3 = new Song("Job3");

  demo.enqueue(job1);
  demo.enqueue(job2);
  demo.enqueue(job3);

 // demo.dequeue();

  println(demo.head.getContent());
}
void draw() {
}



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
  // declare methods here
  void enqueue(Song n) {
    if (head == null) {
      head = n;
      tail = n;
    } 
    else {
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
    } 
    else {
      return false;
    }
  }
}

