import java.util.InputMismatchException;
import java.util.Scanner;

public class Java314Berkutov_HW4_switch {
    public static void main(String[] args){
        System.out.println(0/.0 == 0/.0);
        task1();
        task2();
    }

    public static void task1(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите номер месяца: ");
            int month = scanner.nextInt();
            String result;
            switch (month){
                case 1:
                    result = "Январь";
                    break;
                case 2:
                    result = "Февраль";
                    break;
                case 3:
                    result = "Март";
                    break;
                case 4:
                    result = "Апрель";
                    break;
                case 5:
                    result = "Май";
                    break;
                case 6:
                    result = "Июнь";
                    break;
                case 7:
                    result = "Июль";
                    break;
                case 8:
                    result = "Август";
                    break;
                case 9:
                    result = "Сентябрь";
                    break;
                case 10:
                    result = "Октябрь";
                    break;
                case 11:
                    result = "Ноябрь";
                    break;
                case 12:
                    result = "Декабрь";
                    break;
                default:
                    result = "Некорректный номер месяца";
            }
            System.out.println(result);
        } catch(InputMismatchException e){
            System.out.println("Введенные данные не являются числом");
        }
    }

    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        try{
            while(true) {
                String action;
                System.out.print("Веберите действие:");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        action = "Открыть файл";
                        break;
                    case 2:
                        action = "Прочитать данные из файла";
                        break;
                    case 3:
                        action = "Зашифровать данные";
                        break;
                    case 4:
                        action = "Расшифровать данные";
                        break;
                    case 5:
                        action = "Записать данные в файл";
                        break;
                    case 6:
                        action = "Закрыть файл";
                        break;
                    case 7:
                        action = "Копировать файл";
                        break;
                    case 8:
                        action = "Переместить файл";
                        break;
                    case 9:
                        action = "Удалить файл";
                        break;
                    default:
                        System.out.println("Действие по умолчанию - Завершение работы");
                        return;
                }
                System.out.println("Выбранное действие: " + action);
            }

        } catch (InputMismatchException e){
            System.out.println("Введенные данные не являются числом");
            System.out.println("Завершение работы");
        }

    }
}
