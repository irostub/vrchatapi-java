/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.3.3
 * Contact: me@ruby.js.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.api;

import io.github.vrchatapi.ApiCallback;
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.ApiResponse;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.Pair;
import io.github.vrchatapi.ProgressRequestBody;
import io.github.vrchatapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.github.vrchatapi.model.Config;
import io.github.vrchatapi.model.InlineResponse2002;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemApi {
    private ApiClient localVarApiClient;

    public SystemApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SystemApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getConfig
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Set-Cookie -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getConfigCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/config";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConfigValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getConfigCall(_callback);
        return localVarCall;

    }

    /**
     * Fetch API Config
     * API config contains configuration that the clients needs to work properly.  Currently the most important value here is &#x60;clientApiKey&#x60; which is used for all other API endpoints.
     * @return Config
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Set-Cookie -  <br>  </td></tr>
     </table>
     */
    public Config getConfig() throws ApiException {
        ApiResponse<Config> localVarResp = getConfigWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Fetch API Config
     * API config contains configuration that the clients needs to work properly.  Currently the most important value here is &#x60;clientApiKey&#x60; which is used for all other API endpoints.
     * @return ApiResponse&lt;Config&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Set-Cookie -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<Config> getConfigWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getConfigValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Config>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch API Config (asynchronously)
     * API config contains configuration that the clients needs to work properly.  Currently the most important value here is &#x60;clientApiKey&#x60; which is used for all other API endpoints.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Set-Cookie -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getConfigAsync(final ApiCallback<Config> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConfigValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Config>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCurrentOnlineUsers
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCurrentOnlineUsersCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/visits";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCurrentOnlineUsersValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getCurrentOnlineUsersCall(_callback);
        return localVarCall;

    }

    /**
     * Current Online Users
     * Returns in plain format the number of currently online users.  **NOTE:** The response type is not of JSON, but is an integer in plain ASCII format.
     * @return Integer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Integer getCurrentOnlineUsers() throws ApiException {
        ApiResponse<Integer> localVarResp = getCurrentOnlineUsersWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Current Online Users
     * Returns in plain format the number of currently online users.  **NOTE:** The response type is not of JSON, but is an integer in plain ASCII format.
     * @return ApiResponse&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Integer> getCurrentOnlineUsersWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getCurrentOnlineUsersValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Current Online Users (asynchronously)
     * Returns in plain format the number of currently online users.  **NOTE:** The response type is not of JSON, but is an integer in plain ASCII format.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCurrentOnlineUsersAsync(final ApiCallback<Integer> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCurrentOnlineUsersValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getHealth
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> API&#39;s Health </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHealthCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/health";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHealthValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getHealthCall(_callback);
        return localVarCall;

    }

    /**
     * Check API Health
     * Gets the overall health status, the server name, and the current build version tag of the API.
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> API&#39;s Health </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2002 getHealth() throws ApiException {
        ApiResponse<InlineResponse2002> localVarResp = getHealthWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Check API Health
     * Gets the overall health status, the server name, and the current build version tag of the API.
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> API&#39;s Health </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2002> getHealthWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getHealthValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check API Health (asynchronously)
     * Gets the overall health status, the server name, and the current build version tag of the API.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> API&#39;s Health </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHealthAsync(final ApiCallback<InlineResponse2002> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHealthValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSystemTime
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSystemTimeCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/time";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSystemTimeValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSystemTimeCall(_callback);
        return localVarCall;

    }

    /**
     * Current System Time
     * Returns in plain format the current time of the API server.  **NOTE:** The response type is not of JSON, but is a string in plain ASCII format.
     * @return OffsetDateTime
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public OffsetDateTime getSystemTime() throws ApiException {
        ApiResponse<OffsetDateTime> localVarResp = getSystemTimeWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Current System Time
     * Returns in plain format the current time of the API server.  **NOTE:** The response type is not of JSON, but is a string in plain ASCII format.
     * @return ApiResponse&lt;OffsetDateTime&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OffsetDateTime> getSystemTimeWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSystemTimeValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<OffsetDateTime>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Current System Time (asynchronously)
     * Returns in plain format the current time of the API server.  **NOTE:** The response type is not of JSON, but is a string in plain ASCII format.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSystemTimeAsync(final ApiCallback<OffsetDateTime> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSystemTimeValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<OffsetDateTime>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
