import java.util.Scanner;

public class Main {
    /**
     * Программа выводит являтся ли строка палиндромом или нет.
     * На вход подается строка без символов:".", ",", "-", ";" и т.п.
     * В строке происходит удаление пробелов и преобразование всех символов к нижнему регистру,результат записывается в s
     * sb нужен для разворота строки.Результат записывается в новую переменную и сравнивается с изначальной строкой
     *
     * @author JuliSosnova
     * @version 2.0
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку,состоящую из букв/цифр/пробелов");
        String s = (in.nextLine().replaceAll(" ", "")).toLowerCase();
        StringBuffer sb=new StringBuffer(s);
        String s_reverse=sb.reverse().toString();
        if(s.equals(s_reverse)){
            System.out.println("палиндром");
        }
        else{
            System.out.println("не палиндром");
        }
    }
}