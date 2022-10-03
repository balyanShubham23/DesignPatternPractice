package Java.DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("Shubham")
                .setAge(29)
                .setGradYear(2015).Build();

        Student Keshav = Student.getBuilder()
                .setName("Keshav")
                .setAge(5)
                .setGradYear(2021).Build();
    }
}
