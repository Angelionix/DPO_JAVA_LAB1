public class Student {
    public String name;
    public int group;
    public int course;
    public int[] marks;

    Student(String name, int group, int course, int[] marks)
    {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public int medianMark()
    {
        int sum=0;
        for (int i=0; i<marks.length; i++)
        {
            sum += marks[i];
        }
        return sum/marks.length;
    }
    public String marksToString()
    {
        String s = "";
        for (int i=0; i<marks.length; i++)
        {
            s += marks[i] + " ";
        }
        return s;
    }
}
