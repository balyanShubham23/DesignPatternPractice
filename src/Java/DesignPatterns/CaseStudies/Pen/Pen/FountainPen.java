package Java.DesignPatterns.CaseStudies.Pen.Pen;

import Java.DesignPatterns.CaseStudies.Pen.IRefilable;
import Java.DesignPatterns.CaseStudies.Pen.Ink;
import Java.DesignPatterns.CaseStudies.Pen.Nib;
import Java.DesignPatterns.CaseStudies.Pen.WriteStrategy.IWriteStrategy;

public class FountainPen extends Pen {

    private Ink ink;

    public FountainPen(IWriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Nib getNib() {
        return nib;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    private Nib nib;

    @Override
    public void write() {

    }
}
