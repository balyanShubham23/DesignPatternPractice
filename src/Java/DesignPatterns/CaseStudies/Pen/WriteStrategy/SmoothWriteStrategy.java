package Java.DesignPatterns.CaseStudies.Pen.WriteStrategy;

public class SmoothWriteStrategy implements IWriteStrategy{
    @Override
    public void writeBehavior() {
        System.out.println("smooth write behavior");
    }
}
