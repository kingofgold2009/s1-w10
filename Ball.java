public class Ball {
    private double radius;
    private double x, y;

    public Ball(double r, double x, double y) {
        this.radius = r;
        this.x = x;
        this.y = y;
    }

    public double calcDistance(Ball b) {
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }

    //returns true if this ball overlaps
    //with the Ball b; false otherwise
    //if the distance between the balls is less
    //than the sum of their radius the balls are overlapping.
    public boolean overLap(Ball b) {
        return this.calcDistance(b) < (this.radius + b.radius);
    }
}
