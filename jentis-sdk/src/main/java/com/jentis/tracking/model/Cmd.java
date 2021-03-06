package com.jentis.tracking.model;

import androidx.annotation.RestrictTo;

import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo(RestrictTo.Scope.LIBRARY)
public class Cmd {
    String key;
    CmdDatum[] data;

    public String getKey() {
        return key;
    }

    public CmdDatum[] getData() {
        return data;
    }

    public Cmd() {}

    public Cmd(String key, CmdDatum[] data) {
        this.key = key;
        this.data = data;
    }

    public JsonObject toJSON() {
        JsonObject jsonObject= new JsonObject();
        jsonObject.addProperty("key", getKey());
        if(data != null) {
            jsonObject.addProperty("data", data.toString());
        }

        return jsonObject;
    }
}