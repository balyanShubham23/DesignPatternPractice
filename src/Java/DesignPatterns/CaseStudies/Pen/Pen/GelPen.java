package Java.DesignPatterns.CaseStudies.Pen.Pen;

import Java.DesignPatterns.CaseStudies.Pen.Ink;
import Java.DesignPatterns.CaseStudies.Pen.Nib;
import Java.DesignPatterns.CaseStudies.Pen.WriteStrategy.IWriteStrategy;

public class GelPen extends Pen{

    private Ink ink;

    private Nib nib;

    public GelPen(IWriteStrategy writeStrategy) {
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

    @Override
    public void write() {

    }
}
