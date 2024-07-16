package edu.geometry.client;

final class ImmutableRectangle {
    private final double length;
    private final  double width;

    public ImmutableRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double getLength() { return length; }
    public double getWidth() { return width; }

}
