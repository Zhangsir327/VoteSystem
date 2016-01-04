package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    static {
        //创建sessionFactory
        Configuration configuration=new Configuration().configure();
        ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).
                buildServiceRegistry();
        sessionFactory=configuration.buildSessionFactory(serviceRegistry);
    }
    //打开和关闭session,session可以看作数据库连接
    public static Session openSession(){
        Session session=sessionFactory.openSession();
        return session;
    }
    public static void closeSession(Session session){
        if (session!=null){
            session.close();
        }
    }
}
