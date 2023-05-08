
package com.unsis.odonto.edu.modell;


import com.unsis.odonto.edu.entity.RolesTiposUsuario;
import com.unsis.odonto.edu.entity.Usuarios;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoginModelImpl implements ILoginModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public Usuarios login(Usuarios usuarios) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();

            StoredProcedureQuery sp = s.createStoredProcedureQuery("spValidarUsuarioRol");
            sp.registerStoredProcedureParameter("nombre_usuario", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("pass_usuario", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("iD", int.class, ParameterMode.OUT);
            sp.registerStoredProcedureParameter("nombre_rol", String.class, ParameterMode.OUT);

            //Datos del formulario login
            sp.setParameter("nombre_usuario", usuarios.getNombreUsuario());
            sp.setParameter("pass_usuario", usuarios.getPassUsuario());
            //guardamos el id del alumno, administrador o catedratico al cual le
            //pertenece dicho usuario, esto lo guardamos en la variable id_usuario
            usuarios.setIdUsuario(Integer.valueOf(sp.getOutputParameterValue("iD").toString()));
            usuarios.setNombreRol(sp.getOutputParameterValue("nombre_rol").toString());

            s.close();
            sf.close();
            return usuarios;

        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
}
