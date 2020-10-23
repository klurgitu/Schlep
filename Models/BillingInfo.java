
package Models;

/**
 *This is the model for the billing controller.
 * It fetches user entered credit card data and saves it to the database.
 * @author Josiah Stadler
 * Last updated: 10/23/20
 */
public class BillingInfo extends DB.DataObject {
    private String firstName;
    private String lastName; 
    private String creditCardNum;
    private String expDate;
    private String ccv;
    
    public BillingInfo(){
        
    }
    
    public BillingInfo(String _fName, String _lName, String _cCardNum, String _expDate, String _ccv ){
        this.firstName = _fName;
        this.lastName = _lName;
        this.creditCardNum  = _cCardNum;
        this.expDate = _expDate;
        this.ccv = _ccv;
    }
 //============================= GETTERS ===============================   
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
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
    //=================== Setters ============================================

    /**
     * @param _firstName the firstName to set
     */
    public void setFirstName(String _fName) {
        this.firstName = _fName;
    }

    

    /**
     * @param _lastName the lastName to set
     */
    public void setLastName(String _lName) {
        this.lastName = _lName;
    }

    

    /**
     * @param _creditCardNum the creditCardNum to set
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
