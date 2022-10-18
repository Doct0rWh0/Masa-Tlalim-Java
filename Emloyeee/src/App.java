import java.util.Scanner;
import java.lang.*;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int amount = in.nextInt();
        Employee[] employeesList = new Employee[amount];

        System.out.println("Let's fill the employees list:");
        for (int i = 0; i < amount; i++) {
            employeesList[i] = new Employee();
            System.out.println("Enter " + (i + 1) + " employee name: ");
            employeesList[i].name = input.nextLine();
            System.out.println("Enter " + (i + 1) + " employee salary: ");
            employeesList[i].salary = in.nextInt();
            System.out.println("Enter " + (i + 1) + " employee office hours: ");
            employeesList[i].work = in.nextInt();
        }
        boolean breaker = true;
        while (breaker == true){
            System.out.println("What do you want to do:\n" +
                    "1 : Find information about employee\n" +
                    "2 : Add 10$ to employee's salary if it's lower than 500$\n" +
                    "3 : Add 5$ to employee's salary if his office hours > 6\n" +
                    "0 : Stop the program");


            String choice = input.nextLine();
            String info;
            int i;
            switch (choice){
                case "1":
                    System.out.println("Enter employee's name: ");
                    info = input.nextLine();

                    i = 0;
                    for (i = 0; i < amount; i++) {
                        if (employeesList[i].name.equals(info)) {
                            employeesList[i].getInfo();
                        }
                    }
                    break;
                case "2":
                    System.out.println("Enter employee's name: ");
                    info = input.nextLine();
                    for (i = 0; i < amount; i++) {
                        if (employeesList[i].name.equals(info))
                            employeesList[i].AddSal();
                    }
                    break;
                case "3":
                    System.out.println("Enter employee's name: ");
                    info = input.nextLine();
                    for (i = 0; i < amount; i++) {
                        if (employeesList[i].name.equals(info))
                            employeesList[i].AddWork();
                    }
                    break;
                case "0":
                    breaker = false;
                    break;
                default:
                    System.out.println("Try again");
                    break;

            }
        }
        System.out.println("Bye");

        }
}
//    Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//    ФИО,номер читательского билета,факультет,дата рождения,телефон.Методы takeBook(), returnBook().
//    Разработать программу, в которой создается массив объектов данного класса.Перегрузить методы takeBook(), returnBook():
//        - takeBook, который будет принимать количество взятых книг.
//        Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//        - takeBook, который будет принимать переменное количество названий книг.
//        Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        - takeBook, который будет принимать переменное количество объектов класса Book
//        (создать новый класс, содержащий имя и автора книги).
//        Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        Аналогичным образом перегрузить метод returnBook().
//        Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия"
//        Или  "Петров В. В. вернул 3 книги".
