package figury;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Trojkat extends Figura{

    public Trojkat(Graphics2D buffer, int delay, int width, int height) {
        super(buffer,delay,width,height);

        aft = new AffineTransform();
        area = new Area(shape);
    }
}
