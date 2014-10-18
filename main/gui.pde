boolean paused=false;

void draw() {
  background(255);
  fill(0);
  rect(0, 0, 650, 50);
  museBotText();
  playPause();
  timeline();
}

void museBotText() {
  fill(255);
  //textFont(hLight, 45);
  textSize(48);
  text("MuseBot", 0, 51);
  // text("();", 196, 44);
  textSize(14);
  text("a Computer Science project", 461, 50);
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
  if ((mouseX >= 25) && (mouseX <= 68) && (mouseY >= 70) && (mouseY <= 130)) {
    paused=!paused;
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

