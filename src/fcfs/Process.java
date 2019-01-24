/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcfs;

/**
 *
 * @author Kamrul
 */
public class Process {
    int id;
    int arrivalTime;
    int duration;
    GlobalTimer globalTimer;
    
    public Process(int id,int arrivalTime, int duration, GlobalTimer globalTimer){
        this.id=id;
        this.arrivalTime=arrivalTime;
        this.duration=duration;
        this.globalTimer=globalTimer;        
    }
    
    public void runProcess(){
        for(int i=0;i<duration;i++){
            System.out.println("My process ID: "+id);
            System.out.println("Global time: "+globalTimer.time);            
            globalTimer.time++;
         }
        
        System.out.println("********Process Id: "+id + " completed its job********");
    }

    public int getId() {
        return id;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getDuration() {
        return duration;
    }

    public GlobalTimer getGlobalTimer() {
        return globalTimer;
    }

   
    
        
}
