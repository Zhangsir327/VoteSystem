package service;

public interface LoginService {
    /**
     * 验证是否登录成功
     * @param username
     * @param password
     * @return
     */
    public boolean isLogin(String username, String password);
}
