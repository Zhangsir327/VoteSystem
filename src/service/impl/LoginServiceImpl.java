package service.impl;

import service.LoginService;

public class LoginServiceImpl implements LoginService {
    @Override
    public boolean isLogin(String username, String password) {
        if (username.equals("Kobe")&&password.equals("Bryant")){
            return true;
        }
        return false;
    }
}
