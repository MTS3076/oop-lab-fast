package Lab09;

abstract class Course2 {
    abstract void startCourse();
}

interface Assignment {
    void conduct();
}

interface Quiz {
    void conduct();
}

class ProgrammingCourse extends Course2 implements Assignment, Quiz {

    public void startCourse() {
        System.out.println("Programming course started.");
    }

    public void assignmentTask() {
        System.out.println("Assignment given to students.");
    }

    public void quizTask() {
        System.out.println("Quiz conducted for students.");
    }

    public void conduct() {
        assignmentTask();
        quizTask();
    }

    public static void main(String[] args) {
        ProgrammingCourse c = new ProgrammingCourse();

        c.startCourse();
        c.conduct();

        Course2 guestInstructor = new Course2() {
            public void startCourse() {
                System.out.println("Guest instructor started a special session.");
            }
        };

        guestInstructor.startCourse();
    }
}
