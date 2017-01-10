package com.company;

/**
 * Created by Yin on 1/5/2017.
 */
public class GymMembership {

    public static double memberships;
    public static double classes;
    public static double retail;
    public static double aquatics;
    public static double personalTrainer;

    public GymMembership(double m, double c, double r, double a, double pt)
    {
        memberships = m;
        classes = c;
        retail = r;
        aquatics = a;
        personalTrainer = pt;
    }

    public static double RegMemberships(int mo)
    {
        double regMem = mo * 65;
        return regMem;
    }
    public static double RegClasses(double cl)
    {
        double regClass = cl * 10;
        return regClass;
    }
    /*public static double Retail(double rt)
    {
        double regRetail = rt * 1;
        return regRetail;
    } */
    public static double RegAquatics(double aqr)
    {
        double regAquatic = aqr * 0;
        return regAquatic;
    }
    public static double RegPersonalTrainer(double nd)
    {
        double regTrainer = nd * 25;
        return regTrainer;
    }
}
