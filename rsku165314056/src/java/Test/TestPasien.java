/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Helper.pasienHelper;
import Pojos.Pasien;
import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author basisa03
 */
public class TestPasien {
     public static void main(String[] args) {
        pasienHelper test = new pasienHelper();
        List<Pasien> list = test.getAllPasien();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }
}
