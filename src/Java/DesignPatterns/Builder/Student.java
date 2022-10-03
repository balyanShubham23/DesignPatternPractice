package Java.DesignPatterns.Builder;

public class Student {
    String name;
    int age;
    double psp;
    String universityName;
    String batch;
    long id;
    int gradYear;
    String phoneNumber;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder)
    {
        this.gradYear = builder.getGradYear();
        this.age = builder.getAge();
        this.name = builder.getName();
    }

    public static class Builder{
        private int gradYear;

        private String name;

        private int age;

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student Build()
        {
            if(getGradYear() > 2022)
            {
                throw new IllegalArgumentException("Grad year cannot be greater than 2022");
            }
            return new Student(this);
        }
    }


}
