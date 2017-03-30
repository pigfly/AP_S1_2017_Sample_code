package au.edu.rmit.week5;

/**
 * Created by alexj on 30/3/17.
 */
public class Runner {

    public static class Main {

        public static void main(String[] args) {
            Course course = new Course();
            InClassSchoolPolicy inClassPolicy = new InClassSchoolPolicy();
            FinalTestSchoolPolicy finalClassPolicy = new FinalTestSchoolPolicy();

            BusinessCoordinator b1 = new BusinessCoordinator(course, inClassPolicy);
            BusinessCoordinator b2 = new BusinessCoordinator(course, finalClassPolicy);
            System.out.println("Hello World!");
        }
    }
}
