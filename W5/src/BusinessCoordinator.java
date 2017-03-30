package au.edu.rmit.week5;

/**
 * Created by alexj on 30/3/17.
 */
public class BusinessCoordinator extends Coordinator {
    private Course dummyCourse;
    private SchoolPolicy policy;

    public BusinessCoordinator(Course dummyCourse, SchoolPolicy policy) {
        this.dummyCourse = dummyCourse;
        this.policy = policy;
    }
}
