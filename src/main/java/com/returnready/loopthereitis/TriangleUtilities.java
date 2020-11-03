package com.returnready.loopthereitis;

import java.util.ArrayList;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
         int numberOfStars = 1;
         String stars = "";
        for (int i = 1; i < numberOfRows; i++){
            for(int j = 0; j < numberOfStars; j++){
                stars += "*";
            }
            numberOfStars++;
            stars += "\n";
        }
        return stars;
    }

    public static String getRow(int numberOfStars) {
        String stars = "";
        for (int i = 0; i < numberOfStars; i++){
            stars += "*";
        }
        return stars;
    }

    public static String getSmallTriangle() {
        int numberOfRows = 5;
        int numberOfStars = 1;
        String stars = "";
        for (int i = 1; i < numberOfRows; i++){
            for(int j = 0; j < numberOfStars; j++){
                stars += "*";
            }
            numberOfStars++;
            stars += "\n";
        }
        return stars;
    }

    public static String getLargeTriangle() {
        int numberOfRows = 10;
        int numberOfStars = 1;
        String stars = "";
        for (int i = 1; i < numberOfRows; i++){
            for(int j = 0; j < numberOfStars; j++){
                stars += "*";
            }
            numberOfStars++;
            stars += "\n";
        }
        return stars;
    }
}
