package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.VoterDAO;
import dao.impl.VoterDAOImpl;
import domain.Voter;

/**
 * Created by zhangsirui on 15/12/29.
 */
public class RegisterAction extends ActionSupport {
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

    public String execute()throws Exception{
        return SUCCESS;
    }
}
