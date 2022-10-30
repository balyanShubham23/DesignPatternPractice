package Java.DesignPatterns.CaseStudies.Pen;


import Java.DesignPatterns.CaseStudies.Pen.Pen.BallPen;
import Java.DesignPatterns.CaseStudies.Pen.Pen.Pen;
import Java.DesignPatterns.CaseStudies.Pen.WriteStrategy.SmoothWriteStrategy;

public class Client {
    public static void main(String[] args) {
        Pen pen = new BallPen(new SmoothWriteStrategy());
        pen.write();
    }
}
