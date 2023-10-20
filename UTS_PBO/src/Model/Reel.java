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
public class Reel extends Post{
    private int duration;
    private int playedCount;

    public Reel(int duration, int playedCount, String postId, ContentState status, Timestamp timeUpload, ContentType postType, ArrayList<Comment> listComment) {
        super(postId, status, timeUpload, postType, listComment);
        this.duration = duration;
        this.playedCount = playedCount;
    }

    

    public int getDuration() {
        return duration;
    }

    public int getPlayedCount() {
        return playedCount;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPlayedCount(int playedCount) {
        this.playedCount = playedCount;
    }
    
    
}
