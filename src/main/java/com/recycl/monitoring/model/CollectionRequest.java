package com.recycl.monitoring.model;

import java.util.Date;
import java.util.Vector;

public class CollectionRequest {
    private int id;
    private Company company;
    private WasteCollection wasteCollection;
    private Date requestDate;
    private Date collectionDate;
    private Vector<RequestDetails> requestDetails;
}
