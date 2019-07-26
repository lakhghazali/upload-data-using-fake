package DbUtil;

import Enumeration.EtatMateriel;
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

public class MaterielDbUtil {


   static String[] marqueCar = {"ACURA",
            "ALFA",
            "AMC",
            "ASTON",
            "AUDI",
            "AVANTI",
            "BENTL",
            "BMW",
            "BUICK",
            "CAD",
            "CHEV",
            "CHRY",
            "DAEW",
            "DAIHAT",
            "DATSUN",
            "DELOREAN",
            "DODGE",
            "EAGLE",
            "FER",
            "FIAT",
            "FISK",
            "FORD",
            "FREIGHT",
            "GEO",
            "GMC",
            "HONDA",
            "AMGEN",
            "HYUND",
            "INFIN",
            "ISU",
            "JAG",
            "JEEP",
            "KIA",
            "LAM",
            "LAN",
            "ROV",
            "LEXUS",
            "LINC",
            "LOTUS",
            "MAS",
            "MAYBACH",
            "MAZDA",
            "MCLAREN",
            "MB",
            "MERC",
            "MERKUR",
            "MINI",
            "MIT",
            "NISSAN",
            "OLDS",
            "PEUG",
            "PLYM",
            "PONT",
            "POR",
            "RAM",
            "REN",
            "RR",
            "SAAB",
            "SATURN",
            "SCION",
            "SMART",
            "SRT",
            "STERL",
            "SUB",
            "SUZUKI",
            "TESLA",
            "TOYOTA",
            "TRI",
            "VOLKS",
            "VOLVO",
            "YUGO"};
    public static void chargeData() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;
        Faker faker = new Faker();
        List<EtatMateriel> etatMaterielList =  Arrays.asList(EtatMateriel.values());

        try {
            con = DataConnect.getConnection();
            for (int i = 0; i < 50; i++) {
                ps = con.prepareStatement("INSERT INTO materiel (chassis_materiel, code_entreprise_materiel, cree_a_materiel, date_aquisition_materiel," +
                        " date_fin_garantie_materiel, " +
                        " etat_materiel, fournisseur_materiel, matricule_materiel, mise_a_jour_materiel," +
                        " numero_serie_materiel, releve_compteur_materiel, val_aquisition_materiel,intitule_materiel,idTypeMateriel,idFiliale) " +
                        "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");



            ps.setString(1, getRandomChassis());
            ps.setString(2, getRandomHasCode());
            ps.setDate(3, new java.sql.Date(faker.date().birthday(20, 39).getTime()));
            ps.setDate(4, new java.sql.Date(faker.date().birthday(21, 39).getTime()));
            ps.setDate(5, new java.sql.Date(faker.date().birthday(1, 19).getTime()));
            ps.setString(6, getRandomEtat(etatMaterielList));
            ps.setString(7, faker.name().fullName());
            ps.setString(8, getRandomImmatriculation());
            ps.setDate(9, new java.sql.Date(faker.date().birthday(1, 2).getTime()));
            ps.setString(10, getRandomNumeroSerie());
            ps.setString(11, faker.number().digits(10));
            ps.setString(12, faker.number().digits(10));
                ps.setString(13, getRandomCarName(marqueCar).toUpperCase());
                ps.setInt(14, faker.number().numberBetween(8,49));
                ps.setInt(15, faker.number().numberBetween(19,30));
            ps.executeUpdate();

        }
        } catch (SQLException ex) {
            System.out.println("Login error -->" + ex.getMessage());
        } finally {
            DataConnect.close(con);
        }
    }


    public static String getRandomImmatriculation() {
        Faker faker = new Faker();
        return faker.number().numberBetween(1, 99999) + " " + faker.number().numberBetween(1, 9) + faker.number().numberBetween(1, 9) + faker.number().numberBetween(1, 9) +" "+faker.number().numberBetween(1,48);
    }

    public static String getRandomChassis() {
        Faker faker = new Faker();
        return String.valueOf(faker.number().numberBetween(1,9)+
                faker.letterify("????")+
                faker.number().numberBetween(10,99)+
                faker.letterify("???")+
                faker.number().numberBetween(100000,999999)).toUpperCase();
    }
    public static String getRandomNumeroSerie() {
        Faker faker = new Faker();
        return String.valueOf(faker.number().numberBetween(1,9)+
                faker.letterify("???")+
                faker.number().numberBetween(10,99)+
                faker.letterify("????")+
                faker.number().numberBetween(100000,999999)).toUpperCase();
    }

    public static String getRandomHasCode() {
        Faker faker = new Faker();
        return String.valueOf(
                faker.letterify("HAS????")+
                        faker.numerify("####")+
                        faker.number().numberBetween(99909,999999)).toUpperCase();
    }


    public static String getRandomEtat(List<EtatMateriel> etatMaterielList) {
        int rnd = new Random().nextInt(etatMaterielList.size());
        return String.valueOf(etatMaterielList.get(rnd));
    }



    public static String getRandomCarName(String[] marqueCar) {
        Faker faker = new Faker();
        int rnd = new Random().nextInt(marqueCar.length);
        return marqueCar[rnd].concat(faker.letterify("-????-")+faker.numerify("####"));
    }

}



