import DbUtil.MODbUtil;
import com.github.javafaker.Faker;

public class Looper {



        public static void main (String...args){
            String[] specialiteArray =

                    {
                            "Monteur / Monteuse en pneumatique"
                            ,"Electricien / Electricienne de maintenance automobile"
                            ,"Contrôleur / Contrôleuse technique de véhicules automobiles"
                            ,"Mécanicien / Mécanicienne de maintenance automobile et de véhicules industriels"
                            ,"Expert / Experte technique en automobile"
                            ,"Garagiste"
                            ,"Mécanicien / Mécanicienne de garage automobile"
                            ,"Diéséliste"
                            ,"Préparateur / Préparatrice de véhicules neufs et/ou d' occasion "
                            ,"Technicien / Technicienne en diagnostic et réparation automobile"
                            ,"Préparateur / Préparatrice de voitures de compétition automobile"
                            ,"Mécanicien / Mécanicienne d' entretien en automobile "
                            ,"Technicien / Technicienne service rapide en automobile"
                            ,"Poseur / Poseuse de films de protection de vitrage de véhicules"
                            ,"Electricien / Electricienne automobile"
                            ,"Contremaître / Contremaîtresse en réparation automobile"
                            ,"Mécanicien / Mécanicienne de maintenance automobile"
                            ,"Démonteur / Démonteuse automobile"
                            ,"Mécanicien / Mécanicienne service rapide en automobile"
                            ,"Chef mécanicien / mécanicienne automobile"
                            ,"Mécanicien / Mécanicienne de véhicules de transport en commun"
                            ,"Electricien / Electricienne poids lourds"
                            ,"Garagiste-mécanicien / Garagiste-mécanicienne"
                            ,"Mécanicien-réparateur / Mécanicienne-réparatrice automobile"
                            ,"Préparateur / Préparatrice de véhicules automobiles"
                            ,"Mécanicien / Mécanicienne de véhicules militaires"
                            ,"Technicien / Technicienne en maintenance automobile"
                            ,"Dépanneur-remorqueur / Dépanneuse-remorqueuse de véhicules automobiles"
                            ,"Essayeur-metteur / Essayeuse-metteuse au point automobile"
                            ,"Mécanicien / Mécanicienne automobile"
                            ,"Réceptionnaire en atelier mécanique automobile"
                            ,"Technicien électricien-électronicien / Technicienne électricienne-électronicienne automobile"
                            ,"Technicien / Technicienne de maintenance de véhicules industriels"
                            ,"Mécanicien / Mécanicienne de véhicules industriels"
                            ,"Mécanicien / Mécanicienne poids lourds"
                            ,"Mécanicien / Mécanicienne motoriste automobile"
                            ,"Contrôleur / Contrôleuse technique automobile"
                            ,"Motoriste metteur / metteuse au point"
                            ,"Mécanicien / Mécanicienne diéséliste"
                            ,"Laveur / Laveuse de véhicules automobiles"
                            ,"Technicien poseur / Technicienne poseuse de pare-brise"
                            ,"Préparateur réparateur / Préparatrice réparatrice véhicules de loisirs"
                            ,"Contrôleur / Contrôleuse technique poids lourds"};


            String[] specialiteLabel =  {
                    "Monteur_Monteuse_en_pneumatique"
                    , "Electricien_Electricienne_de_maintenance_automobile"
                    , "Contrôleur_Contrôleuse_technique_de_véhicules_automobiles"
                    , "Mécanicien_Mécanicienne_de_maintenance_automobile_et_de_véhicules_industriels"
                    , "Expert_Experte_technique_en_automobile"
                    , "Garagiste"
                    , "Mécanicien_Mécanicienne_de_garage_automobile"
                    , "Diéséliste"
                    , "Préparateur_Préparatrice_de_véhicules_neufs_e_u_d'occasion"
                    , "Technicien_Technicienne_en_diagnostic_et_réparation_automobile"
                    , "Préparateur_Préparatrice_de_voitures_de_compétition_automobile"
                    , "Mécanicien_Mécanicienne_d'entretien_en_automobile"
                    , "Technicien_Technicienne_service_rapide_en_automobile"
                    , "Poseur_Poseuse_de_films_de_protection_de_vitrage_de_véhicules"
                    , "Electricien_Electricienne_automobile"
                    , "Contremaître_Contremaîtresse_en_réparation_automobile"
                    , "Mécanicien_Mécanicienne_de_maintenance_automobile"
                    , "Démonteur_Démonteuse_automobile"
                    , "Mécanicien_Mécanicienne_service_rapide_en_automobile"
                    , "Chef_mécanicien_mécanicienne_automobile"
                    , "Mécanicien_Mécanicienne_de_véhicules_de_transport_en_commun"
                    , "Electricien_Electricienne_poids_lourds"
                    , "Garagiste_mécanicien_Garagiste_mécanicienne"
                    , "Mécanicien_réparateur_Mécanicienne_réparatrice_automobile"
                    , "Préparateur_Préparatrice_de_véhicules_automobiles"
                    , "Mécanicien_Mécanicienne_de_véhicules_militaires"
                    , "Technicien_Technicienne_en_maintenance_automobile"
                    , "Dépanneur_remorqueur_Dépanneuse_remorqueuse_de_véhicules_automobiles"
                    , "Essayeur_metteur_Essayeuse_metteuse_au_point_automobile"
                    , "Mécanicien_Mécanicienne_automobile"
                    , "Réceptionnaire_en_atelier_mécanique_automobile"
                    , "Technicien_électricien_électronicien_Technicienne_électricienne_électronicienne_automobile"
                    , "Technicien_Technicienne_de_maintenance_de_véhicules_industriels"
                    , "Mécanicien_Mécanicienne_de_véhicules_industriels"
                    , "Mécanicien_Mécanicienne_poids_lourds"
                    , "Mécanicien_Mécanicienne_motoriste_automobile"
                    , "Contrôleur_Contrôleuse_technique_automobile"
                    , "Motoriste_metteur_metteuse_au_point"
                    , "Mécanicien_Mécanicienne_diéséliste"
                    , "Laveur_Laveuse_de_véhicules_automobiles"
                    , "Technicien_poseur_Technicienne_poseuse_de_pare_brise"
                    , "Préparateur_réparateur_Préparatrice_réparatrice_véhicules_de_loisirs"
                    , "Contrôleur_Contrôleuse_technique_poids_lourds"
            } ;

        for (int i = 0; i < specialiteLabel.length; i++) {

            System.out.println(specialiteLabel[i]+"(");
            System.out.println(specialiteArray[i]);

        }


    }
    }
