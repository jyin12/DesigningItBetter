package com.company;

/**
 * Created by Yin on 1/5/2017.
 */
public class memCustomer {
    public static double memberships;
    public static double classes;
    public static double retail;
    public static double aquatics;
    public static double personalTrainer;

    public memCustomer(double m, double c, double r, double a, double pt)
    {
        memberships = m;
        classes = c;
        retail = r;
        aquatics = a;
        personalTrainer = pt;
    }

    public static double MemMemberships(double mm)
    {
        double memMem = mm * 0;
        return memMem;
    }
    public static double MemClasses(double cll)
    {
        double memClass = cll * 8;
        return memClass;
    }
    public static double MemAquatics(double aqr)
    {
        double memAquatic = aqr * 10;
        return memAquatic;
    }
    public static double MemPersonalTrainer(double pts)
    {
        double memTrainer = pts * 20;
        return memTrainer;
    }

}
