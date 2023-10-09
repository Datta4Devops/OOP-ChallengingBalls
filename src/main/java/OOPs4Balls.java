import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;


public class OOPs4Balls extends PApplet {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int DIAMETER = 10;
    public List<Ball> list;

    public static void main(String[] args) {
        PApplet.main("OOPs4Balls", args);
    }

    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        list = new ArrayList<Ball>();
        for (int i = 1; i < 5; i++) {
            list.add(new Ball(HEIGHT * i / 5, DIAMETER, i));
        }
    }

    @Override
    public void draw() {
        for (Ball x : list) {
            x.drawBall();
        }
    }

    public class Ball {
        int x;
        int y;
        int diameter;
        int increment;

        Ball(int y, int diameter, int increment) {
            this.x = 0;
            this.y = y;
            this.diameter = diameter;
            this.increment = increment;
        }

        public void drawBall() {
            ellipse(x, y, diameter, diameter);
            x += increment;
        }

    }


}
