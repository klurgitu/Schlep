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

    public abstract int createObject(Map<String, String> _keyValuePair, String _table);

    public abstract HashMap<String, Object> readObject(Map<String, String> _keyValuePair, String _table);

    public abstract Boolean updateObject(Map<String, String> _keyValuePair, String _uuid, String _table);

    public abstract Boolean deleteObject(String _uuid);
}
