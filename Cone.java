import java.util.*;
 class Shape {
    abstract void get();
}

class Sphere extends Shape {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    void get() {
        double a = 4 * Math.PI * (radius * radius);
        double v = (4.0 / 3.0) * Math.PI * (radius * radius * radius);
        System.out.println("AREA OF SPHERE IS " + a);
        System.out.println("volume OF sphere IS " + v);
    }
}

class Cylinder extends Shape 
{
    double radius;
    double height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    void get() {
        double a = 2 * Math.PI * radius * (radius + height);
        double v = Math.PI * (radius * radius) * height;
        System.out.println("AREA OF cylinder IS " + a);
        System.out.println("volume OF cylinder IS " + v);
    }
}

class Cone extends Shape {
    double radius;
    double height;

    Cone(double r, double h) {
        radius = r;
        height = h;
    }

    void get() {
        double a = Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
        double v = (1.0 / 3) * Math.PI * (radius * radius) * height;
        System.out.println("AREA OF cone IS " + a);
        System.out.println("volume OF cone IS " + v);
    }

    public static void main(String arg[]) {
        Cone s1 = new Cone(10);
        s1.get();

        Cylinder s2 = new Cylinder(10, 20);
        s2.get();

        Sphere s3 = new Sphere(10);
        s3.get();
    }
}
