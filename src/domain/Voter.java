package domain;

/**
 * Created by zhangsirui on 15/12/23.
 */

public class Voter {
    /**
     * @id 投票人的id
     * @vote 投票人投给对象的名称
     */
    private int id;
    private String username;
    private String password;
    private String vote;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }
}
