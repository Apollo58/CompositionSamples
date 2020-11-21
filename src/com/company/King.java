package com.company;

public class King {
    private static King staticKingObject = null;
    private final String name;

    private King() {
        name = "King Robert";
    }

    public static King getKingInstance() {
        if (staticKingObject == null) {
            staticKingObject = new King();
            System.out.println("Created");
            return staticKingObject;
        } else {
            System.out.println("Not");
        }

        return staticKingObject;
    }

    public String getName() {
        return name;
    }
}
