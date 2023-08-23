package project.diy.domain;

public class ProgressStatusCode {

    private ProgressStatus progressStatus;

    public enum ProgressStatus {
        IN_PROGRESS, DONE, PENDING, ABANDONED
    }
}
