/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import java.sql.Timestamp;  
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Vincent
 */
public class Controller {
    
    public static ArrayList inputDummy() {
        ArrayList<User> listUser = new ArrayList<>();
        
        Comment comment1 = new Comment("C100", "Bagus Bang", ContentState.SHOWED);
        Comment comment2 = new Comment("C101", "Yang bener bang", ContentState.SHOWED);
        Comment comment3 = new Comment("C102", "Minimal maksimal", ContentState.ARCHIVED);
        Comment comment4 = new Comment("C103", "Kampret", ContentState.DELETED);
        Comment comment5 = new Comment("C104", "Mantap", ContentState.PINNED);
        Comment comment6 = new Comment("C105", "Vangke", ContentState.DELETED);
        
        ArrayList <Comment> listComment1 = new ArrayList<Comment>();
        listComment1.add(comment1);
        listComment1.add(comment2);
        
        ArrayList <Comment> listComment2 = new ArrayList<Comment>();
        listComment2.add(comment3);
        listComment2.add(comment4);
        
        ArrayList <Comment> listComment3 = new ArrayList<Comment>();
        listComment3.add(comment5);
        listComment3.add(comment6);
        
        Timestamp ts1 = Timestamp.valueOf("2018-09-01 09:01:15");  
        Timestamp ts2 = Timestamp.valueOf("2019-09-01 09:01:15");  
        Timestamp ts3 = Timestamp.valueOf("2020-09-01 09:01:15");  
        
        ArrayList <Post> listPost1 = new ArrayList<Post>();
        ArrayList <Post> listPost2 = new ArrayList<Post>();
        ArrayList <Post> listPost3 = new ArrayList<Post>();
        
        Story story1 = new Story("Makan Bang", 100, "S1", ContentState.SHOWED, ts1, ContentType.PICTURE, listComment1);
        Story story2 = new Story("Riding Bang", 200, "S1", ContentState.SHOWED, ts2, ContentType.VIDEO, listComment1);
        Reel reel1 = new Reel(100, 300, "R1", ContentState.PINNED, ts2, ContentType.VIDEO, listComment2);
        Reel reel2 = new Reel(100, 200, "R2", ContentState.PINNED, ts2, ContentType.VIDEO, listComment2);
        Feed feed1 = new Feed(200, 100, "F1", ContentState.SHOWED, ts1, ContentType.PICTURE, listComment1);
        Feed feed2 = new Feed(150, 50, "F2", ContentState.SHOWED, ts1, ContentType.VIDEO, listComment1);
        
        listPost1.add(story1);
        listPost1.add(story2);
        listPost2.add(reel1);
        listPost2.add(reel2);
        listPost3.add(feed1);
        listPost3.add(feed2);
             
        User user1 = new User("U1", "Vnct1234", "LostVayne", "Wibu", listPost1);
        User user2 = new User("U2", "Vnct123", "Lost", "Wibu1", listPost2);
        User user3 = new User("U3", "Vnct12", "Vayne", "Wibu2", listPost3);
        
        return listUser;
    }
    public String printData(ArrayList<Post> listpost, int j) {
        String hasil;
        if (listpost.get(j) instanceof Story) {
            Story story = (Story) listpost.get(j);
            return hasil = "\nViews: " + story.getViews() + listpost.get(j).getStatus();
        } else if (listpost.get(j) instanceof Feed) {
            Feed feed = (Feed) listpost.get(j);
            return hasil = "\nUsername Teman: " + feed.getLikes() + listpost.get(j).getStatus();
        } else if (listpost.get(j) instanceof Reel){
            Reel reel = (Reel) listpost.get(j);
            return hasil = "\nUsername Teman: " + reel.getPlayedCount() + listpost.get(j).getStatus();
        } else {
            return "";
        }
    }
    
    public String showUserPosts(ArrayList <User> listUser){
        String pinned = "";
        String showed = "";
        String archived = "";
        int jumlahDelete = 0;
        
        for (int i = 0; i < listUser.size(); i++) {
            ArrayList<Post> listpost = listUser.get(i).getListPost();
            for (int j = 0; j < listpost.size(); j++) {
                switch (listpost.get(j).getStatus()) {
                    case PINNED:
                        pinned += printData(listpost,j);
                        break;
                    case SHOWED:
                        showed += printData(listpost,j);
                        break;
                    case ARCHIVED:
                        archived += printData(listpost,j);
                        break;
                    case DELETED:
                        jumlahDelete++;
                    default:
                        break;
                }
            }
        }
        String hasil = pinned + showed + archived + "Jumlah post deleted : " + jumlahDelete;
        return hasil;
    }
    
        
    
    public void showPost(String postId, ArrayList <User> listUser){
        for (int i = 0; i < listUser.size(); i++) {
            ArrayList<Post> listpost = listUser.get(i).getListPost();
            for (int j = 0; j < listpost.size(); j++) {
                if (listpost.get(j) instanceof Story) {
                    Story story = (Story) listpost.get(j);
                    if (story.getPostId() == postId) {
                        System.out.println("Post ID: " + story.getPostId() +
                            ", Status: " + story.getStatus() +
                            ", Type: " + story.getPostType() +
                            ", Time Upload: " + story.getTimeUpload() +
                            ", Duration: " + story.getViews()+
                            ", Play Count: " + story.getCaption());
                    break;
                    }
                } else if (listpost.get(j) instanceof Reel) {
                    Reel reel = (Reel) listpost.get(j);
                    if (reel.getPostId() == postId) {
                        System.out.println("Post ID: " + reel.getPostId() +
                            ", Status: " + reel.getStatus() +
                            ", Type: " + reel.getPostType() +
                            ", Time Upload: " + reel.getTimeUpload() +
                            ", Duration: " + reel.getDuration() +
                            ", Play Count: " + reel.getPlayedCount());
                    break;
                    }
                } else if (listpost.get(j) instanceof Feed){
                    Feed feed = (Feed) listpost.get(j);
                    if (feed.getPostId() == postId) {
                        System.out.println("Post ID: " + feed.getPostId() +
                            ", Status: " + feed.getStatus() +
                            ", Type: " + feed.getPostType() +
                            ", Time Upload: " + feed.getTimeUpload() +
                            ", Caption: " + feed.getDuration() +
                            ", Likes: " + feed.getLikes());
                    break;
                } 
            } else {
                    System.out.println("Post not Found");    
                }
            }   
        }
    }
    public void changePostState(Post post, ContentState newStatus) {
        
    }
}
