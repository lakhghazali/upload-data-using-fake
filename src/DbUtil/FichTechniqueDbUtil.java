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

public class FichTechniqueDbUtil {


    public static void chargeData() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;
        Faker faker = new Faker();

        try {
            con = DataConnect.getConnection();
            ps = con.prepareStatement("SELECT * from materiel");
                 rs =        ps.executeQuery();


                 while (rs.next()){
                     ps = con.prepareStatement("insert into pneumatique(id_materiel) value (?)");
                     ps.setInt(1, rs.getInt("id_materiel"));
                     ps.executeUpdate();


                     ps = con.prepareStatement("insert into moteur(id_materiel) value (?)");
                     ps.setInt(1, rs.getInt("id_materiel"));
                     ps.executeUpdate();


                     ps = con.prepareStatement("insert into energie(id_materiel) value (?)");
                     ps.setInt(1, rs.getInt("id_materiel"));
                     ps.executeUpdate();

                 }



        } catch (SQLException ex) {
            System.out.println("Login error -->" + ex.getMessage());
        } finally {
            DataConnect.close(con);
        }
    }
}



