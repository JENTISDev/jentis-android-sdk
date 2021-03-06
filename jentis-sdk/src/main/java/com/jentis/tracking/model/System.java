package com.jentis.tracking.model;

import androidx.annotation.RestrictTo;

import com.google.gson.JsonObject;
import com.jentis.tracking.Utils;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

@RestrictTo(RestrictTo.Scope.LIBRARY)
public class System {
    String environment, navigatorUserAgent, href;
    Map<String, Boolean> consent;

    public System() {}

    public System(String environment, String navigatorUserAgent, String href, Map<String, Boolean> consent) {
        setEnvironment(environment);
        setNavigatorUserAgent(navigatorUserAgent);
        setHref(href);
        setConsent(consent);
    }

    public JsonObject toJSON() {
        JsonObject jsonObject= new JsonObject();
        jsonObject.addProperty("environment", getEnvironment());
        jsonObject.addProperty("navigator-userAgent", getNavigatorUserAgent());
        jsonObject.addProperty("href", getHref());
        if(getConsent() != null){
            jsonObject.add("consent", Utils.hashMapToJsonObjectBoolean(getConsent()));
        }

        return jsonObject;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getNavigatorUserAgent() {
        return navigatorUserAgent;
    }

    public void setNavigatorUserAgent(String navigatorUserAgent) {
        this.navigatorUserAgent = navigatorUserAgent;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Map<String, Boolean> getConsent() {
        return consent;
    }

    public void setConsent(Map<String, Boolean> consent) {
        this.consent = consent;
    }
}
