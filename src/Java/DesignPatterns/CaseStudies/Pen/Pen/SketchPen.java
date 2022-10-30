package Java.DesignPatterns.CaseStudies.Pen.Pen;

import Java.DesignPatterns.CaseStudies.Pen.Ink;
import Java.DesignPatterns.CaseStudies.Pen.Nib;
import Java.DesignPatterns.CaseStudies.Pen.Refill;
import Java.DesignPatterns.CaseStudies.Pen.WriteStrategy.IWriteStrategy;

public class SketchPen extends Pen{

    private Refill refill;

    public SketchPen(IWriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    public Refill getRefill() {
        return refill;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    @Override
    public void write() {

    }
}
