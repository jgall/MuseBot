package com.temboo.Library.Google.Spreadsheets;

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
AddListRows

Adds one or more rows to a worksheet in a Google spreadsheet using a simple XML file you provide.
*/
public class AddListRows extends Choreography {

	/**
	Create a new instance of the AddListRows Choreo. A TembooSession object, containing a valid
	set of Temboo credentials, must be supplied.
	*/
	public AddListRows(TembooSession session) {
		super(session, TembooPath.pathFromStringNoException("/Library/Google/Spreadsheets/AddListRows"));
	}

	/** 
	Set the value of the RowsetXML input for this Choreo. 

	@param String - (required, xml) The rows of data that you want to add to a worksheet in XML format. Your XML needs to be in the rowset/row schema described in the Choreo documentation.
	*/
	public void setRowsetXML(String value) {
		this.inputs.setInput("RowsetXML", value);
	}


	/** 
	Set the value of the AccessToken input for this Choreo. 

	@param String - (optional, string) A valid Access Token retrieved during the OAuth process. This is required when authenticating with OAuth unless providing the ClientID, ClientSecret, and RefreshToken.
	*/
	public void setAccessToken(String value) {
		this.inputs.setInput("AccessToken", value);
	}


	/** 
	Set the value of the ClientID input for this Choreo. 

	@param String - (optional, string) The Client ID provided by Google. Required when authenticating with OAuth unless providing a valid AccessToken.
	*/
	public void setClientID(String value) {
		this.inputs.setInput("ClientID", value);
	}


	/** 
	Set the value of the ClientSecret input for this Choreo. 

	@param String - (optional, string) The Client Secret provided by Google. Required when authenticating with OAuth unless providing a valid AccessToken.
	*/
	public void setClientSecret(String value) {
		this.inputs.setInput("ClientSecret", value);
	}


	/** 
	Set the value of the Password input for this Choreo. 

	@param String - (conditional, password) Your Google password.
	*/
	public void setPassword(String value) {
		this.inputs.setInput("Password", value);
	}


	/** 
	Set the value of the RefreshToken input for this Choreo. 

	@param String - (optional, string) An OAuth Refresh Token used to generate a new Access Token when the original token is expired. Required when authenticating with OAuth unless providing a valid AccessToken.
	*/
	public void setRefreshToken(String value) {
		this.inputs.setInput("RefreshToken", value);
	}


	/** 
	Set the value of the ResponseFormat input for this Choreo. 

	@param String - (optional, string) The format that the response should be in. Valid values are: xml (the default) and json.
	*/
	public void setResponseFormat(String value) {
		this.inputs.setInput("ResponseFormat", value);
	}


	/** 
	Set the value of the SpreadsheetKey input for this Choreo. 

	@param String - (required, string) The unique key of the spreadsheet that contains the worksheet you want to add rows to.
	*/
	public void setSpreadsheetKey(String value) {
		this.inputs.setInput("SpreadsheetKey", value);
	}


	/** 
	Set the value of the Username input for this Choreo. 

	@param String - (conditional, string) Your full Google email address e.g., martha.temboo@gmail.com.
	*/
	public void setUsername(String value) {
		this.inputs.setInput("Username", value);
	}


	/** 
	Set the value of the WorksheetId input for this Choreo. 

	@param String - (required, string) The unique ID of the worksheet that you want to add rows to.
	*/
	public void setWorksheetId(String value) {
		this.inputs.setInput("WorksheetId", value);
	}


	
	/**
	 * Execute the Choreo, wait for the Choreo to complete 
	 * and return a ResultSet containing the execution results.
	 */
	@Override
	public AddListRowsResultSet run() {
		JSONObject result = super.runWithResults();
		return new AddListRowsResultSet(result);
	}
	
}
