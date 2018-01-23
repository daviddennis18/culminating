/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preliminary.cuminating;

import java.awt.*;
/**
 *
 * @author daden2468
 */
public class Posts {

    private double bud;
    private String date;

    public Posts(int budget) {
        bud = budget;
    }

    public double getBudget() {
        return (bud);
    }
    
    public void setBudget(double newBudget) {
        bud = newBudget;
    }

    public String getDate() {
        return (date);
    }

    public void setDate(String newDate) {
        date = newDate;
    }
    
   
    
    //budget manager

    public static String getCaption1(int picNum) {
        String caption1 = "";

        switch (picNum) {
            case 0:
                caption1 = "test 1";
                break;
            case 1:
                caption1 = "test 2";
                break;
            case 2:
                caption1 = "test 3";
                break;
            case 3:
                caption1 = "test 4";
                break;
            case 4:
                caption1 = "test 5";
                break;
            case 5:
                caption1 = "test 6";
                break;
            case 6:
                caption1 = "test 7";
                break;
            case 7:
                caption1 = "test 8";
                break;
            case 8:
                caption1 = "test 9";
                break;
        }

        return (caption1);
    }
    
    public static String getCaption2(int picNum) {
        String caption2 = "";

        switch (picNum) {
            case 0:
                caption2 = "test 10";
                break;
            case 1:
                caption2 = "test 11";
                break;
            case 2:
                caption2 = "test 12";
                break;
            case 3:
                caption2 = "test 13";
                break;
            case 4:
                caption2 = "test 14";
                break;
            case 5:
                caption2 = "test 15";
                break;
            case 6:
                caption2 = "test 16";
                break;
            case 7:
                caption2 = "test 17";
                break;
            case 8:
                caption2 = "test 18";
                break;
        }

        return (caption2);
    }
    
    public static String getCaption3(int picNum) {
        String caption3 = "";

        switch (picNum) {
            case 0:
                caption3 = "test 19";
                break;
            case 1:
                caption3 = "test 20";
                break;
            case 2:
                caption3 = "test 21";
                break;
            case 3:
                caption3 = "test 22";
                break;
            case 4:
                caption3 = "test 23";
                break;
            case 5:
                caption3 = "test 24";
                break;
            case 6:
                caption3 = "test 25";
                break;
            case 7:
                caption3 = "test 26";
                break;
            case 8:
                caption3 = "test 27";
                break;
        }

        return (caption3);
    }

}
