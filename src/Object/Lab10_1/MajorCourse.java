package Object.Lab10_1;

public class MajorCourse extends Course {
    protected int year;

    public MajorCourse() {
    }

    public MajorCourse(String c, int u, String g, int y) {
        super(c, u, g);
        this.year = y;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return super.toString() + "   year " + year;
    }
}
