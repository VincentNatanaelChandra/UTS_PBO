/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Vincent
 */
public class Comment {
    private String commentId;
    private String text;
    private ContentState status;

    public Comment(String commentId, String text, ContentState status) {
        this.commentId = commentId;
        this.text = text;
        this.status = status;
    }

    

    public String getCommentId() {
        return commentId;
    }

    public String getText() {
        return text;
    }

    public ContentState getStatus() {
        return status;
    }

    

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setStatus(ContentState status) {
        this.status = status;
    }

    
    
    
}
