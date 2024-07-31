package testemplo;

public class ProgrammingLanguage {
    String language_name;
    String language_type;


    void ProgrammingLanguage(String name, String type) {
        language_name = name;
        language_type = type;
    }

    void setname(String name) {
        language_name = name;
    }

    void display() {
        System.out.println(language_name + " " + language_type);
    }


}
