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
public class AuthenticationFactory extends AbstractLoginFactory{

    @Override
    public Authentication login(Authentication auth) {
        if(auth.equals(new Detect())) {
            return new Detect();
        }
        else if(auth.equals(new Biometric())) {
            return new Biometric();
        }
        else if(auth.equals(new Password())) {
            return new Password();
        }
        return null;
    }
    
}
