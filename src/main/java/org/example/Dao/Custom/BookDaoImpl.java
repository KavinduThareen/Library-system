package org.example.Dao.Custom;

import org.example.Dao.BookDao;
import org.example.Entity.Books;
import org.example.unill.SessionFactoryConfiguration;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    Session session = SessionFactoryConfiguration.getInstance().getSession();
    @Override
    public Books getData(String title) {
        String sql = "SELECT B FROM Books AS B WHERE B.title =: title";
        Query query = session.createQuery(sql);
        query.setParameter("title",title);
        return (Books) query.getSingleResult();
    }

    @Override
    public Books getData(int Id) {
        return null;
    }

    @Override
    public List<String> getOneData() {
        String sql = "SELECT B.title FROM Books AS B";
        Query query = session.createQuery(sql);
        List<String> titles = query.getResultList();
        return titles;
    }

    @Override
    public int saved(Books data) {
        return 0;
    }

    @Override
    public ArrayList<Books> getAll() {
        return null;
    }

    @Override
    public void Update(Books Data) {

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
