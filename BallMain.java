public class BallMain{
    public static void main(String[] args) {
        Ball a = new Ball(25, 50, 100);
        Ball b = new Ball(25, 500, 100);
        Ball c = new Ball(25, 51, 100);

        boolean test = a.overLap(b);
        boolean test1 = a.overLap(c);
        System.out.println(test);
        System.out.println(test1);
    }
}