package com.temboo.Library.Google.Gmail;

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
InboxFeed

Allows you to access a read-only Gmail feed that contains a list of unread emails.
*/
public class InboxFeed extends Choreography {

	/**
	Create a new instance of the InboxFeed Choreo. A TembooSession object, containing a valid
	set of Temboo credentials, must be supplied.
	*/
	public InboxFeed(TembooSession session) {
		super(session, TembooPath.pathFromStringNoException("/Library/Google/Gmail/InboxFeed"));
	}

	/** 
	Set the value of the Label input for this Choreo. 

	@param String - (optional, string) The name of a Gmail Label to retrieve messages from (e.g., important, starred, sent, junk-e-mail, all).
	*/
	public void setLabel(String value) {
		this.inputs.setInput("Label", value);
	}


	/** 
	Set the value of the Mode input for this Choreo. 

	@param String - (optional, string) Used when an XPath query is provided. Valid values are "select" or "recursive". Select mode will return the first match of the query. In recursive mode, the XPath query will be applied within a loop.
	*/
	public void setMode(String value) {
		this.inputs.setInput("Mode", value);
	}


	/** 
	Set the value of the Password input for this Choreo. 

	@param String - (required, password) Your Gmail password.
	*/
	public void setPassword(String value) {
		this.inputs.setInput("Password", value);
	}


	/** 
	Set the value of the ResponseFormat input for this Choreo. 

	@param String - (optional, string) The format for the response. Valid values are JSON and XML. This will be ignored when providng an XPath query because results are returned as a string or JSON depending on the Mode specified.
	*/
	public void setResponseFormat(String value) {
		this.inputs.setInput("ResponseFormat", value);
	}


	/** 
	Set the value of the Username input for this Choreo. 

	@param String - (required, string) Your full Google email address e.g., martha.temboo@gmail.com.
	*/
	public void setUsername(String value) {
		this.inputs.setInput("Username", value);
	}


	/** 
	Set the value of the XPath input for this Choreo. 

	@param String - (optional, string) An XPATH query to run.
	*/
	public void setXPath(String value) {
		this.inputs.setInput("XPath", value);
	}


	
	/**
	 * Execute the Choreo, wait for the Choreo to complete 
	 * and return a ResultSet containing the execution results.
	 */
	@Override
	public InboxFeedResultSet run() {
		JSONObject result = super.runWithResults();
		return new InboxFeedResultSet(result);
	}
	
}
