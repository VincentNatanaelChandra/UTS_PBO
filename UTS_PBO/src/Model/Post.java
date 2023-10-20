/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Timestamp;  
import java.util.ArrayList;

/**
 *
 * @author Vincent
 */
public abstract class Post {
    private String postId;
    private ContentState status;
    private Timestamp timeUpload; 
    private ContentType postType;
    private ArrayList <Comment> listComment;

    public Post(String postId, ContentState status, Timestamp timeUpload, ContentType postType, ArrayList<Comment> listComment) {
        this.postId = postId;
        this.status = status;
        this.timeUpload = timeUpload;
        this.postType = postType;
        this.listComment = listComment;
    }

    

    public String getPostId() {
        return postId;
    }

    public ContentState getStatus() {
        return status;
    }

    

    public Timestamp getTimeUpload() {
        return timeUpload;
    }

    public ContentType getPostType() {
        return postType;
    }

    public ArrayList<Comment> getListComment() {
        return listComment;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public void setStatus(ContentState status) {
        this.status = status;
    }


    public void setTimeUpload(Timestamp timeUpload) {
        this.timeUpload = timeUpload;
    }

    public void setPostType(ContentType postType) {
        this.postType = postType;
    }    

    public void setListComment(ArrayList<Comment> listComment) {
        this.listComment = listComment;
    }
    
    
}
