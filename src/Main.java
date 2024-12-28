import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String[] names = {"Александр", "Анна", "Борис", "Вера", "Григорий", "Дарья", "Евгений", "Екатерина", "Иван",
                "Ирина", "Кирилл", "Ксения", "Леонид", "Мария", "Михаил", "Наталья", "Николай", "Ольга", "Павел",
                "Светлана", "Роман", "Татьяна", "Сергей", "Юлия", "Дмитрий", "Елена", "Андрей", "Анастасия",
                "Артем", "Виктория"};
        List<Student> students = new ArrayList<Student>();
        // Studetn Initialise
        for (int i=0; i < 50; i++)
        {
            int[] marks = new int[10];
            for (int j=0; j < 10; j++)
            {
                marks[j] = rand.nextInt(1,6);
            }
            Student newStudent = new Student(names[rand.nextInt(names.length-1)], rand.nextInt(100), rand.nextInt(1,6), marks);
            students.add(newStudent);
        }

        // Показываем список до
        for (int i=0; i < students.size(); i++)
        {
            System.out.println("name: "+ students.get(i).name +"  Group:"+ students.get(i).group +
                    " Course:"+ students.get(i).course +" Marks:"+ students.get(i).marksToString() +
                    " Average mark:"+students.get(i).medianMark());
        }

        // Выводим список студентов определенного курса.. например 3
        printStudents(students, 3);

        //  отсккем двоеников
        separateStudents(students);

        //список после чистки
        for (int i=0; i < students.size(); i++)
        {
            System.out.println("name: "+ students.get(i).name +"  Group:"+ students.get(i).group +
                    " Course:"+ students.get(i).course +" Marks:"+ students.get(i).marksToString() +
                    " Average mark:"+students.get(i).medianMark());
        }

    }

    private static void printStudents(List<Student> students, int course)
    {
        for(int i=0; i < students.size(); i++)
        {
            if (students.get(i).course == course)
            {
                System.out.println(students.get(i).name);
            }
        }
    }

    private static void separateStudents(List<Student> students)
    {
        for(int i=0; i < students.size(); i++)
        {
            if (students.get(i).medianMark() < 3)
            {
                students.remove(i);
                i -= 1;
            }

        }
    }



}