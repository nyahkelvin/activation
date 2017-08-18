/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.za.mits.util;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author mila
 */
public final class SQLUtil {

    private static DataSource dataSource;    

    static {
        try {
            dataSource = (DataSource) new InitialContext().lookup("jdcb/activation");
        } catch (NamingException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    public static void closeConnection() throws SQLException {
        dataSource.getConnection().close();
    }
}
