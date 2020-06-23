package com.recycl.monitoring.model;

import java.util.Vector;

public class Company {
    private int id;
    private String siret;
    private String name;
    private Vector<CollectionRequest> collectionRequests;

    public Company(int id, String siret, String name, Vector<CollectionRequest> collectionRequests) {
        super();
        this.id = id;
        this.siret = siret;
        this.name = name;
        this.collectionRequests = collectionRequests;
    }

    public Company() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<CollectionRequest> getCollectionRequests() {
        return collectionRequests;
    }

    public void setCollectionRequests(Vector<CollectionRequest> collectionRequests) {
        this.collectionRequests = collectionRequests;
    }
}
