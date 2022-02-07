package com.softserve.hw_1_t_3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How much is a minute of a call from Poland?");
        double с1 = Double.parseDouble(br.readLine());

        System.out.println("How long is the call from Poland");
        double t1 = Double.parseDouble(br.readLine());

        System.out.println("How much is a minute of a call from France?");
        double с2 = Double.parseDouble(br.readLine());

        System.out.println("How long is the call from France");
        double t2 = Double.parseDouble(br.readLine());

        System.out.println("How much is a minute of a call from USA?");
        double с3 = Double.parseDouble(br.readLine());

        System.out.println("How long is the call from USA");
        double t3 = Double.parseDouble(br.readLine());

        double total1 = с1*t1;
        double total2 = с2*t2;
        double total3 = с3*t3;

        double  total = total1+total2+total3;

        System.out.printf("Call from Poland costs: %.2f $", total1 );
        System.out.printf("\nCall from France costs: %.2f $", total2);
        System.out.printf("\nCall from USA costs: %.2f $", total3);

        System.out.printf("\n\nAll calls cost: %.2f $", total );
    }
}
