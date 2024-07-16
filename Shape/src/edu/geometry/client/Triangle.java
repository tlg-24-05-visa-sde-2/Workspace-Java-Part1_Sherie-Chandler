package edu.geometry.client;

final class ImmutableTriangle {
    private final double side1;
    private final double side2;
    private final double angle; // in degrees

    public ImmutableTriangle(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    public double getArea() {
        // Convert angle:radians
        double angleInRadians = Math.toRadians(angle);

        return 0.5 * side1 * side2 * Math.sin(angleInRadians);
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getAngle() {
        return angle;
    }
}
