package com.softserve.hw_1_t_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the radius");
        int radius = Integer.parseInt(br.readLine());

        double perimetr = 2*3.14*radius;
        double area = 3.14*radius*radius;


        System.out.printf("Perimeter: %.1f", perimetr);
        System.out.println("\nArea: " + area);

    }
}
