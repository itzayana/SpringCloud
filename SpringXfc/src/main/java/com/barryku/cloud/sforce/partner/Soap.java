package com.barryku.cloud.sforce.partner;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2011-09-11T16:54:21.777-07:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "urn:partner.soap.sforce.com", name = "Soap")
@XmlSeeAlso({ObjectFactory.class})
public interface Soap {

    /**
     * Merge and update a set of sObjects based on object id
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "merge", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.Merge")
    @WebMethod
    @ResponseWrapper(localName = "mergeResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.MergeResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.MergeResult> merge(
        @WebParam(name = "request", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.barryku.cloud.sforce.partner.MergeRequest> request
    ) throws InvalidFieldFault_Exception, InvalidSObjectFault_Exception, InvalidIdFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Returns standard information relevant to the current user
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "getUserInfo", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.GetUserInfo")
    @WebMethod
    @ResponseWrapper(localName = "getUserInfoResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.GetUserInfoResponse")
    public com.barryku.cloud.sforce.partner.GetUserInfoResult getUserInfo() throws UnexpectedErrorFault_Exception;

    /**
     * Describe the layout of the SoftPhone
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeSoftphoneLayout", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeSoftphoneLayout")
    @WebMethod
    @ResponseWrapper(localName = "describeSoftphoneLayoutResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeSoftphoneLayoutResponse")
    public com.barryku.cloud.sforce.partner.DescribeSoftphoneLayoutResult describeSoftphoneLayout() throws UnexpectedErrorFault_Exception;

    /**
     * Update a set of sObjects
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "update", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.Update")
    @WebMethod
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.UpdateResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.SaveResult> update(
        @WebParam(name = "sObjects", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.barryku.cloud.sforce.partner.SObject> sObjects
    ) throws InvalidFieldFault_Exception, InvalidSObjectFault_Exception, InvalidIdFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Set a user's password
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "setPassword", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.SetPassword")
    @WebMethod
    @ResponseWrapper(localName = "setPasswordResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.SetPasswordResponse")
    public com.barryku.cloud.sforce.partner.SetPasswordResult setPassword(
        @WebParam(name = "userId", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String userId,
        @WebParam(name = "password", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String password
    ) throws InvalidNewPasswordFault_Exception, InvalidIdFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Logout the current user, invalidating the current session.
     */
    @RequestWrapper(localName = "logout", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.Logout")
    @WebMethod
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.LogoutResponse")
    public void logout() throws UnexpectedErrorFault_Exception;

    /**
     * Get a set of sObjects
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "retrieve", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.Retrieve")
    @WebMethod
    @ResponseWrapper(localName = "retrieveResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.RetrieveResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.SObject> retrieve(
        @WebParam(name = "fieldList", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String fieldList,
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String sObjectType,
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> ids
    ) throws InvalidFieldFault_Exception, MalformedQueryFault_Exception, InvalidSObjectFault_Exception, InvalidIdFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Create a Query Cursor, including deleted sObjects
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "queryAll", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.QueryAll")
    @WebMethod
    @ResponseWrapper(localName = "queryAllResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.QueryAllResponse")
    public com.barryku.cloud.sforce.partner.QueryResult queryAll(
        @WebParam(name = "queryString", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String queryString
    ) throws InvalidFieldFault_Exception, MalformedQueryFault_Exception, InvalidSObjectFault_Exception, InvalidIdFault_Exception, UnexpectedErrorFault_Exception, InvalidQueryLocatorFault_Exception;

    /**
     * Get the IDs for updated sObjects
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "getUpdated", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.GetUpdated")
    @WebMethod
    @ResponseWrapper(localName = "getUpdatedResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.GetUpdatedResponse")
    public com.barryku.cloud.sforce.partner.GetUpdatedResult getUpdated(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String sObjectType,
        @WebParam(name = "startDate", targetNamespace = "urn:partner.soap.sforce.com")
        javax.xml.datatype.XMLGregorianCalendar startDate,
        @WebParam(name = "endDate", targetNamespace = "urn:partner.soap.sforce.com")
        javax.xml.datatype.XMLGregorianCalendar endDate
    ) throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Undelete a set of sObjects
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "undelete", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.Undelete")
    @WebMethod
    @ResponseWrapper(localName = "undeleteResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.UndeleteResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.UndeleteResult> undelete(
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> ids
    ) throws UnexpectedErrorFault_Exception;

    /**
     * Create a set of new sObjects
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "create", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.Create")
    @WebMethod
    @ResponseWrapper(localName = "createResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.CreateResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.SaveResult> create(
        @WebParam(name = "sObjects", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.barryku.cloud.sforce.partner.SObject> sObjects
    ) throws InvalidFieldFault_Exception, InvalidSObjectFault_Exception, InvalidIdFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Send outbound email
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "sendEmail", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.SendEmail")
    @WebMethod
    @ResponseWrapper(localName = "sendEmailResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.SendEmailResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.SendEmailResult> sendEmail(
        @WebParam(name = "messages", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.barryku.cloud.sforce.partner.Email> messages
    ) throws UnexpectedErrorFault_Exception;

    /**
     * Search for sObjects
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "search", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.Search")
    @WebMethod
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.SearchResponse")
    public com.barryku.cloud.sforce.partner.SearchResult search(
        @WebParam(name = "searchString", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String searchString
    ) throws InvalidFieldFault_Exception, InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception, MalformedSearchFault_Exception;

    /**
     * Create a Query Cursor
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "query", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.Query")
    @WebMethod
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.QueryResponse")
    public com.barryku.cloud.sforce.partner.QueryResult query(
        @WebParam(name = "queryString", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String queryString
    ) throws InvalidFieldFault_Exception, MalformedQueryFault_Exception, InvalidSObjectFault_Exception, InvalidIdFault_Exception, UnexpectedErrorFault_Exception, InvalidQueryLocatorFault_Exception;

    /**
     * Get the IDs for deleted sObjects
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "getDeleted", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.GetDeleted")
    @WebMethod
    @ResponseWrapper(localName = "getDeletedResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.GetDeletedResponse")
    public com.barryku.cloud.sforce.partner.GetDeletedResult getDeleted(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String sObjectType,
        @WebParam(name = "startDate", targetNamespace = "urn:partner.soap.sforce.com")
        javax.xml.datatype.XMLGregorianCalendar startDate,
        @WebParam(name = "endDate", targetNamespace = "urn:partner.soap.sforce.com")
        javax.xml.datatype.XMLGregorianCalendar endDate
    ) throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Submit an entity to a workflow process or process a workitem
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "process", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.Process")
    @WebMethod
    @ResponseWrapper(localName = "processResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.ProcessResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.ProcessResult> process(
        @WebParam(name = "actions", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.barryku.cloud.sforce.partner.ProcessRequest> actions
    ) throws InvalidIdFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Describe the data category group structures for a given set of pair of types and data category group name
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeDataCategoryGroupStructures", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeDataCategoryGroupStructures")
    @WebMethod
    @ResponseWrapper(localName = "describeDataCategoryGroupStructuresResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeDataCategoryGroupStructuresResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.DescribeDataCategoryGroupStructureResult> describeDataCategoryGroupStructures(
        @WebParam(name = "pairs", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.barryku.cloud.sforce.partner.DataCategoryGroupSobjectTypePair> pairs,
        @WebParam(name = "topCategoriesOnly", targetNamespace = "urn:partner.soap.sforce.com")
        boolean topCategoriesOnly
    ) throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Reset a user's password
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "resetPassword", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.ResetPassword")
    @WebMethod
    @ResponseWrapper(localName = "resetPasswordResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.ResetPasswordResponse")
    public com.barryku.cloud.sforce.partner.ResetPasswordResult resetPassword(
        @WebParam(name = "userId", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String userId
    ) throws InvalidIdFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Describe the Global state
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeGlobal", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeGlobal")
    @WebMethod
    @ResponseWrapper(localName = "describeGlobalResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeGlobalResponse")
    public com.barryku.cloud.sforce.partner.DescribeGlobalResult describeGlobal() throws UnexpectedErrorFault_Exception;

    /**
     * Describe the layout of an sObject
     */
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "describeLayoutResponse", targetNamespace = "urn:partner.soap.sforce.com", partName = "parameters")
    @WebMethod
    public DescribeLayoutResponse describeLayout(
        @WebParam(partName = "parameters", name = "describeLayout2", targetNamespace = "urn:partner.soap.sforce.com")
        DescribeLayout2 parameters
    ) throws InvalidSObjectFault_Exception, InvalidIdFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Describe the tabs that appear on a users page
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeTabs", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeTabs")
    @WebMethod
    @ResponseWrapper(localName = "describeTabsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeTabsResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.DescribeTabSetResult> describeTabs() throws UnexpectedErrorFault_Exception;

    /**
     * Describe all the data category groups available for a given set of types
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeDataCategoryGroups", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeDataCategoryGroups")
    @WebMethod
    @ResponseWrapper(localName = "describeDataCategoryGroupsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeDataCategoryGroupsResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.DescribeDataCategoryGroupResult> describeDataCategoryGroups(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> sObjectType
    ) throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Gets server timestamp
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "getServerTimestamp", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.GetServerTimestamp")
    @WebMethod
    @ResponseWrapper(localName = "getServerTimestampResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.GetServerTimestampResponse")
    public com.barryku.cloud.sforce.partner.GetServerTimestampResult getServerTimestamp() throws UnexpectedErrorFault_Exception;

    /**
     * Logs out and invalidates session ids
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "invalidateSessions", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.InvalidateSessions")
    @WebMethod
    @ResponseWrapper(localName = "invalidateSessionsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.InvalidateSessionsResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.InvalidateSessionsResult> invalidateSessions(
        @WebParam(name = "sessionIds", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> sessionIds
    ) throws UnexpectedErrorFault_Exception;

    /**
     * Describe an sObject
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeSObject", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeSObject")
    @WebMethod
    @ResponseWrapper(localName = "describeSObjectResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeSObjectResponse")
    public com.barryku.cloud.sforce.partner.DescribeSObjectResult describeSObject(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String sObjectType
    ) throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Login to the Salesforce.com SOAP Api
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "login", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.Login")
    @WebMethod
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.LoginResponse")
    public com.barryku.cloud.sforce.partner.LoginResult login(
        @WebParam(name = "username", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String username,
        @WebParam(name = "password", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String password
    ) throws LoginFault_Exception, InvalidIdFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Gets the next batch of sObjects from a query
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "queryMore", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.QueryMore")
    @WebMethod
    @ResponseWrapper(localName = "queryMoreResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.QueryMoreResponse")
    public com.barryku.cloud.sforce.partner.QueryResult queryMore(
        @WebParam(name = "queryLocator", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String queryLocator
    ) throws InvalidFieldFault_Exception, UnexpectedErrorFault_Exception, InvalidQueryLocatorFault_Exception;

    /**
     * Describe a number sObjects
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "describeSObjects", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeSObjects")
    @WebMethod
    @ResponseWrapper(localName = "describeSObjectsResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DescribeSObjectsResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.DescribeSObjectResult> describeSObjects(
        @WebParam(name = "sObjectType", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> sObjectType
    ) throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * Empty a set of sObjects from the recycle bin
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "emptyRecycleBin", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.EmptyRecycleBin")
    @WebMethod
    @ResponseWrapper(localName = "emptyRecycleBinResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.EmptyRecycleBinResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.EmptyRecycleBinResult> emptyRecycleBin(
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> ids
    ) throws UnexpectedErrorFault_Exception;

    /**
     * Update or insert a set of sObjects based on object id
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "upsert", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.Upsert")
    @WebMethod
    @ResponseWrapper(localName = "upsertResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.UpsertResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.UpsertResult> upsert(
        @WebParam(name = "externalIDFieldName", targetNamespace = "urn:partner.soap.sforce.com")
        java.lang.String externalIDFieldName,
        @WebParam(name = "sObjects", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.barryku.cloud.sforce.partner.SObject> sObjects
    ) throws InvalidFieldFault_Exception, InvalidSObjectFault_Exception, InvalidIdFault_Exception, UnexpectedErrorFault_Exception;

    /**
     * convert a set of leads
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "convertLead", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.ConvertLead")
    @WebMethod
    @ResponseWrapper(localName = "convertLeadResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.ConvertLeadResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.LeadConvertResult> convertLead(
        @WebParam(name = "leadConverts", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<com.barryku.cloud.sforce.partner.LeadConvert> leadConverts
    ) throws UnexpectedErrorFault_Exception;

    /**
     * Delete a set of sObjects
     */
    @WebResult(name = "result", targetNamespace = "urn:partner.soap.sforce.com")
    @RequestWrapper(localName = "delete", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.Delete")
    @WebMethod
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "urn:partner.soap.sforce.com", className = "com.barryku.cloud.sforce.partner.DeleteResponse")
    public java.util.List<com.barryku.cloud.sforce.partner.DeleteResult> delete(
        @WebParam(name = "ids", targetNamespace = "urn:partner.soap.sforce.com")
        java.util.List<java.lang.String> ids
    ) throws UnexpectedErrorFault_Exception;
}
