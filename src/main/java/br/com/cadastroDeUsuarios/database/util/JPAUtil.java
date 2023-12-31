package br.com.cadastroDeUsuarios.database.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory FACTORY =
            Persistence.createEntityManagerFactory("users");

    public EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}
