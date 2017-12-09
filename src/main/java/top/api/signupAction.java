package top.api;

import top.core.user;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;

public class signupAction extends ActionSupport {
  private String username;
  private String password;
  
  public String signUp() throws ClassNotFoundException, SQLException {
    String[] parameter = {username, password};
    user.signUp(parameter);
    return SUCCESS;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
}
