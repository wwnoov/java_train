package com.myStudy.Inheri.exam05;

public class ColorTv extends Tv{
    private int resolution;

    public ColorTv(int size, int resolution) {
        super(size);
        this.resolution = resolution;
    }
    protected int getResolution() { return resolution; }

    public void printProperty() {
        System.out.println(getSize() + "인치 " + resolution + "컬러");
    }
}
