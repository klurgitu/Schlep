package Models;

import DB.MySQLConnector;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * This is the model for the billing controller. It fetches user entered credit
 * card data and saves it to the database.
 *
 * @author Josiah Stadler 
 * Last updated: 10/23/20
 * Last updated: 11/4/20
 */
public class BillingInfo extends DB.DataObject {

    private String name;   
    private String creditCardNum;
    private String expDate;
    private String ccv;
    private String uuid;
    protected final static BillingInfo apiListener = new BillingInfo();
    private final static MySQLConnector con = new MySQLConnector();

    public BillingInfo() {

    }

    public BillingInfo(String _name,  String _cCardNum, String _expDate, String _ccv) throws SQLException {
        this.name = _name;
        this.creditCardNum = _cCardNum;
        this.expDate = _expDate;
        this.ccv = _ccv;
        this.uuid = SchlepUser.connectUUID();
        saveBillingInfo();
        updateBillingInfo();
    }
    /***
     * 
     * @throws SQLException 
     */
    private void saveBillingInfo() throws SQLException {
        HashMap<String, String> pairs = new HashMap();
        pairs.put("name",this.getName());        
        pairs.put("creditcardNum", this.getCreditCardNum());
        pairs.put("expDate",this.getExpDate());
        pairs.put("ccv", this.getCcv());
        con.createObject(pairs,"BillingInfo");       
    }
    private void updateBillingInfo() {
        HashMap<String, String> map = new HashMap();
        map.put("card_id", "card.UUID");
        con.updateObject(map, this.getUUID(),"user", "BillingInfo");
    }
    //============================= GETTERS ===============================

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the creditCardNum
     */
    public String getCreditCardNum() {
        return creditCardNum;
    }

    /**
     * @return the expDate
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * @return the ccv
     */
    public String getCcv() {
        return ccv;
    }
    public String getUUID() {
        return uuid;
    }
    //=================== Setters ============================================

    /**
     * @param _name the Name to set
     */
    public void setName(String _name) {
        this.name = _name;
    }

    /**
     * @param _cCardNum the creditCardNum to set
     */
    public void setCreditCardNum(String _cCardNum) {
        this.creditCardNum = _cCardNum;
    }

    /**
     * @param _expDate the expDate to set
     */
    public void setExpDate(String _expDate) {
        this.expDate = _expDate;
    }

    /**
     * @param _ccv the ccv to set
     */
    public void setCcv(String _ccv) {
        this.ccv = _ccv;
    }

}
