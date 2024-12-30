package com.paremal.sheebu.visitor;

import java.util.ArrayList;
import java.util.List;

interface Visitor{
    void visit(Qube qube);
    void visit(Box box);
    void visit(Sphere sphere);
}
interface ThreeDShape{
    void accept(Visitor visitor);
}

class Qube implements ThreeDShape{
    Integer side;

    public Qube(Integer side) {
        this.side = side;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
class Box implements ThreeDShape{

    Integer length;
    Integer breadth;

    public Box(Integer length, Integer breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class Sphere implements ThreeDShape{

    Integer radius;

    public Sphere(Integer radius) {
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
public class Visitor3Dshape implements Visitor   {
   static double total_volume=0.0;



    @Override
    public void visit(Qube qube) {
        //total_volume=total_volume+ qube.side*qube.side*qube.side;
        double r=qube.side*qube.side*qube.side;
        total_volume=total_volume+ r;
        System.out.println( "Qube volume="+r);
    }

    @Override
    public void visit(Box box) {
        double r=box.length*box.breadth;
        total_volume=total_volume+ r;
        System.out.println( "Box volume="+r);
    }

    @Override
    public void visit(Sphere sphere) {

        double r=4.0/3.0 * (Math.PI* Math.pow(sphere.radius,3.0));
        total_volume=total_volume+ r;
        System.out.println( "Sphere volume="+r);

    }

    public static void main(String[] args) {
        List<ThreeDShape> threeDShapeList= new ArrayList<>();
        Visitor visitor= new Visitor3Dshape();
        threeDShapeList.add(new Qube(10));
        threeDShapeList.add(new Box(10,5));
        threeDShapeList.add(new Sphere(10));
        for(ThreeDShape threeDShape:threeDShapeList){
            threeDShape.accept(visitor);
        }
        System.out.println(total_volume);
    }
}
