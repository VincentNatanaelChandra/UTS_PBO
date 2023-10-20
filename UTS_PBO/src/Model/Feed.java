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
public class Feed extends Post{
    private int duration;
    private int likes;

    public Feed(int duration, int likes, String postId, ContentState status, Timestamp timeUpload, ContentType postType, ArrayList<Comment> listComment) {
        super(postId, status, timeUpload, postType, listComment);
        this.duration = duration;
        this.likes = likes;
    }

    

    public int getDuration() {
        return duration;
    }

    public int getLikes() {
        return likes;
    }

    

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    
    
    
}
