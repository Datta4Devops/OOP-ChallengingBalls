import processing.core.PApplet;
public class Procedure4Balls extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    float x1=0;
    float x2=0;
    float x3=0;
    float x4=0;
    public static void main(String[] args) {
        PApplet.main("Procedure4Balls", args);
    }

    public void settings()
    {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        System.out.println("called from the setup method");
    }

    @Override
    public void draw() {
//        super.draw();
//        paintWhite();
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(x1, (float) HEIGHT /5, DIAMETER,DIAMETER);
        x1++;
    }
    private void drawCircle2() {
        ellipse(x2, (float) (HEIGHT * 2) /5, DIAMETER,DIAMETER);
        x2+=2f;
    }
    private void drawCircle3() {
        ellipse(x3, (float) (HEIGHT * 3) /5, DIAMETER,DIAMETER);
        x3+=3f;
    }
    private void drawCircle4() {
        ellipse(x4, (float) (HEIGHT * 4) /5, DIAMETER,DIAMETER);
        x4+=4f;
    }

    private void paintWhite()
    {
        background(255);
    }


}

