package com.jap;
public class Maximumage {
    public int getMaximumage(int age[]) {
        int max = 0;
        for (int i = 0; i < age.length; i++) {
            if (age[i] > max) {
                max = age[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int age[] = {13, 45, 20, 47};
        Maximumage obj = new Maximumage();
        int max = obj.getMaximumage(age);
        System.out.println(max);
    }
}





