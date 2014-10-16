package com.temboo.Library.Netflix;

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
GetDiscQueue

Retrieves the contents of a subscriber's disc queue.
*/
public class GetDiscQueue extends Choreography {

	/**
	Create a new instance of the GetDiscQueue Choreo. A TembooSession object, containing a valid
	set of Temboo credentials, must be supplied.
	*/
	public GetDiscQueue(TembooSession session) {
		super(session, TembooPath.pathFromStringNoException("/Library/Netflix/GetDiscQueue"));
	}

	/** 
	Set the value of the APIKey input for this Choreo. 

	@param String - (required, string) The API Key provided by Netflix (AKA the OAuth Consumer Key).
	*/
	public void setAPIKey(String value) {
		this.inputs.setInput("APIKey", value);
	}


	/** 
	Set the value of the AccessTokenSecret input for this Choreo. 

	@param String - (required, string) The Access Token Secret retrieved during the OAuth process.
	*/
	public void setAccessTokenSecret(String value) {
		this.inputs.setInput("AccessTokenSecret", value);
	}


	/** 
	Set the value of the AccessToken input for this Choreo. 

	@param String - (required, string) The Access Token retrieved during the OAuth process.
	*/
	public void setAccessToken(String value) {
		this.inputs.setInput("AccessToken", value);
	}


	/** 
	Set the value of the MaxResults input for this Choreo. 

	@param Integer - (optional, integer) Set this to the maximum number of results to return. This number cannot be greater than 500. If you do not specify max_results, the default value is 25
	*/
	public void setMaxResults(Integer value) {
		this.inputs.setInput("MaxResults", value);
	}

	/** 
	Set the value of the MaxResults input for this Choreo as a String. 

	@param String - (optional, integer) Set this to the maximum number of results to return. This number cannot be greater than 500. If you do not specify max_results, the default value is 25
	*/
	public void setMaxResults(String value) {
		this.inputs.setInput("MaxResults", value);	
	}
	/** 
	Set the value of the SharedSecret input for this Choreo. 

	@param String - (required, string) The Shared Secret provided by Netflix (AKA the OAuth Consumer Secret).
	*/
	public void setSharedSecret(String value) {
		this.inputs.setInput("SharedSecret", value);
	}


	/** 
	Set the value of the Sort input for this Choreo. 

	@param String - (optional, string) Use this to specify the sort order for the queue entries. Sort order may be by queue_sequence, date_added, or alphabetical. The default sort order, if you do not specify one, is queue_sequence.
	*/
	public void setSort(String value) {
		this.inputs.setInput("Sort", value);
	}


	/** 
	Set the value of the StartIndex input for this Choreo. 

	@param Integer - (optional, integer) The offset number of the results from the query.
	*/
	public void setStartIndex(Integer value) {
		this.inputs.setInput("StartIndex", value);
	}

	/** 
	Set the value of the StartIndex input for this Choreo as a String. 

	@param String - (optional, integer) The offset number of the results from the query.
	*/
	public void setStartIndex(String value) {
		this.inputs.setInput("StartIndex", value);	
	}
	/** 
	Set the value of the UpdatedMin input for this Choreo. 

	@param String - (optional, date) If set, the response will include only those items with updated timestamps greater than or equal to the timestamp provided. Specify this value either in Unix time format (seconds since epoch).
	*/
	public void setUpdatedMin(String value) {
		this.inputs.setInput("UpdatedMin", value);
	}


	/** 
	Set the value of the UserID input for this Choreo. 

	@param String - (required, string) The ID associated with the user whose queue information you want to retrieve.
	*/
	public void setUserID(String value) {
		this.inputs.setInput("UserID", value);
	}


	
	/**
	 * Execute the Choreo, wait for the Choreo to complete 
	 * and return a ResultSet containing the execution results.
	 */
	@Override
	public GetDiscQueueResultSet run() {
		JSONObject result = super.runWithResults();
		return new GetDiscQueueResultSet(result);
	}
	
}
