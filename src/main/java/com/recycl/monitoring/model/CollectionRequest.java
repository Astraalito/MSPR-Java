package com.recycl.monitoring.model;

import sun.misc.Request;

import java.util.Date;
import java.util.Vector;

// TODO: Tester fonctionnement requêtes MyBatis

public class CollectionRequest {
    private int id;
    private Company company;
    private WasteCollection wasteCollection;
    private Date requestDate;
    private Date collectionDate;
    private Vector<RequestDetails> requestDetails;
    private boolean isValid;

    public CollectionRequest(int id, Company company, WasteCollection wasteCollection, Date requestDate, Date collectionDate, Vector<RequestDetails> requestDetails, boolean isValid) {
        super();
        this.id = id;
        this.company = company;
        this.wasteCollection = wasteCollection;
        this.requestDate = requestDate;
        this.collectionDate = collectionDate;
        this.requestDetails = requestDetails;
        this.isValid = isValid;
    }

    public CollectionRequest() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public WasteCollection getWasteCollection() {
        return wasteCollection;
    }

    public void setWasteCollection(WasteCollection wasteCollection) {
        this.wasteCollection = wasteCollection;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public Vector<RequestDetails> getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(Vector<RequestDetails> requestDetails) {
        this.requestDetails = requestDetails;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
