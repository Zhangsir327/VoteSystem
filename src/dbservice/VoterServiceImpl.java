package dbservice;

import dao.VoterDAO;
import dao.impl.VoterDAOImpl;
import domain.Voter;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by zhangsirui on 15/12/29.
 */
public class VoterServiceImpl implements VoterService {
    @Override
    public void saveVoter(Voter voter) {
        VoterDAO voterDAO=new VoterDAOImpl();
        voterDAO.addVoter(voter);
    }

    @Override
    public void deleteVoter(Voter voter) {
        VoterDAO voterDAO=new VoterDAOImpl();
        voterDAO.deleteVoter(voter);
    }
    //    @Override
//    public void updateVoter(Voter voter) {
//        //获取当前会话
//        HttpSession session= ServletActionContext.getRequest().getSession();
//        VoterDAO voterDAO=new VoterDAOImpl();
//        voterDAO.updateVoter(voter);
//    }
//
//    @Override
//    public Voter readVoter(String username) {
//        VoterDAO voterDAO=new VoterDAOImpl();
//        Voter voter=voterDAO.findByName(username);
//        return voter;
//    }
}
