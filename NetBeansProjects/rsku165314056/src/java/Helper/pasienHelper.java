/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Pojos.Pasien;
import Util.rskuHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author basisa03
 */
public class pasienHelper {
      public List<Pasien> getAllPasien() {
        List<Pasien> result = null;
        Session session = rskuHibernateUtil.getSessionFactory().openSession();
        String query = "from Pasien p";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
}}
