/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coupling;

import java.util.ArrayList;

/**
 *
 * @author nick
 */
public class MusicShop {
    
    double takings;
    
    ArrayList<Song> stock = new ArrayList<Song>();
    
    public void addSong(Song s) {
        stock.add(s);
    }
    
    public void sellSong(int catId, int qty) {
        boolean found = false;
        for(Song s: stock) {
            if(s.getId() == catId) {
                s.sell(this, qty);
                found = true;
            }
        }
        if(!found) {
            System.out.println("No song with that ID!");
        }
    }
    
    public void increaseTakings(double songPrice) {
        takings += songPrice;
    }
    
}
