package action;

import com.opensymphony.xwork2.ActionSupport;
import domain.Voter;
import dbservice.VoterService;
import dbservice.VoterServiceImpl;

/**
 * Created by zhangsirui on 15/12/29.
 * 注册用户
 */
public class AddAction extends ActionSupport{
    private String username;
    private String password;

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

    public String saveVoter()throws Exception{
        Voter voter=new Voter();
        voter.setUsername(username);
        voter.setPassword(password);
        VoterService voterService=new VoterServiceImpl();
        voterService.saveVoter(voter);
        return SUCCESS;
    }
}
