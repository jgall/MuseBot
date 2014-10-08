void setup() {
  PrinterQueue demo = new PrinterQueue();
  PrintJob job1 = new PrintJob("Job1");
  PrintJob job2 = new PrintJob("Job2");
  PrintJob job3 = new PrintJob("Job3");

  demo.enqueue(job1);
  demo.enqueue(job2);
  demo.enqueue(job3);

 // demo.dequeue();

  println(demo.head.getContent());
}
void draw() {
}



class PrinterQueue {
  // declare instance variables here
  PrintJob head;
  PrintJob tail;
  int size;

  PrinterQueue() {
    // constructor
    head = null;
    tail = null;
    size = 0;
  }
  // declare methods here
  void enqueue(PrintJob n) {
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

  PrintJob dequeue() {
    head = head.getNextNode();
    return head;
  }

  PrintJob peek() {
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

