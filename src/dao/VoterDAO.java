package dao;

import domain.Voter;

/**
 * Created by zhangsirui on 15/12/29.
 */
public interface VoterDAO {
    /**
     * 增加投票人信息
     * @param voter 投票人信息
     */
    public void addVoter(Voter voter);

    /**
     * 修改投票人信息
     * @param voter 投票人信息
     */
    //public void updateVoter(Voter voter);

    /**
     * 查找投票人
     * @param username
     * @return 一个投票人对象
     */
     //public Voter findByName(String username);

    /**
     * 删除投票人
     * @param voter
     */
    public void deleteVoter(Voter voter);
}
