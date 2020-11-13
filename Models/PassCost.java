/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author josiah Stadler
 * @ last updated: 11/12/20,11/13
 * This class sets details for each bid from a driver to transport an item
 */
public class PassCost {
    protected String driverName; 
    protected String rating;
    protected double distance;
    protected double ratePerMile;
    protected double rateOfSpeed;
    protected double baseCost;
    protected double instDeliveryCost;
    protected double assistCost;
    protected double assitanceTime;
    protected double eta;
    private final double tax = 1.067;
    private final double costPerMile = .55;
    protected double assistanceWage;    
   
    protected double total;// = (baseCost + instDeliveryCost + assistCost) * tax ;
    
    
    public PassCost(){
        
    }
    public PassCost(String _name, String _rating, double _distance, double _speed, double _instant, double _time) {
        this.driverName = _name;
        this.rating = _rating;
        this.distance = _distance;
       //this.ratePerMile = _ratePerMile;
        this.rateOfSpeed = _speed;
        this.baseCost = _distance * costPerMile;
        this.instDeliveryCost =_instant;
        this.assistCost = assistanceWage *_time;
        //this.eta = (_distance / _speed);
        this.total = (baseCost + _instant + assistCost)* tax;
        
    }

    public double getAssistanceWage() {
        return 15.00;
    }

    public double getAssitanceTime() {
        return assitanceTime;
    }

    public void setAssitanceTime(double assitanceTime) {
        this.assitanceTime = assitanceTime;
    }

    public double getEta() {
        this.eta = this.distance/ this.rateOfSpeed;
        return this.eta;
    }

    public void setEta(double eta) {
        this.eta = eta;
    }
    

    @Override
    public String toString() {
        return "Thank you for using Schlep!\n"
                + "Your Schlepper, " + this.driverName +" is currently " + this.distance
                + " from your location, and should be there in approximately "+ 
               this.eta + ".\n" + 
               "We will call you when your Schlepper is 30 minutes away\n" +
               "Your total cost is: " + this.total;
    }  
    
    public double calcCost(){
        this.total = (this.baseCost + this.instDeliveryCost + this.assistCost)* tax;
        return this.total;
    }

    //=================================== GETTERS ==================================//
    public String getDriverName() {
        return driverName;
    }
    public String getRating() {
        return rating;
    }
     public double getDistance() {
        return distance;
    }
     public double getRatePerMile() {
        return ratePerMile;
    }
      public double getRateOfSpeed() {
        return rateOfSpeed;
    }
    
    public double getBaseCost() {
        return baseCost;
    }
     public double getInstDeliveryCost() {
        return instDeliveryCost;
    }
      public double getAssistCost() {
        return assistCost;
    }
      public double getTotal() {
          this.total = (this.baseCost + this.instDeliveryCost + this.assistCost)* tax;
          return total;
    }
    //=========================== SETTERS =====================================   
     public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    

    public void setRating(String rating) {
        this.rating = rating;
    }

   

    public void setDistance(double distance) {
        this.distance = distance;
    }

    

    public void setRatePerMile(double ratePerMile) {
        this.ratePerMile = ratePerMile;
    }

   

    public void setRateOfSpeed(double rateOfSpeed) {
        this.rateOfSpeed = rateOfSpeed;
    }
    
    public void setBaseCost(double _baseCost) {
        this.baseCost = _baseCost;
    }

   

    public void setInstDeliveryCost(double _instDeliveryCost) {
        this.instDeliveryCost = _instDeliveryCost;
    }

   

    public void setAssistCost(double _assistCost) {
        this.assistCost = _assistCost;
    }

   

    public void setTotal(double _total) {
        this.total = _total;
    }
    
    
}
