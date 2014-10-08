class Song {
  Song nextNode;
  String linkContent;

  Song(String tempContent) {
    content = tempContent;
  }

  void setNextNode(Song n) {
    nextNode = n;
  }

  Song getNextNode() {
    return nextNode;
  }

  String getContent() {
    return linkContent;
  }
}

