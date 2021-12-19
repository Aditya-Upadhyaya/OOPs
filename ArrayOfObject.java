
class Subject
{
    private String subId;
    private String name;
    private int maxMarks;
    private int obtMark;

    public Subject(String s , String n, int m)
    {
        subId=s;
        name=n;
        maxMarks=m;
    }
    public String getsubId()
    {
        return subId;
    }
    public String getName()
    {
        return name;
    }
    public int getMAxMark()
    {
        return maxMarks;
    }
    public int getObtainMark()
    {
        return obtMark;
    }
    public void setObtainMark(int n)
    {
        obtMark=n;
    }
    public boolean isQualified()
    {
        return obtMark >= (maxMarks*40)/100;
    }
    public String toString()
    {
        return "Subject Id = "+ subId +"\nSubject name = "+ name+"\nMax Marks = "+ maxMarks+"\nObtained Marks = "+obtMark + "\nIs Qualified : " + isQualified();
    }
    

}
class Student
{
    private String rollNo;
    private String name;
    private String dept;
    // private String subjects[];
    Subject s2[];

    public Student(String r, String n,String d , Subject ...s)
    {
        rollNo=r;
        this.name=n;
        dept=d;
        s2=new Subject[s.length];
        for (int i = 0; i < s.length; i++) {
            s2[i]=s[i];
        }
    }
    public void display()
    {
        System.out.println("Roll no. = "+rollNo);
        System.out.println("Name = "+name);
        System.out.println("Department = "+dept);
        for (Subject s : s2) {
            System.out.println();
            System.out.print(" "+s);
        }

    }


}
public class ArrayOfObject {
    public static void main(String[] args) {
        Subject sub[]=new Subject[3];
        sub[0]=new Subject("D-105", "Data Structure", 100);
        sub[1]=new Subject("A-207", "Algorithm", 200);
        sub[2]=new Subject("P-423", "Python", 150);
        sub[0].setObtainMark(50);
        sub[1].setObtainMark(150);
        sub[2].setObtainMark(75);
        Student s3=new Student("AS-1544887", "Mike", "CS", sub);
        s3.display();
    }
}
