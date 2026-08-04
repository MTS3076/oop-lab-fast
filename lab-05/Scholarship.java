package Lab05;

public class Scholarship {
    public static void main(String[] args) {
        int marks[] = {65, 72, 40, 50, 99, 37, 79, 86, 90, 100, 59, 66};
        int fullScholarship = 0;
        int halfScholarship = 0;
        int noScholarship = 0;
        int belowAverage=0;
        int total = 0;

        for(int i=0;i<marks.length;i++){
            if(marks[i]<40){
                marks[i]=40;
            }
        }
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
            if (marks[i] > 85) {
                fullScholarship++;
            } else if (marks[i] >= 70 && marks[i] <= 85) {
                halfScholarship++;
            } else {
                noScholarship++;
            }
            }
        double average = total/(double) marks.length;
        for(int i=0;i<marks.length;i++){
            if(marks[i]<average){
                belowAverage++;
            }
        }
        System.out.println("Full Scholarship receiver " + fullScholarship);
        System.out.println("Half Scholarship receiver " + halfScholarship);
        System.out.println("No Scholarship receiver " + noScholarship);
        System.out.println("Class Average " + average);
        System.out.println("Student scored below average " + belowAverage);
        System.out.println("Marks after Grace Marks Policy ");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
