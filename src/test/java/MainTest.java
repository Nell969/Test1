public class MainTest {
    public static void main(String[] args) {

        // Задание 1
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
        // Задание 2

        String str = "make install";
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        System.out.println(reversedStr);

        // Задание 3
        double a = 1;
        double b = 4;
        double c = 7;

        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            double kor1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double kor2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения: " + kor1 + " и " + kor2);
        } else {
            System.out.println("Нет вещественных корней");
        }
    }
}







