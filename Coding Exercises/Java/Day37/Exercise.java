package Java.Day37;

public class Exercise {
  public static char gradeStudent(int score){
      if (score >= 90) {
          return 'A';
      } else if (score >= 80) {
          return 'B';
      } else if (score >= 70) {
          return 'C';
      } else if (score >= 60) {
          return 'D';
      } else {
          return 'F';
      }
  }
}
