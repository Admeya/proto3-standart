package com.guru.admeya;

import my.city.CityOuterClass.City;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleMain {
    public static void main(String[] args) {
        City message = getBuilder().build();
        writingToBin(message);
        message.toByteArray();
        readingFromBin();
    }

    public static City.Builder getBuilder() {
        City.Builder builder = City.newBuilder();
        builder.setCountryName("Russia")
            .setName("Moscow")
            .setZipCode("111");
        builder.addFlat("8").addFlat("19");
        return builder;
    }

    private static void writingToBin(City message) {
        try {
            FileOutputStream outputStream = new FileOutputStream("simple_message.bin");
            message.writeTo(outputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readingFromBin() {
        try {
            System.out.println("Reading from file...");

            FileInputStream fis = new FileInputStream("simple_message.bin");
            City msgFromFile = City.parseFrom(fis);

            System.out.println(msgFromFile.getCountryName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
