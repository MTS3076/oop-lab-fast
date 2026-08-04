package Lab09;
interface Recorded {
    default void playVideo() {
        System.out.println("[Recorded] Playing pre-recorded video...");
    }
}

interface Live {
    default void playVideo() {
        System.out.println("[Live] Streaming live video...");
    }
}

abstract class Course {
    protected String title;
    protected String instructor;

    public Course(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
    }

    public abstract void startSession();

    public void showInfo() {
        System.out.println("Course     : " + title);
        System.out.println("Instructor : " + instructor);
    }
}

class RecordedCourse extends Course implements Recorded {

    public RecordedCourse(String title, String instructor) {
        super(title, instructor);
    }

    @Override
    public void startSession() {
        System.out.println("[RecordedCourse] Starting pre-recorded session for: " + title);
        playVideo();
    }
}

class LiveCourse extends Course implements Live {

    public LiveCourse(String title, String instructor) {
        super(title, instructor);
    }

    @Override
    public void startSession() {
        System.out.println("[LiveCourse] Starting live session for: " + title);
        playVideo();
    }
}

class HybridCourse extends Course implements Recorded, Live {

    private boolean isLiveNow;

    public HybridCourse(String title, String instructor, boolean isLiveNow) {
        super(title, instructor);
        this.isLiveNow = isLiveNow;
    }

    @Override
    public void playVideo() {
        if (isLiveNow) {
            Live.super.playVideo();
        } else {
            Recorded.super.playVideo();
        }
    }

    public void playRecorded() {
        Recorded.super.playVideo();
    }

    public void playLive() {
        Live.super.playVideo();
    }

    @Override
    public void startSession() {
        System.out.println("[HybridCourse] Starting hybrid session for: " + title);
        playVideo();
    }

    public void setLiveNow(boolean isLiveNow) {
        this.isLiveNow = isLiveNow;
    }
}

class OnlinePlatform {

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("  Online Learning Platform   ");
        System.out.println("==============================");

        RecordedCourse rc = new RecordedCourse("Java Basics", "Dr. Ahmed");
        System.out.println("\n--- Recorded Course ---");
        rc.showInfo();
        rc.startSession();

        LiveCourse lc = new LiveCourse("Data Structures", "Prof. Sara");
        System.out.println("\n--- Live Course ---");
        lc.showInfo();
        lc.startSession();

        HybridCourse hc = new HybridCourse("Machine Learning", "Dr. Ali", false);
        System.out.println("\n--- Hybrid Course (Recorded Mode) ---");
        hc.showInfo();
        hc.startSession();

        System.out.println("\n--- Hybrid Course (Switching to Live Mode) ---");
        hc.setLiveNow(true);
        hc.startSession();

        System.out.println("\n--- Hybrid Course (Both Modes Explicitly) ---");
        hc.playRecorded();
        hc.playLive();

        System.out.println("\n==============================");
        System.out.println("  Platform Loaded OK          ");
        System.out.println("==============================");
    }
}
