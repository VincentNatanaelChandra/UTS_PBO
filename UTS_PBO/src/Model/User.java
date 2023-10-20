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
public class User {
    private String userId;
    private String username;
    private String password;
    private String bio;
    ArrayList <Post> listPost;

    public User(String userId, String username, String password, String bio, ArrayList<Post> listPost) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.listPost = listPost;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBio() {
        return bio;
    }

    public ArrayList<Post> getListPost() {
        return listPost;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setListPost(ArrayList<Post> listPost) {
        this.listPost = listPost;
    }

    
    
}
