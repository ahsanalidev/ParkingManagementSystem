package com.example.puffer.parkingdemo.DataClass;


public class
Taipei_Parking_Info {

    public Result[] parkings;

    public class Result{
        public String area; //
        public String name; //
        public String summary;  //
        public String address;  //
        public String tel;  //
        public String payex;    //
        public String servicetime;  //  Business hours
        public double tw97x;    //
        public double tw97y;    //
        public int totalcar; //Car parking space
        public int totalmotor;   //Locomotive parking space
        public int totalbike;    //Bicycle parking space
        public String Pregnancy_First; //Priority parking for pregnant women
        public String Handicap_First; //Handicapped priority parking
//        public String TOTALLARGEMOTOR; //
        public String ChargingStation; //charging station
    }
}
