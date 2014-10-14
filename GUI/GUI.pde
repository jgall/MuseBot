boolean paused=false;

void setup() {
  size(650, 150);
  background(255);

  //LIST AVAILABLE FONTS
  // String[] fontList = PFont.list();
  // println(fontList);

  //PFont hLight;
  // PFont helveticaNeueULight;
  //hLight = loadFont("HelveticaNeue-Light-48.vlw");
  //helveticaNeueULight = loadFont("HelveticaNeue-UltraLight-48.vlw");
}

void draw() {
  background(255);
  fill(0);
  rect(0, 0, 650, 50);
  museBotText();
  playPause();
}

void museBotText() {
  fill(255);
  //textFont(hLight, 45);
  textSize(48);
  text("MuseBot", 0, 51);
  text("();", 196, 44);
  textSize(14);
  text("a Computer Science project", 461, 50);
}

void playPause() {
  if (paused==false) {
    pauseButton();
  } else if(paused==true) {
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
  if (mousePressed==true) {
    if ((mouseX >= 25) && (mouseX <= 68) && (mouseY >= 70) && (mouseY <= 130)) {
      paused=true;
    }
  }
}

void playButton() {
  noStroke();
  if ((mouseX >= 25) && (mouseX <= 68) && (mouseY >= 70) && (mouseY <= 130)) {
    fill(120);
  } else {
    fill(150);
  }
  triangle(25, 70, 25, 130, 68, 100);
  if (mousePressed==true) {
    if ((mouseX >= 25) && (mouseX <= 68) && (mouseY >= 70) && (mouseY <= 130)) {
      paused=false;
    }
  }
}

