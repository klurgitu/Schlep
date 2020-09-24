package API;
/**
 * This is a BaseAPI Class for our Country, State, City API
 * @author Katelynn Urgitus
 * Last Updated 09/24/2020
 */
public class BaseAddressAPIClass {
    protected final static CountryStateCityAPIInterface universalAPI = new UniversalTutorialAPITranslator();
}
