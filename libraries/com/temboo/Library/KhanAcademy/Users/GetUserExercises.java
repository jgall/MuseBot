package com.temboo.Library.KhanAcademy.Users;

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
GetUserExercises

Retrieves data about all excercises engaged by a specific user.
*/
public class GetUserExercises extends Choreography {

	/**
	Create a new instance of the GetUserExercises Choreo. A TembooSession object, containing a valid
	set of Temboo credentials, must be supplied.
	*/
	public GetUserExercises(TembooSession session) {
		super(session, TembooPath.pathFromStringNoException("/Library/KhanAcademy/Users/GetUserExercises"));
	}

	/** 
	Set the value of the ConsumerKey input for this Choreo. 

	@param String - (required, string) The Consumer Key provided by Khan Academy.
	*/
	public void setConsumerKey(String value) {
		this.inputs.setInput("ConsumerKey", value);
	}


	/** 
	Set the value of the ConsumerSecret input for this Choreo. 

	@param String - (required, string) The OAuth Consumer Secret provided by Khan Academy.
	*/
	public void setConsumerSecret(String value) {
		this.inputs.setInput("ConsumerSecret", value);
	}


	/** 
	Set the value of the Email input for this Choreo. 

	@param String - (optional, string) The email address (coach or student ID) of user. If not provided, defaults to currently logged in user.
	*/
	public void setEmail(String value) {
		this.inputs.setInput("Email", value);
	}


	/** 
	Set the value of the OAuthTokenSecret input for this Choreo. 

	@param String - (required, string) The OAuth Token Secret retrieved during the OAuth process.
	*/
	public void setOAuthTokenSecret(String value) {
		this.inputs.setInput("OAuthTokenSecret", value);
	}


	/** 
	Set the value of the OAuthToken input for this Choreo. 

	@param String - (required, string) The OAuth Token retrieved during the OAuth process.
	*/
	public void setOAuthToken(String value) {
		this.inputs.setInput("OAuthToken", value);
	}


	
	/**
	 * Execute the Choreo, wait for the Choreo to complete 
	 * and return a ResultSet containing the execution results.
	 */
	@Override
	public GetUserExercisesResultSet run() {
		JSONObject result = super.runWithResults();
		return new GetUserExercisesResultSet(result);
	}
	
}
