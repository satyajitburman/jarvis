package org.jarvis.item.model.dao;

import java.util.List;
import org.jarvis.item.model.Item;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
 
public class ItemDaoImpl implements ItemDao {
    private SessionFactory sessionFactory;
 
    public ItemDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    //by writing @transactional Spring maintains transactions support. No need to write extra code for that.
    @Override
    @Transactional
    public List<Item> list() {
        @SuppressWarnings("unchecked")
        List<Item> listItem = (List<Item>) sessionFactory.getCurrentSession()
                .createCriteria(Item.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
 
        return listItem;
    }
 
}