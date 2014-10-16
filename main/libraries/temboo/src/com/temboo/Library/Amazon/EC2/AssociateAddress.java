package com.temboo.Library.Amazon.EC2;

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
AssociateAddress

Associates an Elastic IP address with an instance or a network interface.
*/
public class AssociateAddress extends Choreography {

	/**
	Create a new instance of the AssociateAddress Choreo. A TembooSession object, containing a valid
	set of Temboo credentials, must be supplied.
	*/
	public AssociateAddress(TembooSession session) {
		super(session, TembooPath.pathFromStringNoException("/Library/Amazon/EC2/AssociateAddress"));
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
	Set the value of the AllocationId input for this Choreo. 

	@param String - (optional, string) [EC2-VPC] The allocation ID.  Required for a VPC.
	*/
	public void setAllocationId(String value) {
		this.inputs.setInput("AllocationId", value);
	}


	/** 
	Set the value of the AllowReassociation input for this Choreo. 

	@param String - (optional, string) [EC2-VPC] Allows an Elastic IP address that is already associated with an instance or network interface to be re-associated with the specified instance or network interface. False if not specified.
	*/
	public void setAllowReassociation(String value) {
		this.inputs.setInput("AllowReassociation", value);
	}


	/** 
	Set the value of the InstanceId input for this Choreo. 

	@param String - (conditional, string) The ID of the instance.  Required for EC2-Classic. For a VPC, you can specify either an instance ID or a network interface ID, but not both.
	*/
	public void setInstanceId(String value) {
		this.inputs.setInput("InstanceId", value);
	}


	/** 
	Set the value of the NetworkInterfaceId input for this Choreo. 

	@param String - (optional, string) [EC2-VPC] The ID of the network interface. Association fails when specifying an instance ID unless exactly one interface is attached.
	*/
	public void setNetworkInterfaceId(String value) {
		this.inputs.setInput("NetworkInterfaceId", value);
	}


	/** 
	Set the value of the PrivateIpAddress input for this Choreo. 

	@param String - (optional, string) [EC2-VPC] The primary or secondary private IP address to associate with the Elastic IP address. If nothing is specified, the Elastic IP address is associated with the primary private IP address.
	*/
	public void setPrivateIpAddress(String value) {
		this.inputs.setInput("PrivateIpAddress", value);
	}


	/** 
	Set the value of the PublicIp input for this Choreo. 

	@param String - (conditional, string) The Elastic IP address.
	*/
	public void setPublicIp(String value) {
		this.inputs.setInput("PublicIp", value);
	}


	/** 
	Set the value of the ResponseFormat input for this Choreo. 

	@param String - (optional, string) The format that the response should be in. Valid values are "xml" (the default) and "json".
	*/
	public void setResponseFormat(String value) {
		this.inputs.setInput("ResponseFormat", value);
	}


	/** 
	Set the value of the UserRegion input for this Choreo. 

	@param String - (optional, string) The AWS region that corresponds to the EC2 endpoint you wish to access. The default region is "us-east-1". See description below for valid values.
	*/
	public void setUserRegion(String value) {
		this.inputs.setInput("UserRegion", value);
	}


	
	/**
	 * Execute the Choreo, wait for the Choreo to complete 
	 * and return a ResultSet containing the execution results.
	 */
	@Override
	public AssociateAddressResultSet run() {
		JSONObject result = super.runWithResults();
		return new AssociateAddressResultSet(result);
	}
	
}
