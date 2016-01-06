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
     * @param
     */
    public void updateVoter(String username, String newPassword);



    /**
     * 删除投票人
     * @param voter
     */
    public void deleteVoter(Voter voter);
}
