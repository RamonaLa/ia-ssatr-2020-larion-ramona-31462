/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.curs2.ssatr.ia;

/**
 *
 * @author mihai.hulea
 */
public class OttoCar extends Car {
    private int batteryLevel;
    
    public OttoCar(String name, int speed, String plateNumber) {
        super(name, speed, plateNumber);
        batteryLevel = 100;
    }

    @Override //poate sa lipseasca
    void accelerate() {
        speed+=3;
        System.out.println("Electric car speed is "+speed+" and battery level is "+batteryLevel);        
    }
    
    
}
