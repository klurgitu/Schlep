package DB;

/**
 * The Database Interface to implement the CRUD operations that allow us to
 * use any database
 * @author Katelynn Urgitus
 * Last Updated: 10/08/2020
 */

import java.util.HashMap;
import java.util.Map;

public interface DBConnectorInterface {

    public abstract int createObject(Map<String, String> keyValuePair, String table);

    public abstract HashMap<String, Object> readObject(Map<String, String> keyValuePair, String table);

    public abstract Boolean updateObject(Map<String, String> keyValuePair, String uuid, String table);

    public abstract Boolean deleteObject(String uuid);
}
