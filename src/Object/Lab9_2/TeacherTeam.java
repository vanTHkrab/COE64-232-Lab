package Object.Lab9_2;

public class TeacherTeam {
    public static void main(String[] args) {
        Teacher[] t = new Teacher[5];
        t[0] = new Teacher("AAA", 'F', 40, 'M');
        t[1] = new Teacher("BBB", 'M', 51, 'S');
        t[2] = new Teacher("CCC", 'M', 39, 'M');
        t[3] = new Teacher("DDD", 'F', 45, 'S');
        t[4] = new Teacher("FFF", 'F', 31, 'S');

        System.out.println("Teacher Team: 5 Persons");
        for (int i = 0; i < t.length; i++) {
            System.out.println((i + 1) + ". " + t[i]);
        }
        System.out.println("==================================");
        displayCountGender(t);
        displayCountStatus(t);
        displayAverageAge(t);
    }

    public static void displayCountGender(Teacher[] t) {
        int countMale = 0, countFemale = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i].getGender() == 'M') {
                countMale++;
            } else {
                countFemale++;
            }
        }
        System.out.printf("No. of Female: %d, No. of Male: %d\n", countFemale, countMale);
    }

    public static void displayCountStatus(Teacher[] t) {
        int countMarriage = 0, countSingle = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i].getStatus() == 'M') {
                countMarriage++;
            } else {
                countSingle++;
            }
        }
        System.out.printf("No. of Single: %d, No. of Marriage: %d\n", countMarriage, countSingle);
    }

    public static void displayAverageAge(Teacher[] t) {
        int sum = 0, min = t[0].getAge(), max = t[0].getAge();
        for (int i = 0; i < t.length; i++) {
            sum += t[i].getAge();
            if (t[i].getAge() < min) {
                min = t[i].getAge();
            } else if (t[i].getAge() > max) {
                max = t[i].getAge();
            }
        }
        System.out.printf("Average age: %.2f, Min: %d, Max: %d\n", (float) sum / t.length, min, max);
    }
}
