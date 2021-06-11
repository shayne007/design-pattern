package designpattern.patterns.create.prototype;

/**
 * @author fengsy
 * @date 6/12/21
 * @Description
 */


// 实现 Cloneable 接口的原型抽象类 Prototype
class Student implements Cloneable {
    private String name;
    private Teacher teacher;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    // 重写 clone 方法
    @Override
    public Student clone() {
        Student prototype = null;
        try {
            prototype = (Student) super.clone();
            //Teacher teacher = this.teacher.clone();//深拷贝
            //prototype.setTeacher(teacher);//
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}

class Teacher implements Cloneable {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Teacher clone() {
        Teacher prototype = null;
        try {
            prototype = (Teacher) super.clone();

        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }
        return prototype;
    }

}


public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("Mr Wong");
        Student student = new Student();
        student.setName("Jack");
        student.setTeacher(teacher);

        Student student2 = student.clone();
        student2.setName("Jason");
        student2.getTeacher().setName("Miss Zhao");
        System.out.println("student " + student.getName() + "'s teacher is " + student.getTeacher().getName());
        System.out.println("student " + student2.getName() + "'s teacher is " + student2.getTeacher().getName());
    }
}

