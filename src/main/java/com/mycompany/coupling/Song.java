/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coupling;

/**
 *
 * @author nick
 */
public class Song {
    
    String title, artist;
    double price;
    int quantity, catalogueId;
    
    public Song (String t, String a, int catId) {
        title = t;
        artist = a;
        quantity = 100;
        catalogueId = catId;
    }
    
    public void sell (MusicShop s, int desiredQuantity) {
        if(quantity >= desiredQuantity) {
            s.increaseTakings(price * desiredQuantity);
            quantity -= desiredQuantity;
        } else {
            System.out.println("Out of stock!");
        }
        
    }
    
    
    public int getId() {
        return catalogueId;
    }
}
