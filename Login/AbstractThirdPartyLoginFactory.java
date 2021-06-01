package Login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sutic
 */
public class AbstractThirdPartyLoginFactory extends AbstractLoginFactory{

    @Override
    public Authentication login(Authentication auth) {
        if(auth.equals(new GoogleLogin())) {
            return new GoogleLogin();
        }
        else if(auth.equals(new FacebookLogin())) {
            return new FacebookLogin();
        }
        else if(auth.equals(new EmailLogin())) {
            return new EmailLogin();
        }
        return null;
    }
    
}
