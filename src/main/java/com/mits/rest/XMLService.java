package com.mits.rest;

import com.mits.domain.Customer;
import com.mits.persistence.AbstractPersist;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.QueryParam;

@Path("/xml/client")
public class XMLService {

    @GET
    @Path("/query")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer checkCustomerActivation(@QueryParam("companyName") String companyName) throws SQLException {
        //http://158.69.199.58:8080/activation/rest/xml/client/query?companyName=someCompanyName 

        Customer cust = new Customer();
        if (companyName != null) {
            cust = companyStatus(companyName);
        }
        return cust;

    }

    public Customer companyStatus(String companyName) {
        System.out.println("Company Name: " + companyName);
        AbstractPersist af = new AbstractPersist();
        Customer customer = new Customer();
        
        try (ResultSet rs = af.getCustomerStatus(companyName)) {
            while (rs.next()) {
                customer.setClient(rs.getString("client"));
                customer.setStatus(rs.getBoolean("status"));
            }

        } catch (Exception e) {
            System.out.println("Get company status error: " + e.getMessage());
        }

        return customer;
    }

}
