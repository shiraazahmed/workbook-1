package com.pluralsight;

public class MathApp {
    //    Q1


            int bobSalary = 10000;
            int garySalary = 11000;
            int highestSalary = garySalary;
            System.out.println("The Highest Salary is " + garySalary);

//Q2
            int carPrice = 10000;
            int truckPrice = 15000;
            int smallestPrice = Math.min(carPrice, truckPrice);
            System.out.println("The smallest price:" + smallestPrice);
// Q3
            double radius = 7.25;
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("The area of the circle:" + area);

//Q4
            double myVariable = 5.0;
            double sqRoot = Math.sqrt(myVariable);
            System.out.println("The square root after it is set to 5 is:" + sqRoot);

// Q5
            int x1 = 5;
            int x2 = 85;
            int y1 = 10;
            int y2 = 50;
            double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            System.out.println("Distance between points is: " + distance);

//Q6
            int variable = (int) -3.8;
            int absoluteValue;
            if (variable < 0) {
                absoluteValue = -variable;
            } else {
                absoluteValue = variable;
            }
            System.out.println("Absolute value: " + absoluteValue);

//Q7
            double randomNum = Math.random();
            System.out.println("random number between 0 and 1: " + randomNum);
    }
}






