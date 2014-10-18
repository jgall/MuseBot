//import controlP5.*;

//WARNING, Before running the program, you must go into the recieve class and enter the password for the gmail account. please do not commit anything with the password in it!

void setup() {
  size(650, 150);
  background(255);
  Queue myQueue = new Queue();
  String links = getLinks();
  links = links.replaceAll("\"","");
  links = links.replaceAll("\\[","").replaceAll("\\]","");
  String[] linksList = split(links, ",");
  for(int i=0;i<linksList.length;i++){
    Song temp = new Song(linksList[i]);
    myQueue.enqueue(temp);
  }
  //TODO, integrate playing of the songs...
}

