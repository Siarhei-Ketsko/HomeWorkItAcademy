package com.homework.lesson11;

public class CheckIpAddress {

    public static void main(String[] args) {
        ////////true
        System.out.println(checkIp("0.0.0.0"));
        System.out.println(checkIp("0.0.1.0"));
        System.out.println(checkIp("255.0.0.1"));
        System.out.println(checkIp("255.55.255.255"));
        System.out.println(checkIp("192.168.0.1"));

        ////////false
        System.out.println(checkIp("001.0.0.0"));
        System.out.println(checkIp("256.1.1.1"));
        System.out.println(checkIp("1.1.1.1."));
        System.out.println(checkIp("-1.0.-1.1"));
    }

    public static boolean checkIp(String ipAddress) {


        return ipAddress.matches("(25[0-5]|2[0-4][0-9]|[1][0-9][0-9]|[1-9][0-9]|[0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[1][0-9][0-9]|[1-9][0-9]|[0-9]?)){3}");
    }
}
