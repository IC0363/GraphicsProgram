import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(50, 50, 300, 300);
        box.setColor(Color.BLUE);
        box.fill();

        Ellipse egg = new Ellipse(150, 150, 100, 100);
        egg.draw();

        RandomWalk();
    }

    public static void RandomWalk() {
        int counter = 0;
        Ellipse dot = new Ellipse(195, 195, 10, 10);
        dot.setColor(Color.RED);
        dot.fill();

        try {
            Thread.sleep(100);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        while (dot.getX() < 245 && dot.getY() < 245) {
            int i = (int) (Math.random() * 20);
            if (i <= 10) {
                dot.translate(1, 0);
                counter++;
            } else {
                dot.translate(0, 1);
                counter++;
            }
            System.out.println("You took " + counter + " steps");
            try {
                Thread.sleep(100);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
