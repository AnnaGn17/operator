public class Main {
    public static void main(String[] args) {
        int y = 2021;
        if (y % 4 == 0 && y != 0 || y % 400 == 0) {System.out.println("год високосный");
        } else {System.out.println("год не високосный");}
    }
}