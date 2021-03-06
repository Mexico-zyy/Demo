package com.paradoxie.demo.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.paradoxie.demo.entity.Advert;

import com.paradoxie.demo.dao.AdvertDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig advertDaoConfig;

    private final AdvertDao advertDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        advertDaoConfig = daoConfigMap.get(AdvertDao.class).clone();
        advertDaoConfig.initIdentityScope(type);

        advertDao = new AdvertDao(advertDaoConfig, this);

        registerDao(Advert.class, advertDao);
    }
    
    public void clear() {
        advertDaoConfig.getIdentityScope().clear();
    }

    public AdvertDao getAdvertDao() {
        return advertDao;
    }

}
