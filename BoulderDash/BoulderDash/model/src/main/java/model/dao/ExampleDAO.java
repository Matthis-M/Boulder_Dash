package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ExampleDAO extends AbstractDAO {

    /** The sql example by id. */
    private static String sqlGetMap   = "{call GetMap(?)}";

    
    public static int[][] GetMap(final int Level) throws SQLException {
    	final int[][]BDD = new int[20][20];
    	
        final CallableStatement callStatement = prepareCall(sqlGetMap);
        Example example = null;
        

        callStatement.setInt(1, Level);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            
            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) 
            {
            	int x = result.getInt(1);
            	int y = result.getInt(2);
            	int ido = result.getInt(3);
            	
            	BDD[x][y] = ido;
            			
            }
            result.close();
        }
        return BDD;
    }
}