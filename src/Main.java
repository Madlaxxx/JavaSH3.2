public class Main {
    public static void main(String[] args) {
        int x = 300;
        int y = 1300;
        int percent = 1;

        int bonus;

        if(y>=1000) {
            bonus = y * percent / 100 + x + y;
        } else {
            bonus = x + y;
        }

        System.out.println(bonus);
    }
}