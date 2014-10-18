import com.temboo.core.*;
import com.temboo.Library.Google.Gmail.*;
import processing.net.*;
Client myClient;
String username = "fcsmusebot", password = "Enter the Password Here"; // ENTERE THE PASSWORD HERE, AND THEN DELETE IT AGAIN BEFORE YOU COMMIT!
// Create a session using your Temboo account application details
TembooSession session = new TembooSession("gaminator", "myFirstApp", "8450cfd815f24516864a77d78378d712");

String getLinks() {
  println("Starting Program...");
  // Run the GetUnreadMail Choreo function
  get();
  return runGetUnreadMailChoreo();
  
}

String runGetUnreadMailChoreo() {
  // Create the Choreo object using your Temboo session
  GetUnreadMail getUnreadMailChoreo = new GetUnreadMail(session);

  // Set inputs
  getUnreadMailChoreo.setPassword(password);
  getUnreadMailChoreo.setUsername(username);

  // Run the Choreo and store the results
  GetUnreadMailResultSet getUnreadMailResults = getUnreadMailChoreo.run();
  
  // Print results
  
  println(getUnreadMailResults.getResponse());
  println(getUnreadMailResults.getFullCount());
  return getUnreadMailResults.getResponse();

}
