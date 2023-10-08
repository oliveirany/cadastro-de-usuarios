package br.com.cadastroDeUsuarios.database.dao;

import br.com.cadastroDeUsuarios.database.entities.User;

import javax.persistence.EntityManager;


public class UserDAO {
    private EntityManager em;

    public UserDAO(EntityManager em) {
        this.em = em;
    }

    public void register(User user) {
        this.em.getTransaction().begin();
        this.em.persist(user);
        this.em.getTransaction().commit();
        this.em.close();
    }
}
