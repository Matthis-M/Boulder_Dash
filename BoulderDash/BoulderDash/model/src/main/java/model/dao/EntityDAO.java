package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Entity;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class EntityDAO extends AbstractDAO {

    /** The sql example by id. */
    private static String sqlGetMap   = "{call GetMap(?)}";
    
    
    public static int[][] GetMap(final int Level) throws SQLException {
    	final int[][]BDD = new int[20][20];
    	
        final CallableStatement callStatement = prepareCall(sqlGetMap);
        
        callStatement.setInt(1, Level);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            
            
            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) 
            {
            	int X = result.getInt(1);
            	int Y = result.getInt(2);
            	int ido = result.getInt(3);
            	
            	BDD[Y][X] = ido;
            	System.out.println(ido);
            }
            result.close();
        }
        return BDD;
    }
}