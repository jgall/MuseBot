package com.temboo.Library.Nexmo.Account;

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
GetPricingByPrefix

Retrieve Nexmo's outbound pricing for the specified international prefix.
*/
public class GetPricingByPrefix extends Choreography {

	/**
	Create a new instance of the GetPricingByPrefix Choreo. A TembooSession object, containing a valid
	set of Temboo credentials, must be supplied.
	*/
	public GetPricingByPrefix(TembooSession session) {
		super(session, TembooPath.pathFromStringNoException("/Library/Nexmo/Account/GetPricingByPrefix"));
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
	Set the value of the Prefix input for this Choreo. 

	@param Integer - (required, integer) International dialing code. (e.g. 44)
	*/
	public void setPrefix(Integer value) {
		this.inputs.setInput("Prefix", value);
	}

	/** 
	Set the value of the Prefix input for this Choreo as a String. 

	@param String - (required, integer) International dialing code. (e.g. 44)
	*/
	public void setPrefix(String value) {
		this.inputs.setInput("Prefix", value);	
	}
	/** 
	Set the value of the ResponseFormat input for this Choreo. 

	@param String - (optional, string) The format that the response should be in. Valid values are "json" (the default) and "xml".
	*/
	public void setResponseFormat(String value) {
		this.inputs.setInput("ResponseFormat", value);
	}


	
	/**
	 * Execute the Choreo, wait for the Choreo to complete 
	 * and return a ResultSet containing the execution results.
	 */
	@Override
	public GetPricingByPrefixResultSet run() {
		JSONObject result = super.runWithResults();
		return new GetPricingByPrefixResultSet(result);
	}
	
}
