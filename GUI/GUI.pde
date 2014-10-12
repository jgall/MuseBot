boolean paused;

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
}

void playPause() {
  if (paused==true) {
    playButton();
  } else {
    pauseButton();
  }
}

void pauseButton() {
  if ((mouseX >= 25) && (mouseX <= 68) && (mouseY >= 70) && (mouseY <= 130)) {
    if (mousePressed==true) {
      paused=true;
      // fill(255);
    } else {
      fill(100);
      noStroke();
      rect(25, 70, 15, 60);
      rect(53, 70, 15, 60);
    }
  } else {
    fill(0);
    noStroke();
    rect(25, 70, 15, 60);
    rect(53, 70, 15, 60);
  }
}

void playButton() {
  if ((mouseX >= 25) && (mouseX <= 68) && (mouseY >= 70) && (mouseY <= 130)) {
    if (mousePressed==true) {
      paused=false;
    } else {
      fill(100);
      noStroke();
      triangle(25, 70, 25, 130, 68, 100);
    }
  } else {
    fill(0);
    noStroke();
    triangle(25, 70, 25, 130, 68, 100);
  }
}

