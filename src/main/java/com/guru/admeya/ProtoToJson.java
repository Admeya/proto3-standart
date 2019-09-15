package com.guru.admeya;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import my.city.CityOuterClass;
import my.city.StreetOuterClass;

public class ProtoToJson {
    public static void main(String[] args) {
        CityOuterClass.City message = SimpleMain.getBuilder().build();
        StreetOuterClass.Street.Builder builderStreet = StreetOuterClass.Street.newBuilder();
        builderStreet.setStreetName("Studenaya");

        try {
            //выводим строку в json
            String jsonStr = JsonFormat.printer().print(message);
            System.out.println(jsonStr);
            System.out.println("and...");
            //json to protobuf
            JsonFormat.parser().ignoringUnknownFields().merge(jsonStr, builderStreet);
            System.out.println(builderStreet);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
}
