package builder_design_pattern;

public class BuilderDesignPatternTest {
    public static void main(String[] args) {

        Student student =new Student.StudentBuilder("Chandan", "Singh")
                .address("Bangalore")
                .age(25)
                .build();
    }
}
