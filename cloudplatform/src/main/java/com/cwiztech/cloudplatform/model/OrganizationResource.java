package com.cwiztech.cloudplatform.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
 @Table(name="TBLORGANIZATIONRESOURCE")
 
public class OrganizationResource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ORGANIZATIONRESOURCE_ID;
	private int ORGANIZATION_ID  ;
	private int RESOURCETYPE_ID ;
	private  long ORGANIZATIONRESOURCE_DESCRIPTION;
	private int MAXIMUM_NODES ; 
	private String WEBSITE ; 
	private int VISIBILITY_ID ; 
	private  int RESOURCEBEHAVIOURTYPE_ID ;
	private  char USEGLOBALSECURITYGROUP ; 
	private  char CHECKRUNWAYINSTANCES ;
	private char ACCESSINTERNET ; 
	private char USEPROXY ;
	private String PROXY_HOSTNAME ;
	private String  PROXY_USERNAME  ;
	private  String PROXY_PASSWORD ;
	private String PROXY_PRIVATEKEY ;
	private String PROXY_PUBLICEKEY ;
	private char ISACTIVE ;
	private int MODIFIED_BY ;
	private String MODIFIED_WHEN  ;
	private String MODIFIED_WORKSTATION  ;

	
	public int getORGANIZATIONRESOURCE_ID() {
		return ORGANIZATIONRESOURCE_ID;
	}
	public void setORGANIZATIONRESOURCE_ID(int oRGANIZATIONRESOURCE_ID) {
		ORGANIZATIONRESOURCE_ID = oRGANIZATIONRESOURCE_ID;
	}
	public int getORGANIZATION_ID() {
		return ORGANIZATION_ID;
	}
	public void setORGANIZATION_ID(int oRGANIZATION_ID) {
		ORGANIZATION_ID = oRGANIZATION_ID;
	}
	public int getRESOURCETYPE_ID() {
		return RESOURCETYPE_ID;
	}
	public void setRESOURCETYPE_ID(int rESOURCETYPE_ID) {
		RESOURCETYPE_ID = rESOURCETYPE_ID;
	}
	public long getORGANIZATIONRESOURCE_DESCRIPTION() {
		return ORGANIZATIONRESOURCE_DESCRIPTION;
	}
	public void setORGANIZATIONRESOURCE_DESCRIPTION(long oRGANIZATIONRESOURCE_DESCRIPTION) {
		ORGANIZATIONRESOURCE_DESCRIPTION = oRGANIZATIONRESOURCE_DESCRIPTION;
	}
	public int getMAXIMUM_NODES() {
		return MAXIMUM_NODES;
	}
	public void setMAXIMUM_NODES(int mAXIMUM_NODES) {
		MAXIMUM_NODES = mAXIMUM_NODES;
	}
	public String getWEBSITE() {
		return WEBSITE;
	}
	public void setWEBSITE(String wEBSITE) {
		WEBSITE = wEBSITE;
	}
	public int getVISIBILITY_ID() {
		return VISIBILITY_ID;
	}
	public void setVISIBILITY_ID(int vISIBILITY_ID) {
		VISIBILITY_ID = vISIBILITY_ID;
	}
	public int getRESOURCEBEHAVIOURTYPE_ID() {
		return RESOURCEBEHAVIOURTYPE_ID;
	}
	public void setRESOURCEBEHAVIOURTYPE_ID(int rESOURCEBEHAVIOURTYPE_ID) {
		RESOURCEBEHAVIOURTYPE_ID = rESOURCEBEHAVIOURTYPE_ID;
	}
	public char getUSEGLOBALSECURITYGROUP() {
		return USEGLOBALSECURITYGROUP;
	}
	public void setUSEGLOBALSECURITYGROUP(char uSEGLOBALSECURITYGROUP) {
		USEGLOBALSECURITYGROUP = uSEGLOBALSECURITYGROUP;
	}
	public char getCHECKRUNWAYINSTANCES() {
		return CHECKRUNWAYINSTANCES;
	}
	public void setCHECKRUNWAYINSTANCES(char cHECKRUNWAYINSTANCES) {
		CHECKRUNWAYINSTANCES = cHECKRUNWAYINSTANCES;
	}
	public char getACCESSINTERNET() {
		return ACCESSINTERNET;
	}
	public void setACCESSINTERNET(char aCCESSINTERNET) {
		ACCESSINTERNET = aCCESSINTERNET;
	}
	public char getUSEPROXY() {
		return USEPROXY;
	}
	public void setUSEPROXY(char uSEPROXY) {
		USEPROXY = uSEPROXY;
	}
	public String getPROXY_HOSTNAME() {
		return PROXY_HOSTNAME;
	}
	public void setPROXY_HOSTNAME(String pROXY_HOSTNAME) {
		PROXY_HOSTNAME = pROXY_HOSTNAME;
	}
	public String getPROXY_USERNAME() {
		return PROXY_USERNAME;
	}
	public void setPROXY_USERNAME(String pROXY_USERNAME) {
		PROXY_USERNAME = pROXY_USERNAME;
	}
	public String getPROXY_PASSWORD() {
		return PROXY_PASSWORD;
	}
	public void setPROXY_PASSWORD(String pROXY_PASSWORD) {
		PROXY_PASSWORD = pROXY_PASSWORD;
	}
	public String getPROXY_PRIVATEKEY() {
		return PROXY_PRIVATEKEY;
	}
	public void setPROXY_PRIVATEKEY(String pROXY_PRIVATEKEY) {
		PROXY_PRIVATEKEY = pROXY_PRIVATEKEY;
	}
	
	public char getISACTIVE() {
		return ISACTIVE;
	}
	public void setISACTIVE(char iSACTIVE) {
		ISACTIVE = iSACTIVE;
	}
	public int getMODIFIED_BY() {
		return MODIFIED_BY;
	}
	public void setMODIFIED_BY(int mODIFIED_BY) {
		MODIFIED_BY = mODIFIED_BY;
	}
	public String getMODIFIED_WORKSTATION() {
		return MODIFIED_WORKSTATION;
	}
	public void setMODIFIED_WORKSTATION(String mODIFIED_WORKSTATION) {
		MODIFIED_WORKSTATION = mODIFIED_WORKSTATION;
	}
	public String getPROXY_PUBLICEKEY() {
		return PROXY_PUBLICEKEY;
	}
	public void setPROXY_PUBLICEKEY(String pROXY_PUBLICEKEY) {
		PROXY_PUBLICEKEY = pROXY_PUBLICEKEY;
	}
	public String getMODIFIED_WHEN() {
		return MODIFIED_WHEN;
	}
	public void setMODIFIED_WHEN(String mODIFIED_WHEN) {
		MODIFIED_WHEN = mODIFIED_WHEN;
	}
	

}
