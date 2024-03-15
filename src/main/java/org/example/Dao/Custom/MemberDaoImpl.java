package org.example.Dao.Custom;

import org.example.Dao.MemberDao;
import org.example.Entity.Member;
import org.example.unill.SessionFactoryConfiguration;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class MemberDaoImpl implements MemberDao {

    Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public Member getData ( int Id ) {
        return session.get(Member.class, Id);
    }

    @Override
    public Member getData(String Id) {
        return null;
    }

    @Override
    public List<String> getOneData() {
        return null;
    }

    @Override
    public int saved(Member data) {
        return 0;
    }

    @Override
    public ArrayList<Member> getAll() {
        return null;
    }

    @Override
    public void Update(Member Data) {

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
