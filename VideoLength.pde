/**
 * Extract the video ID from a youtube video URL.
 */
String youtubeVideoId(String youtubeUrl) {
  String regex = "^https?://(www.)?youtube.com/(watch\\?v=|v/)" +
                 "(.*?)(&.*)?$";
  return youtubeUrl.replaceAll(regex, "$3");
}

/**
 * Get the duration (in seconds) of a video at a given [youtubeUrl].
 *
 * This may take a few seconds to run since it needs internet
 * connectivity. In some cases of error, -1 will be returned.
 */
double youtubeDuration(String youtubeUrl) {
  // Get the URL to youtube's video info API.
  String identifier = youtubeVideoId(youtubeUrl);
  String infoUrl = "https://gdata.youtube.com/feeds/api/videos/" +
                   identifier + "?v=2";
  // Load the info URL and find the first `duration` attribute.
  String info = loadStrings(infoUrl)[0];
  String regex = "^.*duration='(.*?)'.*$";
  String duration = info.replaceAll(regex, "$1");
  // Parse the [duration] string.
  try {
    return Double.parseDouble(duration);
  } catch (NumberFormatException e) {
    return -1;
  }
}

void setup() {
  println(youtubeDuration("https://www.youtube.com/watch?v=R4ajQ-foj2Q"));
}
