package pr15;
import java.util.ArrayList;
import java.util.LinkedList;
public class CollectionApp {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();
        // добавим в список ряд элементов
        animals.add("Кошка");
        animals.add("Собака");
        animals.add("Крокодил");
        animals.add("Зебра");
        animals.add(1, "Зебра"); // добавляем элемент по индексу 1

        System.out.println(animals.get(1));// получаем 2-й объект
        animals.set(2, "Носорог"); // установка нового значения для 3-го объекта

        System.out.printf("В списке %d животных \n", animals.size());
        for(String state : animals){

            System.out.println(state);
        }

        if(animals.contains("Кошка")){

            System.out.println("Список содержит животное Кошка");
        }

        // удалим несколько объектов
        animals.remove("Кошка");
        animals.remove(0);

        Object[] countries = animals.toArray();
        for(Object country : countries){

            System.out.println(country);
        }
        LinkedList<String> subjects = new LinkedList<String>();

        // добавим в список ряд элементов
        subjects.add("Обществознание");
        subjects.add("Окружающий мир");
        subjects.addLast("Программирование"); // добавляем на последнее место
        subjects.addFirst("Правоведение"); // добавляем на первое место
        subjects.add(3, "История"); // добавляем элемент по индексу 1

        System.out.printf("В списке %d предметов \n", subjects.size());
        System.out.println(subjects.get(1));
        subjects.set(1, "Литература");
        for(String state : subjects){

            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(subjects.contains("Русский")){

            System.out.println("Список содержит предмет Русский");
        }

        subjects.remove("Русский");
        subjects.removeFirst(); // удаление первого элемента
        subjects.removeLast(); // удаление последнего элемента

    }
}
