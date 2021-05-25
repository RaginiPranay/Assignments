import processing.core.PApplet;
public class TryProcessing extends PApplet {
    public static final int width=648;
    public static final int height=488;
    public static final int diameter=10;

    public static int start[]={0,0,0,0};


    public static void main(String[] args) {

        PApplet.main("TryProcessing", args);

    }

    @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void setup() {
        super.setup();
    }
    @Override
    public void draw()
    {
        for(int i=0;i<4;i++)
        {
            drawcustm(i);
        }
    }

    private void drawcustm(int num) {

        ellipse(start[num],(num+1)*height/5,diameter,diameter);
        start[num]+=num+1;
    }
}
