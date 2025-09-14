package org.example.dao;

import org.example.model.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(User user) {
        if (user.getId() == null) {
            entityManager.persist(user);
        } else {
            entityManager.merge(user);
        }
    }

    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    public void delete(User user) {
        User managedUser = entityManager.contains(user) ? user : entityManager.merge(user);
        entityManager.remove(managedUser);
    }

    public List<User> findAll() {
        String hql = "FROM User";
        return entityManager.createQuery(hql, User.class).getResultList();
    }

}
