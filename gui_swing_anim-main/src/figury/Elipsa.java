package figury;

import java.awt.*;
import java.awt.geom.*;

public class Elipsa extends Figura {

    public Elipsa(Graphics2D buffer, int delay, int width, int height) {
        super(buffer, delay, width, height);
        area = new Area(new Ellipse2D.Float(0, 0, 60, 30));
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