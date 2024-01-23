package it.epicode.be;


import it.epicode.be.dao.EventoDAO;
import it.epicode.be.entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

    public static void main(String[] args) {

        System.out.println("Esercitazione D2");
        EntityManager em = emf.createEntityManager();

        EventoDAO ed = new EventoDAO(em);

//        Student aldo = new Student("Aldo", "Baglio", StudentType.BACKEND);
//        Student giovanni = new Student("Giovanni", "Rossi", StudentType.FRONTEND);
//        Student giacomo = new Student("Giacomo", "Bianchi", StudentType.FULLSTACK);

//        sd.save(aldo);
//        sd.save(giovanni);
//        sd.save(giacomo);
//        sd.findByIdAndDelete(2);

        Evento beatles = new Evento("Beatles", "25/01/24", "Concerto", tipoEvento.PUBBLICO, 100);

        ed.save(beatles);



        em.close();
        emf.close();
    }
}
