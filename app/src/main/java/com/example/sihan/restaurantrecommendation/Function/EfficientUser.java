package com.example.sihan.restaurantrecommendation.Function;


/**
 * Write a description of EfficientUser here.
 * 
 * @di.yao_1301853 (your name) 
 * @version (a version number or a date)
 */
// changed

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
public class EfficientUser implements Serializable {
    private String myID;
    private String myName;
    private String myAccount;
    private String myPassword;
    private HashMap<String, Rating> myRatings;
    
    public EfficientUser(){
        myRatings = new HashMap<String, Rating>();
    }
    
    public EfficientUser(String id, String name, String account, String password){
        myID = id; 
        myName = name;
        myAccount = account;
        myPassword = password;
        myRatings = new HashMap<String, Rating>();
    }
    
    public void addRating(String rest_id, double value1, double value2, double value3){
        myRatings.put(rest_id, new Rating(rest_id, value1, value2, value3));
    }
    
    public boolean hasRating(String id){
        return myRatings.containsKey(id);
    }
    
    public String getID(){
        return myID;
    }
    
    public String getName(){
        return myName;
    }
    
    public double getFlavorRating(String rest_id){
        if(myRatings.containsKey(rest_id)){
            return myRatings.get(rest_id).getFlavorValue();
        }
        
        return -1;
    }
    
    
    public double getEnvironRating(String rest_id){
        if(myRatings.containsKey(rest_id)){
            return myRatings.get(rest_id).getEnvironValue();
        }
        
        return -1;
    }
    
    
    public double getServiceRating(String rest_id){
        if(myRatings.containsKey(rest_id)){
            return myRatings.get(rest_id).getServiceValue();
        }
        
        return -1;
    }
    
    public double getAverageRating(String rest_id){
        if(myRatings.containsKey(rest_id)){
            return myRatings.get(rest_id).getAverageValue();
        }
        
        return -1;
    }

    public String getAccount() {
       return myAccount;
    }

    public String getPassword() {
        return myPassword;
    }
    
    public int numRatings(){
        return myRatings.size();
    }
    
    public ArrayList<String> getIDOfRestaurantRated(){
        ArrayList<String> list = new ArrayList<String>();
        for(String currentID: myRatings.keySet()){
            list.add(currentID);
        }
        
        return list;
    }
    
}
