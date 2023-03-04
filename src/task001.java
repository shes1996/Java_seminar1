import java.util.Scanner;

public class task001 {
    //Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    //Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”


        public static void main(String[] args) {
            Scanner name = new Scanner(System.in);
            System.out.print("Name is ");
            String name1 = name.nextLine();
            name.close();
            System.out.println("Hello, " + name1);
        }
    }




