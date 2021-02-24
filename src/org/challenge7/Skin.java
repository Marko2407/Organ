package org.challenge7;

public class Skin extends Organ{
    private int softness;
    private String color;

    public Skin(String name, String medicalCondition, int softness, String color) {
        super(name, medicalCondition);
        this.softness = softness;
        this.color = color;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin color:"+ this.getColor());
    }


    public String getColor() {
        return color;
    }


}
