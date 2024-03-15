package org.example.Dao.Custom;

import org.example.Dao.AdminDao;
import org.example.Entity.Admin;
import org.example.unill.SessionFactoryConfiguration;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class AdminDaoImpl implements AdminDao {

    Session session = SessionFactoryConfiguration.getInstance().getSession();
    @Override
    public Admin getData(int Id) {
         return session.get(Admin.class, Id);
    }

    @Override
    public Admin getData(String Id) {
        return null;
    }

    @Override
    public List<String> getOneData() {
        return null;
    }

    @Override
    public int saved(Admin data) {
        return 0;
    }

    @Override
    public ArrayList<Admin> getAll() {
        return null;
    }

    @Override
    public void Update(Admin Data) {

    }

    @Override
    public void Delete(int Id) {

    }

    @Override
    public long Count() {
        return 0;
    }

    @Override
    public void SetSession(Session session) {

    }
}
