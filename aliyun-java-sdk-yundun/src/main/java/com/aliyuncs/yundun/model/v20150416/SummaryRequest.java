/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.yundun.model.v20150416;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SummaryRequest extends RpcAcsRequest<SummaryResponse> {
	
	public SummaryRequest() {
		super("Yundun", "2015-04-16", "Summary");
	}

	private Long jstOwnerId;

	private String instanceIds;

	public Long getJstOwnerId() {
		return this.jstOwnerId;
	}

	public void setJstOwnerId(Long jstOwnerId) {
		this.jstOwnerId = jstOwnerId;
		putQueryParameter("JstOwnerId", String.valueOf(jstOwnerId));
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		putQueryParameter("InstanceIds", instanceIds);
	}

	@Override
	public Class<SummaryResponse> getResponseClass() {
		return SummaryResponse.class;
	}

}
