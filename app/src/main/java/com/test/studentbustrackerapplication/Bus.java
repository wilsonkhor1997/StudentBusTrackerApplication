package com.test.studentbustrackerapplication;

import java.io.Serializable;

public class Bus {

    //private int userid;
    private String latitude1;
    private String longitude1;
    private String busPlateNum;
    private String studNum;
    private String route;
    private String busStop;
    private String StudNum;

    public Bus(String latitude1,String longitude1, String busStop, String StudNum ){
        this.latitude1=latitude1;
        this.longitude1=longitude1;
        this.busStop=busStop;
        this.StudNum=StudNum;
    }

    public Bus(String latitude1,String longitude1,String busPlateNum,String studNum, String route){
        this.latitude1=latitude1;
        this.longitude1=longitude1;
        this.busPlateNum=busPlateNum;
        this.studNum=studNum;
        this.route=route;
    }

    public String getLatitude1() {
        return latitude1;
    }

    public String getLongitude1(){
        return longitude1;
    }

    public String getBusPlateNum() {
        return busPlateNum;
    }

    public String getStudentNum() {
        return studNum;
    }

    public String getRoute() {
        return route;
    }

    public String getBusStop() {
        return busStop;
    }

    public String getStudNum() {
        return StudNum;
    }
}