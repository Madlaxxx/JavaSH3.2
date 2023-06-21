public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int pay = 1300;
        int percent = 1;
        int bonus;
        if (pay >= 1000) {
            bonus = pay * percent / 100 + balance + pay;
        } else {
            bonus = balance + pay;
        }
        System.out.println(bonus);
    }
}