import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }

    public static void getDeviceLink(int osType, int manufacturingYear) {
        if (osType != 1 && osType != 0) {
            throw new IllegalArgumentException("Wrong OS type");
        }
        int currentYear = LocalDate.now().getYear();
        if (manufacturingYear > currentYear) {
            throw new IllegalArgumentException("Wrong manufacturing year");
        }
        String osString = osType == 0 ? "iOS" : "Android";
        String versionString = manufacturingYear > 2015 ? "полную" : "облегченную";
        System.out.printf("Установите %s версию для %s по ссылке%n", versionString, osString);
    }

    public  static  int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
        }
    }
}