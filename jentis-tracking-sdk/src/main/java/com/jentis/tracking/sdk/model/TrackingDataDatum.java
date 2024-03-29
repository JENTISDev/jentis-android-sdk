package com.jentis.tracking.sdk.model;

import android.util.Log;

import com.google.gson.JsonObject;
import com.jentis.tracking.sdk.JentisUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrackingDataDatum {

    String id;
    String action;
    String account;
    String documentType = null;
    Property property = new Property();
    System system = null;
    Aggr aggr = new Aggr();
    Parent parent = new Parent();
    String pluginid = null;

    Map<String, ArrayList<Object>> product = new HashMap<>();
    int productCount;

    public TrackingDataDatum() {
    }

    public TrackingDataDatum(String id, String action, String account, String documentType, Property property, System system, Aggr aggr, Parent parent, String pluginid) {
        this.id = id;
        this.action = action;
        this.account = account;
        this.documentType = documentType;
        this.property = property; //?? Property()
        this.system = system;
        this.aggr = aggr; //?? Aggr()
        this.parent = parent; //?? Parent()
        this.pluginid = pluginid;
    }


    public String getId() {
        return id;
    }

    public String getAction() {
        return action;
    }

    public String getAccount() {
        return account;
    }

    public String getDocumentType() {
        return documentType;
    }

    public Property getProperty() {
        return property;
    }

    public System getSystem() {
        return system;
    }

    public Aggr getAggr() {
        return aggr;
    }

    public Parent getParent() {
        return parent;
    }

    public String getPluginid() {
        return pluginid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public void setAggr(Aggr aggr) {
        this.aggr = aggr;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void setPluginid(String pluginid) {
        this.pluginid = pluginid;
    }

    public void setProduct(Map<String, ArrayList<Object>> product) {
        this.product = product;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getProductCount() {
        return productCount;
    }

    public Map<String, ArrayList<Object>> getProduct() {
        return product;
    }

    public JsonObject toJSON() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("_id", getId());
        jsonObject.addProperty("action", getAction());
        jsonObject.addProperty("account", getAccount());
        jsonObject.addProperty("documentType", getDocumentType());
        if (getProperty() != null) {
            jsonObject.add("property", getProperty().toJSON(getProductCount(), getProduct()));
        }

        if (getSystem() != null) {
            jsonObject.add("system", getSystem().toJSON());
        }

        if (getAggr() != null) {
            jsonObject.add("aggr", getAggr().toJSON());
        }
        if (getParent() != null) {
            jsonObject.add("parent", getParent().toJSON());
        }
        if (getPluginid() != null)
            jsonObject.addProperty("pluginid", getPluginid());

        return jsonObject;
    }
}
