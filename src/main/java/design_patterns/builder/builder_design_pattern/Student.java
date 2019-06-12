package builder_design_pattern;

public class Student {

    private final String firstName; // mandatory
    private final String lastName;  // mandatory
    private final int age;          // optional
    private final String address;   // optional

    public Student(StudentBuilder studentBuilder) {
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.age = studentBuilder.age;
        this.address = studentBuilder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static class StudentBuilder
    {
        private final String firstName; // mandatory
        private final String lastName;  // mandatory
        private  int age;          // optional
        private  String address;   // optional

        public StudentBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public StudentBuilder age(int age)
        {
            this.age = age;
            return this;
        }

        public StudentBuilder address(String address)
        {
            this.address = address;
            return this;
        }

        public Student build()
        {
            Student student = new Student(this);
            return student;
        }
    }
}
