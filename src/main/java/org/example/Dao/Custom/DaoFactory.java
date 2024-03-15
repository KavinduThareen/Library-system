package org.example.Dao.Custom;

import org.example.Dao.SuperDao;

public class DaoFactory {
    private static DaoFactory daoFactory;
    private DaoFactory(){}

    public static  DaoFactory getDaoFactory() {
        return  (daoFactory == null) ? daoFactory = new DaoFactory() : daoFactory;
    }

    public enum DaoType{
        Member ,admin, Books
    }

    public SuperDao getDao( DaoType daoType ){
        switch ( daoType ){
            case Member :
                return (SuperDao) new MemberDaoImpl();

            case admin:
                return (SuperDao) new AdminDaoImpl();
            case Books:
                return (SuperDao) new BookDaoImpl();
            default:
                return null;
        }
    }
}
