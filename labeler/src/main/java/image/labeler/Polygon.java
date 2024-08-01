package image.labeler;

import java.util.ArrayList;

/**
 * Represents a polygon
  */
public class Polygon { 
    private ArrayList<Point> points; // list of points
    private String name;

    public Polygon() {
        points = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    /**
     * Adds a point to the polygon
     * @param point point to add
     */
    public void addPoint(Point point) {
        points.add(point);
    }

    /**
     * Returns the list of points
     * @param point list of points
      */
    public void removePoint(Point point) {
        points.remove(point);
    }

    // ********** Getters **********
    public ArrayList<Point> getPoints() {
        return points;
    }
}
