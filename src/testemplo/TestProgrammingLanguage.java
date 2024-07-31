package testemplo;

public class TestProgrammingLanguage {
    public static void main(String[] args) {
        ProgrammingLanguage pl1 = new ProgrammingLanguage();
        ProgrammingLanguage pl2 = new ProgrammingLanguage();
        pl1.ProgrammingLanguage("Java", "OOP");
        pl2.ProgrammingLanguage("Python", "Scripting");
        pl1.display();
        pl2.display();
    }
}
