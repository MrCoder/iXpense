package com.tw.gae.ixpense;

import com.google.apphosting.api.ApiProxy;

import java.util.Map;

public class TestEnv implements ApiProxy.Environment {
    public String getAppId() {
        return "Unit Tests";
    }

    public String getVersionId() {
        return "1.0";
    }

    public void setDefaultNamespace(String s) {
    }

    public String getRequestNamespace() {
        return null;
    }

    public Map<String, Object> getAttributes() {
        return null;
    }

    public String getDefaultNamespace() {
        return null;
    }

    public String getAuthDomain() {
        return null;
    }

    public boolean isLoggedIn() {
        return false;
    }

    public String getEmail() {
        return null;
    }

    public boolean isAdmin() {
        return false;
    }
}
