package Java.DesignPatterns.ProtoType;

public class Client {

    public static void FillRegistry(StudentRegistry studentRegistry)
    {
        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("April");
        aprBatchStudent.setAverageBatchPsp(89.0);

        studentRegistry.register("april21Batch", aprBatchStudent);

        IntelligentStudent aprintelligentStudent = new IntelligentStudent();
        aprintelligentStudent.setIQ(99);
        aprintelligentStudent.setBatch("April");
        aprintelligentStudent.setAverageBatchPsp(89.0);

        studentRegistry.register("aprintelligentStudent", aprintelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        FillRegistry(studentRegistry);

        Student shubham = studentRegistry.get("april21Batch").clone();
        shubham.setName("Shubham");
        shubham.setAge(29);
        shubham.setStudentPsp(98);

        Student rishi = studentRegistry.get("aprintelligentStudent").clone();
        rishi.setName("Rishi");
        rishi.setAge(28);
        rishi.setStudentPsp(99);
    }
}
