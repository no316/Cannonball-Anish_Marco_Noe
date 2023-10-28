/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngmen
 */
public abstract class KinematicsEquations {
    public static double findVFinalWithTimeAndVInitial(double v0, double a, double t) {
        return (v0 + (a * t));
    }

    public static double findVFialWithDeltaXandVInitial(double v0, double a, double x) {
        return Math.pow((Math.pow(v0, 2) + (2 * a * x)), 0.5);
    }

    public static double findDeltaXWithVInitialVFinalAndTime(double v0, double vF, double t) {
        return ((v0 + vF) / 2) * t;
    }

    public static double findDeltaXWithVInitialTimeAndAcceleration(double v0, double a, double t) {
        return (v0 * t) + (0.5 * a * (Math.pow(t, 2)));
    }

    public static double getVHorizontal(double v0, double vPower, double angle, double aPower) {
        return v0 * Math.cos(angle);
    }

    public static double getVVertical(double v0, double vPower, double angle, double aPower) {
        return v0 * Math.sin(angle);
    }

    public static double findTimeToTopOfParabola(double v0, double angle, double g) {
        return getVVertical(v0, 1, angle, 1) * g;
    }

    public static double findYInParabola(double v0, double angle, double g, double x) {
        return ((Math.tan(angle)) * x) - (g / (2 * getVHorizontal(v0, 2, angle, 2))) * Math.pow(x, 2);
    }

    public static double findHeighOfParabola(double v0, double angle, double g) {
        return (getVVertical(v0, 2, angle, 2)) / (2 * g);
    }

    public static double findRange(double v0, double angle, double g) {
        return (getVVertical(v0, 2, 2 * angle, 1)) / g;
    }
} System.out.println("efhpigwrtgpiuhrtiugjirwuthgiuhriubnvijrgnbiurhbggt");
