package ru.stqa.pft.sandbox;

public class Point {
  int xb;
  int xa;
  int yb;
  int ya;

  Point(int a, int b){}

  public static double distance(Point p1, Point p2) {


    double AB = Math.sqrt((p1.xb - p1.xa) * (p1.xb - p1.xa)) + ((p2.yb - p2.ya) * (p1.xb - p1.xa));
    return AB;
  }}

  class Mega{
    public static void main(String[] args) {

      Point p1 = new Point(6,9);
    Point p2 = new Point(7,8);
    System.out.println( Point.distance(p1,p2));
    }


    }



