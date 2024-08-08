package Object.Lab9_2;

public class Teacher {
    private String name;
    private char gender;
    private int age;
    private char status;

    public Teacher() {
    }

    public Teacher(String name, char gender, int age, char status) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public char getGender() {
        return gender;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char s) {
        status = s;
    }

    public String toString() {
        String s = "", g = "";
        switch (this.status) {
            case 'M':
                s = "Marriage";
                break;
            case 'S':
                s = "Single";
                break;
            default:
                break;
        }
        switch (this.gender) {
            case 'M':
                g = "Male";
                break;
            case 'F':
                g = "Female";
                break;
            default:
                break;
        }
        return this.name + ", " + g + ", " + s + ", " + this.age;
    }





}
