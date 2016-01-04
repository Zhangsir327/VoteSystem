package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import dbservice.VoterService;
import dbservice.VoterServiceImpl;
import domain.Voter;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by zhangsirui on 15/12/29.
 */
public class UpdateAction extends ActionSupport {
    private String oldPassword;
    private String newPassword;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String updateVoter()throws Exception{
        //先从session中获取当前用户的登录信息
        Voter v=(Voter)ActionContext.getContext().getSession().get("voteInfo");
        //HttpSession session= ServletActionContext.getRequest().getSession();
        String username=v.getUsername();
        //根据用户名进行查询,获取已有的用户对象,再修改密码
        VoterService voterService=new VoterServiceImpl();
//        Voter voter=voterService.readVoter(username);
        //System.out.println(voter.getId()+", "+voter.getUsername()+", "+voter.getPassword());
        return SUCCESS;
    }
}
