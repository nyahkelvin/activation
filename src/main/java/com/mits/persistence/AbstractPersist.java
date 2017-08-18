/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mits.persistence;

import gov.za.mits.util.SQLUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mila
 */
public class AbstractPersist {

    public ResultSet getCustomerStatus(String clientName) throws SQLException {
        ResultSet rs = null;
        Connection con = SQLUtil.getConnection();
        try {
            String selectSQL = "SELECT * FROM activation.clients c WHERE c.client  = '" + clientName + "' ";
            PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
            rs = preparedStatement.executeQuery(selectSQL);

        } catch (Exception e) {
            System.out.println("Exception of SQL " + e.toString());
        } finally {
            con.close();
        }
        return rs;
    }
}
