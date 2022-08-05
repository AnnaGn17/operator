public class Main {
    public static void main(String[] args) {

        int deliveryDisstance = 95;
        int dayDisstance = deliveryDisstance / 30;
        if (deliveryDisstance <= 20) {System.out.println ("1 день");

        } else if ( dayDisstance > 0) {System.out.println (dayDisstance + " доставка");

        }
    }
}