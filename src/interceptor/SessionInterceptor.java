package interceptor;

import action.LoginAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;

public class SessionInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        if (LoginAction.class==actionInvocation.getAction().getClass()){
            //说明此时是登录判定,并不需要验证,跳过
            return actionInvocation.invoke();
        }
        //获取session
        Map session=actionInvocation.getInvocationContext().getSession();
        if (session.get("voterInfo")==null){
            return Action.LOGIN;
        }
        return actionInvocation.invoke();
    }
}
