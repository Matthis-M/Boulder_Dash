package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @author Vincent PASQUET & Matthis MOYON
 * @version 2.0
 */
public abstract class EntityDAO extends AbstractDAO {

    /** The sql example by id. */
    private static String sqlGetMap   = "{call GetMap(?)}";
	final static int[][]DBMap = new int[20][20];
    
    public static void GenerateDBMap(final int chosenLevel) throws SQLException {

    	
        final CallableStatement callStatement = prepareCall(sqlGetMap);
        
        callStatement.setInt(1, chosenLevel);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            
            
            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) 
            {
            	int X = result.getInt(3);
            	int Y = result.getInt(2);
            	int ido = result.getInt(4);
            	
            	DBMap[Y][X] = ido;
            }
            result.close();
        }
    }
    
    /**
     * Getter of the DB int MAP.
     * @return The DBMap.
     */
    public static int[][] getDBMap() {
    	return DBMap;
    }
    
    /**
     * The getter of the int placed at a precise position in the DBMap.
     * @param Y
     * @param X
     * @return
     */
    public static int checkIntDBMap(int Y, int X) {
    	return DBMap[Y][X];
    }
}