package com.company;

public class Motherboard {

    private String model;
    private String manufacture;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String bios,String model,String manufacture, int ramSlots,int cardSlots) {
        this.bios = bios;
        this.cardSlots = cardSlots;
        this.manufacture = manufacture;
        this.model = model;
        this.ramSlots = ramSlots;
    }
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading");
    }

    public String getBios() {
        return bios;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public int getRamSlots()  {
        return ramSlots;
    }
}
