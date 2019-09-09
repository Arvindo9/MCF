package com.indtel.mcf.data.model.apis.casesAfterAssessmen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/24/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
public class CasesAfterAssessment {

    //Fresh--------------------------------------

    @SerializedName("ID")
    @Expose
    private Double iD;
    @SerializedName("NAMEOFFIRM")
    @Expose
    private String nAMEOFFIRM;
    @SerializedName("ITEM_NAME")
    @Expose
    private String iTEMNAME;
    @SerializedName("STATUS_OF_ASSESSMENT")
    @Expose
    private String sTATUSOFASSESSMENT;
    @SerializedName("REMARK_BY_ASSESSMENT_OFFICER")
    @Expose
    private String rEMARKBYASSESSMENTOFFICER;
    @SerializedName("DATE_OF_REMARK_OF_ASSESSMENT")
    @Expose
    private String dATEOFREMARKOFASSESSMENT;
    @SerializedName("SSE_ID")
    @Expose
    private Double sSEID;
    @SerializedName("IS_ASSESSMENT_RERQUIRED")
    @Expose
    private String iSASSESSMENTRERQUIRED;
    @SerializedName("DATE_OF_REMARK_OF_SSE_ON_ASSESSMENT")
    @Expose
    private Object dATEOFREMARKOFSSEONASSESSMENT;
    @SerializedName("REVERT_SSE_ASSESSMENT")
    @Expose
    private Object rEVERTSSEASSESSMENT;
    @SerializedName("AME_ID")
    @Expose
    private Double aMEID;

    //Reverted--------------------------------------

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
    @SerializedName("SCRUTINY_STATUS")
    @Expose
    private String sCRUTINYSTATUS = "";
    @SerializedName("RECOMMENDED_AO_NAME")
    @Expose
    private String rECOMMENDEDAONAME = "";
    @SerializedName("RECOMMENDED_AO_ID")
    @Expose
    private String rECOMMENDEDAOID = "";
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
    private String aOID = "";
    @SerializedName("DYCME_NAME")
    @Expose
    private String dYCMENAME = "";
    @SerializedName("DYCME_ID")
    @Expose
    private String dYCMEID = "";
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
    @SerializedName("ATTACHMENT_OF_ASSESSMENT_REPORT")
    @Expose
    private String aTTACHMENTOFASSESSMENTREPORT = "";
    @SerializedName("AME_NAME")
    @Expose
    private String aMENAME = "";
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
    private String cPLEID = "";
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
    @SerializedName("ATTACHMENT_TO_VENDOR")
    @Expose
    private String aTTACHMENTTOVENDOR = "";
    @SerializedName("STATUS_OF_ASSESSMENT_REPORT_SSE")
    @Expose
    private String sTATUSOFASSESSMENTREPORTSSE = "";
    @SerializedName("REMARK_OF_SSE_ON_ASSESSMENT")
    @Expose
    private String rEMARKOFSSEONASSESSMENT = "";
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


    public Double getiD() {
        return iD;
    }

    public void setiD(Double iD) {
        this.iD = iD;
    }

    public String getnAMEOFFIRM() {
        return nAMEOFFIRM;
    }

    public void setnAMEOFFIRM(String nAMEOFFIRM) {
        this.nAMEOFFIRM = nAMEOFFIRM;
    }

    public String getiTEMNAME() {
        return iTEMNAME;
    }

    public void setiTEMNAME(String iTEMNAME) {
        this.iTEMNAME = iTEMNAME;
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

    public String getdATEOFREMARKOFASSESSMENT() {
        return dATEOFREMARKOFASSESSMENT;
    }

    public void setdATEOFREMARKOFASSESSMENT(String dATEOFREMARKOFASSESSMENT) {
        this.dATEOFREMARKOFASSESSMENT = dATEOFREMARKOFASSESSMENT;
    }

    public Double getsSEID() {
        return sSEID;
    }

    public void setsSEID(Double sSEID) {
        this.sSEID = sSEID;
    }

    public String getiSASSESSMENTRERQUIRED() {
        return iSASSESSMENTRERQUIRED;
    }

    public void setiSASSESSMENTRERQUIRED(String iSASSESSMENTRERQUIRED) {
        this.iSASSESSMENTRERQUIRED = iSASSESSMENTRERQUIRED;
    }

    public Object getdATEOFREMARKOFSSEONASSESSMENT() {
        return dATEOFREMARKOFSSEONASSESSMENT;
    }

    public void setdATEOFREMARKOFSSEONASSESSMENT(Object dATEOFREMARKOFSSEONASSESSMENT) {
        this.dATEOFREMARKOFSSEONASSESSMENT = dATEOFREMARKOFSSEONASSESSMENT;
    }

    public Object getrEVERTSSEASSESSMENT() {
        return rEVERTSSEASSESSMENT;
    }

    public void setrEVERTSSEASSESSMENT(Object rEVERTSSEASSESSMENT) {
        this.rEVERTSSEASSESSMENT = rEVERTSSEASSESSMENT;
    }

    public Double getaMEID() {
        return aMEID;
    }

    public void setaMEID(Double aMEID) {
        this.aMEID = aMEID;
    }

    public Double getvENDORID() {
        return vENDORID;
    }

    public void setvENDORID(Double vENDORID) {
        this.vENDORID = vENDORID;
    }

    public String gettENDERNO() {
        return tENDERNO;
    }

    public void settENDERNO(String tENDERNO) {
        this.tENDERNO = tENDERNO;
    }

    public String getlETTERNO() {
        return lETTERNO;
    }

    public void setlETTERNO(String lETTERNO) {
        this.lETTERNO = lETTERNO;
    }

    public String getlETTERNODATE() {
        return lETTERNODATE;
    }

    public void setlETTERNODATE(String lETTERNODATE) {
        this.lETTERNODATE = lETTERNODATE;
    }

    public String getdATE() {
        return dATE;
    }

    public void setdATE(String dATE) {
        this.dATE = dATE;
    }

    public String getiTEMID() {
        return iTEMID;
    }

    public void setiTEMID(String iTEMID) {
        this.iTEMID = iTEMID;
    }

    public String getaTTACHMENT() {
        return aTTACHMENT;
    }

    public void setaTTACHMENT(String aTTACHMENT) {
        this.aTTACHMENT = aTTACHMENT;
    }

    public String getqUANTITY() {
        return qUANTITY;
    }

    public void setqUANTITY(String qUANTITY) {
        this.qUANTITY = qUANTITY;
    }

    public String getqUANTITYUNIT() {
        return qUANTITYUNIT;
    }

    public void setqUANTITYUNIT(String qUANTITYUNIT) {
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

    public String getrEGISTRATIONCERTIFICATEFACTORYLICENSE() {
        return rEGISTRATIONCERTIFICATEFACTORYLICENSE;
    }

    public void setrEGISTRATIONCERTIFICATEFACTORYLICENSE(String rEGISTRATIONCERTIFICATEFACTORYLICENSE) {
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

    public String getsCRUTINYSTATUS() {
        return sCRUTINYSTATUS;
    }

    public void setsCRUTINYSTATUS(String sCRUTINYSTATUS) {
        this.sCRUTINYSTATUS = sCRUTINYSTATUS;
    }

    public String getrECOMMENDEDAONAME() {
        return rECOMMENDEDAONAME;
    }

    public void setrECOMMENDEDAONAME(String rECOMMENDEDAONAME) {
        this.rECOMMENDEDAONAME = rECOMMENDEDAONAME;
    }

    public String getrECOMMENDEDAOID() {
        return rECOMMENDEDAOID;
    }

    public void setrECOMMENDEDAOID(String rECOMMENDEDAOID) {
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

    public String getaOID() {
        return aOID;
    }

    public void setaOID(String aOID) {
        this.aOID = aOID;
    }

    public String getdYCMENAME() {
        return dYCMENAME;
    }

    public void setdYCMENAME(String dYCMENAME) {
        this.dYCMENAME = dYCMENAME;
    }

    public String getdYCMEID() {
        return dYCMEID;
    }

    public void setdYCMEID(String dYCMEID) {
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

    public String getaTTACHMENTOFASSESSMENTREPORT() {
        return aTTACHMENTOFASSESSMENTREPORT;
    }

    public void setaTTACHMENTOFASSESSMENTREPORT(String aTTACHMENTOFASSESSMENTREPORT) {
        this.aTTACHMENTOFASSESSMENTREPORT = aTTACHMENTOFASSESSMENTREPORT;
    }

    public String getaMENAME() {
        return aMENAME;
    }

    public void setaMENAME(String aMENAME) {
        this.aMENAME = aMENAME;
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

    public String getcPLEID() {
        return cPLEID;
    }

    public void setcPLEID(String cPLEID) {
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

    public String getrEMARKBYVENDORFORDEFICIENCY() {
        return rEMARKBYVENDORFORDEFICIENCY;
    }

    public void setrEMARKBYVENDORFORDEFICIENCY(String rEMARKBYVENDORFORDEFICIENCY) {
        this.rEMARKBYVENDORFORDEFICIENCY = rEMARKBYVENDORFORDEFICIENCY;
    }

    public String getdATEOFREMARKBYVENDOR() {
        return dATEOFREMARKBYVENDOR;
    }

    public void setdATEOFREMARKBYVENDOR(String dATEOFREMARKBYVENDOR) {
        this.dATEOFREMARKBYVENDOR = dATEOFREMARKBYVENDOR;
    }

    public String getaTTACHMENTBYVENDOR() {
        return aTTACHMENTBYVENDOR;
    }

    public void setaTTACHMENTBYVENDOR(String aTTACHMENTBYVENDOR) {
        this.aTTACHMENTBYVENDOR = aTTACHMENTBYVENDOR;
    }

    public String getnUMBEROFSUPERVISORYSTAFF() {
        return nUMBEROFSUPERVISORYSTAFF;
    }

    public void setnUMBEROFSUPERVISORYSTAFF(String nUMBEROFSUPERVISORYSTAFF) {
        this.nUMBEROFSUPERVISORYSTAFF = nUMBEROFSUPERVISORYSTAFF;
    }

    public String gettOTALSKILLEDNONSKILLEDSTAFF() {
        return tOTALSKILLEDNONSKILLEDSTAFF;
    }

    public void settOTALSKILLEDNONSKILLEDSTAFF(String tOTALSKILLEDNONSKILLEDSTAFF) {
        this.tOTALSKILLEDNONSKILLEDSTAFF = tOTALSKILLEDNONSKILLEDSTAFF;
    }

    public String getdESIGNATIONOfDyCMM() {
        return dESIGNATIONOfDyCMM;
    }

    public void setdESIGNATIONOfDyCMM(String dESIGNATIONOfDyCMM) {
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

    public String getrEVERTAMEASSESSMENT() {
        return rEVERTAMEASSESSMENT;
    }

    public void setrEVERTAMEASSESSMENT(String rEVERTAMEASSESSMENT) {
        this.rEVERTAMEASSESSMENT = rEVERTAMEASSESSMENT;
    }

    public String getrEVERTDYCMEASSESSMENT() {
        return rEVERTDYCMEASSESSMENT;
    }

    public void setrEVERTDYCMEASSESSMENT(String rEVERTDYCMEASSESSMENT) {
        this.rEVERTDYCMEASSESSMENT = rEVERTDYCMEASSESSMENT;
    }

    public String getrEMARKBYVENDORASSESSMENT() {
        return rEMARKBYVENDORASSESSMENT;
    }

    public void setrEMARKBYVENDORASSESSMENT(String rEMARKBYVENDORASSESSMENT) {
        this.rEMARKBYVENDORASSESSMENT = rEMARKBYVENDORASSESSMENT;
    }

    public String getdATEOFREMARKBYVENDORASSESSMENT() {
        return dATEOFREMARKBYVENDORASSESSMENT;
    }

    public void setdATEOFREMARKBYVENDORASSESSMENT(String dATEOFREMARKBYVENDORASSESSMENT) {
        this.dATEOFREMARKBYVENDORASSESSMENT = dATEOFREMARKBYVENDORASSESSMENT;
    }

    public String getaTTACHMENTBYVENDORASSESSMENT() {
        return aTTACHMENTBYVENDORASSESSMENT;
    }

    public void setaTTACHMENTBYVENDORASSESSMENT(String aTTACHMENTBYVENDORASSESSMENT) {
        this.aTTACHMENTBYVENDORASSESSMENT = aTTACHMENTBYVENDORASSESSMENT;
    }
}
