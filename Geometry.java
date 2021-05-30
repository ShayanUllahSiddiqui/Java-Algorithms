package com.mkyong;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Line2D.Double;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Geometry extends JFrame {

    private int x;
    private int y;

    public Geometry(int x, int y) throws HeadlessException {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    class Shape {
        private int area;
        private int parimeter;
        private String fillColor;
        private String borderColor;

        public Shape(int area, int parimeter, String fillColor, String borderColor) {
            area = (int) 1.0;
            parimeter = (int) 1.0;
            fillColor = "Black";
            borderColor = "Black";
        };

        public void setArea(int area) {
            this.area = area;
        }

        public void setParimeter(int parimeter) {
            this.parimeter = parimeter;
        }

        public int getParimeter() {
            return parimeter;
        }

        public void setFillColor(String fillColor) {
            this.fillColor = fillColor;
        }

        public String getFillColor() {
            return fillColor;
        }

        public void setBorderColor(String borderColor) {
            this.borderColor = borderColor;
        }

        public String getBorderColor() {
            return borderColor;
        }

        public int getArea() {
            return area;
        }

        public void changeBorderColor(String x) {
            setBorderColor(x);
        }

        public void changeFillColor(String x) {
            changeFillColor(x);
        }

    };

    class Circle {
        private int centerPoint;
        private int radius;

        public Circle() {
            this.centerPoint = 0;
            this.radius = (int) 0.1;
        }

        public void setCenterPoint(int centerPoint) {
            this.centerPoint = centerPoint;
        }

        public int getCenterPoint() {
            return centerPoint;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }

        public void area(int x) {
            area(x);
        };

        public void perimeter(int x) {
            perimeter(x);
        };
    };

    private static final long serialVersionUID = 1L;

    public Geometry() {

        setSize(new Dimension(320, 320));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                Double line = new Line2D.Double(3, 3, 303, 303);
                Rectangle rect = new Rectangle(3, 3, 303, 303);
                java.awt.geom.Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 100, 100);
                java.awt.geom.RoundRectangle2D.Double roundRect = new RoundRectangle2D.Double(20, 20, 250, 250, 5, 25);
                System.out.println(line);
                System.out.println(rect);
                System.out.println(circle);
                System.out.println(roundRect);
                g2.draw(line);
                g2.draw(rect);
                g2.draw(circle);
                g2.draw(roundRect);
            }
        };
        setTitle("My Shapes");
        this.getContentPane().add(p);
    }

    public static void main(String arg[]) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Geometry();
            }
        });
    };
};