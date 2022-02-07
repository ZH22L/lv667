package com.softserve.hw_1_t_2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What's your name?");
        String name = br.readLine();

        System.out.println("What's your address," + name+"?");
        String address = br.readLine();

        System.out.println("Your name is:" + name);
        System.out.println("Your address is:" + address);

    }
}
