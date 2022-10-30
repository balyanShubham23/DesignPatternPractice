package Java.DesignPatterns.CaseStudies.Pen.Pen;


import Java.DesignPatterns.CaseStudies.Pen.Refill;
import Java.DesignPatterns.CaseStudies.Pen.WriteStrategy.IWriteStrategy;

public class BallPen extends Pen{


    public BallPen(IWriteStrategy writeStrategy)
    {
        super(writeStrategy);
    }
    private Refill refill;

    public Refill getRefill() {
        return refill;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    public void write() {
        this.getWriteStrategy().writeBehavior();
    }
}
