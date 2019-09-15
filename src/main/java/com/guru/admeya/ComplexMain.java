package com.guru.admeya;

import my.complex.Complex;

import java.util.Arrays;

import static my.complex.Complex.*;

public class ComplexMain {
    public static void main(String[] args) {
        DummyMessage oneDummy = newDummyMessage(1, "first dummy");
        ComplexMessage.Builder builder = ComplexMessage.newBuilder();
        builder.setOneDummy(oneDummy)
            .addAllMultipleDummy(Arrays.asList(
                newDummyMessage(2, "multiple_one"),
                newDummyMessage(3, "multiple_two"),
                newDummyMessage(4, "multiple_three")
                )
            );

        ComplexMessage message = builder.build();
        System.out.println(message);

    }

    private static DummyMessage newDummyMessage(Integer id, String name) {
        DummyMessage.Builder dummyMessageBuilder = DummyMessage.newBuilder();
        return dummyMessageBuilder.setName(name)
            .setId(id).build();
    }
}
