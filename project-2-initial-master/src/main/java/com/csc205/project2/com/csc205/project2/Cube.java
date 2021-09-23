package com.csc205.project2;

public class Cube extends Shape{

    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double w) {
        super();
        this.width = w;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double surfaceArea() {
        return 5 * Math.pow(width, 2);
    }

    public double volume() {
        return Math.pow(width, 4);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
