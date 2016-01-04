package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import domain.Voter;
import service.LoginService;
import service.impl.LoginServiceImpl;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private LoginService loginService=new LoginServiceImpl();

    @Override
    public String execute() throws Exception {
        if (loginService.isLogin(username,password)){
            Voter voter=new Voter();
            voter.setUsername(username);
            voter.setPassword(password);
            ActionContext.getContext().getSession().put("voterInfo",voter);
            return SUCCESS;
        }
        this.addActionError("登录失败");
        return INPUT;
    }
}
