package com.temboo.Library.Nexmo.Voice;

/*
Copyright 2014 Temboo, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

import processing.data.JSONArray;
import processing.data.JSONObject;
import java.math.BigDecimal;
import com.temboo.core.Choreography;
import com.temboo.core.Choreography.ResultSet;
import com.temboo.core.TembooException;
import com.temboo.core.TembooPath;
import com.temboo.core.TembooSession;

/** 
ConfirmTextToSpeechPrompt

Sends a Text-to-Speech message to the specifed Number and confirms the specifed pin-code.
*/
public class ConfirmTextToSpeechPrompt extends Choreography {

	/**
	Create a new instance of the ConfirmTextToSpeechPrompt Choreo. A TembooSession object, containing a valid
	set of Temboo credentials, must be supplied.
	*/
	public ConfirmTextToSpeechPrompt(TembooSession session) {
		super(session, TembooPath.pathFromStringNoException("/Library/Nexmo/Voice/ConfirmTextToSpeechPrompt"));
	}

	/** 
	Set the value of the APIKey input for this Choreo. 

	@param String - (required, string) Your API Key provided to you by Nexmo.
	*/
	public void setAPIKey(String value) {
		this.inputs.setInput("APIKey", value);
	}


	/** 
	Set the value of the APISecret input for this Choreo. 

	@param String - (required, string) Your API Secret provided to you by Nexmo.
	*/
	public void setAPISecret(String value) {
		this.inputs.setInput("APISecret", value);
	}


	/** 
	Set the value of the ByeText input for this Choreo. 

	@param String - (required, string) Body of the text message played after digits are entered. (with a maximum length of 500 characters),
	*/
	public void setByeText(String value) {
		this.inputs.setInput("ByeText", value);
	}


	/** 
	Set the value of the CallbackURL input for this Choreo. 

	@param String - (required, string) A URL that Nexmo will request when the call ends to notify your application.
	*/
	public void setCallbackURL(String value) {
		this.inputs.setInput("CallbackURL", value);
	}


	/** 
	Set the value of the DropIfMachine input for this Choreo. 

	@param Integer - (optional, integer) Set to 1 to drop the call if a machine is detected.
	*/
	public void setDropIfMachine(Integer value) {
		this.inputs.setInput("DropIfMachine", value);
	}

	/** 
	Set the value of the DropIfMachine input for this Choreo as a String. 

	@param String - (optional, integer) Set to 1 to drop the call if a machine is detected.
	*/
	public void setDropIfMachine(String value) {
		this.inputs.setInput("DropIfMachine", value);	
	}
	/** 
	Set the value of the FailedText input for this Choreo. 

	@param String - (required, string) Body of the text message played after 3 failed attempts. (with a maximum length of 500 characters),
	*/
	public void setFailedText(String value) {
		this.inputs.setInput("FailedText", value);
	}


	/** 
	Set the value of the From input for this Choreo. 

	@param String - (optional, string) A voice enabled inbound number associated with your Nexmo account.
	*/
	public void setFrom(String value) {
		this.inputs.setInput("From", value);
	}


	/** 
	Set the value of the Language input for this Choreo. 

	@param String - (optional, string) The language used to play back your message.  The default is "en-us" which corresponds to United States english.
	*/
	public void setLanguage(String value) {
		this.inputs.setInput("Language", value);
	}


	/** 
	Set the value of the MaxDigits input for this Choreo. 

	@param Integer - (required, integer) Number of digits entered by the end user.
	*/
	public void setMaxDigits(Integer value) {
		this.inputs.setInput("MaxDigits", value);
	}

	/** 
	Set the value of the MaxDigits input for this Choreo as a String. 

	@param String - (required, integer) Number of digits entered by the end user.
	*/
	public void setMaxDigits(String value) {
		this.inputs.setInput("MaxDigits", value);	
	}
	/** 
	Set the value of the PinCode input for this Choreo. 

	@param String - (required, string) Pin-code to be entered by end user (Pin-code length should be equals to MaxDigits).
	*/
	public void setPinCode(String value) {
		this.inputs.setInput("PinCode", value);
	}


	/** 
	Set the value of the Repeat input for this Choreo. 

	@param Integer - (optional, integer) Define how many times you want to repeat the text message (default is 1 , maximum is 10).
	*/
	public void setRepeat(Integer value) {
		this.inputs.setInput("Repeat", value);
	}

	/** 
	Set the value of the Repeat input for this Choreo as a String. 

	@param String - (optional, integer) Define how many times you want to repeat the text message (default is 1 , maximum is 10).
	*/
	public void setRepeat(String value) {
		this.inputs.setInput("Repeat", value);	
	}
	/** 
	Set the value of the ResponseFormat input for this Choreo. 

	@param String - (optional, string) The format that the response should be in. Valid values are "json" (the default) and "xml".
	*/
	public void setResponseFormat(String value) {
		this.inputs.setInput("ResponseFormat", value);
	}


	/** 
	Set the value of the Text input for this Choreo. 

	@param String - (conditional, string) Body of the text message (with a maximum length of 1000 characters).
	*/
	public void setText(String value) {
		this.inputs.setInput("Text", value);
	}


	/** 
	Set the value of the To input for this Choreo. 

	@param String - (required, string) Phone number in international format and one recipient per request. (e.g. 447525856424 when sending to UK)
	*/
	public void setTo(String value) {
		this.inputs.setInput("To", value);
	}


	/** 
	Set the value of the Voice input for this Choreo. 

	@param String - (optional, string) The voice to be used female (default) or male.
	*/
	public void setVoice(String value) {
		this.inputs.setInput("Voice", value);
	}


	
	/**
	 * Execute the Choreo, wait for the Choreo to complete 
	 * and return a ResultSet containing the execution results.
	 */
	@Override
	public ConfirmTextToSpeechPromptResultSet run() {
		JSONObject result = super.runWithResults();
		return new ConfirmTextToSpeechPromptResultSet(result);
	}
	
}
