package com.mits.domain;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "request")
public class Customer {

    private String client;
    private boolean status;
    

    @XmlElement(name = "client")
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @XmlElement(name = "status")
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

 
    

    @Override
    public String toString() {
        return client;
    }

    public boolean isEmpty() {
        return client != null && !client.equalsIgnoreCase("");
    }
}
