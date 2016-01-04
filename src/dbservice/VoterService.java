package dbservice;

import domain.Voter;

/**
 * Created by zhangsirui on 15/12/29.
 */
public interface VoterService {
    //添加用户
    public void saveVoter(Voter voter);
//    //修改用户信息
//    public void updateVoter(Voter voter);
//    //根据用户名查找用户
//    public Voter readVoter(String username);
    //删除用户
    public void deleteVoter(Voter voter);
}
