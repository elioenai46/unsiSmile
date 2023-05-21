
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Usuarios;
import com.unsis.odonto.edu.model.ILoginModel;
import com.unsis.odonto.edu.model.LoginModelImpl;



public class LoginServiceImpl implements ILoginService{
    
    public static void main(String[] args) {
        LoginServiceImpl l = new LoginServiceImpl();
        Usuarios u = new Usuarios();
        u.setNombreUsuario("admin");
        u.setPassUsuario("admin");
        l.login(u);
        
    }
    
    
    
    private ILoginModel model = new LoginModelImpl();

    @Override
    public Usuarios login(Usuarios usuarios) {
        return model.login(usuarios);
    }
}
