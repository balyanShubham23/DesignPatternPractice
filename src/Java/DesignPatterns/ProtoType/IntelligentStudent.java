package Java.DesignPatterns.ProtoType;

public class IntelligentStudent extends Student{

    public int IQ;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent student)
    {
        super(student);
        this.IQ = student.IQ;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
