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
public class Story extends Post{
    private String caption;
    private int views;

    public Story(String caption, int views, String postId, ContentState status, Timestamp timeUpload, ContentType postType, ArrayList<Comment> listComment) {
        super(postId, status, timeUpload, postType, listComment);
        this.caption = caption;
        this.views = views;
    }

    public int getViews() {
        return views;
    }

    

    public String getCaption() {
        return caption;
    }

    

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setViews(int views) {
        this.views = views;
    }

    
    
    
}
