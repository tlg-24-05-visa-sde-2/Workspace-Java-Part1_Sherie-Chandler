package edu.geometry.client;

final class ImmutableCircle {
    final double radius;

    ImmutableCircle(double radius) {
        this.radius = radius;
    }

    // initialized the field

    // added a getter
    public double getArea() {return (double) (Math.PI * radius * radius);}
}
