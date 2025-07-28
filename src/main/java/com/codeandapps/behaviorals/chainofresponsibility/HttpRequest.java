package com.codeandapps.behaviorals.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private Map<String, String> headers;
    private Map<String, Object> attributes;
    private String body;

    public HttpRequest() {
        headers= new HashMap<String, String>();
        attributes= new HashMap<String, Object>();
        body = "";
    }

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    public void setAttribute(String key, Object value) {
        attributes.put(key, value);
    }

    public Object getAttribute(String key) {
        return attributes.get(key);
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
