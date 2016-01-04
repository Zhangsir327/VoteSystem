package dao.impl;

import dao.VoterDAO;
import domain.Voter;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class VoterDAOImpl implements VoterDAO {
    /**
     * 新增投票人
     * @param voter 投票人信息
     */
    @Override
    public void addVoter(Voter voter) {
        Session session= HibernateUtil.openSession();
        Transaction transaction=session.beginTransaction();
        try{
            session.save(voter);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            if (transaction!=null){
                transaction.rollback();
            }
        }finally {
            HibernateUtil.closeSession(session);
        }
    }

    /**
     * 删除投票人
     * @param voter
     */
    @Override
    public void deleteVoter(Voter voter) {
        Session session= HibernateUtil.openSession();
        Transaction transaction=session.beginTransaction();
        try{
            session.delete(voter);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            if (transaction!=null){
                transaction.rollback();
            }
        }finally {
            HibernateUtil.closeSession(session);
        }
    }

    /**
     * 修改投票人
     * @param voter 投票人信息
     */
//    @Override
//    public void updateVoter(Voter voter) {
//        Session session=HibernateUtil.openSession();
//        Transaction transaction=session.beginTransaction();
//        try{
//            session.update(voter);
//            transaction.commit();
//        }catch(Exception e){
//            e.printStackTrace();
//            if (transaction!=null){
//                transaction.rollback();
//            }
//        }finally {
//            HibernateUtil.closeSession(session);
//        }
//    }

    /**
     * 查找投票人
     * @param username
     * @return Voter对象
     */
//    @Override
//    public Voter findByName(String username) {
//        Session session=HibernateUtil.openSession();
//        Transaction transaction=session.beginTransaction();
//        try{
//            Voter voter=(Voter)session.load(Voter.class,username);
//            transaction.commit();
//        }catch(Exception e){
//            e.printStackTrace();
//            if (transaction!=null){
//                transaction.rollback();
//            }
//        }finally {
//            HibernateUtil.closeSession(session);
//        }
//    }
}
