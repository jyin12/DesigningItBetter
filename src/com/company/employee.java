package com.company;

/**
 * Created by Yin on 1/5/2017.
 */
public class employee {
    public static double memberships;
    public static double classes;
    public static double retail;
    public static double aquatics;
    public static double personalTrainer;

    public employee(double m, double c, double r, double a, double pt)
    {
        memberships = m;
        classes = c;
        retail = r;
        aquatics = a;
        personalTrainer = pt;
    }

    public static double EmpMembership(double em)
    {
        double empMem = em * 1;
        return empMem;
    }
    public static double EmpClasses(double ec)
    {
        double empClass = ec * 3;
        return empClass;
    }
    public static double EmpAquatics(double ea)
    {
        double empAquatic = ea * 7;
        return empAquatic;
    }
    public static double EmpPersonalTrainer(double et)
    {
        double empTrainer = et * 15;
        return empTrainer;
    }
}
