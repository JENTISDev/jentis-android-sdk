package com.jentis.tracking.sdk.model;

import com.google.gson.JsonObject;

public class Client {
    Long clientTimestamp;
    String domain = "";

    public Client() {}

    public Client(Long clientTimestamp, String domain) {
        this.clientTimestamp = clientTimestamp;
        this.domain = domain;
    }

    public Long getClientTimestamp() {
        return clientTimestamp;
    }

    public String getDomain() {
        return domain;
    }

    public void setClientTimestamp(Long clientTimestamp) {
        this.clientTimestamp = clientTimestamp;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public JsonObject toJSON() {
        JsonObject jsonObject= new JsonObject();
        jsonObject.addProperty("clientTimestamp", getClientTimestamp());
        jsonObject.addProperty("domain", getDomain());

        return jsonObject;
    }
}
