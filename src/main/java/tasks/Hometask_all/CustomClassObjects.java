package tasks.Hometask_all;

import java.io.IOException;
import java.util.HashMap;

public class CustomClassObjects {
    public static class Student {
        private int rollno;
        private String name;
        public Student(int rollno, String name)
        {
            this.rollno = rollno;
            this.name = name;
        }

        public String getname()
        {
            return this.name;
        }

        public int getmarks()
        {
            return this.rollno;
        }

        public void setname(String name)
        {
            this.name = name;
        }

        public void setmarks(int rollno)
        {
            this.rollno = rollno;
        }

        @Override
        public int hashCode()
        {
            final int temp = 14;
            int ans = 1;
            ans = temp * ans + rollno;
            return ans;
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            Student other = (Student)o;
            if (this.rollno != other.rollno) {
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException
    {
        HashMap<Student, String> map = new HashMap<>();
        Student one = new Student(1, "Student1");
        Student two = new Student(2, "Student2");
        map.put(one, one.getname());
        map.put(two, two.getname());
        one.setname("Not Student1");
        two.setname("Not Student2");
        System.out.println(map.get(one));
        System.out.println(map.get(two));
        Student three = new Student(1, "Student3");
        System.out.println(map.get(three));
    }
}