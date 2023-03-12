import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        double result = 0.0;
        while (true) {
            System.out.println("Ділення - \"/\" множення - \"*\" додавання - \"+\" віднімання - \"-\" корінь - \"\\\" якщо відсоток від числа - \"%\". Щоб вийти - \"q\"");
            System.out.println("Введіть що потрібно зробити:");
            input = scan.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            switch (input) {
                case "%":
                    System.out.println("Введіть процент: ");
                    double one10 = scan.nextDouble();
                    System.out.println("Введіть число: ");
                    double two11 = scan.nextDouble();
                    double resultone = one10 / 100;
                    result = resultone * two11;
                    break;
                case "\\":
                    System.out.println("Введіть число: ");
                    double one8 = scan.nextDouble();
                    result = Math.sqrt(one8);
                    break;
                case "/":
                    System.out.println("Введіть число: ");
                    double one = scan.nextDouble();
                    System.out.println("Введіть друге число: ");
                    double two = scan.nextDouble();
                    result = one / two;
                    break;
                case "+":
                    System.out.println("Введіть число: ");
                    double one1 = scan.nextDouble();
                    System.out.println("Введіть друге число: ");
                    double two1 = scan.nextDouble();
                    result = one1 + two1;
                    break;
                case "-":
                    System.out.println("Введіть число: ");
                    double one2 = scan.nextDouble();
                    System.out.println("Введіть друге число: ");
                    double two2 = scan.nextDouble();
                    result = one2 - two2;
                    break;
                case "*":
                    System.out.println("Введіть число: ");
                    double one3 = scan.nextDouble();
                    System.out.println("Введіть друге число: ");
                    double two3 = scan.nextDouble();
                    result = one3 * two3;
                    break;
                default:
                    System.out.println("Невірний символ");
                    break;
            }
            System.out.println("Результат: " + result);
            // очистити буфер сканера
            scan.nextLine();
        }
    }
}
