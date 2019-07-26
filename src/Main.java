import DbUtil.*;
import com.github.javafaker.Faker;

import java.util.Date;

public class Main {


    public static void main(String... args) {


        MarqueDbUtil.chargeData();
//      OSTDbUtil.chargeData();
//          MODbUtil.chargeData();
//         MaterielDbUtil.chargeData();


       // FichTechniqueDbUtil.chargeData();
        Faker faker = new Faker();


    Date date = new Date();




       // System.out.println(new java.sql.Date(faker.date().birthday().getTime()));
     //   System.out.println("HHHHHHHHHHHHH"+faker.phoneNumber().phoneNumber());

      //  System.out.println(faker.name().fullName());

    }
}
