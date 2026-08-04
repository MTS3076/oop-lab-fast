package Lab07;

class Course {
    public void calculateGrade(int assignments, int exams) {
        int grade = (assignments + exams) / 2;
        System.out.println("Generic course grade: " + grade);
    }
}

class ProgrammingCourse extends Course {
    @Override
    public void calculateGrade(int assignments, int exams) {
        int grade = (int)(assignments * 0.4 + exams * 0.6);
        System.out.println("Programming course grade: " + grade);
    }
}

class MathematicsCourse extends Course {
    @Override
    public void calculateGrade(int assignments, int exams) {
        int grade = (int)(assignments * 0.3 + exams * 0.7);
        System.out.println("Mathematics course grade: " + grade);
    }
}

class DesignCourse extends Course {
    @Override
    public void calculateGrade(int assignments, int exams) {
        int grade = (int)(assignments * 0.5 + exams * 0.5);
        System.out.println("Design course grade: " + grade);
    }
}

public class CourseSystem {
    public static void main(String[] args) {
        Course c1 = new ProgrammingCourse();
        Course c2 = new MathematicsCourse();
        Course c3 = new DesignCourse();

        c1.calculateGrade(85, 90);
        c2.calculateGrade(80, 95);
        c3.calculateGrade(75, 85);
    }
}
