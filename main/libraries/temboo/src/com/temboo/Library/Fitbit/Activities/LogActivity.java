package com.temboo.Library.Fitbit.Activities;

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
LogActivity

Log a new activity for a particular date.
*/
public class LogActivity extends Choreography {

	/**
	Create a new instance of the LogActivity Choreo. A TembooSession object, containing a valid
	set of Temboo credentials, must be supplied.
	*/
	public LogActivity(TembooSession session) {
		super(session, TembooPath.pathFromStringNoException("/Library/Fitbit/Activities/LogActivity"));
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
	Set the value of the ActivityID input for this Choreo. 

	@param Integer - (conditional, integer) This can be the id of the activity, directory activity, or intensity level activity.
	*/
	public void setActivityID(Integer value) {
		this.inputs.setInput("ActivityID", value);
	}

	/** 
	Set the value of the ActivityID input for this Choreo as a String. 

	@param String - (conditional, integer) This can be the id of the activity, directory activity, or intensity level activity.
	*/
	public void setActivityID(String value) {
		this.inputs.setInput("ActivityID", value);	
	}
	/** 
	Set the value of the ActivityName input for this Choreo. 

	@param String - (conditional, string) Custom activity name; either activityId or activityName should be provided.
	*/
	public void setActivityName(String value) {
		this.inputs.setInput("ActivityName", value);
	}


	/** 
	Set the value of the ConsumerKey input for this Choreo. 

	@param String - (required, string) The Consumer Key provided by Fitbit.
	*/
	public void setConsumerKey(String value) {
		this.inputs.setInput("ConsumerKey", value);
	}


	/** 
	Set the value of the ConsumerSecret input for this Choreo. 

	@param String - (required, string) The Consumer Secret provided by Fitbit.
	*/
	public void setConsumerSecret(String value) {
		this.inputs.setInput("ConsumerSecret", value);
	}


	/** 
	Set the value of the Date input for this Choreo. 

	@param String - (required, date) The date that corresponds with the new log entry (in the format yyyy-MM-dd).
	*/
	public void setDate(String value) {
		this.inputs.setInput("Date", value);
	}


	/** 
	Set the value of the DistanceUnit input for this Choreo. 

	@param String - (conditional, string) Corresponds with the Distance parameter (i.e. Mile). See Choreo documentation for links to unit charts.
	*/
	public void setDistanceUnit(String value) {
		this.inputs.setInput("DistanceUnit", value);
	}


	/** 
	Set the value of the Distance input for this Choreo. 

	@param BigDecimal - (conditional, decimal) The activity distance. Used when activityId corresponds to 'Running'  or 'Walking' for example.
	*/
	public void setDistance(BigDecimal value) {
		this.inputs.setInput("Distance", value);
	}

	/** 
	Set the value of the Distance input for this Choreo as a String. 

	@param String - (conditional, decimal) The activity distance. Used when activityId corresponds to 'Running'  or 'Walking' for example.
	*/
	public void setDistance(String value) {
		this.inputs.setInput("Distance", value);	
	}
	/** 
	Set the value of the Duration input for this Choreo. 

	@param Integer - (required, integer) The duration of the activity in milliseconds.
	*/
	public void setDuration(Integer value) {
		this.inputs.setInput("Duration", value);
	}

	/** 
	Set the value of the Duration input for this Choreo as a String. 

	@param String - (required, integer) The duration of the activity in milliseconds.
	*/
	public void setDuration(String value) {
		this.inputs.setInput("Duration", value);	
	}
	/** 
	Set the value of the ManualCalories input for this Choreo. 

	@param Integer - (conditional, integer) The amount of calories defined manually; required when using the ActivityName parameter, otherwise optional.
	*/
	public void setManualCalories(Integer value) {
		this.inputs.setInput("ManualCalories", value);
	}

	/** 
	Set the value of the ManualCalories input for this Choreo as a String. 

	@param String - (conditional, integer) The amount of calories defined manually; required when using the ActivityName parameter, otherwise optional.
	*/
	public void setManualCalories(String value) {
		this.inputs.setInput("ManualCalories", value);	
	}
	/** 
	Set the value of the ResponseFormat input for this Choreo. 

	@param String - (optional, string) The format that you want the response to be in: xml or json. Defaults to json.
	*/
	public void setResponseFormat(String value) {
		this.inputs.setInput("ResponseFormat", value);
	}


	/** 
	Set the value of the StartTime input for this Choreo. 

	@param String - (required, string) The hour and minutes for the start of the activity formatted like HH:mm.
	*/
	public void setStartTime(String value) {
		this.inputs.setInput("StartTime", value);
	}


	/** 
	Set the value of the UserID input for this Choreo. 

	@param String - (optional, string) The user's encoded id. Defaults to "-" (dash) which will return data for the user associated with the token credentials provided.
	*/
	public void setUserID(String value) {
		this.inputs.setInput("UserID", value);
	}


	
	/**
	 * Execute the Choreo, wait for the Choreo to complete 
	 * and return a ResultSet containing the execution results.
	 */
	@Override
	public LogActivityResultSet run() {
		JSONObject result = super.runWithResults();
		return new LogActivityResultSet(result);
	}
	
}
