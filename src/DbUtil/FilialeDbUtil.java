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

public class FilialeDbUtil {


    public static void chargeData() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;
        Faker faker = new Faker();

        try {
            con = DataConnect.getConnection();
            ps = con.prepareStatement("INSERT INTO filiale (intitule_filiale, specialite_filiale) VALUES (?,?)");

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





        } catch (SQLException ex) {
            System.out.println("Login error -->" + ex.getMessage());
        } finally {
            DataConnect.close(con);
        }
    }
}



