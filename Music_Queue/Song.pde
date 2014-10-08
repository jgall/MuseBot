class Song {
  Song nextNode;
  String linkContent;

  Song(String tempContent) {
    linkContent = tempContent;
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

