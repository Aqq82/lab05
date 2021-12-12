package figury;

import java.awt.*;
import java.awt.geom.*;

public class Kwadrat extends Figura {

    public Kwadrat(Graphics2D buffer, int delay, int width, int height) {
        super(buffer, delay, width, height);
        area = new Area(new Rectangle2D.Float(0, 0, 40, 40));
        aft = new AffineTransform();
        aft.translate(0,0);
        area.transform(aft);
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return null;
    }
}
