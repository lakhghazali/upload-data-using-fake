package DbUtil;

import Setting.DataConnect;
import com.github.javafaker.Faker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by salahtobok on 28/04/17.
 */

public class TypeMaterielDbUtil {


    public static void chargeData() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;
        Faker faker = new Faker();

        try {
            con = DataConnect.getConnection();
            ps = con.prepareStatement("INSERT INTO marque (intitule_marque,description_marque) VALUES (?,?)");

            ps.setString(1,"ACURA");
            ps.setString(2,"Acura");
                        ps.executeUpdate();

            ps.setString(1,"ALFA");
            ps.setString(2,"Alfa Romeo");
                        ps.executeUpdate();

            ps.setString(1,"AMC");
            ps.setString(2,"AMC");
                        ps.executeUpdate();

            ps.setString(1,"ASTON");
            ps.setString(2,"Aston Martin");
                        ps.executeUpdate();

            ps.setString(1,"AUDI");
            ps.setString(2,"Audi");
                        ps.executeUpdate();

            ps.setString(1,"AVANTI");
            ps.setString(2,"Avanti");
                        ps.executeUpdate();

            ps.setString(1,"BENTL");
            ps.setString(2,"Bentley");
                        ps.executeUpdate();

            ps.setString(1,"BMW");
            ps.setString(2,"BMW");
                        ps.executeUpdate();

            ps.setString(1,"BUICK");
            ps.setString(2,"Buick");
                        ps.executeUpdate();

            ps.setString(1,"CAD");
            ps.setString(2,"Cadillac");
                        ps.executeUpdate();

            ps.setString(1,"CHEV");
            ps.setString(2,"Chevrolet");
                        ps.executeUpdate();

            ps.setString(1,"CHRY");
            ps.setString(2,"Chrysler");
                        ps.executeUpdate();

            ps.setString(1,"DAEW");
            ps.setString(2,"Daewoo");
                        ps.executeUpdate();

            ps.setString(1,"DAIHAT");
            ps.setString(2,"Daihatsu");
                        ps.executeUpdate();

            ps.setString(1,"DATSUN");
            ps.setString(2,"Datsun");
                        ps.executeUpdate();

            ps.setString(1,"DELOREAN");
            ps.setString(2,"DeLorean");
                        ps.executeUpdate();

            ps.setString(1,"DODGE");
            ps.setString(2,"Dodge");
                        ps.executeUpdate();

            ps.setString(1,"EAGLE");
            ps.setString(2,"Eagle");
                        ps.executeUpdate();

            ps.setString(1,"FER");
            ps.setString(2,"Ferrari");
                        ps.executeUpdate();

            ps.setString(1,"FIAT");
            ps.setString(2,"FIAT");
                        ps.executeUpdate();

            ps.setString(1,"FISK");
            ps.setString(2,"Fisker");
                        ps.executeUpdate();

            ps.setString(1,"FORD");
            ps.setString(2,"Ford");
                        ps.executeUpdate();

            ps.setString(1,"FREIGHT");
            ps.setString(2,"Freightliner");
                        ps.executeUpdate();

            ps.setString(1,"GEO");
            ps.setString(2,"Geo");
                        ps.executeUpdate();

            ps.setString(1,"GMC");
            ps.setString(2,"GMC");
                        ps.executeUpdate();

            ps.setString(1,"HONDA");
            ps.setString(2,"Honda");
                        ps.executeUpdate();

            ps.setString(1,"AMGEN");
            ps.setString(2,"HUMMER");
                        ps.executeUpdate();

            ps.setString(1,"HYUND");
            ps.setString(2,"Hyundai");
                        ps.executeUpdate();

            ps.setString(1,"INFIN");
            ps.setString(2,"Infiniti");
                        ps.executeUpdate();

            ps.setString(1,"ISU");
            ps.setString(2,"Isuzu");
                        ps.executeUpdate();

            ps.setString(1,"JAG");
            ps.setString(2,"Jaguar");
                        ps.executeUpdate();

            ps.setString(1,"JEEP");
            ps.setString(2,"Jeep");
                        ps.executeUpdate();

            ps.setString(1,"KIA");
            ps.setString(2,"Kia");
                        ps.executeUpdate();

            ps.setString(1,"LAM");
            ps.setString(2,"Lamborghini");
                        ps.executeUpdate();

            ps.setString(1,"LAN");
            ps.setString(2,"Lancia");
                        ps.executeUpdate();

            ps.setString(1,"ROV");
            ps.setString(2,"Land Rover");
                        ps.executeUpdate();

            ps.setString(1,"LEXUS");
            ps.setString(2,"Lexus");
                        ps.executeUpdate();

            ps.setString(1,"LINC");
            ps.setString(2,"Lincoln");
                        ps.executeUpdate();

            ps.setString(1,"LOTUS");
            ps.setString(2,"Lotus");
                        ps.executeUpdate();

            ps.setString(1,"MAS");
            ps.setString(2,"Maserati");
                        ps.executeUpdate();

            ps.setString(1,"MAYBACH");
            ps.setString(2,"Maybach");
                        ps.executeUpdate();

            ps.setString(1,"MAZDA");
            ps.setString(2,"Mazda");
                        ps.executeUpdate();

            ps.setString(1,"MCLAREN");
            ps.setString(2,"McLaren");
                        ps.executeUpdate();

            ps.setString(1,"MB");
            ps.setString(2,"Mercedes-Benz");
                        ps.executeUpdate();

            ps.setString(1,"MERC");
            ps.setString(2,"Mercury");
                        ps.executeUpdate();

            ps.setString(1,"MERKUR");
            ps.setString(2,"Merkur");
                        ps.executeUpdate();

            ps.setString(1,"MINI");
            ps.setString(2,"MINI");
                        ps.executeUpdate();

            ps.setString(1,"MIT");
            ps.setString(2,"Mitsubishi");
                        ps.executeUpdate();

            ps.setString(1,"NISSAN");
            ps.setString(2,"Nissan");
                        ps.executeUpdate();

            ps.setString(1,"OLDS");
            ps.setString(2,"Oldsmobile");
                        ps.executeUpdate();

            ps.setString(1,"PEUG");
            ps.setString(2,"Peugeot");
                        ps.executeUpdate();

            ps.setString(1,"PLYM");
            ps.setString(2,"Plymouth");
                        ps.executeUpdate();

            ps.setString(1,"PONT");
            ps.setString(2,"Pontiac");
                        ps.executeUpdate();

            ps.setString(1,"POR");
            ps.setString(2,"Porsche");
                        ps.executeUpdate();

            ps.setString(1,"RAM");
            ps.setString(2,"RAM");
                        ps.executeUpdate();

            ps.setString(1,"REN");
            ps.setString(2,"Renault");
                        ps.executeUpdate();

            ps.setString(1,"RR");
            ps.setString(2,"Rolls-Royce");
                        ps.executeUpdate();

            ps.setString(1,"SAAB");
            ps.setString(2,"Saab");
                        ps.executeUpdate();

            ps.setString(1,"SATURN");
            ps.setString(2,"Saturn");
                        ps.executeUpdate();

            ps.setString(1,"SCION");
            ps.setString(2,"Scion");
                        ps.executeUpdate();

            ps.setString(1,"SMART");
            ps.setString(2,"smart");
                        ps.executeUpdate();

            ps.setString(1,"SRT");
            ps.setString(2,"SRT");
                        ps.executeUpdate();

            ps.setString(1,"STERL");
            ps.setString(2,"Sterling");
                        ps.executeUpdate();

            ps.setString(1,"SUB");
            ps.setString(2,"Subaru");
                        ps.executeUpdate();

            ps.setString(1,"SUZUKI");
            ps.setString(2,"Suzuki");
                        ps.executeUpdate();

            ps.setString(1,"TESLA");
            ps.setString(2,"Tesla");
                        ps.executeUpdate();

            ps.setString(1,"TOYOTA");
            ps.setString(2,"Toyota");
                        ps.executeUpdate();

            ps.setString(1,"TRI");
            ps.setString(2,"Triumph");
                        ps.executeUpdate();

            ps.setString(1,"VOLKS");
            ps.setString(2,"Volkswagen");
                        ps.executeUpdate();

            ps.setString(1,"VOLVO");
            ps.setString(2,"Volvo");
                        ps.executeUpdate();

            ps.setString(1,"YUGO");
            ps.setString(2,"Yugo");
                        ps.executeUpdate();








        } catch (SQLException ex) {
            System.out.println("Login error -->" + ex.getMessage());
        } finally {
            DataConnect.close(con);
        }
    }
}



