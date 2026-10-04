package com.mysafespace.moderation;

import java.time.LocalDateTime;

/**
 * Comment - Data model for page comments
 */
public class Comment {
    private int id;
    private String pageSection; // e.g., 'resources', 'services', 'about'
    private String authorName;
    private String authorEmail;
    private String commentText;
    private LocalDateTime submittedDate;
    private String approvalStatus; // 'pending', 'approved', 'rejected'
    private boolean isPublished;

    public Comment(int id, String pageSection, String authorName, String authorEmail,
                   String commentText, LocalDateTime submittedDate, String approvalStatus,
                   boolean isPublished) {
        this.id = id;
        this.pageSection = pageSection;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.commentText = commentText;
        this.submittedDate = submittedDate;
        this.approvalStatus = approvalStatus;
        this.isPublished = isPublished;
    }

    // Getters
    public int getId() { return id; }
    public String getPageSection() { return pageSection; }
    public String getAuthorName() { return authorName; }
    public String getAuthorEmail() { return authorEmail; }
    public String getCommentText() { return commentText; }
    public LocalDateTime getSubmittedDate() { return submittedDate; }
    public String getApprovalStatus() { return approvalStatus; }
    public boolean isPublished() { return isPublished; }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", pageSection='" + pageSection + '\'' +
                ", authorName='" + authorName + '\'' +
                ", approvalStatus='" + approvalStatus + '\'' +
                ", isPublished=" + isPublished +
                '}';
    }
}
