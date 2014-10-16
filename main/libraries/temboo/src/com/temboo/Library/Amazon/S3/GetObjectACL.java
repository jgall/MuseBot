package com.temboo.Library.Amazon.S3;

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
GetObjectACL

Returns the access control list (ACL) of a file or object.
*/
public class GetObjectACL extends Choreography {

	/**
	Create a new instance of the GetObjectACL Choreo. A TembooSession object, containing a valid
	set of Temboo credentials, must be supplied.
	*/
	public GetObjectACL(TembooSession session) {
		super(session, TembooPath.pathFromStringNoException("/Library/Amazon/S3/GetObjectACL"));
	}

	/** 
	Set the value of the AWSAccessKeyId input for this Choreo. 

	@param String - (required, string) The Access Key ID provided by Amazon Web Services.
	*/
	public void setAWSAccessKeyId(String value) {
		this.inputs.setInput("AWSAccessKeyId", value);
	}


	/** 
	Set the value of the AWSSecretKeyId input for this Choreo. 

	@param String - (required, string) The Secret Key ID provided by Amazon Web Services.
	*/
	public void setAWSSecretKeyId(String value) {
		this.inputs.setInput("AWSSecretKeyId", value);
	}


	/** 
	Set the value of the BucketName input for this Choreo. 

	@param String - (required, string) The name of the bucket associated with the ACL you want to retrieve.
	*/
	public void setBucketName(String value) {
		this.inputs.setInput("BucketName", value);
	}


	/** 
	Set the value of the FileName input for this Choreo. 

	@param String - (required, string) Name of the file or object you wish to retrieve the ACL for. Ex.: filename.txt or folder/filename.txt.
	*/
	public void setFileName(String value) {
		this.inputs.setInput("FileName", value);
	}


	/** 
	Set the value of the ResponseFormat input for this Choreo. 

	@param String - (optional, string) The format that the response should be in. Can be set to xml or json. Defaults to xml.
	*/
	public void setResponseFormat(String value) {
		this.inputs.setInput("ResponseFormat", value);
	}


	
	/**
	 * Execute the Choreo, wait for the Choreo to complete 
	 * and return a ResultSet containing the execution results.
	 */
	@Override
	public GetObjectACLResultSet run() {
		JSONObject result = super.runWithResults();
		return new GetObjectACLResultSet(result);
	}
	
}
