import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        System.out.println("Предлагаем Вам пройти опросник с арифметическими операциями. " +
        "Для выхода из опросника введите слово exit");
        int number1 = random.nextInt(10+1);
        int number2 = random.nextInt(10+1);
        int result = number1 + number2;
        System.out.println("Сколько будет " + number1 + '+' + number2 +'?');
        int answer = scanner.nextInt();


        for (int counter = 0; answer == Integer.parseInt(("exit")); counter = counter + 1) {
        if (answer == result) {
        System.out.println("Ваш ответ: " + answer + " " + "Правильный ответ: " + result + " " + "Текущее количество баллов: " + (score+5));
        }
        else {
        System.out.println("Ваш ответ: " + answer + " " + "Правильный ответ: " + result + " " + "Текущее количество баллов: " + (score-5));
        }

        System.out.println("Ура! Опросник завершен. Ваш финальный счет: " + score);

        }

        }
        
    }
