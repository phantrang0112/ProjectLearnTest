package com.cmcglobal.lesson6;

public class RobotHutBui {
    private String model;
    private int theTich;
    private int trongLuong;
    private int luongNuoc;

    public RobotHutBui() {
    }

    public RobotHutBui(String model, int theTich) {
        this.model = model;
        this.theTich = theTich;
        this.trongLuong = theTich * 2 + 100;
        this.luongNuoc = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTheTich() {
        return theTich;
    }

    public void setTheTich(int theTich) {
        this.theTich = theTich;
    }

    public int getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }

    public int getLuongNuoc() {
        return luongNuoc;
    }

    public void setLuongNuoc(int luongNuoc) {
        this.luongNuoc = luongNuoc;
    }

    public int chamNuoc() {
        int nuocDoRa = this.luongNuoc;
        this.luongNuoc = 0;
        return nuocDoRa;
    }
}
