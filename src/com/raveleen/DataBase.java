package com.raveleen;

import java.util.ArrayList;

public class DataBase {
    private static ArrayList<PersonalInfo> database = new ArrayList<>();

    public static void add(PersonalInfo personalInfo) {
        database.add(personalInfo);
    }

    public static int[] getCountryStatistics() {
        int[] array = new int[4];

        for (PersonalInfo personalInfo : database) {
            switch (personalInfo.getCountry()) {
                case 0: {
                    array[0] = array[0] + 1;
                    break;
                }
                case 1: {
                    array[1] = array[1] + 1;
                    break;
                }
                case 2: {
                    array[2] = array[2] + 1;
                    break;
                }
                case 3: {
                    array[3] = array[3] + 1;
                    break;
                }
            }
        }

        double a = (double) array[0] / database.size();
        double b = (double) array[1] / database.size();
        double c = (double) array[2] / database.size();
        double d = (double) array[3] / database.size();

        array[0] = (int) (a * 100);
        array[1] = (int) (b * 100);
        array[2] = (int) (c * 100);
        array[3] = (int) (d * 100);

        return array;
    }

    public static int[] getGenderStatistics() {
        int[] gender = new int[2];

        for (PersonalInfo personalInfo : database) {
            if (personalInfo.getGender() == 0) {
                gender[0] = gender[0] + 1;
            } else {
                gender[1] = gender[1] + 1;
            }
        }

        double a = (double) gender[0] / database.size();
        double b = (double) gender[1] / database.size();

        gender[0] = (int) (a * 100);
        gender[1] = (int) (b * 100);

        return gender;
    }
}
