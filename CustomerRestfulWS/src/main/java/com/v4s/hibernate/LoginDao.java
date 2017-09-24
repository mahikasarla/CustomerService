package com.v4s.hibernate;


import org.hibernate.Session;
import com.v4s.domain.Login;
import com.v4s.entity.InsLogin;

public class LoginDao extends HibernateBase{
public boolean createLogin(Login l) {
		
        Session session = getSessionFactoryObj().openSession();
        session.beginTransaction();

        InsLogin iLogin = new InsLogin();
        iLogin.setLoginId(l.getLoginId());
        iLogin.setUserName(l.getUserName());
        iLogin.setPassword(l.getPassword());
        // Save User
        session.save(iLogin);   
        session.getTransaction().commit();
        session.close();
                
        System.out.println("Successfully created " + l.toString());
        return true;
    }
	
public Login getLogin(Integer id) {
	
    Session session = getSessionFactoryObj().openSession();
    InsLogin iLogin = (InsLogin) session.load(InsLogin.class, id);
    
    Login login = new Login();
    login.setLoginId(iLogin.getLoginId());
   login.setUserName(iLogin.getUserName());
   login.setPassword(iLogin.getPassword());
    session.close();
    return login;
}

}
