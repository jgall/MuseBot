//import controlP5.*;

//WARNING, Before running the program, you must go into the recieve class and enter the password for the gmail account. please do not commit anything with the password in it!

//creates the queue
Queue myQueue = new Queue();

void setup() {
  size(650, 150);
  background(255);

  
  //gets the links in the form of a single long string
  String links = getLinks();
  
  //string parsing to get the links into an array
  links = links.replaceAll("\"","");
  links = links.replaceAll("\\[","").replaceAll("\\]","");
  String[] linksList = split(links, ",");
  
  //adding the links to the queue
  for(int i=0;i<linksList.length;i++){
    Song temp = new Song(linksList[i]);
    myQueue.enqueue(temp);
  }
  //TODO, integrate playing of the songs...
}

