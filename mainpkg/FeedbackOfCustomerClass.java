
package mainpkg;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class FeedbackOfCustomerClass implements Serializable{
    private String feedback;
    private int feedbackValue;

    public FeedbackOfCustomerClass(String feedback, int feedbackValue) {
        this.feedback = feedback;
        this.feedbackValue = feedbackValue;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getFeedbackValue() {
        return feedbackValue;
    }

    public void setFeedbackValue(int feedbackValue) {
        this.feedbackValue = feedbackValue;
    }

    @Override
    public String toString() {
        return "FeedbackOfCustomerClass{" + "feedback=" + feedback + ", feedbackValue=" + feedbackValue + '}';
    }
    
}
