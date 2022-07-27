package Repository;

import Entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserRepository {

    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("orm");

    public void saveUser(Users user){

        EntityManager manager = managerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try {
            transaction.begin();
            manager.persist(user);
            transaction.commit();
        }catch (Exception e){

            e.printStackTrace();
            transaction.rollback();

        }


    }


}
