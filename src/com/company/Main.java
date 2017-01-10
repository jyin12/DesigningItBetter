package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ans = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String nm = ans.nextLine();
        System.out.println("Hello " + nm + ", Welcome to Fitness Center");
        System.out.println("Are you a regular customer, membership customer or an employee?");
        String a = ans.nextLine();

        {
            if (a.equalsIgnoreCase("regular customer"))
            {
                Scanner b = new Scanner(System.in);
                System.out.println("Sounds like you never been here before");
                System.out.println("What is your full name?");
                String name = b.nextLine();
                System.out.println("What is your height?");
                String heg = b.nextLine();
                System.out.println("How many days do you want to visit here in a week?");
                double numDays = b.nextDouble();
                System.out.println("How long would you like to workout?");
                double numHrs = b.nextDouble();
                System.out.println("How many classes would you like to take?");
                double cls = b.nextDouble();
                System.out.println("And aquatic class?");
                double aqus = b.nextDouble();
                System.out.println("Are the following information correct?");
                System.out.println("Name: " + name + '\n' + "Height: " + heg + '\n' + "Visits per week: " + numDays + " day(s)"+ '\n' + "Number of Hours: " + numHrs + " hour(s)" + '\n' + "Number of classes: " + cls );
                System.out.println("Number of aquatic class: " + aqus);
                System.out.println("Yes or no");
                String te = b.next();
                if(te.equalsIgnoreCase("yes"))
                {
                    System.out.println("Alrighty then, here are your rates for the month:");
                    System.out.println("Membership Cost: " + "$" + GymMembership.RegMemberships(1));
                    System.out.println("Class Cost: " + "$" + GymMembership.RegClasses(cls));
                    //System.out.println("Retail Cost: " + "$" );
                    System.out.println("Aquatics Cost: " + "$" + GymMembership.RegAquatics(aqus));
                    System.out.println("Personal Trainer: " + "$" + GymMembership.RegPersonalTrainer(numHrs));
                    double grandTotal = GymMembership.RegMemberships(1) + GymMembership.RegClasses(cls) + GymMembership.RegAquatics(aqus) + GymMembership.RegPersonalTrainer(numHrs);
                    System.out.println("You grand total bill is: $" + grandTotal);
                }
                else
                    System.out.println("Please enter you data again");


            }
            else if (a.equalsIgnoreCase("membership customer"))
            {
                Scanner bb = new Scanner(System.in);
                System.out.println("Welcome back " + nm + ", how many classes do you want to take?");
                double cll = bb.nextDouble();
                System.out.println("And aquatics class?");
                double aqq = bb.nextDouble();
                System.out.println("How many hours would like to work out?");
                double hrr = bb.nextDouble();
                System.out.println("And how many months is this for you?");
                double mth = bb.nextDouble();
                System.out.println("Are the following information correct?");
                System.out.println("Number of classes: " + cll + '\n' + "Number of aquatic class; " + aqq + '\n' + "Number of hours: " + hrr + " hour(s)" + '\n' +  "Number of months: " + mth + " month(s)");
                System.out.println("Yes or no");
                String res = bb.next();
                if(res.equalsIgnoreCase("yes"))
                {
                    System.out.println("Alrighty then, here are your rates for the month:");
                    System.out.println("Membership cost: $" + memCustomer.MemMemberships(mth));
                    System.out.println("Class cost: $" + memCustomer.MemClasses(cll));
                    System.out.println("Aquatics cost: $" + memCustomer.MemAquatics(aqq));
                    System.out.println("Personal Trainer: $" + memCustomer.MemPersonalTrainer(hrr));
                    double total2 = memCustomer.MemMemberships(mth) + memCustomer.MemClasses(cll) + memCustomer.MemAquatics(aqq) + memCustomer.MemPersonalTrainer(hrr);
                    System.out.println("Your grand total is: $" + total2);
                    System.out.println("Keep in mind that you're a membership customer, you enjoy 20% off of any retail item you purchase");
                }
                else
                    System.out.println("Please re-enter your data");
            }
            else if (a.equalsIgnoreCase("employee"))
            {
                Scanner cc = new Scanner(System.in);
                System.out.println("Welcome, " + nm);
                System.out.println("How days would you like to visit?");
                double vv = cc.nextDouble();
                System.out.println("How long do you workout?");
                double wo = cc.nextDouble();
                System.out.println("How many classes would you like to take?");
                double css = cc.nextDouble();
                System.out.println("And aquatics class?");
                double aqq = cc.nextDouble();
                System.out.println("Are the following information correct?");
                System.out.println("Number of days: " + vv + " day(s)" + '\n' + "Number of hours: " + wo + " hour(s)" + '\n' + "Number of classes: " + css);
                System.out.println("Number of aquatic class: " + aqq);
                System.out.println("Yes or no");
                String ttt = cc.next();
                if(ttt.equalsIgnoreCase("yes"))
                {
                    System.out.println("Alrighty, here's your rate for this month: ");
                    System.out.println("Membership cost: $" + employee.EmpMembership(1));
                    System.out.println("Number of classes: $" + employee.EmpClasses(css));
                    System.out.println("Number of aquatic classes: $" + employee.EmpAquatics(aqq));
                    System.out.println("Personal Trainer: $" + employee.EmpPersonalTrainer(wo));
                    double total3 = employee.EmpMembership(1) + employee.EmpClasses(css) + employee.EmpAquatics(aqq) + employee.EmpPersonalTrainer(wo);
                    System.out.println("Your grand total is: $" + total3);
                    System.out.println("Keep in mind that you're an employee, so enjoy 10% off on all retail items you purchase");
                }
                else
                    System.out.println("Please re-enter");
            }
            else
                System.out.println("Please try again");
        }
    }
}
