package Object.Lab9_2;

public class PhoneNumber {
    private String number;

    public PhoneNumber() {
    }

    public PhoneNumber(String number) {
        this.number = number;
    }

    public void readAs() {
        String[] number = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        for (int i = 0; i < this.number.length(); i++) {
            int digit = this.number.charAt(i) - '0';
            System.out.print(number[digit] + " ");
        }
        System.out.println();
    }

    public int[] calFreq() {
        int[] result = new int[10];
        for (int i = 0; i < this.number.length(); i++) {
            int digit = this.number.charAt(i) - '0';
            result[digit] ++;;
        }
        return result;
    }

    // {0, 4, 2, 0, 0, 0, 0, 0, 0, 0}

    public String toString() {
        return this.number;
    }
}
