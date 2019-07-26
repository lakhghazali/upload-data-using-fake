package DbUtil;

import Enumeration.SpecialiteMainOeuvre;
import Setting.DataConnect;
import com.github.javafaker.Faker;

import java.sql.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by salahtobok on 28/04/17.
 */

public class MODbUtil {


    public static void chargeData() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;
        Faker faker = new Faker();

        List<SpecialiteMainOeuvre> specialiteMainOeuvreList =  Arrays.asList(SpecialiteMainOeuvre.values());
        String[] atelierNumbers =  {"1","2","3","4","5"};


        try {
            con = DataConnect.getConnection();

            for (int i = 0; i < 100; i++) {
                faker = new Faker();
                ps = con.prepareStatement("INSERT INTO main_oeuvre (date_naissance_main_oeuvre,nom_main_oeuvre,prenom_main_oeuvre,nombre_heure_travail_main_oeuvre,specialite_main_oeuvre,telephone_main_oeuvre,idAtelier) VALUES (?,?,?,?,?,?,?)");

                ps.setDate(1, new java.sql.Date(faker.date().birthday().getTime()));
                ps.setString(2, faker.name().lastName());
                ps.setString(3, faker.name().firstName());
                ps.setInt(4, Integer.valueOf(faker.number().digits(6)));
                ps.setString(5, getRandomSpecialite(specialiteMainOeuvreList));
                ps.setString(6, "213" + faker.number().digits(9));
                ps.setString(7, getRandomAtelier(atelierNumbers));
                ps.executeUpdate();


            }


        } catch (SQLException ex) {
            System.out.println("Login error -->" + ex.getMessage());
        } finally {
            DataConnect.close(con);
        }
    }

    public static String getRandomSpecialite(List<SpecialiteMainOeuvre> specialiteMainOeuvreList) {
        int rnd = new Random().nextInt(specialiteMainOeuvreList.size());
        return String.valueOf(specialiteMainOeuvreList.get(rnd));
    }

    public static String getRandomAtelier(String[] atelierNumbers) {
        int rnd = new Random().nextInt(atelierNumbers.length);
        return atelierNumbers[rnd];
    }
}



