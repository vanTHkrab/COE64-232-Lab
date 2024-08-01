package Object.Lab8_1;

public class SmsDemo {
    public static void main(String[] args) {
        SMS sms1 = new SMS("4888051");
        SMS sms2 = new SMS("494999");
        SMS sms3 = new SMS("4888051");
        sms1.readAs();
        sms2.readAs();
        sms3.readAs();

        if (sms1.equals(sms2)) {
            System.out.println("SMS Number 1 is equal to SMS Number 2");
        } else {
            System.out.println("SMS Number 1 is not equal to SMS Number 2");
        }

        if (sms1.equals(sms3)) {
            System.out.println("SMS Number 1 is equal to SMS Number 3");
        } else {
            System.out.println("SMS Number 1 is not equal to SMS Number 3");
        }
        System.out.println("Bye Bye!!!"); 
    }
    
    public boolean equals(Object anotherObject) {
        String s, t;
        s = this.toString();
        t = anotherObject.toString();
        return s.equals(t);
    }
    
}
