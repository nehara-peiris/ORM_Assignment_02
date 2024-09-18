package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Child;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //SELECT

        Query query = session.createQuery("select c from Child c");
        List<Child> children = query.list();

        for (Child child : children){
            System.out.println(child);
        }


        //INSERT
        //Doesn't support insert statement for JPQL


        //UPDATE

        /*Query query1 = session.createQuery("update Child  c set c.address = :address, c.name = :name  where c.sId = :id");
        query1.setParameter("address","Galle");
        query1.setParameter("name","Dilmi");
        query1.setParameter("Id",2);
        query1.executeUpdate();*/


        //DELETE

        /*Query query2 = session.createQuery("delete from Child c where c.cId = :id");
        query2.setParameter("Id",2);
        query2.executeUpdate();*/


        //SEARCH BY ID

        /*Query query3 = session.createQuery("select c from Child c where c.cId = :id");
        query3.setParameter("Id",3);
        List<Student> stList = query3.list();

        for (Student student : stList){
            System.out.println(student);
        }*/


        //JOINQUERY

        /*Query query4 = session.createQuery("select w from Child c join c.watchList w where c.cId = :id");
        query4.setParameter("Id",1);
        List<Watch> watches = query4.list();

        for (Watch watch : watches){
            System.out.println("Watch type :"+watch.getType());
        }*/

        transaction.commit();
        session.close();

    }
}