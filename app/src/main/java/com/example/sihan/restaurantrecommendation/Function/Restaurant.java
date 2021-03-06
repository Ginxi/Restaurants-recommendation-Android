package com.example.sihan.restaurantrecommendation.Function;


import java.io.Serializable;

/**
 * Write a description of Restaurant here.
 * 
 * @di.yao_1301853 (your name) 
 * @version (a version number or a date)
 */
public class Restaurant implements Serializable{
    private String id;
    private String title;
    private int averageSpent;
    private String categories;
    private double environmentScore;
    private double serviceScore;
    private double flavorScore;
    private String phoneNumber;
    private String address;
    private int distance;
    
    public Restaurant(String anID, String aTitle, int anAverageSpent, String aCategories, 
                      double anEnvironmentScore, double aServiceScore, double aFlavorScore, String 
                      aPhoneNumber, String anAddress, int aDistance){
        id = anID.trim();
        title = aTitle.trim();
        averageSpent = anAverageSpent;
        categories = aCategories.trim();
        environmentScore = anEnvironmentScore;
        serviceScore = aServiceScore;
        flavorScore = aFlavorScore;
        phoneNumber = aPhoneNumber.trim();
        address = anAddress.trim();
        distance = aDistance;
    }
    
    public String getID(){
        return id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getAverageSpent(){
        return averageSpent;
    }
    
    public String getCategories(){
        return categories;
    }
    
    public double getEnvironmentScore(){
        return environmentScore;
    }
    
    public double getServiceScore(){
        return serviceScore;
    }

    public double getFlavorScore(){
        return flavorScore;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getDistance(){
        return distance;
    }

    public String toString () {
        String result = "Restaurant [id=" + id + ", title=" + title + ", average spent=" + averageSpent;
        result += ", categories= " + categories +", environment score="+ environmentScore + ", service core="+serviceScore;
        result += ", flavor score="+ flavorScore +", phone number=" + phoneNumber;
        result +=", address="+ address + ", distance=" + distance +"]";
        return  result;
    }

}
