package org.example.DistanceJava;

public class Distance2points {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double x1 = Math.pow(x,2);
        double y1 = Math.pow(y,2);
        double distance = Math.sqrt(x1 + y1);
        System.out.println("Distance of the points from origin is " +distance);
    }
}
