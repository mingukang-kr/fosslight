/*
 * Copyright (c) 2021 LG Electronics Inc.
 * SPDX-License-Identifier: AGPL-3.0-only 
 */

package oss.fosslight.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import oss.fosslight.domain.OssAnalysis;
import oss.fosslight.domain.OssComponentsLicense;
import oss.fosslight.domain.OssLicense;
import oss.fosslight.domain.OssMaster;
import oss.fosslight.domain.Project;
import oss.fosslight.domain.ProjectIdentification;
import oss.fosslight.domain.Vulnerability;

@Mapper
public interface OssMapper {
	int selectOssMasterTotalCount(OssMaster ossMaster);			
	
	List<OssMaster> selectOssList(OssMaster ossMaster); 	
	
	List<OssMaster> selectOssSubList(OssMaster ossMaster); 	
	
	List<OssLicense> selectOssLicenseList(OssMaster ossMaster);
	
	List<OssMaster> selectOssNameList();
	
	List<OssMaster> selectOssNicknameList(OssMaster ossMaster); 
	
	List<Vulnerability> getOssVulnerabilityList(Vulnerability vulnParam);
	
	OssMaster selectOssOne(OssMaster ossMaster); 	
	
	List<OssMaster> selectOssNicknameListWithoutOwn(OssMaster ossMaster); 
	
	List<OssMaster> selectOssDownloadLocationList(OssMaster ossMaster);
	
	int selectOssPopupTotalCount(OssMaster ossMaster);			
	
	List<OssMaster> selectOssPopupList(OssMaster ossMaster);
	
	List<OssMaster> getBasicOssInfoListById(OssMaster ossMaster);
	
	int checkExistOssConfProject(OssMaster ossMaster);
	
	int checkExistOssConfPartner(OssMaster ossMaster);
		
	void insertOssMaster(OssMaster ossMaster);					
	
	int insertOssNickname(OssMaster ossMaster);					
	
	int mergeOssNickname(OssMaster ossMaster);					
	
	int insertOssLicense(OssMaster ossMaster);					
	
	int updateOssForProject(OssMaster ossMaster);				
	
	List<OssMaster> selectOssList2(OssMaster ossMaster); 				
	
	int deleteOssMaster(OssMaster ossMaster);				
	
	int deleteOssNickname(OssMaster ossMaster);					
	
	int deleteOssLicense(OssMaster ossMaster);
	
	List<OssMaster> selectOssListExcel(OssMaster ossMaster);
	
	List<OssMaster> getBasicOssInfoList(OssMaster ossMaster);	
	
	Map<String, Object> selectOssNameMap(OssMaster ossMaster);
	
	OssMaster checkExistsOss(OssMaster param);
	
	OssMaster licenseChecker(OssMaster ossMaster);
	
	OssMaster checkExistsOssNickname(OssMaster param);
	
	OssMaster checkExistsOssname(OssMaster param);
	
	List<Project> getOssChangeForUserList(OssMaster param);
	
	void deleteComponentLicenseByChangeOss(String componentId);
	
	void insertComponentLicenseByChangeOss(OssComponentsLicense bean);
	
	void deleteComponentLicenseIgnoreFirstByChangeOss(OssComponentsLicense deleteParam);
	
	void updateComponentLicenseByOssChange(OssComponentsLicense updateParam);
	
	List<OssMaster> getOssListByName(OssMaster bean);
	
	int checkExistsOssByname(OssMaster bean);
	
	void updateOssLicenseFlag(OssMaster updateParam);
	
	void updateOssLicenseVDiffFlag(OssMaster updateParam);
	
	List<OssMaster> apiSelectOssIdList();
	
	OssMaster getLastModifiedOssInfoByName(OssMaster bean);
	
	List<OssMaster> apiGetOssCopyTargetList(OssMaster param);
	
	void apiCopyOssMaster(OssMaster bean);
	
	void apiCopyOssLicense(OssMaster bean);
	
	void apiCopyOssLicenseFlag(OssMaster bean);
	
	int checkHasAnotherVersion(OssMaster ossMaster);
	
	OssMaster getOssBasicInfoForMailContents(String ossId);
	
	List<String> checkNickNameRegOss(String ossName);
	
	void updateLicenseTypeAndObligation(OssMaster ossBean);
	
	OssMaster checkExistsOssNickname2(OssMaster param);
	
	List<OssMaster> getOssInfoAll();
	
	List<OssMaster> getOssInfoAllWithNick();
	
	OssMaster getNvdDataByOssName(OssMaster nvdParam);
	
	void updateNvdData(OssMaster ossMaster);
	
	void changeOssNameByDelete(OssMaster bean);
	
	void mergeOssNickname2(OssMaster nickMergeParam);
	
	int getOssVersionCountByName(String ossName);
	
	String checkExistOssConfByName(String ossName);
	
	List<OssMaster> getBasicOssListByName(String ossName);
	
	List<OssMaster> checkExistsOssDownloadLocation(OssMaster ossMaster);
	
	List<OssMaster> checkExistsOssHomepage(OssMaster ossMaster);
	
	List<OssMaster> getOssAllNickNameList();
	
	List<OssMaster> checkExistsOssDownloadLocationWithOssName(OssMaster param);
	
	List<OssMaster> checkExistsOssHomepageWithOssName(OssMaster param);
	
	OssMaster getNvdDataByOssNameWithoutVer(OssMaster nvdParam);
	
	int existsOssDownloadLocation(OssMaster ossMaster);
	
	void deleteOssDownloadLocation(OssMaster ossMaster);
	
	void insertOssDownloadLocation(OssMaster ossMaster);
	
	String checkOssName(ProjectIdentification bean);
	
	List<OssMaster> checkOssNameUrl(ProjectIdentification bean);
	
	List<OssMaster> checkOssNameUrl2(ProjectIdentification bean);
	
	int updateOssCheckNameBySelfCheck(ProjectIdentification bean);
	
	int updateOssCheckName(ProjectIdentification bean);
	
	int checkOssNameCnt(ProjectIdentification bean);
	
	int checkOssNameUrlCnt(ProjectIdentification bean);
	
	int checkOssNameUrl2Cnt(ProjectIdentification bean);
	
	int ossAnalysisListCnt(OssMaster bean);
	
	void deleteOssAnalysisList(OssMaster bean);
	
	int insertOssAnalysisList(OssMaster bean);
	
	int updateOssAnalysisList(OssMaster bean);
	
	List<OssAnalysis> selectOssAnalysisList(OssMaster bean);
	
	void setOssAnalysisStatus(OssMaster bean);
	
	OssAnalysis getNewestOssInfo(OssAnalysis bean);
	
	List<OssMaster> getNewestOssInfoByOssMaster(OssMaster bean);
	
	int updateAnalysisComplete(OssAnalysis bean);
	
	int getAnalysisListPage(@Param("rows") int rows, @Param("prjId") String prjId);
	
	OssAnalysis getAutoAnalysisSuccessOssInfo(@Param("referenceOssId") String referenceOssId);
}