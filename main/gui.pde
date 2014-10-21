boolean paused=false;

void draw() {
  background(255);
  fill(0);
  //rect(0, 0, 650, 50);
  oneBigButton();
  //playPause();
  museBotText(0);
}

void museBotText(int colorVal) {
  fill(colorVal);
  //textFont(hLight, 45);
  textSize(30);
  text("MUSEBOT", 6, 36);
  // text("();", 196, 44);
 /* textSize(14);
  text("a Computer Science project", 461, 50);
  */
}
void oneBigButton() {
  noStroke();
  if ((mouseX >= 10) && (mouseX <= 140) && (mouseY >= 50) && (mouseY <= 180)) {
    fill(50);
    background(0);
  } else {
    fill(10);
    background(255);
  }
  rect (10,50,130,130);
  
  fill(255);
  textSize(46);
  text("NEXT", 16, 135);
}

void playPause() {
  if (paused==false) {
    pauseButton();
  } else if (paused==true) {
    playButton();
  }
}

void pauseButton() {
  noStroke();
  if ((mouseX >= 25) && (mouseX <= 68) && (mouseY >= 70) && (mouseY <= 130)) {
    fill(120);
  } else {
    fill(150);
  }
  rect(25, 70, 15, 60);
  rect(53, 70, 15, 60);
}

void playButton() {
  noStroke();
  if ((mouseX >= 25) && (mouseX <= 68) && (mouseY >= 70) && (mouseY <= 130)) {
    fill(120);
  } else {
    fill(150);
  }
  triangle(25, 70, 25, 130, 68, 100);
}

void mouseClicked() {
  if ((mouseX >= 10) && (mouseX <= 140) && (mouseY >= 50) && (mouseY <= 180)) {
    //paused=!paused;
    
    //this opens a link each time you press the pause/play button. TODO clean this up and make it a function...
    if(myQueue.isEmpty() == false) {
      link(myQueue.peek().linkContent);
      myQueue.dequeue();
    }
  }
}

void timeline() {
  int x;
  int songLength;
  //timeline bar
  rect(86, 99, 550, 2, 5, 5, 5, 5);

  songLength = 240;
  x = 550/songLength;

  //for (int i=0; i<550; i=i+x) {
  //  rect(86+i, 95, 2, 10, 5, 5, 5, 5);
  // }
}

