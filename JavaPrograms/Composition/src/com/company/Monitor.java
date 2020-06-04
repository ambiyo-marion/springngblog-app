package com.company;

public class Monitor {
    private String model;
    private String manufacture;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String manufacture, String model,int size,Resolution nativeResolution) {
        this.manufacture = manufacture;
        this.model = model;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x,int y,String color){
        System.out.println("Drawing pixel at" + x + ","+y +" in colour" + color);
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public int getSize() {
        return size;
    }
}
