package weiboclient4j.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * @author Hover Ruan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentList {
    private List<Comment> comments;
    private long previousCursor;
    private long nextCursor;
    private int totalNumber;
    private boolean hasvisible;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public long getPreviousCursor() {
        return previousCursor;
    }

    public void setPreviousCursor(long previousCursor) {
        this.previousCursor = previousCursor;
    }

    public long getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(long nextCursor) {
        this.nextCursor = nextCursor;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public boolean isHasvisible() {
        return hasvisible;
    }

    public void setHasvisible(boolean hasvisible) {
        this.hasvisible = hasvisible;
    }
}
