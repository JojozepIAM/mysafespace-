package com.mysafespace.moderation;

import java.time.LocalDateTime;

/**
 * Recommendation - Data model for peer recommendations
 */
public class Recommendation {
    private int id;
    private String authorName;
    private String authorEmail;
    private String title;
    private String content;
    private String category;
    private LocalDateTime submittedDate;
    private String approvalStatus; // 'pending', 'approved', 'rejected'
    private boolean isPublished;

    public Recommendation(int id, String authorName, String authorEmail, String title,
                          String content, String category, LocalDateTime submittedDate,
                          String approvalStatus, boolean isPublished) {
        this.id = id;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.title = title;
        this.content = content;
        this.category = category;
        this.submittedDate = submittedDate;
        this.approvalStatus = approvalStatus;
        this.isPublished = isPublished;
    }

    // Getters
    public int getId() { return id; }
    public String getAuthorName() { return authorName; }
    public String getAuthorEmail() { return authorEmail; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getCategory() { return category; }
    public LocalDateTime getSubmittedDate() { return submittedDate; }
    public String getApprovalStatus() { return approvalStatus; }
    public boolean isPublished() { return isPublished; }

    @Override
    public String toString() {
        return "Recommendation{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", category='" + category + '\'' +
                ", approvalStatus='" + approvalStatus + '\'' +
                ", isPublished=" + isPublished +
                '}';
    }
}
