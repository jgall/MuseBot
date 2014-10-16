String youtubeVideoId(String youtubeUrl) {
  String regex = "^https?://(www.)?youtube.com/(watch\\?v=|v/)" +
                 "(.*?)(&.*)?$";
  return youtubeUrl.replaceAll(regex, "$3");
}

double youtubeDuration(String youtubeUrl) {
  String identifier = youtubeVideoId(youtubeUrl);
  String infoUrl = "https://gdata.youtube.com/feeds/api/videos/" +
                   identifier + "?v=2";
  String info = loadStrings(infoUrl)[0];
  String regex = "^.*duration='(.*?)'.*$";
  String duration = info.replaceAll(regex, "$1");
  try {
    return Double.parseDouble(duration);
  } catch (NumberFormatException e) {
    return -1;
  }
}

void setup() {
  println(youtubeDuration("https://www.youtube.com/watch?v=R4ajQ-foj2Q"));
}
