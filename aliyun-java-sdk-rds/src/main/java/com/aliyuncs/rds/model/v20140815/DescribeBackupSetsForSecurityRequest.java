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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupSetsForSecurityRequest extends RpcAcsRequest<DescribeBackupSetsForSecurityResponse> {
	
	public DescribeBackupSetsForSecurityRequest() {
		super("Rds", "2014-08-15", "DescribeBackupSetsForSecurity", "rds");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String targetAliBid;

	private String backupId;

	private String ownerAccount;

	private String endTime;

	private String startTime;

	private Long ownerId;

	private Integer pageNumber;

	private String backupStatus;

	private String backupLocation;

	private String targetAliUid;

	private Integer pageSize;

	private String dBInstanceId;

	private String backupMode;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getTargetAliBid() {
		return this.targetAliBid;
	}

	public void setTargetAliBid(String targetAliBid) {
		this.targetAliBid = targetAliBid;
		if(targetAliBid != null){
			putQueryParameter("TargetAliBid", targetAliBid);
		}
	}

	public String getBackupId() {
		return this.backupId;
	}

	public void setBackupId(String backupId) {
		this.backupId = backupId;
		if(backupId != null){
			putQueryParameter("BackupId", backupId);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getBackupStatus() {
		return this.backupStatus;
	}

	public void setBackupStatus(String backupStatus) {
		this.backupStatus = backupStatus;
		if(backupStatus != null){
			putQueryParameter("BackupStatus", backupStatus);
		}
	}

	public String getBackupLocation() {
		return this.backupLocation;
	}

	public void setBackupLocation(String backupLocation) {
		this.backupLocation = backupLocation;
		if(backupLocation != null){
			putQueryParameter("BackupLocation", backupLocation);
		}
	}

	public String getTargetAliUid() {
		return this.targetAliUid;
	}

	public void setTargetAliUid(String targetAliUid) {
		this.targetAliUid = targetAliUid;
		if(targetAliUid != null){
			putQueryParameter("TargetAliUid", targetAliUid);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getBackupMode() {
		return this.backupMode;
	}

	public void setBackupMode(String backupMode) {
		this.backupMode = backupMode;
		if(backupMode != null){
			putQueryParameter("BackupMode", backupMode);
		}
	}

	@Override
	public Class<DescribeBackupSetsForSecurityResponse> getResponseClass() {
		return DescribeBackupSetsForSecurityResponse.class;
	}

}
