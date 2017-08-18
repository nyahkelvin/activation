/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mits.domain;

/**
 *
 * @author mila
 */
public class USSDIncident {
    
    private String title;
    private String name;
    private String surname;
    private String cellNumber;
    private String incidentType;
    private String incidentTypeCategory;
    private String incedentServiceType;
    private String complaintDetails;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getIncidentTypeCategory() {
        return incidentTypeCategory;
    }

    public void setIncidentTypeCategory(String incidentTypeCategory) {
        this.incidentTypeCategory = incidentTypeCategory;
    }

    public String getIncedentServiceType() {
        return incedentServiceType;
    }

    public void setIncedentServiceType(String incedentServiceType) {
        this.incedentServiceType = incedentServiceType;
    }

    public String getComplaintDetails() {
        return complaintDetails;
    }

    public void setComplaintDetails(String complaintDetails) {
        this.complaintDetails = complaintDetails;
    }
    
    
}
