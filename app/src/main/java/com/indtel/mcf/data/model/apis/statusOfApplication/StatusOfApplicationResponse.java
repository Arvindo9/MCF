package com.indtel.mcf.data.model.apis.statusOfApplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Author       : Arvindo Mondal
 * Created on   : 16-08-2019
 * Email        : arvindo@aiprog.in
 * Company      : AIPROG
 * Designation  : Programmer
 * About        : I am a human can only think, I can't be a person like machine which have lots of memory and knowledge.
 * Quote        : No one can measure limit of stupidity but stupid things bring revolutions
 * Strength     : Never give up
 * Motto        : To be known as great Mathematician
 * Skills       : Algorithms and logic
 * Website      : www.aiprog.in
 */
public class StatusOfApplicationResponse {
    @SerializedName("ID")
    @Expose
    private Double iD;
    @SerializedName("NAMEOFFIRM")
    @Expose
    private String nAMEOFFIRM = "";
    @SerializedName("VENDOR_ID")
    @Expose
    private Double vENDORID;
    @SerializedName("TENDER_NO")
    @Expose
    private String tENDERNO = "";
    @SerializedName("LETTER_NO")
    @Expose
    private String lETTERNO = "";
    @SerializedName("LETTERNO_DATE")
    @Expose
    private String lETTERNODATE = "";
    @SerializedName("DATE")
    @Expose
    private String dATE = "";
    @SerializedName("ITEM_NAME")
    @Expose
    private String iTEMNAME = "";
    @SerializedName("ITEM_ID")
    @Expose
    private String iTEMID = "";
    @SerializedName("ATTACHMENT")
    @Expose
    private String aTTACHMENT = "";
    @SerializedName("QUANTITY")
    @Expose
    private String qUANTITY = "";
    @SerializedName("QUANTITY_UNIT")
    @Expose
    private String qUANTITYUNIT = "";
    @SerializedName("STAGE")
    @Expose
    private String sTAGE = "";
    @SerializedName("STAGE_SRNO")
    @Expose
    private Double sTAGESRNO;
    @SerializedName("DATE_OF_FEEDING")
    @Expose
    private String dATEOFFEEDING = "";
    @SerializedName("OFFICE_ADDRESS")
    @Expose
    private String oFFICEADDRESS = "";
    @SerializedName("OFFICE_STATE")
    @Expose
    private String oFFICESTATE = "";
    @SerializedName("OFFICE_STATE_CODE")
    @Expose
    private Double oFFICESTATECODE;
    @SerializedName("OFFICE_CITY")
    @Expose
    private String oFFICECITY = "";
    @SerializedName("FACTORY_ADDRESS")
    @Expose
    private String fACTORYADDRESS = "";
    @SerializedName("FACTORY_STATE")
    @Expose
    private String fACTORYSTATE = "";
    @SerializedName("FACTORY_STATE_CODE")
    @Expose
    private Double fACTORYSTATECODE;
    @SerializedName("FACTORY_CITY")
    @Expose
    private String fACTORYCITY = "";
    @SerializedName("HOURS_OF_FACTORY_WORKING")
    @Expose
    private String hOURSOFFACTORYWORKING = "";
    @SerializedName("WEEKLY_CLOSING_DAY")
    @Expose
    private String wEEKLYCLOSINGDAY = "";
    @SerializedName("NAME_OF_KEY_PERSON")
    @Expose
    private String nAMEOFKEYPERSON = "";
    @SerializedName("KEY_PERSON_DESIGNATION")
    @Expose
    private String kEYPERSONDESIGNATION = "";
    @SerializedName("KEY_PERSON_MOBILE")
    @Expose
    private Double kEYPERSONMOBILE;
    @SerializedName("KEY_PERSON_EMAIL")
    @Expose
    private String kEYPERSONEMAIL = "";
    @SerializedName("FACTORY_AREA_COVERED")
    @Expose
    private String fACTORYAREACOVERED = "";
    @SerializedName("FACTORY_AREA_UNCOVERED")
    @Expose
    private String fACTORYAREAUNCOVERED = "";
    @SerializedName("FACTORY_ATTACHMENT")
    @Expose
    private String fACTORYATTACHMENT = "";
    @SerializedName("FACTORY_LICENSE_NO")
    @Expose
    private String fACTORYLICENSENO = "";
    @SerializedName("IS_IT_PARTNERSHIP_OR_PROPRIETOR_FIRM")
    @Expose
    private String iSITPARTNERSHIPORPROPRIETORFIRM = "";
    @SerializedName("PARTNERSHIP_OR_PROPRIETOR_FIRM_ATTACHMENT")
    @Expose
    private String pARTNERSHIPORPROPRIETORFIRMATTACHMENT = "";
    @SerializedName("WHETHER_INDIANS_FACTORY_ACT")
    @Expose
    private String wHETHERINDIANSFACTORYACT = "";
    @SerializedName("POWER_AVAILABILITY")
    @Expose
    private String pOWERAVAILABILITY = "";
    @SerializedName("ADMINISTRATION_STAFF")
    @Expose
    private String aDMINISTRATIONSTAFF = "";
    @SerializedName("TECHNICAL_STAFF")
    @Expose
    private String tECHNICALSTAFF = "";
    @SerializedName("PRODUCTION_STAFF")
    @Expose
    private String pRODUCTIONSTAFF = "";
    @SerializedName("QUALITY_CONTROL_STAFF")
    @Expose
    private String qUALITYCONTROLSTAFF = "";
    @SerializedName("MANPOWER_ATTACHMENT")
    @Expose
    private String mANPOWERATTACHMENT = "";
    @SerializedName("DETAILS_OF_HEAT_TREATMENT")
    @Expose
    private String dETAILSOFHEATTREATMENT = "";
    @SerializedName("DETAILS_OF_ISO9001")
    @Expose
    private String dETAILSOFISO9001 = "";
    @SerializedName("IS90001_CERTIFICATE")
    @Expose
    private String iS90001CERTIFICATE = "";
    @SerializedName("ISO9000_CERTIFICATE")
    @Expose
    private String iSO9000CERTIFICATE = "";
    @SerializedName("QUALITY_ASSURANCE_PLAN_ATTACHMENT")
    @Expose
    private String qUALITYASSURANCEPLANATTACHMENT = "";
    @SerializedName("WHETHER_FIRM_MANUFACTURER_COMPLETE_DETAILS_SUB_ASSEMBLIES")
    @Expose
    private String wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES = "";
    @SerializedName("WHETHER_FIRM_MANUFACTURER_COMPLETE_DETAILS_SUB_ASSEMBLIES_ATTACHMENT")
    @Expose
    private String wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT = "";
    @SerializedName("NAME_OF_THE_SUB_CONTRACTOR_CONTENT_ATTACHMENT")
    @Expose
    private String nAMEOFTHESUBCONTRACTORCONTENTATTACHMENT = "";
    @SerializedName("DETAILS_OF_FACILITY_M_P_AVAILABLE")
    @Expose
    private String dETAILSOFFACILITYMPAVAILABLE = "";
    @SerializedName("MANUFACTURING_SPECIAL_ITEMS_ATTACHMENT")
    @Expose
    private String mANUFACTURINGSPECIALITEMSATTACHMENT = "";
    @SerializedName("DETAILS_OF_PRODUCT_SUPPLIED")
    @Expose
    private String dETAILSOFPRODUCTSUPPLIED = "";
    @SerializedName("LIST_OF_ORDER_ON_HAND")
    @Expose
    private String lISTOFORDERONHAND = "";
    @SerializedName("DETAIL_OF_PROOF_OF_OWNERSHIP")
    @Expose
    private String dETAILOFPROOFOFOWNERSHIP = "";
    @SerializedName("DETAIL_OF_FACTORY_LICENSE")
    @Expose
    private String dETAILOFFACTORYLICENSE = "";
    @SerializedName("DETAIL_OF_GSTN")
    @Expose
    private String dETAILOFGSTN = "";
    @SerializedName("DETAIL_OF_ELECTRICITY_BILL")
    @Expose
    private String dETAILOFELECTRICITYBILL = "";
    @SerializedName("DETAIL_OF_NSIC_DIC")
    @Expose
    private String dETAILOFNSICDIC = "";
    @SerializedName("DETAIL_OF_MSME")
    @Expose
    private String dETAILOFMSME = "";
    @SerializedName("PROOF_OF_OWNERSHIP")
    @Expose
    private String pROOFOFOWNERSHIP = "";
    @SerializedName("FACTORY_LICENSE")
    @Expose
    private String fACTORYLICENSE = "";
    @SerializedName("GSTN")
    @Expose
    private String gSTN = "";
    @SerializedName("ELECTRICITY_BILL")
    @Expose
    private String eLECTRICITYBILL = "";
    @SerializedName("REGISTRATION_CERTIFICATE_FACTORY_LICENSE")
    @Expose
    private String rEGISTRATIONCERTIFICATEFACTORYLICENSE = "";
    @SerializedName("NSIC_DIC")
    @Expose
    private String nSICDIC = "";
    @SerializedName("MSME")
    @Expose
    private String mSME = "";
    @SerializedName("BANKER_NAME")
    @Expose
    private String bANKERNAME = "";
    @SerializedName("BANKER_ADDRESS")
    @Expose
    private String bANKERADDRESS = "";
    @SerializedName("IS_COMPANY_CERTIFIED_ISO_14001")
    @Expose
    private String iSCOMPANYCERTIFIEDISO14001 = "";
    @SerializedName("IS_COMPANY_CERTIFIED_ISO_14001_ATTACHMENT")
    @Expose
    private String iSCOMPANYCERTIFIEDISO14001ATTACHMENT = "";
    @SerializedName("IS_COMPANY_MONITOR_ENVIRONMENT_PERFORMANCE")
    @Expose
    private String iSCOMPANYMONITORENVIRONMENTPERFORMANCE = "";
    @SerializedName("IS_COMPANY_MEASURE_ENVIRONMENT_PERFORMANCE")
    @Expose
    private String iSCOMPANYMEASUREENVIRONMENTPERFORMANCE = "";
    @SerializedName("IS_COMPANY_MEASURE_ENVIRONMENT_PERFORMANCE_ATTACHMENT")
    @Expose
    private String iSCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT = "";
    @SerializedName("IS_COMPANY_IDENTIFIED_ENVIRONMENT_IMPACTS")
    @Expose
    private String iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTS = "";
    @SerializedName("IS_COMPANY_IDENTIFIED_ENVIRONMENT_IMPACTS_ATTACHMENT")
    @Expose
    private String iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT = "";
    @SerializedName("IS_COMPANY_DEFINED_GOALS_ENERGY")
    @Expose
    private String iSCOMPANYDEFINEDGOALSENERGY = "";
    @SerializedName("IS_COMPANY_DEFINED_GOALS_ENERGY_ATTACHMENT")
    @Expose
    private String iSCOMPANYDEFINEDGOALSENERGYATTACHMENT = "";
    @SerializedName("IS_COMPANY_DEFINED_GOALS_WATER")
    @Expose
    private String iSCOMPANYDEFINEDGOALSWATER = "";
    @SerializedName("IS_COMPANY_DEFINED_GOALS_WATER_ATTCHMENT")
    @Expose
    private String iSCOMPANYDEFINEDGOALSWATERATTCHMENT = "";
    @SerializedName("IS_COMPANY_IDENTIFIED_LEGAL_REQUIREMENTS")
    @Expose
    private String iSCOMPANYIDENTIFIEDLEGALREQUIREMENTS = "";
    @SerializedName("IS_COMPANY_LEGAL_REQUIREMETS_COMPLIANCE")
    @Expose
    private String iSCOMPANYLEGALREQUIREMETSCOMPLIANCE = "";
    @SerializedName("IS_COMPANY_IDENTIFIED_WASTES_GENERATED")
    @Expose
    private String iSCOMPANYIDENTIFIEDWASTESGENERATED = "";
    @SerializedName("IS_COMPANY_SEGREGATING_WASTES")
    @Expose
    private String iSCOMPANYSEGREGATINGWASTES = "";
    @SerializedName("IS_COMPANY_SAFE_DISPOSAL_WASTES")
    @Expose
    private String iSCOMPANYSAFEDISPOSALWASTES = "";
    @SerializedName("IS_COMPANY_DISPOSING_WASTES")
    @Expose
    private String iSCOMPANYDISPOSINGWASTES = "";
    @SerializedName("IS_COMPANY_ENERGY_EFFICIENT")
    @Expose
    private String iSCOMPANYENERGYEFFICIENT = "";
    @SerializedName("IS_COMPANY_CONDUCTING_REGULAR_AWARENESS")
    @Expose
    private String iSCOMPANYCONDUCTINGREGULARAWARENESS = "";
    @SerializedName("DATE_OF_SUBMISSION")
    @Expose
    private String dATEOFSUBMISSION = "";
    @SerializedName("SSE_NAME")
    @Expose
    private String sSENAME = "";
    @SerializedName("SSE_ID")
    @Expose
    private Double sSEID;
    @SerializedName("SCRUTINY_STATUS")
    @Expose
    private String sCRUTINYSTATUS = "";
    @SerializedName("IS_ASSESSMENT_RERQUIRED")
    @Expose
    private String iSASSESSMENTRERQUIRED = "";
    @SerializedName("RECOMMENDED_AO_NAME")
    @Expose
    private String rECOMMENDEDAONAME = "";
    @SerializedName("RECOMMENDED_AO_ID")
    @Expose
    private Double rECOMMENDEDAOID;
    @SerializedName("REMARK_OF_SCRUTINY")
    @Expose
    private String rEMARKOFSCRUTINY = "";
    @SerializedName("ATTACHMENT_OF_SCRUTINY")
    @Expose
    private String aTTACHMENTOFSCRUTINY = "";
    @SerializedName("DATE_OF_SCRUTINY")
    @Expose
    private String dATEOFSCRUTINY = "";
    @SerializedName("AO_NAME")
    @Expose
    private String aONAME = "";
    @SerializedName("AO_ID")
    @Expose
    private Double aOID;
    @SerializedName("DYCME_NAME")
    @Expose
    private String dYCMENAME = "";
    @SerializedName("DYCME_ID")
    @Expose
    private Double dYCMEID;
    @SerializedName("REMARK_OF_DYCME")
    @Expose
    private String rEMARKOFDYCME = "";
    @SerializedName("DATE_OF_REMARK_BY_DYCME")
    @Expose
    private String dATEOFREMARKBYDYCME = "";
    @SerializedName("PROBABLE_DATE_OF_VISIT")
    @Expose
    private String pROBABLEDATEOFVISIT = "";
    @SerializedName("DATE_OF_FEEDING_OF_PROBABLE_DATE")
    @Expose
    private String dATEOFFEEDINGOFPROBABLEDATE = "";
    @SerializedName("STATUS_OF_ASSESSMENT")
    @Expose
    private String sTATUSOFASSESSMENT = "";
    @SerializedName("REMARK_BY_ASSESSMENT_OFFICER")
    @Expose
    private String rEMARKBYASSESSMENTOFFICER = "";
    @SerializedName("ATTACHMENT_OF_ASSESSMENT_REPORT")
    @Expose
    private String aTTACHMENTOFASSESSMENTREPORT = "";
    @SerializedName("DATE_OF_REMARK_OF_ASSESSMENT")
    @Expose
    private String dATEOFREMARKOFASSESSMENT = "";
    @SerializedName("AME_NAME")
    @Expose
    private String aMENAME = "";
    @SerializedName("AME_ID")
    @Expose
    private Double aMEID;
    @SerializedName("REMARK_ON_ASSESSMENT_BY_AME")
    @Expose
    private String rEMARKONASSESSMENTBYAME = "";
    @SerializedName("DATE_OF_REMARK_ON_ASSESSMENT_BY_AME")
    @Expose
    private String dATEOFREMARKONASSESSMENTBYAME = "";
    @SerializedName("SCRUTINY_STATUS_OF_ASSESSMENT_REPORT")
    @Expose
    private String sCRUTINYSTATUSOFASSESSMENTREPORT = "";
    @SerializedName("SCRUTINY_REPORT_OF_ASSESSMENT_REPORT")
    @Expose
    private String sCRUTINYREPORTOFASSESSMENTREPORT = "";
    @SerializedName("STATUS_OF_VERIFICATION_BY_DYCME")
    @Expose
    private String sTATUSOFVERIFICATIONBYDYCME = "";
    @SerializedName("VERIFICATION_REMARK_BY_DYCME")
    @Expose
    private String vERIFICATIONREMARKBYDYCME = "";
    @SerializedName("DATE_OF_VERIFICATION_BY_DYCME")
    @Expose
    private String dATEOFVERIFICATIONBYDYCME = "";
    @SerializedName("CPLE_NAME")
    @Expose
    private String cPLENAME = "";
    @SerializedName("CPLE_ID")
    @Expose
    private Double cPLEID;
    @SerializedName("STATUS_OF_CPLE")
    @Expose
    private String sTATUSOFCPLE = "";
    @SerializedName("REMARK_BY_CPLE")
    @Expose
    private String rEMARKBYCPLE = "";
    @SerializedName("DATE_OF_REMARK_BY_CPLE")
    @Expose
    private String dATEOFREMARKBYCPLE = "";
    @SerializedName("REMARK_OF_ACCEPTANCE_REJECTION_LETTER")
    @Expose
    private String rEMARKOFACCEPTANCEREJECTIONLETTER = "";
    @SerializedName("DATE_OF_ACCEPTANCE_REJECTION_LETTER")
    @Expose
    private String dATEOFACCEPTANCEREJECTIONLETTER = "";
    @SerializedName("LETTER_OF_ACCEPTANCE_REJECTION")
    @Expose
    private String lETTEROFACCEPTANCEREJECTION = "";
    @SerializedName("REMARK_BY_VENDOR_FOR_DEFICIENCY")
    @Expose
    private String rEMARKBYVENDORFORDEFICIENCY = "";
    @SerializedName("DATE_OF_REMARK_BY_VENDOR")
    @Expose
    private String dATEOFREMARKBYVENDOR = "";
    @SerializedName("ATTACHMENT_BY_VENDOR")
    @Expose
    private String aTTACHMENTBYVENDOR = "";
    @SerializedName("NUMBER_OF_SUPERVISORY_STAFF")
    @Expose
    private String nUMBEROFSUPERVISORYSTAFF = "";
    @SerializedName("TOTAL_SKILLED_NONSKILLED_STAFF")
    @Expose
    private String tOTALSKILLEDNONSKILLEDSTAFF = "";
    @SerializedName("DESIGNATION_of_DyCMM")
    @Expose
    private String dESIGNATIONOfDyCMM = "";
    @SerializedName("FACTORY_TYPE")
    @Expose
    private String fACTORYTYPE = "";
    @SerializedName("FACTORY_RENT_AGREEMENT")
    @Expose
    private String fACTORYRENTAGREEMENT = "";
    @SerializedName("LICENSE_ISSUING_AUTHORITY")
    @Expose
    private String lICENSEISSUINGAUTHORITY = "";
    @SerializedName("LICENSE_ISSUE_DATE")
    @Expose
    private String lICENSEISSUEDATE = "";
    @SerializedName("LICENSE_VALIDITY")
    @Expose
    private String lICENSEVALIDITY = "";
    @SerializedName("LICENSE_ATTACHMENT")
    @Expose
    private String lICENSEATTACHMENT = "";
    @SerializedName("DATE_OF_REMARK_BY_AME_ON_RECOMMENDATION")
    @Expose
    private String dATEOFREMARKBYAMEONRECOMMENDATION = "";
    @SerializedName("REMARK_BY_AME_ON_RECOMMENDATION")
    @Expose
    private String rEMARKBYAMEONRECOMMENDATION = "";
    @SerializedName("DATE_OF_REMARK_OF_SSE_ON_ASSESSMENT")
    @Expose
    private String dATEOFREMARKOFSSEONASSESSMENT = "";
    @SerializedName("ATTACHMENT_TO_VENDOR")
    @Expose
    private String aTTACHMENTTOVENDOR = "";
    @SerializedName("STATUS_OF_ASSESSMENT_REPORT_SSE")
    @Expose
    private String sTATUSOFASSESSMENTREPORTSSE = "";
    @SerializedName("REMARK_OF_SSE_ON_ASSESSMENT")
    @Expose
    private String rEMARKOFSSEONASSESSMENT = "";
    @SerializedName("REVERT_SSE_ASSESSMENT")
    @Expose
    private String rEVERTSSEASSESSMENT = "";
    @SerializedName("REVERT_AME_ASSESSMENT")
    @Expose
    private String rEVERTAMEASSESSMENT = "";
    @SerializedName("REVERT_DYCME_ASSESSMENT")
    @Expose
    private String rEVERTDYCMEASSESSMENT = "";
    @SerializedName("REMARK_BY_VENDOR_ASSESSMENT")
    @Expose
    private String rEMARKBYVENDORASSESSMENT = "";
    @SerializedName("DATE_OF_REMARK_BY_VENDOR_ASSESSMENT")
    @Expose
    private String dATEOFREMARKBYVENDORASSESSMENT = "";
    @SerializedName("ATTACHMENT_BY_VENDOR_ASSESSMENT")
    @Expose
    private String aTTACHMENTBYVENDORASSESSMENT = "";

    public Double getID() {
        return iD;
    }

    public void setID(Double iD) {
        this.iD = iD;
    }

    public String getNAMEOFFIRM() {
        return nAMEOFFIRM;
    }

    public void setNAMEOFFIRM(String nAMEOFFIRM) {
        this.nAMEOFFIRM = nAMEOFFIRM;
    }

    public Double getVENDORID() {
        return vENDORID;
    }

    public void setVENDORID(Double vENDORID) {
        this.vENDORID = vENDORID;
    }

    public String getTENDERNO() {
        return tENDERNO;
    }

    public void setTENDERNO(String tENDERNO) {
        this.tENDERNO = tENDERNO;
    }

    public String getLETTERNO() {
        return lETTERNO;
    }

    public void setLETTERNO(String lETTERNO) {
        this.lETTERNO = lETTERNO;
    }

    public String getLETTERNODATE() {
        return lETTERNODATE;
    }

    public void setLETTERNODATE(String lETTERNODATE) {
        this.lETTERNODATE = lETTERNODATE;
    }

    public String getDATE() {
        return dATE;
    }

    public void setDATE(String dATE) {
        this.dATE = dATE;
    }

    public String getITEMNAME() {
        return iTEMNAME;
    }

    public void setITEMNAME(String iTEMNAME) {
        this.iTEMNAME = iTEMNAME;
    }

    public String getITEMID() {
        return iTEMID;
    }

    public void setITEMID(String iTEMID) {
        this.iTEMID = iTEMID;
    }

    public String getATTACHMENT() {
        return aTTACHMENT;
    }

    public void setATTACHMENT(String aTTACHMENT) {
        this.aTTACHMENT = aTTACHMENT;
    }

    public String getQUANTITY() {
        return qUANTITY;
    }

    public void setQUANTITY(String qUANTITY) {
        this.qUANTITY = qUANTITY;
    }

    public String getQUANTITYUNIT() {
        return qUANTITYUNIT;
    }

    public void setQUANTITYUNIT(String qUANTITYUNIT) {
        this.qUANTITYUNIT = qUANTITYUNIT;
    }

    public String getSTAGE() {
        return sTAGE;
    }

    public void setSTAGE(String sTAGE) {
        this.sTAGE = sTAGE;
    }

    public Double getSTAGESRNO() {
        return sTAGESRNO;
    }

    public void setSTAGESRNO(Double sTAGESRNO) {
        this.sTAGESRNO = sTAGESRNO;
    }

    public String getDATEOFFEEDING() {
        return dATEOFFEEDING;
    }

    public void setDATEOFFEEDING(String dATEOFFEEDING) {
        this.dATEOFFEEDING = dATEOFFEEDING;
    }

    public String getOFFICEADDRESS() {
        return oFFICEADDRESS;
    }

    public void setOFFICEADDRESS(String oFFICEADDRESS) {
        this.oFFICEADDRESS = oFFICEADDRESS;
    }

    public String getOFFICESTATE() {
        return oFFICESTATE;
    }

    public void setOFFICESTATE(String oFFICESTATE) {
        this.oFFICESTATE = oFFICESTATE;
    }

    public Double getOFFICESTATECODE() {
        return oFFICESTATECODE;
    }

    public void setOFFICESTATECODE(Double oFFICESTATECODE) {
        this.oFFICESTATECODE = oFFICESTATECODE;
    }

    public String getOFFICECITY() {
        return oFFICECITY;
    }

    public void setOFFICECITY(String oFFICECITY) {
        this.oFFICECITY = oFFICECITY;
    }

    public String getFACTORYADDRESS() {
        return fACTORYADDRESS;
    }

    public void setFACTORYADDRESS(String fACTORYADDRESS) {
        this.fACTORYADDRESS = fACTORYADDRESS;
    }

    public String getFACTORYSTATE() {
        return fACTORYSTATE;
    }

    public void setFACTORYSTATE(String fACTORYSTATE) {
        this.fACTORYSTATE = fACTORYSTATE;
    }

    public Double getFACTORYSTATECODE() {
        return fACTORYSTATECODE;
    }

    public void setFACTORYSTATECODE(Double fACTORYSTATECODE) {
        this.fACTORYSTATECODE = fACTORYSTATECODE;
    }

    public String getFACTORYCITY() {
        return fACTORYCITY;
    }

    public void setFACTORYCITY(String fACTORYCITY) {
        this.fACTORYCITY = fACTORYCITY;
    }

    public String getHOURSOFFACTORYWORKING() {
        return hOURSOFFACTORYWORKING;
    }

    public void setHOURSOFFACTORYWORKING(String hOURSOFFACTORYWORKING) {
        this.hOURSOFFACTORYWORKING = hOURSOFFACTORYWORKING;
    }

    public String getWEEKLYCLOSINGDAY() {
        return wEEKLYCLOSINGDAY;
    }

    public void setWEEKLYCLOSINGDAY(String wEEKLYCLOSINGDAY) {
        this.wEEKLYCLOSINGDAY = wEEKLYCLOSINGDAY;
    }

    public String getNAMEOFKEYPERSON() {
        return nAMEOFKEYPERSON;
    }

    public void setNAMEOFKEYPERSON(String nAMEOFKEYPERSON) {
        this.nAMEOFKEYPERSON = nAMEOFKEYPERSON;
    }

    public String getKEYPERSONDESIGNATION() {
        return kEYPERSONDESIGNATION;
    }

    public void setKEYPERSONDESIGNATION(String kEYPERSONDESIGNATION) {
        this.kEYPERSONDESIGNATION = kEYPERSONDESIGNATION;
    }

    public Double getKEYPERSONMOBILE() {
        return kEYPERSONMOBILE;
    }

    public void setKEYPERSONMOBILE(Double kEYPERSONMOBILE) {
        this.kEYPERSONMOBILE = kEYPERSONMOBILE;
    }

    public String getKEYPERSONEMAIL() {
        return kEYPERSONEMAIL;
    }

    public void setKEYPERSONEMAIL(String kEYPERSONEMAIL) {
        this.kEYPERSONEMAIL = kEYPERSONEMAIL;
    }

    public String getFACTORYAREACOVERED() {
        return fACTORYAREACOVERED;
    }

    public void setFACTORYAREACOVERED(String fACTORYAREACOVERED) {
        this.fACTORYAREACOVERED = fACTORYAREACOVERED;
    }

    public String getFACTORYAREAUNCOVERED() {
        return fACTORYAREAUNCOVERED;
    }

    public void setFACTORYAREAUNCOVERED(String fACTORYAREAUNCOVERED) {
        this.fACTORYAREAUNCOVERED = fACTORYAREAUNCOVERED;
    }

    public String getFACTORYATTACHMENT() {
        return fACTORYATTACHMENT;
    }

    public void setFACTORYATTACHMENT(String fACTORYATTACHMENT) {
        this.fACTORYATTACHMENT = fACTORYATTACHMENT;
    }

    public String getFACTORYLICENSENO() {
        return fACTORYLICENSENO;
    }

    public void setFACTORYLICENSENO(String fACTORYLICENSENO) {
        this.fACTORYLICENSENO = fACTORYLICENSENO;
    }

    public String getISITPARTNERSHIPORPROPRIETORFIRM() {
        return iSITPARTNERSHIPORPROPRIETORFIRM;
    }

    public void setISITPARTNERSHIPORPROPRIETORFIRM(String iSITPARTNERSHIPORPROPRIETORFIRM) {
        this.iSITPARTNERSHIPORPROPRIETORFIRM = iSITPARTNERSHIPORPROPRIETORFIRM;
    }

    public String getPARTNERSHIPORPROPRIETORFIRMATTACHMENT() {
        return pARTNERSHIPORPROPRIETORFIRMATTACHMENT;
    }

    public void setPARTNERSHIPORPROPRIETORFIRMATTACHMENT(String pARTNERSHIPORPROPRIETORFIRMATTACHMENT) {
        this.pARTNERSHIPORPROPRIETORFIRMATTACHMENT = pARTNERSHIPORPROPRIETORFIRMATTACHMENT;
    }

    public String getWHETHERINDIANSFACTORYACT() {
        return wHETHERINDIANSFACTORYACT;
    }

    public void setWHETHERINDIANSFACTORYACT(String wHETHERINDIANSFACTORYACT) {
        this.wHETHERINDIANSFACTORYACT = wHETHERINDIANSFACTORYACT;
    }

    public String getPOWERAVAILABILITY() {
        return pOWERAVAILABILITY;
    }

    public void setPOWERAVAILABILITY(String pOWERAVAILABILITY) {
        this.pOWERAVAILABILITY = pOWERAVAILABILITY;
    }

    public String getADMINISTRATIONSTAFF() {
        return aDMINISTRATIONSTAFF;
    }

    public void setADMINISTRATIONSTAFF(String aDMINISTRATIONSTAFF) {
        this.aDMINISTRATIONSTAFF = aDMINISTRATIONSTAFF;
    }

    public String getTECHNICALSTAFF() {
        return tECHNICALSTAFF;
    }

    public void setTECHNICALSTAFF(String tECHNICALSTAFF) {
        this.tECHNICALSTAFF = tECHNICALSTAFF;
    }

    public String getPRODUCTIONSTAFF() {
        return pRODUCTIONSTAFF;
    }

    public void setPRODUCTIONSTAFF(String pRODUCTIONSTAFF) {
        this.pRODUCTIONSTAFF = pRODUCTIONSTAFF;
    }

    public String getQUALITYCONTROLSTAFF() {
        return qUALITYCONTROLSTAFF;
    }

    public void setQUALITYCONTROLSTAFF(String qUALITYCONTROLSTAFF) {
        this.qUALITYCONTROLSTAFF = qUALITYCONTROLSTAFF;
    }

    public String getMANPOWERATTACHMENT() {
        return mANPOWERATTACHMENT;
    }

    public void setMANPOWERATTACHMENT(String mANPOWERATTACHMENT) {
        this.mANPOWERATTACHMENT = mANPOWERATTACHMENT;
    }

    public String getDETAILSOFHEATTREATMENT() {
        return dETAILSOFHEATTREATMENT;
    }

    public void setDETAILSOFHEATTREATMENT(String dETAILSOFHEATTREATMENT) {
        this.dETAILSOFHEATTREATMENT = dETAILSOFHEATTREATMENT;
    }

    public String getDETAILSOFISO9001() {
        return dETAILSOFISO9001;
    }

    public void setDETAILSOFISO9001(String dETAILSOFISO9001) {
        this.dETAILSOFISO9001 = dETAILSOFISO9001;
    }

    public String getIS90001CERTIFICATE() {
        return iS90001CERTIFICATE;
    }

    public void setIS90001CERTIFICATE(String iS90001CERTIFICATE) {
        this.iS90001CERTIFICATE = iS90001CERTIFICATE;
    }

    public String getISO9000CERTIFICATE() {
        return iSO9000CERTIFICATE;
    }

    public void setISO9000CERTIFICATE(String iSO9000CERTIFICATE) {
        this.iSO9000CERTIFICATE = iSO9000CERTIFICATE;
    }

    public String getQUALITYASSURANCEPLANATTACHMENT() {
        return qUALITYASSURANCEPLANATTACHMENT;
    }

    public void setQUALITYASSURANCEPLANATTACHMENT(String qUALITYASSURANCEPLANATTACHMENT) {
        this.qUALITYASSURANCEPLANATTACHMENT = qUALITYASSURANCEPLANATTACHMENT;
    }

    public String getWHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES() {
        return wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES;
    }

    public void setWHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES(String wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES) {
        this.wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES = wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES;
    }

    public String getWHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT() {
        return wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT;
    }

    public void setWHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT(String wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT) {
        this.wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT = wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT;
    }

    public String getNAMEOFTHESUBCONTRACTORCONTENTATTACHMENT() {
        return nAMEOFTHESUBCONTRACTORCONTENTATTACHMENT;
    }

    public void setNAMEOFTHESUBCONTRACTORCONTENTATTACHMENT(String nAMEOFTHESUBCONTRACTORCONTENTATTACHMENT) {
        this.nAMEOFTHESUBCONTRACTORCONTENTATTACHMENT = nAMEOFTHESUBCONTRACTORCONTENTATTACHMENT;
    }

    public String getDETAILSOFFACILITYMPAVAILABLE() {
        return dETAILSOFFACILITYMPAVAILABLE;
    }

    public void setDETAILSOFFACILITYMPAVAILABLE(String dETAILSOFFACILITYMPAVAILABLE) {
        this.dETAILSOFFACILITYMPAVAILABLE = dETAILSOFFACILITYMPAVAILABLE;
    }

    public String getMANUFACTURINGSPECIALITEMSATTACHMENT() {
        return mANUFACTURINGSPECIALITEMSATTACHMENT;
    }

    public void setMANUFACTURINGSPECIALITEMSATTACHMENT(String mANUFACTURINGSPECIALITEMSATTACHMENT) {
        this.mANUFACTURINGSPECIALITEMSATTACHMENT = mANUFACTURINGSPECIALITEMSATTACHMENT;
    }

    public String getDETAILSOFPRODUCTSUPPLIED() {
        return dETAILSOFPRODUCTSUPPLIED;
    }

    public void setDETAILSOFPRODUCTSUPPLIED(String dETAILSOFPRODUCTSUPPLIED) {
        this.dETAILSOFPRODUCTSUPPLIED = dETAILSOFPRODUCTSUPPLIED;
    }

    public String getLISTOFORDERONHAND() {
        return lISTOFORDERONHAND;
    }

    public void setLISTOFORDERONHAND(String lISTOFORDERONHAND) {
        this.lISTOFORDERONHAND = lISTOFORDERONHAND;
    }

    public String getDETAILOFPROOFOFOWNERSHIP() {
        return dETAILOFPROOFOFOWNERSHIP;
    }

    public void setDETAILOFPROOFOFOWNERSHIP(String dETAILOFPROOFOFOWNERSHIP) {
        this.dETAILOFPROOFOFOWNERSHIP = dETAILOFPROOFOFOWNERSHIP;
    }

    public String getDETAILOFFACTORYLICENSE() {
        return dETAILOFFACTORYLICENSE;
    }

    public void setDETAILOFFACTORYLICENSE(String dETAILOFFACTORYLICENSE) {
        this.dETAILOFFACTORYLICENSE = dETAILOFFACTORYLICENSE;
    }

    public String getDETAILOFGSTN() {
        return dETAILOFGSTN;
    }

    public void setDETAILOFGSTN(String dETAILOFGSTN) {
        this.dETAILOFGSTN = dETAILOFGSTN;
    }

    public String getDETAILOFELECTRICITYBILL() {
        return dETAILOFELECTRICITYBILL;
    }

    public void setDETAILOFELECTRICITYBILL(String dETAILOFELECTRICITYBILL) {
        this.dETAILOFELECTRICITYBILL = dETAILOFELECTRICITYBILL;
    }

    public String getDETAILOFNSICDIC() {
        return dETAILOFNSICDIC;
    }

    public void setDETAILOFNSICDIC(String dETAILOFNSICDIC) {
        this.dETAILOFNSICDIC = dETAILOFNSICDIC;
    }

    public String getDETAILOFMSME() {
        return dETAILOFMSME;
    }

    public void setDETAILOFMSME(String dETAILOFMSME) {
        this.dETAILOFMSME = dETAILOFMSME;
    }

    public String getPROOFOFOWNERSHIP() {
        return pROOFOFOWNERSHIP;
    }

    public void setPROOFOFOWNERSHIP(String pROOFOFOWNERSHIP) {
        this.pROOFOFOWNERSHIP = pROOFOFOWNERSHIP;
    }

    public String getFACTORYLICENSE() {
        return fACTORYLICENSE;
    }

    public void setFACTORYLICENSE(String fACTORYLICENSE) {
        this.fACTORYLICENSE = fACTORYLICENSE;
    }

    public String getGSTN() {
        return gSTN;
    }

    public void setGSTN(String gSTN) {
        this.gSTN = gSTN;
    }

    public String getELECTRICITYBILL() {
        return eLECTRICITYBILL;
    }

    public void setELECTRICITYBILL(String eLECTRICITYBILL) {
        this.eLECTRICITYBILL = eLECTRICITYBILL;
    }

    public String getREGISTRATIONCERTIFICATEFACTORYLICENSE() {
        return rEGISTRATIONCERTIFICATEFACTORYLICENSE;
    }

    public void setREGISTRATIONCERTIFICATEFACTORYLICENSE(String rEGISTRATIONCERTIFICATEFACTORYLICENSE) {
        this.rEGISTRATIONCERTIFICATEFACTORYLICENSE = rEGISTRATIONCERTIFICATEFACTORYLICENSE;
    }

    public String getNSICDIC() {
        return nSICDIC;
    }

    public void setNSICDIC(String nSICDIC) {
        this.nSICDIC = nSICDIC;
    }

    public String getMSME() {
        return mSME;
    }

    public void setMSME(String mSME) {
        this.mSME = mSME;
    }

    public String getBANKERNAME() {
        return bANKERNAME;
    }

    public void setBANKERNAME(String bANKERNAME) {
        this.bANKERNAME = bANKERNAME;
    }

    public String getBANKERADDRESS() {
        return bANKERADDRESS;
    }

    public void setBANKERADDRESS(String bANKERADDRESS) {
        this.bANKERADDRESS = bANKERADDRESS;
    }

    public String getISCOMPANYCERTIFIEDISO14001() {
        return iSCOMPANYCERTIFIEDISO14001;
    }

    public void setISCOMPANYCERTIFIEDISO14001(String iSCOMPANYCERTIFIEDISO14001) {
        this.iSCOMPANYCERTIFIEDISO14001 = iSCOMPANYCERTIFIEDISO14001;
    }

    public String getISCOMPANYCERTIFIEDISO14001ATTACHMENT() {
        return iSCOMPANYCERTIFIEDISO14001ATTACHMENT;
    }

    public void setISCOMPANYCERTIFIEDISO14001ATTACHMENT(String iSCOMPANYCERTIFIEDISO14001ATTACHMENT) {
        this.iSCOMPANYCERTIFIEDISO14001ATTACHMENT = iSCOMPANYCERTIFIEDISO14001ATTACHMENT;
    }

    public String getISCOMPANYMONITORENVIRONMENTPERFORMANCE() {
        return iSCOMPANYMONITORENVIRONMENTPERFORMANCE;
    }

    public void setISCOMPANYMONITORENVIRONMENTPERFORMANCE(String iSCOMPANYMONITORENVIRONMENTPERFORMANCE) {
        this.iSCOMPANYMONITORENVIRONMENTPERFORMANCE = iSCOMPANYMONITORENVIRONMENTPERFORMANCE;
    }

    public String getISCOMPANYMEASUREENVIRONMENTPERFORMANCE() {
        return iSCOMPANYMEASUREENVIRONMENTPERFORMANCE;
    }

    public void setISCOMPANYMEASUREENVIRONMENTPERFORMANCE(String iSCOMPANYMEASUREENVIRONMENTPERFORMANCE) {
        this.iSCOMPANYMEASUREENVIRONMENTPERFORMANCE = iSCOMPANYMEASUREENVIRONMENTPERFORMANCE;
    }

    public String getISCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT() {
        return iSCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT;
    }

    public void setISCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT(String iSCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT) {
        this.iSCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT = iSCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT;
    }

    public String getISCOMPANYIDENTIFIEDENVIRONMENTIMPACTS() {
        return iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTS;
    }

    public void setISCOMPANYIDENTIFIEDENVIRONMENTIMPACTS(String iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTS) {
        this.iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTS = iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTS;
    }

    public String getISCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT() {
        return iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT;
    }

    public void setISCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT(String iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT) {
        this.iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT = iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT;
    }

    public String getISCOMPANYDEFINEDGOALSENERGY() {
        return iSCOMPANYDEFINEDGOALSENERGY;
    }

    public void setISCOMPANYDEFINEDGOALSENERGY(String iSCOMPANYDEFINEDGOALSENERGY) {
        this.iSCOMPANYDEFINEDGOALSENERGY = iSCOMPANYDEFINEDGOALSENERGY;
    }

    public String getISCOMPANYDEFINEDGOALSENERGYATTACHMENT() {
        return iSCOMPANYDEFINEDGOALSENERGYATTACHMENT;
    }

    public void setISCOMPANYDEFINEDGOALSENERGYATTACHMENT(String iSCOMPANYDEFINEDGOALSENERGYATTACHMENT) {
        this.iSCOMPANYDEFINEDGOALSENERGYATTACHMENT = iSCOMPANYDEFINEDGOALSENERGYATTACHMENT;
    }

    public String getISCOMPANYDEFINEDGOALSWATER() {
        return iSCOMPANYDEFINEDGOALSWATER;
    }

    public void setISCOMPANYDEFINEDGOALSWATER(String iSCOMPANYDEFINEDGOALSWATER) {
        this.iSCOMPANYDEFINEDGOALSWATER = iSCOMPANYDEFINEDGOALSWATER;
    }

    public String getISCOMPANYDEFINEDGOALSWATERATTCHMENT() {
        return iSCOMPANYDEFINEDGOALSWATERATTCHMENT;
    }

    public void setISCOMPANYDEFINEDGOALSWATERATTCHMENT(String iSCOMPANYDEFINEDGOALSWATERATTCHMENT) {
        this.iSCOMPANYDEFINEDGOALSWATERATTCHMENT = iSCOMPANYDEFINEDGOALSWATERATTCHMENT;
    }

    public String getISCOMPANYIDENTIFIEDLEGALREQUIREMENTS() {
        return iSCOMPANYIDENTIFIEDLEGALREQUIREMENTS;
    }

    public void setISCOMPANYIDENTIFIEDLEGALREQUIREMENTS(String iSCOMPANYIDENTIFIEDLEGALREQUIREMENTS) {
        this.iSCOMPANYIDENTIFIEDLEGALREQUIREMENTS = iSCOMPANYIDENTIFIEDLEGALREQUIREMENTS;
    }

    public String getISCOMPANYLEGALREQUIREMETSCOMPLIANCE() {
        return iSCOMPANYLEGALREQUIREMETSCOMPLIANCE;
    }

    public void setISCOMPANYLEGALREQUIREMETSCOMPLIANCE(String iSCOMPANYLEGALREQUIREMETSCOMPLIANCE) {
        this.iSCOMPANYLEGALREQUIREMETSCOMPLIANCE = iSCOMPANYLEGALREQUIREMETSCOMPLIANCE;
    }

    public String getISCOMPANYIDENTIFIEDWASTESGENERATED() {
        return iSCOMPANYIDENTIFIEDWASTESGENERATED;
    }

    public void setISCOMPANYIDENTIFIEDWASTESGENERATED(String iSCOMPANYIDENTIFIEDWASTESGENERATED) {
        this.iSCOMPANYIDENTIFIEDWASTESGENERATED = iSCOMPANYIDENTIFIEDWASTESGENERATED;
    }

    public String getISCOMPANYSEGREGATINGWASTES() {
        return iSCOMPANYSEGREGATINGWASTES;
    }

    public void setISCOMPANYSEGREGATINGWASTES(String iSCOMPANYSEGREGATINGWASTES) {
        this.iSCOMPANYSEGREGATINGWASTES = iSCOMPANYSEGREGATINGWASTES;
    }

    public String getISCOMPANYSAFEDISPOSALWASTES() {
        return iSCOMPANYSAFEDISPOSALWASTES;
    }

    public void setISCOMPANYSAFEDISPOSALWASTES(String iSCOMPANYSAFEDISPOSALWASTES) {
        this.iSCOMPANYSAFEDISPOSALWASTES = iSCOMPANYSAFEDISPOSALWASTES;
    }

    public String getISCOMPANYDISPOSINGWASTES() {
        return iSCOMPANYDISPOSINGWASTES;
    }

    public void setISCOMPANYDISPOSINGWASTES(String iSCOMPANYDISPOSINGWASTES) {
        this.iSCOMPANYDISPOSINGWASTES = iSCOMPANYDISPOSINGWASTES;
    }

    public String getISCOMPANYENERGYEFFICIENT() {
        return iSCOMPANYENERGYEFFICIENT;
    }

    public void setISCOMPANYENERGYEFFICIENT(String iSCOMPANYENERGYEFFICIENT) {
        this.iSCOMPANYENERGYEFFICIENT = iSCOMPANYENERGYEFFICIENT;
    }

    public String getISCOMPANYCONDUCTINGREGULARAWARENESS() {
        return iSCOMPANYCONDUCTINGREGULARAWARENESS;
    }

    public void setISCOMPANYCONDUCTINGREGULARAWARENESS(String iSCOMPANYCONDUCTINGREGULARAWARENESS) {
        this.iSCOMPANYCONDUCTINGREGULARAWARENESS = iSCOMPANYCONDUCTINGREGULARAWARENESS;
    }

    public String getDATEOFSUBMISSION() {
        return dATEOFSUBMISSION;
    }

    public void setDATEOFSUBMISSION(String dATEOFSUBMISSION) {
        this.dATEOFSUBMISSION = dATEOFSUBMISSION;
    }

    public String getSSENAME() {
        return sSENAME;
    }

    public void setSSENAME(String sSENAME) {
        this.sSENAME = sSENAME;
    }

    public Double getSSEID() {
        return sSEID;
    }

    public void setSSEID(Double sSEID) {
        this.sSEID = sSEID;
    }

    public String getSCRUTINYSTATUS() {
        return sCRUTINYSTATUS;
    }

    public void setSCRUTINYSTATUS(String sCRUTINYSTATUS) {
        this.sCRUTINYSTATUS = sCRUTINYSTATUS;
    }

    public String getISASSESSMENTRERQUIRED() {
        return iSASSESSMENTRERQUIRED;
    }

    public void setISASSESSMENTRERQUIRED(String iSASSESSMENTRERQUIRED) {
        this.iSASSESSMENTRERQUIRED = iSASSESSMENTRERQUIRED;
    }

    public String getRECOMMENDEDAONAME() {
        return rECOMMENDEDAONAME;
    }

    public void setRECOMMENDEDAONAME(String rECOMMENDEDAONAME) {
        this.rECOMMENDEDAONAME = rECOMMENDEDAONAME;
    }

    public Double getRECOMMENDEDAOID() {
        return rECOMMENDEDAOID;
    }

    public void setRECOMMENDEDAOID(Double rECOMMENDEDAOID) {
        this.rECOMMENDEDAOID = rECOMMENDEDAOID;
    }

    public String getREMARKOFSCRUTINY() {
        return rEMARKOFSCRUTINY;
    }

    public void setREMARKOFSCRUTINY(String rEMARKOFSCRUTINY) {
        this.rEMARKOFSCRUTINY = rEMARKOFSCRUTINY;
    }

    public String getATTACHMENTOFSCRUTINY() {
        return aTTACHMENTOFSCRUTINY;
    }

    public void setATTACHMENTOFSCRUTINY(String aTTACHMENTOFSCRUTINY) {
        this.aTTACHMENTOFSCRUTINY = aTTACHMENTOFSCRUTINY;
    }

    public String getDATEOFSCRUTINY() {
        return dATEOFSCRUTINY;
    }

    public void setDATEOFSCRUTINY(String dATEOFSCRUTINY) {
        this.dATEOFSCRUTINY = dATEOFSCRUTINY;
    }

    public String getAONAME() {
        return aONAME;
    }

    public void setAONAME(String aONAME) {
        this.aONAME = aONAME;
    }

    public Double getAOID() {
        return aOID;
    }

    public void setAOID(Double aOID) {
        this.aOID = aOID;
    }

    public String getDYCMENAME() {
        return dYCMENAME;
    }

    public void setDYCMENAME(String dYCMENAME) {
        this.dYCMENAME = dYCMENAME;
    }

    public Double getDYCMEID() {
        return dYCMEID;
    }

    public void setDYCMEID(Double dYCMEID) {
        this.dYCMEID = dYCMEID;
    }

    public String getREMARKOFDYCME() {
        return rEMARKOFDYCME;
    }

    public void setREMARKOFDYCME(String rEMARKOFDYCME) {
        this.rEMARKOFDYCME = rEMARKOFDYCME;
    }

    public String getDATEOFREMARKBYDYCME() {
        return dATEOFREMARKBYDYCME;
    }

    public void setDATEOFREMARKBYDYCME(String dATEOFREMARKBYDYCME) {
        this.dATEOFREMARKBYDYCME = dATEOFREMARKBYDYCME;
    }

    public String getPROBABLEDATEOFVISIT() {
        return pROBABLEDATEOFVISIT;
    }

    public void setPROBABLEDATEOFVISIT(String pROBABLEDATEOFVISIT) {
        this.pROBABLEDATEOFVISIT = pROBABLEDATEOFVISIT;
    }

    public String getDATEOFFEEDINGOFPROBABLEDATE() {
        return dATEOFFEEDINGOFPROBABLEDATE;
    }

    public void setDATEOFFEEDINGOFPROBABLEDATE(String dATEOFFEEDINGOFPROBABLEDATE) {
        this.dATEOFFEEDINGOFPROBABLEDATE = dATEOFFEEDINGOFPROBABLEDATE;
    }

    public String getSTATUSOFASSESSMENT() {
        return sTATUSOFASSESSMENT;
    }

    public void setSTATUSOFASSESSMENT(String sTATUSOFASSESSMENT) {
        this.sTATUSOFASSESSMENT = sTATUSOFASSESSMENT;
    }

    public String getREMARKBYASSESSMENTOFFICER() {
        return rEMARKBYASSESSMENTOFFICER;
    }

    public void setREMARKBYASSESSMENTOFFICER(String rEMARKBYASSESSMENTOFFICER) {
        this.rEMARKBYASSESSMENTOFFICER = rEMARKBYASSESSMENTOFFICER;
    }

    public String getATTACHMENTOFASSESSMENTREPORT() {
        return aTTACHMENTOFASSESSMENTREPORT;
    }

    public void setATTACHMENTOFASSESSMENTREPORT(String aTTACHMENTOFASSESSMENTREPORT) {
        this.aTTACHMENTOFASSESSMENTREPORT = aTTACHMENTOFASSESSMENTREPORT;
    }

    public String getDATEOFREMARKOFASSESSMENT() {
        return dATEOFREMARKOFASSESSMENT;
    }

    public void setDATEOFREMARKOFASSESSMENT(String dATEOFREMARKOFASSESSMENT) {
        this.dATEOFREMARKOFASSESSMENT = dATEOFREMARKOFASSESSMENT;
    }

    public String getAMENAME() {
        return aMENAME;
    }

    public void setAMENAME(String aMENAME) {
        this.aMENAME = aMENAME;
    }

    public Double getAMEID() {
        return aMEID;
    }

    public void setAMEID(Double aMEID) {
        this.aMEID = aMEID;
    }

    public String getREMARKONASSESSMENTBYAME() {
        return rEMARKONASSESSMENTBYAME;
    }

    public void setREMARKONASSESSMENTBYAME(String rEMARKONASSESSMENTBYAME) {
        this.rEMARKONASSESSMENTBYAME = rEMARKONASSESSMENTBYAME;
    }

    public String getDATEOFREMARKONASSESSMENTBYAME() {
        return dATEOFREMARKONASSESSMENTBYAME;
    }

    public void setDATEOFREMARKONASSESSMENTBYAME(String dATEOFREMARKONASSESSMENTBYAME) {
        this.dATEOFREMARKONASSESSMENTBYAME = dATEOFREMARKONASSESSMENTBYAME;
    }

    public String getSCRUTINYSTATUSOFASSESSMENTREPORT() {
        return sCRUTINYSTATUSOFASSESSMENTREPORT;
    }

    public void setSCRUTINYSTATUSOFASSESSMENTREPORT(String sCRUTINYSTATUSOFASSESSMENTREPORT) {
        this.sCRUTINYSTATUSOFASSESSMENTREPORT = sCRUTINYSTATUSOFASSESSMENTREPORT;
    }

    public String getSCRUTINYREPORTOFASSESSMENTREPORT() {
        return sCRUTINYREPORTOFASSESSMENTREPORT;
    }

    public void setSCRUTINYREPORTOFASSESSMENTREPORT(String sCRUTINYREPORTOFASSESSMENTREPORT) {
        this.sCRUTINYREPORTOFASSESSMENTREPORT = sCRUTINYREPORTOFASSESSMENTREPORT;
    }

    public String getSTATUSOFVERIFICATIONBYDYCME() {
        return sTATUSOFVERIFICATIONBYDYCME;
    }

    public void setSTATUSOFVERIFICATIONBYDYCME(String sTATUSOFVERIFICATIONBYDYCME) {
        this.sTATUSOFVERIFICATIONBYDYCME = sTATUSOFVERIFICATIONBYDYCME;
    }

    public String getVERIFICATIONREMARKBYDYCME() {
        return vERIFICATIONREMARKBYDYCME;
    }

    public void setVERIFICATIONREMARKBYDYCME(String vERIFICATIONREMARKBYDYCME) {
        this.vERIFICATIONREMARKBYDYCME = vERIFICATIONREMARKBYDYCME;
    }

    public String getDATEOFVERIFICATIONBYDYCME() {
        return dATEOFVERIFICATIONBYDYCME;
    }

    public void setDATEOFVERIFICATIONBYDYCME(String dATEOFVERIFICATIONBYDYCME) {
        this.dATEOFVERIFICATIONBYDYCME = dATEOFVERIFICATIONBYDYCME;
    }

    public String getCPLENAME() {
        return cPLENAME;
    }

    public void setCPLENAME(String cPLENAME) {
        this.cPLENAME = cPLENAME;
    }

    public Double getCPLEID() {
        return cPLEID;
    }

    public void setCPLEID(Double cPLEID) {
        this.cPLEID = cPLEID;
    }

    public String getSTATUSOFCPLE() {
        return sTATUSOFCPLE;
    }

    public void setSTATUSOFCPLE(String sTATUSOFCPLE) {
        this.sTATUSOFCPLE = sTATUSOFCPLE;
    }

    public String getREMARKBYCPLE() {
        return rEMARKBYCPLE;
    }

    public void setREMARKBYCPLE(String rEMARKBYCPLE) {
        this.rEMARKBYCPLE = rEMARKBYCPLE;
    }

    public String getDATEOFREMARKBYCPLE() {
        return dATEOFREMARKBYCPLE;
    }

    public void setDATEOFREMARKBYCPLE(String dATEOFREMARKBYCPLE) {
        this.dATEOFREMARKBYCPLE = dATEOFREMARKBYCPLE;
    }

    public String getREMARKOFACCEPTANCEREJECTIONLETTER() {
        return rEMARKOFACCEPTANCEREJECTIONLETTER;
    }

    public void setREMARKOFACCEPTANCEREJECTIONLETTER(String rEMARKOFACCEPTANCEREJECTIONLETTER) {
        this.rEMARKOFACCEPTANCEREJECTIONLETTER = rEMARKOFACCEPTANCEREJECTIONLETTER;
    }

    public String getDATEOFACCEPTANCEREJECTIONLETTER() {
        return dATEOFACCEPTANCEREJECTIONLETTER;
    }

    public void setDATEOFACCEPTANCEREJECTIONLETTER(String dATEOFACCEPTANCEREJECTIONLETTER) {
        this.dATEOFACCEPTANCEREJECTIONLETTER = dATEOFACCEPTANCEREJECTIONLETTER;
    }

    public String getLETTEROFACCEPTANCEREJECTION() {
        return lETTEROFACCEPTANCEREJECTION;
    }

    public void setLETTEROFACCEPTANCEREJECTION(String lETTEROFACCEPTANCEREJECTION) {
        this.lETTEROFACCEPTANCEREJECTION = lETTEROFACCEPTANCEREJECTION;
    }

    public String getREMARKBYVENDORFORDEFICIENCY() {
        return rEMARKBYVENDORFORDEFICIENCY;
    }

    public void setREMARKBYVENDORFORDEFICIENCY(String rEMARKBYVENDORFORDEFICIENCY) {
        this.rEMARKBYVENDORFORDEFICIENCY = rEMARKBYVENDORFORDEFICIENCY;
    }

    public String getDATEOFREMARKBYVENDOR() {
        return dATEOFREMARKBYVENDOR;
    }

    public void setDATEOFREMARKBYVENDOR(String dATEOFREMARKBYVENDOR) {
        this.dATEOFREMARKBYVENDOR = dATEOFREMARKBYVENDOR;
    }

    public String getATTACHMENTBYVENDOR() {
        return aTTACHMENTBYVENDOR;
    }

    public void setATTACHMENTBYVENDOR(String aTTACHMENTBYVENDOR) {
        this.aTTACHMENTBYVENDOR = aTTACHMENTBYVENDOR;
    }

    public String getNUMBEROFSUPERVISORYSTAFF() {
        return nUMBEROFSUPERVISORYSTAFF;
    }

    public void setNUMBEROFSUPERVISORYSTAFF(String nUMBEROFSUPERVISORYSTAFF) {
        this.nUMBEROFSUPERVISORYSTAFF = nUMBEROFSUPERVISORYSTAFF;
    }

    public String getTOTALSKILLEDNONSKILLEDSTAFF() {
        return tOTALSKILLEDNONSKILLEDSTAFF;
    }

    public void setTOTALSKILLEDNONSKILLEDSTAFF(String tOTALSKILLEDNONSKILLEDSTAFF) {
        this.tOTALSKILLEDNONSKILLEDSTAFF = tOTALSKILLEDNONSKILLEDSTAFF;
    }

    public String getDESIGNATIONOfDyCMM() {
        return dESIGNATIONOfDyCMM;
    }

    public void setDESIGNATIONOfDyCMM(String dESIGNATIONOfDyCMM) {
        this.dESIGNATIONOfDyCMM = dESIGNATIONOfDyCMM;
    }

    public String getFACTORYTYPE() {
        return fACTORYTYPE;
    }

    public void setFACTORYTYPE(String fACTORYTYPE) {
        this.fACTORYTYPE = fACTORYTYPE;
    }

    public String getFACTORYRENTAGREEMENT() {
        return fACTORYRENTAGREEMENT;
    }

    public void setFACTORYRENTAGREEMENT(String fACTORYRENTAGREEMENT) {
        this.fACTORYRENTAGREEMENT = fACTORYRENTAGREEMENT;
    }

    public String getLICENSEISSUINGAUTHORITY() {
        return lICENSEISSUINGAUTHORITY;
    }

    public void setLICENSEISSUINGAUTHORITY(String lICENSEISSUINGAUTHORITY) {
        this.lICENSEISSUINGAUTHORITY = lICENSEISSUINGAUTHORITY;
    }

    public String getLICENSEISSUEDATE() {
        return lICENSEISSUEDATE;
    }

    public void setLICENSEISSUEDATE(String lICENSEISSUEDATE) {
        this.lICENSEISSUEDATE = lICENSEISSUEDATE;
    }

    public String getLICENSEVALIDITY() {
        return lICENSEVALIDITY;
    }

    public void setLICENSEVALIDITY(String lICENSEVALIDITY) {
        this.lICENSEVALIDITY = lICENSEVALIDITY;
    }

    public String getLICENSEATTACHMENT() {
        return lICENSEATTACHMENT;
    }

    public void setLICENSEATTACHMENT(String lICENSEATTACHMENT) {
        this.lICENSEATTACHMENT = lICENSEATTACHMENT;
    }

    public String getDATEOFREMARKBYAMEONRECOMMENDATION() {
        return dATEOFREMARKBYAMEONRECOMMENDATION;
    }

    public void setDATEOFREMARKBYAMEONRECOMMENDATION(String dATEOFREMARKBYAMEONRECOMMENDATION) {
        this.dATEOFREMARKBYAMEONRECOMMENDATION = dATEOFREMARKBYAMEONRECOMMENDATION;
    }

    public String getREMARKBYAMEONRECOMMENDATION() {
        return rEMARKBYAMEONRECOMMENDATION;
    }

    public void setREMARKBYAMEONRECOMMENDATION(String rEMARKBYAMEONRECOMMENDATION) {
        this.rEMARKBYAMEONRECOMMENDATION = rEMARKBYAMEONRECOMMENDATION;
    }

    public String getDATEOFREMARKOFSSEONASSESSMENT() {
        return dATEOFREMARKOFSSEONASSESSMENT;
    }

    public void setDATEOFREMARKOFSSEONASSESSMENT(String dATEOFREMARKOFSSEONASSESSMENT) {
        this.dATEOFREMARKOFSSEONASSESSMENT = dATEOFREMARKOFSSEONASSESSMENT;
    }

    public String getATTACHMENTTOVENDOR() {
        return aTTACHMENTTOVENDOR;
    }

    public void setATTACHMENTTOVENDOR(String aTTACHMENTTOVENDOR) {
        this.aTTACHMENTTOVENDOR = aTTACHMENTTOVENDOR;
    }

    public String getSTATUSOFASSESSMENTREPORTSSE() {
        return sTATUSOFASSESSMENTREPORTSSE;
    }

    public void setSTATUSOFASSESSMENTREPORTSSE(String sTATUSOFASSESSMENTREPORTSSE) {
        this.sTATUSOFASSESSMENTREPORTSSE = sTATUSOFASSESSMENTREPORTSSE;
    }

    public String getREMARKOFSSEONASSESSMENT() {
        return rEMARKOFSSEONASSESSMENT;
    }

    public void setREMARKOFSSEONASSESSMENT(String rEMARKOFSSEONASSESSMENT) {
        this.rEMARKOFSSEONASSESSMENT = rEMARKOFSSEONASSESSMENT;
    }

    public String getREVERTSSEASSESSMENT() {
        return rEVERTSSEASSESSMENT;
    }

    public void setREVERTSSEASSESSMENT(String rEVERTSSEASSESSMENT) {
        this.rEVERTSSEASSESSMENT = rEVERTSSEASSESSMENT;
    }

    public String getREVERTAMEASSESSMENT() {
        return rEVERTAMEASSESSMENT;
    }

    public void setREVERTAMEASSESSMENT(String rEVERTAMEASSESSMENT) {
        this.rEVERTAMEASSESSMENT = rEVERTAMEASSESSMENT;
    }

    public String getREVERTDYCMEASSESSMENT() {
        return rEVERTDYCMEASSESSMENT;
    }

    public void setREVERTDYCMEASSESSMENT(String rEVERTDYCMEASSESSMENT) {
        this.rEVERTDYCMEASSESSMENT = rEVERTDYCMEASSESSMENT;
    }

    public String getREMARKBYVENDORASSESSMENT() {
        return rEMARKBYVENDORASSESSMENT;
    }

    public void setREMARKBYVENDORASSESSMENT(String rEMARKBYVENDORASSESSMENT) {
        this.rEMARKBYVENDORASSESSMENT = rEMARKBYVENDORASSESSMENT;
    }

    public String getDATEOFREMARKBYVENDORASSESSMENT() {
        return dATEOFREMARKBYVENDORASSESSMENT;
    }

    public void setDATEOFREMARKBYVENDORASSESSMENT(String dATEOFREMARKBYVENDORASSESSMENT) {
        this.dATEOFREMARKBYVENDORASSESSMENT = dATEOFREMARKBYVENDORASSESSMENT;
    }

    public String getATTACHMENTBYVENDORASSESSMENT() {
        return aTTACHMENTBYVENDORASSESSMENT;
    }

    public void setATTACHMENTBYVENDORASSESSMENT(String aTTACHMENTBYVENDORASSESSMENT) {
        this.aTTACHMENTBYVENDORASSESSMENT = aTTACHMENTBYVENDORASSESSMENT;
    }


    /*
    @SerializedName("ID")
    @Expose
    private Object iD;
    @SerializedName("NAMEOFFIRM")
    @Expose
    private String nAMEOFFIRM;
    @SerializedName("VENDOR_ID")
    @Expose
    private Double vENDORID;
    @SerializedName("TENDER_NO")
    @Expose
    private Object tENDERNO;
    @SerializedName("LETTER_NO")
    @Expose
    private Object lETTERNO;
    @SerializedName("LETTERNO_DATE")
    @Expose
    private Object lETTERNODATE;
    @SerializedName("DATE")
    @Expose
    private Object dATE;
    @SerializedName("ITEM_NAME")
    @Expose
    private String iTEMNAME;
    @SerializedName("ITEM_ID")
    @Expose
    private Object iTEMID;
    @SerializedName("ATTACHMENT")
    @Expose
    private String aTTACHMENT;
    @SerializedName("QUANTITY")
    @Expose
    private Object qUANTITY;
    @SerializedName("QUANTITY_UNIT")
    @Expose
    private Object qUANTITYUNIT;
    @SerializedName("STAGE")
    @Expose
    private String sTAGE;
    @SerializedName("STAGE_SRNO")
    @Expose
    private Double sTAGESRNO;
    @SerializedName("DATE_OF_FEEDING")
    @Expose
    private String dATEOFFEEDING;
    @SerializedName("OFFICE_ADDRESS")
    @Expose
    private String oFFICEADDRESS;
    @SerializedName("OFFICE_STATE")
    @Expose
    private String oFFICESTATE;
    @SerializedName("OFFICE_STATE_CODE")
    @Expose
    private Double oFFICESTATECODE;
    @SerializedName("OFFICE_CITY")
    @Expose
    private String oFFICECITY;
    @SerializedName("FACTORY_ADDRESS")
    @Expose
    private String fACTORYADDRESS;
    @SerializedName("FACTORY_STATE")
    @Expose
    private String fACTORYSTATE;
    @SerializedName("FACTORY_STATE_CODE")
    @Expose
    private Double fACTORYSTATECODE;
    @SerializedName("FACTORY_CITY")
    @Expose
    private String fACTORYCITY;
    @SerializedName("HOURS_OF_FACTORY_WORKING")
    @Expose
    private String hOURSOFFACTORYWORKING;
    @SerializedName("WEEKLY_CLOSING_DAY")
    @Expose
    private String wEEKLYCLOSINGDAY;
    @SerializedName("NAME_OF_KEY_PERSON")
    @Expose
    private String nAMEOFKEYPERSON;
    @SerializedName("KEY_PERSON_DESIGNATION")
    @Expose
    private String kEYPERSONDESIGNATION;
    @SerializedName("KEY_PERSON_MOBILE")
    @Expose
    private Double kEYPERSONMOBILE;
    @SerializedName("KEY_PERSON_EMAIL")
    @Expose
    private String kEYPERSONEMAIL;
    @SerializedName("FACTORY_AREA_COVERED")
    @Expose
    private String fACTORYAREACOVERED;
    @SerializedName("FACTORY_AREA_UNCOVERED")
    @Expose
    private String fACTORYAREAUNCOVERED;
    @SerializedName("FACTORY_ATTACHMENT")
    @Expose
    private String fACTORYATTACHMENT;
    @SerializedName("FACTORY_LICENSE_NO")
    @Expose
    private String fACTORYLICENSENO;
    @SerializedName("IS_IT_PARTNERSHIP_OR_PROPRIETOR_FIRM")
    @Expose
    private String iSITPARTNERSHIPORPROPRIETORFIRM;
    @SerializedName("PARTNERSHIP_OR_PROPRIETOR_FIRM_ATTACHMENT")
    @Expose
    private String pARTNERSHIPORPROPRIETORFIRMATTACHMENT;
    @SerializedName("WHETHER_INDIANS_FACTORY_ACT")
    @Expose
    private String wHETHERINDIANSFACTORYACT;
    @SerializedName("POWER_AVAILABILITY")
    @Expose
    private String pOWERAVAILABILITY;
    @SerializedName("ADMINISTRATION_STAFF")
    @Expose
    private String aDMINISTRATIONSTAFF;
    @SerializedName("TECHNICAL_STAFF")
    @Expose
    private String tECHNICALSTAFF;
    @SerializedName("PRODUCTION_STAFF")
    @Expose
    private String pRODUCTIONSTAFF;
    @SerializedName("QUALITY_CONTROL_STAFF")
    @Expose
    private String qUALITYCONTROLSTAFF;
    @SerializedName("MANPOWER_ATTACHMENT")
    @Expose
    private String mANPOWERATTACHMENT;
    @SerializedName("DETAILS_OF_HEAT_TREATMENT")
    @Expose
    private String dETAILSOFHEATTREATMENT;
    @SerializedName("DETAILS_OF_ISO9001")
    @Expose
    private String dETAILSOFISO9001;
    @SerializedName("IS90001_CERTIFICATE")
    @Expose
    private String iS90001CERTIFICATE;
    @SerializedName("ISO9000_CERTIFICATE")
    @Expose
    private String iSO9000CERTIFICATE;
    @SerializedName("QUALITY_ASSURANCE_PLAN_ATTACHMENT")
    @Expose
    private String qUALITYASSURANCEPLANATTACHMENT;
    @SerializedName("WHETHER_FIRM_MANUFACTURER_COMPLETE_DETAILS_SUB_ASSEMBLIES")
    @Expose
    private String wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES;
    @SerializedName("WHETHER_FIRM_MANUFACTURER_COMPLETE_DETAILS_SUB_ASSEMBLIES_ATTACHMENT")
    @Expose
    private String wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT;
    @SerializedName("NAME_OF_THE_SUB_CONTRACTOR_CONTENT_ATTACHMENT")
    @Expose
    private String nAMEOFTHESUBCONTRACTORCONTENTATTACHMENT;
    @SerializedName("DETAILS_OF_FACILITY_M_P_AVAILABLE")
    @Expose
    private String dETAILSOFFACILITYMPAVAILABLE;
    @SerializedName("MANUFACTURING_SPECIAL_ITEMS_ATTACHMENT")
    @Expose
    private String mANUFACTURINGSPECIALITEMSATTACHMENT;
    @SerializedName("DETAILS_OF_PRODUCT_SUPPLIED")
    @Expose
    private String dETAILSOFPRODUCTSUPPLIED;
    @SerializedName("LIST_OF_ORDER_ON_HAND")
    @Expose
    private String lISTOFORDERONHAND;
    @SerializedName("DETAIL_OF_PROOF_OF_OWNERSHIP")
    @Expose
    private String dETAILOFPROOFOFOWNERSHIP;
    @SerializedName("DETAIL_OF_FACTORY_LICENSE")
    @Expose
    private String dETAILOFFACTORYLICENSE;
    @SerializedName("DETAIL_OF_GSTN")
    @Expose
    private String dETAILOFGSTN;
    @SerializedName("DETAIL_OF_ELECTRICITY_BILL")
    @Expose
    private String dETAILOFELECTRICITYBILL;
    @SerializedName("DETAIL_OF_NSIC_DIC")
    @Expose
    private String dETAILOFNSICDIC;
    @SerializedName("DETAIL_OF_MSME")
    @Expose
    private String dETAILOFMSME;
    @SerializedName("PROOF_OF_OWNERSHIP")
    @Expose
    private String pROOFOFOWNERSHIP;
    @SerializedName("FACTORY_LICENSE")
    @Expose
    private String fACTORYLICENSE;
    @SerializedName("GSTN")
    @Expose
    private String gSTN;
    @SerializedName("ELECTRICITY_BILL")
    @Expose
    private String eLECTRICITYBILL;
    @SerializedName("REGISTRATION_CERTIFICATE_FACTORY_LICENSE")
    @Expose
    private Object rEGISTRATIONCERTIFICATEFACTORYLICENSE;
    @SerializedName("NSIC_DIC")
    @Expose
    private String nSICDIC;
    @SerializedName("MSME")
    @Expose
    private String mSME;
    @SerializedName("BANKER_NAME")
    @Expose
    private String bANKERNAME;
    @SerializedName("BANKER_ADDRESS")
    @Expose
    private String bANKERADDRESS;
    @SerializedName("IS_COMPANY_CERTIFIED_ISO_14001")
    @Expose
    private String iSCOMPANYCERTIFIEDISO14001;
    @SerializedName("IS_COMPANY_CERTIFIED_ISO_14001_ATTACHMENT")
    @Expose
    private String iSCOMPANYCERTIFIEDISO14001ATTACHMENT;
    @SerializedName("IS_COMPANY_MONITOR_ENVIRONMENT_PERFORMANCE")
    @Expose
    private String iSCOMPANYMONITORENVIRONMENTPERFORMANCE;
    @SerializedName("IS_COMPANY_MEASURE_ENVIRONMENT_PERFORMANCE")
    @Expose
    private String iSCOMPANYMEASUREENVIRONMENTPERFORMANCE;
    @SerializedName("IS_COMPANY_MEASURE_ENVIRONMENT_PERFORMANCE_ATTACHMENT")
    @Expose
    private String iSCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT;
    @SerializedName("IS_COMPANY_IDENTIFIED_ENVIRONMENT_IMPACTS")
    @Expose
    private String iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTS;
    @SerializedName("IS_COMPANY_IDENTIFIED_ENVIRONMENT_IMPACTS_ATTACHMENT")
    @Expose
    private String iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT;
    @SerializedName("IS_COMPANY_DEFINED_GOALS_ENERGY")
    @Expose
    private String iSCOMPANYDEFINEDGOALSENERGY;
    @SerializedName("IS_COMPANY_DEFINED_GOALS_ENERGY_ATTACHMENT")
    @Expose
    private String iSCOMPANYDEFINEDGOALSENERGYATTACHMENT;
    @SerializedName("IS_COMPANY_DEFINED_GOALS_WATER")
    @Expose
    private String iSCOMPANYDEFINEDGOALSWATER;
    @SerializedName("IS_COMPANY_DEFINED_GOALS_WATER_ATTCHMENT")
    @Expose
    private String iSCOMPANYDEFINEDGOALSWATERATTCHMENT;
    @SerializedName("IS_COMPANY_IDENTIFIED_LEGAL_REQUIREMENTS")
    @Expose
    private String iSCOMPANYIDENTIFIEDLEGALREQUIREMENTS;
    @SerializedName("IS_COMPANY_LEGAL_REQUIREMETS_COMPLIANCE")
    @Expose
    private String iSCOMPANYLEGALREQUIREMETSCOMPLIANCE;
    @SerializedName("IS_COMPANY_IDENTIFIED_WASTES_GENERATED")
    @Expose
    private String iSCOMPANYIDENTIFIEDWASTESGENERATED;
    @SerializedName("IS_COMPANY_SEGREGATING_WASTES")
    @Expose
    private String iSCOMPANYSEGREGATINGWASTES;
    @SerializedName("IS_COMPANY_SAFE_DISPOSAL_WASTES")
    @Expose
    private String iSCOMPANYSAFEDISPOSALWASTES;
    @SerializedName("IS_COMPANY_DISPOSING_WASTES")
    @Expose
    private String iSCOMPANYDISPOSINGWASTES;
    @SerializedName("IS_COMPANY_ENERGY_EFFICIENT")
    @Expose
    private String iSCOMPANYENERGYEFFICIENT;
    @SerializedName("IS_COMPANY_CONDUCTING_REGULAR_AWARENESS")
    @Expose
    private String iSCOMPANYCONDUCTINGREGULARAWARENESS;
    @SerializedName("DATE_OF_SUBMISSION")
    @Expose
    private String dATEOFSUBMISSION;
    @SerializedName("SSE_NAME")
    @Expose
    private String sSENAME;
    @SerializedName("SSE_ID")
    @Expose
    private Double sSEID;
    @SerializedName("SCRUTINY_STATUS")
    @Expose
    private String sCRUTINYSTATUS;
    @SerializedName("IS_ASSESSMENT_RERQUIRED")
    @Expose
    private String iSASSESSMENTRERQUIRED;
    @SerializedName("RECOMMENDED_AO_NAME")
    @Expose
    private String rECOMMENDEDAONAME;
    @SerializedName("RECOMMENDED_AO_ID")
    @Expose
    private Double rECOMMENDEDAOID;
    @SerializedName("REMARK_OF_SCRUTINY")
    @Expose
    private String rEMARKOFSCRUTINY;
    @SerializedName("ATTACHMENT_OF_SCRUTINY")
    @Expose
    private String aTTACHMENTOFSCRUTINY;
    @SerializedName("DATE_OF_SCRUTINY")
    @Expose
    private String dATEOFSCRUTINY;
    @SerializedName("AO_NAME")
    @Expose
    private String aONAME;
    @SerializedName("AO_ID")
    @Expose
    private Double aOID;
    @SerializedName("DYCME_NAME")
    @Expose
    private String dYCMENAME;
    @SerializedName("DYCME_ID")
    @Expose
    private Double dYCMEID;
    @SerializedName("REMARK_OF_DYCME")
    @Expose
    private String rEMARKOFDYCME;
    @SerializedName("DATE_OF_REMARK_BY_DYCME")
    @Expose
    private String dATEOFREMARKBYDYCME;
    @SerializedName("PROBABLE_DATE_OF_VISIT")
    @Expose
    private String pROBABLEDATEOFVISIT;
    @SerializedName("DATE_OF_FEEDING_OF_PROBABLE_DATE")
    @Expose
    private String dATEOFFEEDINGOFPROBABLEDATE;
    @SerializedName("STATUS_OF_ASSESSMENT")
    @Expose
    private String sTATUSOFASSESSMENT;
    @SerializedName("REMARK_BY_ASSESSMENT_OFFICER")
    @Expose
    private String rEMARKBYASSESSMENTOFFICER;
    @SerializedName("ATTACHMENT_OF_ASSESSMENT_REPORT")
    @Expose
    private Object aTTACHMENTOFASSESSMENTREPORT;
    @SerializedName("DATE_OF_REMARK_OF_ASSESSMENT")
    @Expose
    private String dATEOFREMARKOFASSESSMENT;
    @SerializedName("AME_NAME")
    @Expose
    private String aMENAME;
    @SerializedName("AME_ID")
    @Expose
    private Double aMEID;
    @SerializedName("REMARK_ON_ASSESSMENT_BY_AME")
    @Expose
    private String rEMARKONASSESSMENTBYAME;
    @SerializedName("DATE_OF_REMARK_ON_ASSESSMENT_BY_AME")
    @Expose
    private String dATEOFREMARKONASSESSMENTBYAME;
    @SerializedName("SCRUTINY_STATUS_OF_ASSESSMENT_REPORT")
    @Expose
    private String sCRUTINYSTATUSOFASSESSMENTREPORT;
    @SerializedName("SCRUTINY_REPORT_OF_ASSESSMENT_REPORT")
    @Expose
    private String sCRUTINYREPORTOFASSESSMENTREPORT;
    @SerializedName("STATUS_OF_VERIFICATION_BY_DYCME")
    @Expose
    private String sTATUSOFVERIFICATIONBYDYCME;
    @SerializedName("VERIFICATION_REMARK_BY_DYCME")
    @Expose
    private String vERIFICATIONREMARKBYDYCME;
    @SerializedName("DATE_OF_VERIFICATION_BY_DYCME")
    @Expose
    private String dATEOFVERIFICATIONBYDYCME;
    @SerializedName("CPLE_NAME")
    @Expose
    private String cPLENAME;
    @SerializedName("CPLE_ID")
    @Expose
    private Double cPLEID;
    @SerializedName("STATUS_OF_CPLE")
    @Expose
    private String sTATUSOFCPLE;
    @SerializedName("REMARK_BY_CPLE")
    @Expose
    private String rEMARKBYCPLE;
    @SerializedName("DATE_OF_REMARK_BY_CPLE")
    @Expose
    private String dATEOFREMARKBYCPLE;
    @SerializedName("REMARK_OF_ACCEPTANCE_REJECTION_LETTER")
    @Expose
    private String rEMARKOFACCEPTANCEREJECTIONLETTER;
    @SerializedName("DATE_OF_ACCEPTANCE_REJECTION_LETTER")
    @Expose
    private String dATEOFACCEPTANCEREJECTIONLETTER;
    @SerializedName("LETTER_OF_ACCEPTANCE_REJECTION")
    @Expose
    private String lETTEROFACCEPTANCEREJECTION;
    @SerializedName("REMARK_BY_VENDOR_FOR_DEFICIENCY")
    @Expose
    private Object rEMARKBYVENDORFORDEFICIENCY;
    @SerializedName("DATE_OF_REMARK_BY_VENDOR")
    @Expose
    private Object dATEOFREMARKBYVENDOR;
    @SerializedName("ATTACHMENT_BY_VENDOR")
    @Expose
    private Object aTTACHMENTBYVENDOR;
    @SerializedName("NUMBER_OF_SUPERVISORY_STAFF")
    @Expose
    private Object nUMBEROFSUPERVISORYSTAFF;
    @SerializedName("TOTAL_SKILLED_NONSKILLED_STAFF")
    @Expose
    private Object tOTALSKILLEDNONSKILLEDSTAFF;
    @SerializedName("DESIGNATION_of_DyCMM")
    @Expose
    private Object dESIGNATIONOfDyCMM;
    @SerializedName("FACTORY_TYPE")
    @Expose
    private String fACTORYTYPE;
    @SerializedName("FACTORY_RENT_AGREEMENT")
    @Expose
    private String fACTORYRENTAGREEMENT;
    @SerializedName("LICENSE_ISSUING_AUTHORITY")
    @Expose
    private String lICENSEISSUINGAUTHORITY;
    @SerializedName("LICENSE_ISSUE_DATE")
    @Expose
    private String lICENSEISSUEDATE;
    @SerializedName("LICENSE_VALIDITY")
    @Expose
    private String lICENSEVALIDITY;
    @SerializedName("LICENSE_ATTACHMENT")
    @Expose
    private String lICENSEATTACHMENT;
    @SerializedName("DATE_OF_REMARK_BY_AME_ON_RECOMMENDATION")
    @Expose
    private String dATEOFREMARKBYAMEONRECOMMENDATION;
    @SerializedName("REMARK_BY_AME_ON_RECOMMENDATION")
    @Expose
    private String rEMARKBYAMEONRECOMMENDATION;
    @SerializedName("DATE_OF_REMARK_OF_SSE_ON_ASSESSMENT")
    @Expose
    private String dATEOFREMARKOFSSEONASSESSMENT;
    @SerializedName("ATTACHMENT_TO_VENDOR")
    @Expose
    private String aTTACHMENTTOVENDOR;
    @SerializedName("STATUS_OF_ASSESSMENT_REPORT_SSE")
    @Expose
    private String sTATUSOFASSESSMENTREPORTSSE;
    @SerializedName("REMARK_OF_SSE_ON_ASSESSMENT")
    @Expose
    private String rEMARKOFSSEONASSESSMENT;
    @SerializedName("REVERT_SSE_ASSESSMENT")
    @Expose
    private Object rEVERTSSEASSESSMENT;
    @SerializedName("REVERT_AME_ASSESSMENT")
    @Expose
    private Object rEVERTAMEASSESSMENT;
    @SerializedName("REVERT_DYCME_ASSESSMENT")
    @Expose
    private Object rEVERTDYCMEASSESSMENT;
    @SerializedName("REMARK_BY_VENDOR_ASSESSMENT")
    @Expose
    private Object rEMARKBYVENDORASSESSMENT;
    @SerializedName("DATE_OF_REMARK_BY_VENDOR_ASSESSMENT")
    @Expose
    private Object dATEOFREMARKBYVENDORASSESSMENT;
    @SerializedName("ATTACHMENT_BY_VENDOR_ASSESSMENT")
    @Expose
    private Object aTTACHMENTBYVENDORASSESSMENT;

    public Object getiD() {
        return iD;
    }

    public void setiD(Object iD) {
        this.iD = iD;
    }

    public String getnAMEOFFIRM() {
        return nAMEOFFIRM;
    }

    public void setnAMEOFFIRM(String nAMEOFFIRM) {
        this.nAMEOFFIRM = nAMEOFFIRM;
    }

    public Double getvENDORID() {
        return vENDORID;
    }

    public void setvENDORID(Double vENDORID) {
        this.vENDORID = vENDORID;
    }

    public Object gettENDERNO() {
        return tENDERNO;
    }

    public void settENDERNO(Object tENDERNO) {
        this.tENDERNO = tENDERNO;
    }

    public Object getlETTERNO() {
        return lETTERNO;
    }

    public void setlETTERNO(Object lETTERNO) {
        this.lETTERNO = lETTERNO;
    }

    public Object getlETTERNODATE() {
        return lETTERNODATE;
    }

    public void setlETTERNODATE(Object lETTERNODATE) {
        this.lETTERNODATE = lETTERNODATE;
    }

    public Object getdATE() {
        return dATE;
    }

    public void setdATE(Object dATE) {
        this.dATE = dATE;
    }

    public String getiTEMNAME() {
        return iTEMNAME;
    }

    public void setiTEMNAME(String iTEMNAME) {
        this.iTEMNAME = iTEMNAME;
    }

    public Object getiTEMID() {
        return iTEMID;
    }

    public void setiTEMID(Object iTEMID) {
        this.iTEMID = iTEMID;
    }

    public String getaTTACHMENT() {
        return aTTACHMENT;
    }

    public void setaTTACHMENT(String aTTACHMENT) {
        this.aTTACHMENT = aTTACHMENT;
    }

    public Object getqUANTITY() {
        return qUANTITY;
    }

    public void setqUANTITY(Object qUANTITY) {
        this.qUANTITY = qUANTITY;
    }

    public Object getqUANTITYUNIT() {
        return qUANTITYUNIT;
    }

    public void setqUANTITYUNIT(Object qUANTITYUNIT) {
        this.qUANTITYUNIT = qUANTITYUNIT;
    }

    public String getsTAGE() {
        return sTAGE;
    }

    public void setsTAGE(String sTAGE) {
        this.sTAGE = sTAGE;
    }

    public Double getsTAGESRNO() {
        return sTAGESRNO;
    }

    public void setsTAGESRNO(Double sTAGESRNO) {
        this.sTAGESRNO = sTAGESRNO;
    }

    public String getdATEOFFEEDING() {
        return dATEOFFEEDING;
    }

    public void setdATEOFFEEDING(String dATEOFFEEDING) {
        this.dATEOFFEEDING = dATEOFFEEDING;
    }

    public String getoFFICEADDRESS() {
        return oFFICEADDRESS;
    }

    public void setoFFICEADDRESS(String oFFICEADDRESS) {
        this.oFFICEADDRESS = oFFICEADDRESS;
    }

    public String getoFFICESTATE() {
        return oFFICESTATE;
    }

    public void setoFFICESTATE(String oFFICESTATE) {
        this.oFFICESTATE = oFFICESTATE;
    }

    public Double getoFFICESTATECODE() {
        return oFFICESTATECODE;
    }

    public void setoFFICESTATECODE(Double oFFICESTATECODE) {
        this.oFFICESTATECODE = oFFICESTATECODE;
    }

    public String getoFFICECITY() {
        return oFFICECITY;
    }

    public void setoFFICECITY(String oFFICECITY) {
        this.oFFICECITY = oFFICECITY;
    }

    public String getfACTORYADDRESS() {
        return fACTORYADDRESS;
    }

    public void setfACTORYADDRESS(String fACTORYADDRESS) {
        this.fACTORYADDRESS = fACTORYADDRESS;
    }

    public String getfACTORYSTATE() {
        return fACTORYSTATE;
    }

    public void setfACTORYSTATE(String fACTORYSTATE) {
        this.fACTORYSTATE = fACTORYSTATE;
    }

    public Double getfACTORYSTATECODE() {
        return fACTORYSTATECODE;
    }

    public void setfACTORYSTATECODE(Double fACTORYSTATECODE) {
        this.fACTORYSTATECODE = fACTORYSTATECODE;
    }

    public String getfACTORYCITY() {
        return fACTORYCITY;
    }

    public void setfACTORYCITY(String fACTORYCITY) {
        this.fACTORYCITY = fACTORYCITY;
    }

    public String gethOURSOFFACTORYWORKING() {
        return hOURSOFFACTORYWORKING;
    }

    public void sethOURSOFFACTORYWORKING(String hOURSOFFACTORYWORKING) {
        this.hOURSOFFACTORYWORKING = hOURSOFFACTORYWORKING;
    }

    public String getwEEKLYCLOSINGDAY() {
        return wEEKLYCLOSINGDAY;
    }

    public void setwEEKLYCLOSINGDAY(String wEEKLYCLOSINGDAY) {
        this.wEEKLYCLOSINGDAY = wEEKLYCLOSINGDAY;
    }

    public String getnAMEOFKEYPERSON() {
        return nAMEOFKEYPERSON;
    }

    public void setnAMEOFKEYPERSON(String nAMEOFKEYPERSON) {
        this.nAMEOFKEYPERSON = nAMEOFKEYPERSON;
    }

    public String getkEYPERSONDESIGNATION() {
        return kEYPERSONDESIGNATION;
    }

    public void setkEYPERSONDESIGNATION(String kEYPERSONDESIGNATION) {
        this.kEYPERSONDESIGNATION = kEYPERSONDESIGNATION;
    }

    public Double getkEYPERSONMOBILE() {
        return kEYPERSONMOBILE;
    }

    public void setkEYPERSONMOBILE(Double kEYPERSONMOBILE) {
        this.kEYPERSONMOBILE = kEYPERSONMOBILE;
    }

    public String getkEYPERSONEMAIL() {
        return kEYPERSONEMAIL;
    }

    public void setkEYPERSONEMAIL(String kEYPERSONEMAIL) {
        this.kEYPERSONEMAIL = kEYPERSONEMAIL;
    }

    public String getfACTORYAREACOVERED() {
        return fACTORYAREACOVERED;
    }

    public void setfACTORYAREACOVERED(String fACTORYAREACOVERED) {
        this.fACTORYAREACOVERED = fACTORYAREACOVERED;
    }

    public String getfACTORYAREAUNCOVERED() {
        return fACTORYAREAUNCOVERED;
    }

    public void setfACTORYAREAUNCOVERED(String fACTORYAREAUNCOVERED) {
        this.fACTORYAREAUNCOVERED = fACTORYAREAUNCOVERED;
    }

    public String getfACTORYATTACHMENT() {
        return fACTORYATTACHMENT;
    }

    public void setfACTORYATTACHMENT(String fACTORYATTACHMENT) {
        this.fACTORYATTACHMENT = fACTORYATTACHMENT;
    }

    public String getfACTORYLICENSENO() {
        return fACTORYLICENSENO;
    }

    public void setfACTORYLICENSENO(String fACTORYLICENSENO) {
        this.fACTORYLICENSENO = fACTORYLICENSENO;
    }

    public String getiSITPARTNERSHIPORPROPRIETORFIRM() {
        return iSITPARTNERSHIPORPROPRIETORFIRM;
    }

    public void setiSITPARTNERSHIPORPROPRIETORFIRM(String iSITPARTNERSHIPORPROPRIETORFIRM) {
        this.iSITPARTNERSHIPORPROPRIETORFIRM = iSITPARTNERSHIPORPROPRIETORFIRM;
    }

    public String getpARTNERSHIPORPROPRIETORFIRMATTACHMENT() {
        return pARTNERSHIPORPROPRIETORFIRMATTACHMENT;
    }

    public void setpARTNERSHIPORPROPRIETORFIRMATTACHMENT(String pARTNERSHIPORPROPRIETORFIRMATTACHMENT) {
        this.pARTNERSHIPORPROPRIETORFIRMATTACHMENT = pARTNERSHIPORPROPRIETORFIRMATTACHMENT;
    }

    public String getwHETHERINDIANSFACTORYACT() {
        return wHETHERINDIANSFACTORYACT;
    }

    public void setwHETHERINDIANSFACTORYACT(String wHETHERINDIANSFACTORYACT) {
        this.wHETHERINDIANSFACTORYACT = wHETHERINDIANSFACTORYACT;
    }

    public String getpOWERAVAILABILITY() {
        return pOWERAVAILABILITY;
    }

    public void setpOWERAVAILABILITY(String pOWERAVAILABILITY) {
        this.pOWERAVAILABILITY = pOWERAVAILABILITY;
    }

    public String getaDMINISTRATIONSTAFF() {
        return aDMINISTRATIONSTAFF;
    }

    public void setaDMINISTRATIONSTAFF(String aDMINISTRATIONSTAFF) {
        this.aDMINISTRATIONSTAFF = aDMINISTRATIONSTAFF;
    }

    public String gettECHNICALSTAFF() {
        return tECHNICALSTAFF;
    }

    public void settECHNICALSTAFF(String tECHNICALSTAFF) {
        this.tECHNICALSTAFF = tECHNICALSTAFF;
    }

    public String getpRODUCTIONSTAFF() {
        return pRODUCTIONSTAFF;
    }

    public void setpRODUCTIONSTAFF(String pRODUCTIONSTAFF) {
        this.pRODUCTIONSTAFF = pRODUCTIONSTAFF;
    }

    public String getqUALITYCONTROLSTAFF() {
        return qUALITYCONTROLSTAFF;
    }

    public void setqUALITYCONTROLSTAFF(String qUALITYCONTROLSTAFF) {
        this.qUALITYCONTROLSTAFF = qUALITYCONTROLSTAFF;
    }

    public String getmANPOWERATTACHMENT() {
        return mANPOWERATTACHMENT;
    }

    public void setmANPOWERATTACHMENT(String mANPOWERATTACHMENT) {
        this.mANPOWERATTACHMENT = mANPOWERATTACHMENT;
    }

    public String getdETAILSOFHEATTREATMENT() {
        return dETAILSOFHEATTREATMENT;
    }

    public void setdETAILSOFHEATTREATMENT(String dETAILSOFHEATTREATMENT) {
        this.dETAILSOFHEATTREATMENT = dETAILSOFHEATTREATMENT;
    }

    public String getdETAILSOFISO9001() {
        return dETAILSOFISO9001;
    }

    public void setdETAILSOFISO9001(String dETAILSOFISO9001) {
        this.dETAILSOFISO9001 = dETAILSOFISO9001;
    }

    public String getiS90001CERTIFICATE() {
        return iS90001CERTIFICATE;
    }

    public void setiS90001CERTIFICATE(String iS90001CERTIFICATE) {
        this.iS90001CERTIFICATE = iS90001CERTIFICATE;
    }

    public String getiSO9000CERTIFICATE() {
        return iSO9000CERTIFICATE;
    }

    public void setiSO9000CERTIFICATE(String iSO9000CERTIFICATE) {
        this.iSO9000CERTIFICATE = iSO9000CERTIFICATE;
    }

    public String getqUALITYASSURANCEPLANATTACHMENT() {
        return qUALITYASSURANCEPLANATTACHMENT;
    }

    public void setqUALITYASSURANCEPLANATTACHMENT(String qUALITYASSURANCEPLANATTACHMENT) {
        this.qUALITYASSURANCEPLANATTACHMENT = qUALITYASSURANCEPLANATTACHMENT;
    }

    public String getwHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES() {
        return wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES;
    }

    public void setwHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES(String wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES) {
        this.wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES = wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIES;
    }

    public String getwHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT() {
        return wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT;
    }

    public void setwHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT(String wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT) {
        this.wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT = wHETHERFIRMMANUFACTURERCOMPLETEDETAILSSUBASSEMBLIESATTACHMENT;
    }

    public String getnAMEOFTHESUBCONTRACTORCONTENTATTACHMENT() {
        return nAMEOFTHESUBCONTRACTORCONTENTATTACHMENT;
    }

    public void setnAMEOFTHESUBCONTRACTORCONTENTATTACHMENT(String nAMEOFTHESUBCONTRACTORCONTENTATTACHMENT) {
        this.nAMEOFTHESUBCONTRACTORCONTENTATTACHMENT = nAMEOFTHESUBCONTRACTORCONTENTATTACHMENT;
    }

    public String getdETAILSOFFACILITYMPAVAILABLE() {
        return dETAILSOFFACILITYMPAVAILABLE;
    }

    public void setdETAILSOFFACILITYMPAVAILABLE(String dETAILSOFFACILITYMPAVAILABLE) {
        this.dETAILSOFFACILITYMPAVAILABLE = dETAILSOFFACILITYMPAVAILABLE;
    }

    public String getmANUFACTURINGSPECIALITEMSATTACHMENT() {
        return mANUFACTURINGSPECIALITEMSATTACHMENT;
    }

    public void setmANUFACTURINGSPECIALITEMSATTACHMENT(String mANUFACTURINGSPECIALITEMSATTACHMENT) {
        this.mANUFACTURINGSPECIALITEMSATTACHMENT = mANUFACTURINGSPECIALITEMSATTACHMENT;
    }

    public String getdETAILSOFPRODUCTSUPPLIED() {
        return dETAILSOFPRODUCTSUPPLIED;
    }

    public void setdETAILSOFPRODUCTSUPPLIED(String dETAILSOFPRODUCTSUPPLIED) {
        this.dETAILSOFPRODUCTSUPPLIED = dETAILSOFPRODUCTSUPPLIED;
    }

    public String getlISTOFORDERONHAND() {
        return lISTOFORDERONHAND;
    }

    public void setlISTOFORDERONHAND(String lISTOFORDERONHAND) {
        this.lISTOFORDERONHAND = lISTOFORDERONHAND;
    }

    public String getdETAILOFPROOFOFOWNERSHIP() {
        return dETAILOFPROOFOFOWNERSHIP;
    }

    public void setdETAILOFPROOFOFOWNERSHIP(String dETAILOFPROOFOFOWNERSHIP) {
        this.dETAILOFPROOFOFOWNERSHIP = dETAILOFPROOFOFOWNERSHIP;
    }

    public String getdETAILOFFACTORYLICENSE() {
        return dETAILOFFACTORYLICENSE;
    }

    public void setdETAILOFFACTORYLICENSE(String dETAILOFFACTORYLICENSE) {
        this.dETAILOFFACTORYLICENSE = dETAILOFFACTORYLICENSE;
    }

    public String getdETAILOFGSTN() {
        return dETAILOFGSTN;
    }

    public void setdETAILOFGSTN(String dETAILOFGSTN) {
        this.dETAILOFGSTN = dETAILOFGSTN;
    }

    public String getdETAILOFELECTRICITYBILL() {
        return dETAILOFELECTRICITYBILL;
    }

    public void setdETAILOFELECTRICITYBILL(String dETAILOFELECTRICITYBILL) {
        this.dETAILOFELECTRICITYBILL = dETAILOFELECTRICITYBILL;
    }

    public String getdETAILOFNSICDIC() {
        return dETAILOFNSICDIC;
    }

    public void setdETAILOFNSICDIC(String dETAILOFNSICDIC) {
        this.dETAILOFNSICDIC = dETAILOFNSICDIC;
    }

    public String getdETAILOFMSME() {
        return dETAILOFMSME;
    }

    public void setdETAILOFMSME(String dETAILOFMSME) {
        this.dETAILOFMSME = dETAILOFMSME;
    }

    public String getpROOFOFOWNERSHIP() {
        return pROOFOFOWNERSHIP;
    }

    public void setpROOFOFOWNERSHIP(String pROOFOFOWNERSHIP) {
        this.pROOFOFOWNERSHIP = pROOFOFOWNERSHIP;
    }

    public String getfACTORYLICENSE() {
        return fACTORYLICENSE;
    }

    public void setfACTORYLICENSE(String fACTORYLICENSE) {
        this.fACTORYLICENSE = fACTORYLICENSE;
    }

    public String getgSTN() {
        return gSTN;
    }

    public void setgSTN(String gSTN) {
        this.gSTN = gSTN;
    }

    public String geteLECTRICITYBILL() {
        return eLECTRICITYBILL;
    }

    public void seteLECTRICITYBILL(String eLECTRICITYBILL) {
        this.eLECTRICITYBILL = eLECTRICITYBILL;
    }

    public Object getrEGISTRATIONCERTIFICATEFACTORYLICENSE() {
        return rEGISTRATIONCERTIFICATEFACTORYLICENSE;
    }

    public void setrEGISTRATIONCERTIFICATEFACTORYLICENSE(Object rEGISTRATIONCERTIFICATEFACTORYLICENSE) {
        this.rEGISTRATIONCERTIFICATEFACTORYLICENSE = rEGISTRATIONCERTIFICATEFACTORYLICENSE;
    }

    public String getnSICDIC() {
        return nSICDIC;
    }

    public void setnSICDIC(String nSICDIC) {
        this.nSICDIC = nSICDIC;
    }

    public String getmSME() {
        return mSME;
    }

    public void setmSME(String mSME) {
        this.mSME = mSME;
    }

    public String getbANKERNAME() {
        return bANKERNAME;
    }

    public void setbANKERNAME(String bANKERNAME) {
        this.bANKERNAME = bANKERNAME;
    }

    public String getbANKERADDRESS() {
        return bANKERADDRESS;
    }

    public void setbANKERADDRESS(String bANKERADDRESS) {
        this.bANKERADDRESS = bANKERADDRESS;
    }

    public String getiSCOMPANYCERTIFIEDISO14001() {
        return iSCOMPANYCERTIFIEDISO14001;
    }

    public void setiSCOMPANYCERTIFIEDISO14001(String iSCOMPANYCERTIFIEDISO14001) {
        this.iSCOMPANYCERTIFIEDISO14001 = iSCOMPANYCERTIFIEDISO14001;
    }

    public String getiSCOMPANYCERTIFIEDISO14001ATTACHMENT() {
        return iSCOMPANYCERTIFIEDISO14001ATTACHMENT;
    }

    public void setiSCOMPANYCERTIFIEDISO14001ATTACHMENT(String iSCOMPANYCERTIFIEDISO14001ATTACHMENT) {
        this.iSCOMPANYCERTIFIEDISO14001ATTACHMENT = iSCOMPANYCERTIFIEDISO14001ATTACHMENT;
    }

    public String getiSCOMPANYMONITORENVIRONMENTPERFORMANCE() {
        return iSCOMPANYMONITORENVIRONMENTPERFORMANCE;
    }

    public void setiSCOMPANYMONITORENVIRONMENTPERFORMANCE(String iSCOMPANYMONITORENVIRONMENTPERFORMANCE) {
        this.iSCOMPANYMONITORENVIRONMENTPERFORMANCE = iSCOMPANYMONITORENVIRONMENTPERFORMANCE;
    }

    public String getiSCOMPANYMEASUREENVIRONMENTPERFORMANCE() {
        return iSCOMPANYMEASUREENVIRONMENTPERFORMANCE;
    }

    public void setiSCOMPANYMEASUREENVIRONMENTPERFORMANCE(String iSCOMPANYMEASUREENVIRONMENTPERFORMANCE) {
        this.iSCOMPANYMEASUREENVIRONMENTPERFORMANCE = iSCOMPANYMEASUREENVIRONMENTPERFORMANCE;
    }

    public String getiSCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT() {
        return iSCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT;
    }

    public void setiSCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT(String iSCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT) {
        this.iSCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT = iSCOMPANYMEASUREENVIRONMENTPERFORMANCEATTACHMENT;
    }

    public String getiSCOMPANYIDENTIFIEDENVIRONMENTIMPACTS() {
        return iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTS;
    }

    public void setiSCOMPANYIDENTIFIEDENVIRONMENTIMPACTS(String iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTS) {
        this.iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTS = iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTS;
    }

    public String getiSCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT() {
        return iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT;
    }

    public void setiSCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT(String iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT) {
        this.iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT = iSCOMPANYIDENTIFIEDENVIRONMENTIMPACTSATTACHMENT;
    }

    public String getiSCOMPANYDEFINEDGOALSENERGY() {
        return iSCOMPANYDEFINEDGOALSENERGY;
    }

    public void setiSCOMPANYDEFINEDGOALSENERGY(String iSCOMPANYDEFINEDGOALSENERGY) {
        this.iSCOMPANYDEFINEDGOALSENERGY = iSCOMPANYDEFINEDGOALSENERGY;
    }

    public String getiSCOMPANYDEFINEDGOALSENERGYATTACHMENT() {
        return iSCOMPANYDEFINEDGOALSENERGYATTACHMENT;
    }

    public void setiSCOMPANYDEFINEDGOALSENERGYATTACHMENT(String iSCOMPANYDEFINEDGOALSENERGYATTACHMENT) {
        this.iSCOMPANYDEFINEDGOALSENERGYATTACHMENT = iSCOMPANYDEFINEDGOALSENERGYATTACHMENT;
    }

    public String getiSCOMPANYDEFINEDGOALSWATER() {
        return iSCOMPANYDEFINEDGOALSWATER;
    }

    public void setiSCOMPANYDEFINEDGOALSWATER(String iSCOMPANYDEFINEDGOALSWATER) {
        this.iSCOMPANYDEFINEDGOALSWATER = iSCOMPANYDEFINEDGOALSWATER;
    }

    public String getiSCOMPANYDEFINEDGOALSWATERATTCHMENT() {
        return iSCOMPANYDEFINEDGOALSWATERATTCHMENT;
    }

    public void setiSCOMPANYDEFINEDGOALSWATERATTCHMENT(String iSCOMPANYDEFINEDGOALSWATERATTCHMENT) {
        this.iSCOMPANYDEFINEDGOALSWATERATTCHMENT = iSCOMPANYDEFINEDGOALSWATERATTCHMENT;
    }

    public String getiSCOMPANYIDENTIFIEDLEGALREQUIREMENTS() {
        return iSCOMPANYIDENTIFIEDLEGALREQUIREMENTS;
    }

    public void setiSCOMPANYIDENTIFIEDLEGALREQUIREMENTS(String iSCOMPANYIDENTIFIEDLEGALREQUIREMENTS) {
        this.iSCOMPANYIDENTIFIEDLEGALREQUIREMENTS = iSCOMPANYIDENTIFIEDLEGALREQUIREMENTS;
    }

    public String getiSCOMPANYLEGALREQUIREMETSCOMPLIANCE() {
        return iSCOMPANYLEGALREQUIREMETSCOMPLIANCE;
    }

    public void setiSCOMPANYLEGALREQUIREMETSCOMPLIANCE(String iSCOMPANYLEGALREQUIREMETSCOMPLIANCE) {
        this.iSCOMPANYLEGALREQUIREMETSCOMPLIANCE = iSCOMPANYLEGALREQUIREMETSCOMPLIANCE;
    }

    public String getiSCOMPANYIDENTIFIEDWASTESGENERATED() {
        return iSCOMPANYIDENTIFIEDWASTESGENERATED;
    }

    public void setiSCOMPANYIDENTIFIEDWASTESGENERATED(String iSCOMPANYIDENTIFIEDWASTESGENERATED) {
        this.iSCOMPANYIDENTIFIEDWASTESGENERATED = iSCOMPANYIDENTIFIEDWASTESGENERATED;
    }

    public String getiSCOMPANYSEGREGATINGWASTES() {
        return iSCOMPANYSEGREGATINGWASTES;
    }

    public void setiSCOMPANYSEGREGATINGWASTES(String iSCOMPANYSEGREGATINGWASTES) {
        this.iSCOMPANYSEGREGATINGWASTES = iSCOMPANYSEGREGATINGWASTES;
    }

    public String getiSCOMPANYSAFEDISPOSALWASTES() {
        return iSCOMPANYSAFEDISPOSALWASTES;
    }

    public void setiSCOMPANYSAFEDISPOSALWASTES(String iSCOMPANYSAFEDISPOSALWASTES) {
        this.iSCOMPANYSAFEDISPOSALWASTES = iSCOMPANYSAFEDISPOSALWASTES;
    }

    public String getiSCOMPANYDISPOSINGWASTES() {
        return iSCOMPANYDISPOSINGWASTES;
    }

    public void setiSCOMPANYDISPOSINGWASTES(String iSCOMPANYDISPOSINGWASTES) {
        this.iSCOMPANYDISPOSINGWASTES = iSCOMPANYDISPOSINGWASTES;
    }

    public String getiSCOMPANYENERGYEFFICIENT() {
        return iSCOMPANYENERGYEFFICIENT;
    }

    public void setiSCOMPANYENERGYEFFICIENT(String iSCOMPANYENERGYEFFICIENT) {
        this.iSCOMPANYENERGYEFFICIENT = iSCOMPANYENERGYEFFICIENT;
    }

    public String getiSCOMPANYCONDUCTINGREGULARAWARENESS() {
        return iSCOMPANYCONDUCTINGREGULARAWARENESS;
    }

    public void setiSCOMPANYCONDUCTINGREGULARAWARENESS(String iSCOMPANYCONDUCTINGREGULARAWARENESS) {
        this.iSCOMPANYCONDUCTINGREGULARAWARENESS = iSCOMPANYCONDUCTINGREGULARAWARENESS;
    }

    public String getdATEOFSUBMISSION() {
        return dATEOFSUBMISSION;
    }

    public void setdATEOFSUBMISSION(String dATEOFSUBMISSION) {
        this.dATEOFSUBMISSION = dATEOFSUBMISSION;
    }

    public String getsSENAME() {
        return sSENAME;
    }

    public void setsSENAME(String sSENAME) {
        this.sSENAME = sSENAME;
    }

    public Double getsSEID() {
        return sSEID;
    }

    public void setsSEID(Double sSEID) {
        this.sSEID = sSEID;
    }

    public String getsCRUTINYSTATUS() {
        return sCRUTINYSTATUS;
    }

    public void setsCRUTINYSTATUS(String sCRUTINYSTATUS) {
        this.sCRUTINYSTATUS = sCRUTINYSTATUS;
    }

    public String getiSASSESSMENTRERQUIRED() {
        return iSASSESSMENTRERQUIRED;
    }

    public void setiSASSESSMENTRERQUIRED(String iSASSESSMENTRERQUIRED) {
        this.iSASSESSMENTRERQUIRED = iSASSESSMENTRERQUIRED;
    }

    public String getrECOMMENDEDAONAME() {
        return rECOMMENDEDAONAME;
    }

    public void setrECOMMENDEDAONAME(String rECOMMENDEDAONAME) {
        this.rECOMMENDEDAONAME = rECOMMENDEDAONAME;
    }

    public Double getrECOMMENDEDAOID() {
        return rECOMMENDEDAOID;
    }

    public void setrECOMMENDEDAOID(Double rECOMMENDEDAOID) {
        this.rECOMMENDEDAOID = rECOMMENDEDAOID;
    }

    public String getrEMARKOFSCRUTINY() {
        return rEMARKOFSCRUTINY;
    }

    public void setrEMARKOFSCRUTINY(String rEMARKOFSCRUTINY) {
        this.rEMARKOFSCRUTINY = rEMARKOFSCRUTINY;
    }

    public String getaTTACHMENTOFSCRUTINY() {
        return aTTACHMENTOFSCRUTINY;
    }

    public void setaTTACHMENTOFSCRUTINY(String aTTACHMENTOFSCRUTINY) {
        this.aTTACHMENTOFSCRUTINY = aTTACHMENTOFSCRUTINY;
    }

    public String getdATEOFSCRUTINY() {
        return dATEOFSCRUTINY;
    }

    public void setdATEOFSCRUTINY(String dATEOFSCRUTINY) {
        this.dATEOFSCRUTINY = dATEOFSCRUTINY;
    }

    public String getaONAME() {
        return aONAME;
    }

    public void setaONAME(String aONAME) {
        this.aONAME = aONAME;
    }

    public Double getaOID() {
        return aOID;
    }

    public void setaOID(Double aOID) {
        this.aOID = aOID;
    }

    public String getdYCMENAME() {
        return dYCMENAME;
    }

    public void setdYCMENAME(String dYCMENAME) {
        this.dYCMENAME = dYCMENAME;
    }

    public Double getdYCMEID() {
        return dYCMEID;
    }

    public void setdYCMEID(Double dYCMEID) {
        this.dYCMEID = dYCMEID;
    }

    public String getrEMARKOFDYCME() {
        return rEMARKOFDYCME;
    }

    public void setrEMARKOFDYCME(String rEMARKOFDYCME) {
        this.rEMARKOFDYCME = rEMARKOFDYCME;
    }

    public String getdATEOFREMARKBYDYCME() {
        return dATEOFREMARKBYDYCME;
    }

    public void setdATEOFREMARKBYDYCME(String dATEOFREMARKBYDYCME) {
        this.dATEOFREMARKBYDYCME = dATEOFREMARKBYDYCME;
    }

    public String getpROBABLEDATEOFVISIT() {
        return pROBABLEDATEOFVISIT;
    }

    public void setpROBABLEDATEOFVISIT(String pROBABLEDATEOFVISIT) {
        this.pROBABLEDATEOFVISIT = pROBABLEDATEOFVISIT;
    }

    public String getdATEOFFEEDINGOFPROBABLEDATE() {
        return dATEOFFEEDINGOFPROBABLEDATE;
    }

    public void setdATEOFFEEDINGOFPROBABLEDATE(String dATEOFFEEDINGOFPROBABLEDATE) {
        this.dATEOFFEEDINGOFPROBABLEDATE = dATEOFFEEDINGOFPROBABLEDATE;
    }

    public String getsTATUSOFASSESSMENT() {
        return sTATUSOFASSESSMENT;
    }

    public void setsTATUSOFASSESSMENT(String sTATUSOFASSESSMENT) {
        this.sTATUSOFASSESSMENT = sTATUSOFASSESSMENT;
    }

    public String getrEMARKBYASSESSMENTOFFICER() {
        return rEMARKBYASSESSMENTOFFICER;
    }

    public void setrEMARKBYASSESSMENTOFFICER(String rEMARKBYASSESSMENTOFFICER) {
        this.rEMARKBYASSESSMENTOFFICER = rEMARKBYASSESSMENTOFFICER;
    }

    public Object getaTTACHMENTOFASSESSMENTREPORT() {
        return aTTACHMENTOFASSESSMENTREPORT;
    }

    public void setaTTACHMENTOFASSESSMENTREPORT(Object aTTACHMENTOFASSESSMENTREPORT) {
        this.aTTACHMENTOFASSESSMENTREPORT = aTTACHMENTOFASSESSMENTREPORT;
    }

    public String getdATEOFREMARKOFASSESSMENT() {
        return dATEOFREMARKOFASSESSMENT;
    }

    public void setdATEOFREMARKOFASSESSMENT(String dATEOFREMARKOFASSESSMENT) {
        this.dATEOFREMARKOFASSESSMENT = dATEOFREMARKOFASSESSMENT;
    }

    public String getaMENAME() {
        return aMENAME;
    }

    public void setaMENAME(String aMENAME) {
        this.aMENAME = aMENAME;
    }

    public Double getaMEID() {
        return aMEID;
    }

    public void setaMEID(Double aMEID) {
        this.aMEID = aMEID;
    }

    public String getrEMARKONASSESSMENTBYAME() {
        return rEMARKONASSESSMENTBYAME;
    }

    public void setrEMARKONASSESSMENTBYAME(String rEMARKONASSESSMENTBYAME) {
        this.rEMARKONASSESSMENTBYAME = rEMARKONASSESSMENTBYAME;
    }

    public String getdATEOFREMARKONASSESSMENTBYAME() {
        return dATEOFREMARKONASSESSMENTBYAME;
    }

    public void setdATEOFREMARKONASSESSMENTBYAME(String dATEOFREMARKONASSESSMENTBYAME) {
        this.dATEOFREMARKONASSESSMENTBYAME = dATEOFREMARKONASSESSMENTBYAME;
    }

    public String getsCRUTINYSTATUSOFASSESSMENTREPORT() {
        return sCRUTINYSTATUSOFASSESSMENTREPORT;
    }

    public void setsCRUTINYSTATUSOFASSESSMENTREPORT(String sCRUTINYSTATUSOFASSESSMENTREPORT) {
        this.sCRUTINYSTATUSOFASSESSMENTREPORT = sCRUTINYSTATUSOFASSESSMENTREPORT;
    }

    public String getsCRUTINYREPORTOFASSESSMENTREPORT() {
        return sCRUTINYREPORTOFASSESSMENTREPORT;
    }

    public void setsCRUTINYREPORTOFASSESSMENTREPORT(String sCRUTINYREPORTOFASSESSMENTREPORT) {
        this.sCRUTINYREPORTOFASSESSMENTREPORT = sCRUTINYREPORTOFASSESSMENTREPORT;
    }

    public String getsTATUSOFVERIFICATIONBYDYCME() {
        return sTATUSOFVERIFICATIONBYDYCME;
    }

    public void setsTATUSOFVERIFICATIONBYDYCME(String sTATUSOFVERIFICATIONBYDYCME) {
        this.sTATUSOFVERIFICATIONBYDYCME = sTATUSOFVERIFICATIONBYDYCME;
    }

    public String getvERIFICATIONREMARKBYDYCME() {
        return vERIFICATIONREMARKBYDYCME;
    }

    public void setvERIFICATIONREMARKBYDYCME(String vERIFICATIONREMARKBYDYCME) {
        this.vERIFICATIONREMARKBYDYCME = vERIFICATIONREMARKBYDYCME;
    }

    public String getdATEOFVERIFICATIONBYDYCME() {
        return dATEOFVERIFICATIONBYDYCME;
    }

    public void setdATEOFVERIFICATIONBYDYCME(String dATEOFVERIFICATIONBYDYCME) {
        this.dATEOFVERIFICATIONBYDYCME = dATEOFVERIFICATIONBYDYCME;
    }

    public String getcPLENAME() {
        return cPLENAME;
    }

    public void setcPLENAME(String cPLENAME) {
        this.cPLENAME = cPLENAME;
    }

    public Double getcPLEID() {
        return cPLEID;
    }

    public void setcPLEID(Double cPLEID) {
        this.cPLEID = cPLEID;
    }

    public String getsTATUSOFCPLE() {
        return sTATUSOFCPLE;
    }

    public void setsTATUSOFCPLE(String sTATUSOFCPLE) {
        this.sTATUSOFCPLE = sTATUSOFCPLE;
    }

    public String getrEMARKBYCPLE() {
        return rEMARKBYCPLE;
    }

    public void setrEMARKBYCPLE(String rEMARKBYCPLE) {
        this.rEMARKBYCPLE = rEMARKBYCPLE;
    }

    public String getdATEOFREMARKBYCPLE() {
        return dATEOFREMARKBYCPLE;
    }

    public void setdATEOFREMARKBYCPLE(String dATEOFREMARKBYCPLE) {
        this.dATEOFREMARKBYCPLE = dATEOFREMARKBYCPLE;
    }

    public String getrEMARKOFACCEPTANCEREJECTIONLETTER() {
        return rEMARKOFACCEPTANCEREJECTIONLETTER;
    }

    public void setrEMARKOFACCEPTANCEREJECTIONLETTER(String rEMARKOFACCEPTANCEREJECTIONLETTER) {
        this.rEMARKOFACCEPTANCEREJECTIONLETTER = rEMARKOFACCEPTANCEREJECTIONLETTER;
    }

    public String getdATEOFACCEPTANCEREJECTIONLETTER() {
        return dATEOFACCEPTANCEREJECTIONLETTER;
    }

    public void setdATEOFACCEPTANCEREJECTIONLETTER(String dATEOFACCEPTANCEREJECTIONLETTER) {
        this.dATEOFACCEPTANCEREJECTIONLETTER = dATEOFACCEPTANCEREJECTIONLETTER;
    }

    public String getlETTEROFACCEPTANCEREJECTION() {
        return lETTEROFACCEPTANCEREJECTION;
    }

    public void setlETTEROFACCEPTANCEREJECTION(String lETTEROFACCEPTANCEREJECTION) {
        this.lETTEROFACCEPTANCEREJECTION = lETTEROFACCEPTANCEREJECTION;
    }

    public Object getrEMARKBYVENDORFORDEFICIENCY() {
        return rEMARKBYVENDORFORDEFICIENCY;
    }

    public void setrEMARKBYVENDORFORDEFICIENCY(Object rEMARKBYVENDORFORDEFICIENCY) {
        this.rEMARKBYVENDORFORDEFICIENCY = rEMARKBYVENDORFORDEFICIENCY;
    }

    public Object getdATEOFREMARKBYVENDOR() {
        return dATEOFREMARKBYVENDOR;
    }

    public void setdATEOFREMARKBYVENDOR(Object dATEOFREMARKBYVENDOR) {
        this.dATEOFREMARKBYVENDOR = dATEOFREMARKBYVENDOR;
    }

    public Object getaTTACHMENTBYVENDOR() {
        return aTTACHMENTBYVENDOR;
    }

    public void setaTTACHMENTBYVENDOR(Object aTTACHMENTBYVENDOR) {
        this.aTTACHMENTBYVENDOR = aTTACHMENTBYVENDOR;
    }

    public Object getnUMBEROFSUPERVISORYSTAFF() {
        return nUMBEROFSUPERVISORYSTAFF;
    }

    public void setnUMBEROFSUPERVISORYSTAFF(Object nUMBEROFSUPERVISORYSTAFF) {
        this.nUMBEROFSUPERVISORYSTAFF = nUMBEROFSUPERVISORYSTAFF;
    }

    public Object gettOTALSKILLEDNONSKILLEDSTAFF() {
        return tOTALSKILLEDNONSKILLEDSTAFF;
    }

    public void settOTALSKILLEDNONSKILLEDSTAFF(Object tOTALSKILLEDNONSKILLEDSTAFF) {
        this.tOTALSKILLEDNONSKILLEDSTAFF = tOTALSKILLEDNONSKILLEDSTAFF;
    }

    public Object getdESIGNATIONOfDyCMM() {
        return dESIGNATIONOfDyCMM;
    }

    public void setdESIGNATIONOfDyCMM(Object dESIGNATIONOfDyCMM) {
        this.dESIGNATIONOfDyCMM = dESIGNATIONOfDyCMM;
    }

    public String getfACTORYTYPE() {
        return fACTORYTYPE;
    }

    public void setfACTORYTYPE(String fACTORYTYPE) {
        this.fACTORYTYPE = fACTORYTYPE;
    }

    public String getfACTORYRENTAGREEMENT() {
        return fACTORYRENTAGREEMENT;
    }

    public void setfACTORYRENTAGREEMENT(String fACTORYRENTAGREEMENT) {
        this.fACTORYRENTAGREEMENT = fACTORYRENTAGREEMENT;
    }

    public String getlICENSEISSUINGAUTHORITY() {
        return lICENSEISSUINGAUTHORITY;
    }

    public void setlICENSEISSUINGAUTHORITY(String lICENSEISSUINGAUTHORITY) {
        this.lICENSEISSUINGAUTHORITY = lICENSEISSUINGAUTHORITY;
    }

    public String getlICENSEISSUEDATE() {
        return lICENSEISSUEDATE;
    }

    public void setlICENSEISSUEDATE(String lICENSEISSUEDATE) {
        this.lICENSEISSUEDATE = lICENSEISSUEDATE;
    }

    public String getlICENSEVALIDITY() {
        return lICENSEVALIDITY;
    }

    public void setlICENSEVALIDITY(String lICENSEVALIDITY) {
        this.lICENSEVALIDITY = lICENSEVALIDITY;
    }

    public String getlICENSEATTACHMENT() {
        return lICENSEATTACHMENT;
    }

    public void setlICENSEATTACHMENT(String lICENSEATTACHMENT) {
        this.lICENSEATTACHMENT = lICENSEATTACHMENT;
    }

    public String getdATEOFREMARKBYAMEONRECOMMENDATION() {
        return dATEOFREMARKBYAMEONRECOMMENDATION;
    }

    public void setdATEOFREMARKBYAMEONRECOMMENDATION(String dATEOFREMARKBYAMEONRECOMMENDATION) {
        this.dATEOFREMARKBYAMEONRECOMMENDATION = dATEOFREMARKBYAMEONRECOMMENDATION;
    }

    public String getrEMARKBYAMEONRECOMMENDATION() {
        return rEMARKBYAMEONRECOMMENDATION;
    }

    public void setrEMARKBYAMEONRECOMMENDATION(String rEMARKBYAMEONRECOMMENDATION) {
        this.rEMARKBYAMEONRECOMMENDATION = rEMARKBYAMEONRECOMMENDATION;
    }

    public String getdATEOFREMARKOFSSEONASSESSMENT() {
        return dATEOFREMARKOFSSEONASSESSMENT;
    }

    public void setdATEOFREMARKOFSSEONASSESSMENT(String dATEOFREMARKOFSSEONASSESSMENT) {
        this.dATEOFREMARKOFSSEONASSESSMENT = dATEOFREMARKOFSSEONASSESSMENT;
    }

    public String getaTTACHMENTTOVENDOR() {
        return aTTACHMENTTOVENDOR;
    }

    public void setaTTACHMENTTOVENDOR(String aTTACHMENTTOVENDOR) {
        this.aTTACHMENTTOVENDOR = aTTACHMENTTOVENDOR;
    }

    public String getsTATUSOFASSESSMENTREPORTSSE() {
        return sTATUSOFASSESSMENTREPORTSSE;
    }

    public void setsTATUSOFASSESSMENTREPORTSSE(String sTATUSOFASSESSMENTREPORTSSE) {
        this.sTATUSOFASSESSMENTREPORTSSE = sTATUSOFASSESSMENTREPORTSSE;
    }

    public String getrEMARKOFSSEONASSESSMENT() {
        return rEMARKOFSSEONASSESSMENT;
    }

    public void setrEMARKOFSSEONASSESSMENT(String rEMARKOFSSEONASSESSMENT) {
        this.rEMARKOFSSEONASSESSMENT = rEMARKOFSSEONASSESSMENT;
    }

    public Object getrEVERTSSEASSESSMENT() {
        return rEVERTSSEASSESSMENT;
    }

    public void setrEVERTSSEASSESSMENT(Object rEVERTSSEASSESSMENT) {
        this.rEVERTSSEASSESSMENT = rEVERTSSEASSESSMENT;
    }

    public Object getrEVERTAMEASSESSMENT() {
        return rEVERTAMEASSESSMENT;
    }

    public void setrEVERTAMEASSESSMENT(Object rEVERTAMEASSESSMENT) {
        this.rEVERTAMEASSESSMENT = rEVERTAMEASSESSMENT;
    }

    public Object getrEVERTDYCMEASSESSMENT() {
        return rEVERTDYCMEASSESSMENT;
    }

    public void setrEVERTDYCMEASSESSMENT(Object rEVERTDYCMEASSESSMENT) {
        this.rEVERTDYCMEASSESSMENT = rEVERTDYCMEASSESSMENT;
    }

    public Object getrEMARKBYVENDORASSESSMENT() {
        return rEMARKBYVENDORASSESSMENT;
    }

    public void setrEMARKBYVENDORASSESSMENT(Object rEMARKBYVENDORASSESSMENT) {
        this.rEMARKBYVENDORASSESSMENT = rEMARKBYVENDORASSESSMENT;
    }

    public Object getdATEOFREMARKBYVENDORASSESSMENT() {
        return dATEOFREMARKBYVENDORASSESSMENT;
    }

    public void setdATEOFREMARKBYVENDORASSESSMENT(Object dATEOFREMARKBYVENDORASSESSMENT) {
        this.dATEOFREMARKBYVENDORASSESSMENT = dATEOFREMARKBYVENDORASSESSMENT;
    }

    public Object getaTTACHMENTBYVENDORASSESSMENT() {
        return aTTACHMENTBYVENDORASSESSMENT;
    }

    public void setaTTACHMENTBYVENDORASSESSMENT(Object aTTACHMENTBYVENDORASSESSMENT) {
        this.aTTACHMENTBYVENDORASSESSMENT = aTTACHMENTBYVENDORASSESSMENT;
    }
    */
}
