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

public class OSTDbUtil {


    public static void chargeData() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;
        Faker faker = new Faker();

        try {
            con = DataConnect.getConnection();
            ps = con.prepareStatement("INSERT INTO organisme_sous_traitant (nom_Organisme,telephone_fix_organisme,telephone_Portable_organisme,email_organisme) VALUES (?,?,?,?)");

            ps.setString(1, "ETBE Tounsi,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Unité de Prestation Electronique, ENIE");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Ets PHONE PLUS");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Ets ZAZOU IBRAHIM");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "GROPHARM,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "TEKNACHEM ALGERIE,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "NATIXIS Algérie,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Les Moulins AOUED,EURL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "CHIALI NAWAFID,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Entreprise Construction de Bâtiment,Sarl, ECOBAT");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Entreprise de Production de Matériel de Récolte,Spa, SAMPO Algérie");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "SANTELABO Proderma,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Minoterie TOUZALAH,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();



            ps.setString(1, "ADEIDA POMPES");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Groupe TEHAMI");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "INDEX MEDICAL,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Ouest Equipements,Sarl, OE");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "TABET PHARM,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Entreprise de Réalisation Industrielle Algérienne,Sarl, ERIAL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "CITY PLAZA,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Bâti Leader TOUNSI,Sarl, BLTOUNSI");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "GRUPO PUMAL,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "COPADIM,EURL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "ETP ZEBLAH,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Groupe TABET-DERRAZ");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Société de Management Groupe de Réalisation,Sarl, MGR");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "CHIALI Services,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "CHIALI TUBES,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Fabrication de Matériel Agricole,Sarl, FAMAG");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Hôtel MEKERRA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "SODA SOFIANE,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Les Moulins AZZOUZ,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "REDMAG,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "PHYTAGRI,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Entreprise Publique de Travaux Publics de Sidi Bel Abbès,Spa, EPTP");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Entreprise Nationale des Industries Electroniques,Spa, ENIE");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "STRUGAL ALGERIE,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Société de Production de Plants de la Mekerra,Spa, SPPM");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();


            ps.setString(1, "ALUMIX,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Partisano Biotech Algérie,Sarl, PBA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "AZUD Algérie");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();



            ps.setString(1, "Bolting Technology Algerie,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "SATEREX,EURL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "HEX STATIC,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Chambre de Commerce, Industrie,EPIC, CCI MEKERRA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "DTA Direction du Tourisme et l&#39;Artisanat");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Laiterie ESSAFIRE Frères Ziane,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "ETB AZZOUZ,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "LABDELLI Mohamed Entreprise de Travaux Publics &amp; Souterrains, ETPS");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "KHENTEUR Composants Automobiles,Spa, KCA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "TM TEX,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Ets SOUAS Abdelmadjid");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Recyclage &amp; Conception Algerienne,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "MEDIC NEWTECH");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Hôtel EDEN BELABBES");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "CNEP Banque,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "HARICOT VERT,EURL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Enteprise ,Etude et de Réalisation en Bâtiment et Tout Corps ,Etat, EETR TCE");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "OMEGA Matériel Médical,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "BERROUANE &amp; Fils Industrie,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Société Commerciale &amp; Industrielle de Produits en Plastique,Sarl, SCIPP OUEST");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Société Tout Produits Pétroliers,Sarl, STPP");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Complexe Agro-alimentaire Pâtes AZZOUZ &amp; Couscous,Sarl, CAPAC");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "TPLAST,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Entreprise de Construction de Matériels Agricoles,Spa, CMA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Société de Développement Agricole,Spa, SODEA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Ets BENDIDA,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "TABET PLAST,EURL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "ALPOMAC");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Société de Distribution de Matériaux de Construction,Spa, SODISMAC");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Clinique de la MEKERRA,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "CHU de Sidi Bel Abbès,EPA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "RENADIAL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();


            ps.setString(1, "Le COIN PARA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "LACTAMEL,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "RENADIAL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Carrière de Dhaya");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "CALVIN OUEST,EURL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "SAEC,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();



            ps.setString(1, "Clinique Médico-Chirurgicale LES ROSIERS");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Matériel Médicale BENTEKHICI Fatima,EURL, MMBF");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "ABDELHAK MEDICAL,EURL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "GRANITTAM,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();


            ps.setString(1, "CHAM LIFT");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "ALPOSTONE,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "AZZOUZ Services,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "GALUCHO ALGERIE,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "TIRSE FRERES,SNC");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "TRUST BANK ALGERIA,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();



            ps.setString(1, "ARCHILAB");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "KADDOUS Travaux de bâtiment,EURL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "MARKITOR MACHINERY LOGISTIQUE");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "MARKITOR SOLUTIONS,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Caisse Régionale de Mutualité Agricole, CRMA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Caisse Régionale de Mutualité Agricole, CRMA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "AGRO SERVICES,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "MARKITOR.COM");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Etablissement ABDERRAHMANE");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Agence Nationale de Soutien à l&#39;Emploi de Jeunes, ANSEJ");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Groupe MEK INVESTISSEMENT,EURL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "FENEQ SPORT");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "AL BARAKA ,Algérie,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Agence Nationale de Gestion du Micro-crédit, ANGEM");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Comptoir de Vente Matériels ,Electricité &amp; Gaz,EURL, EEGM MAACHOU");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "REAL SECURITE PROTECTAL");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();


            ps.setString(1, "Société de Fabrication ,Emballage,Sarl, SFE");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "ALLIANCE Assurances,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Agence Nationale de Développement De l&#39;Investissement,EPA, ANDI");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Engineering &amp; Scientific Laboratory Instruments,Sarl, ESLI");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Groupe DJALAB");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Construction Production Industrielle &amp; Métallique,Sarl, CPIM");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "ETP SOLEC");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "BES Electric");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Entreprise de Distribution &amp; de Maintenance du Matériel Agricole,EURL, EDIMMA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Laboratoire National de l&#39;Habitat &amp; de la Construction Ouest,Spa, LNHC");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Groupe CHIALI,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Banque de l&#39;Agriculture &amp; du Développement Rural,Spa, BADR");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();



            ps.setString(1, "Laiterie Fromagerie de Tessala,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "IFKI LAIT,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "COGIMEX TELECOM SERVICE,Sarl");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Compagnie Algérienne ,Assurance &amp; de Réassurance,Spa, CAAR");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Céréales Ouest,Spa");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Entreprise Nationale des Granulats,Spa, ENG");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Office National ,Appareillages, Accessoires pour Personnes Handicapées,EPIC, ONAAPH");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Advance Graphics");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Caisse Régionale de Mutualité Agricole,SCP, CRMA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Caisse Régionale de Mutualité Agricole, CRMA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Caisse Régionale de Mutualité Agricole, CRMA");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Laboratoire des Travaux Publics de l&#39;Ouest,Spa, LTPO");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();

            ps.setString(1, "Complexe Industriel &amp; Commercial De SIDI BEL ABBES,Spa, CIC SIDI BEL ABBES");
            ps.setString(2, "213"+faker.number().digits(8));
            ps.setString(3, "213"+faker.number().digits(9));
            ps.setString(4, faker.name().firstName().concat(faker.name().lastName()).toLowerCase()+"@gmail.com");


            ps.executeUpdate();


        } catch (SQLException ex) {
            System.out.println("Login error -->" + ex.getMessage());
        } finally {
            DataConnect.close(con);
        }
    }





}



