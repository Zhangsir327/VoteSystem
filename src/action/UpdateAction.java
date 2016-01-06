package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import dao.VoterDAO;
import dao.impl.VoterDAOImpl;
import dbservice.VoterService;
import dbservice.VoterServiceImpl;
import domain.Voter;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.Map;

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
//        Map session=ActionContext.getContext().getSession();
//        Voter v=(Voter)session.get("voteInfo");
//        String username=v.getUsername();
        //根据用户名进行查询,获取已有的用户对象,再修改密码
        String username="Kobe";
        VoterDAO voterDAO=new VoterDAOImpl();
        voterDAO.updateVoter(username,newPassword);
        //System.out.println(voter.getId()+", "+voter.getUsername()+", "+voter.getPassword());
        System.out.println("ok!");
        return SUCCESS;
    }
}
