void setup() {
  //Demo the song Queue 
  /*
  Queue demo = new Queue();
   Song song1 = new Song("song1");
   Song song2 = new Song("song2");
   Song song3 = new Song("song3");
   
   demo.enqueue(song1);
   demo.enqueue(song2);
   demo.enqueue(song3);
   
   demo.dequeue();
   demo.dequeue();
   
   println(demo.head.getContent());
   */
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

