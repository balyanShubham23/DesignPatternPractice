package Java.DesignPatterns.CaseStudies.Pen.Pen;

import Java.DesignPatterns.CaseStudies.Pen.Cap;
import Java.DesignPatterns.CaseStudies.Pen.WriteStrategy.IWriteStrategy;

public abstract class Pen {

    private IWriteStrategy writeStrategy;

    private String Name;

    private Cap cap;

    private String brand;

    private double length;

    public Pen(IWriteStrategy writeStrategy)
    {
        this.writeStrategy = writeStrategy;
    }

    public IWriteStrategy getWriteStrategy() {
        return writeStrategy;
    }

    public void setWriteStrategy(IWriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Cap getCap() {
        return cap;
    }

    public void setCap(Cap cap) {
        this.cap = cap;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void write()
    {
        this.writeStrategy.writeBehavior();
    }
}
