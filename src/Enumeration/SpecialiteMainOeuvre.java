package Enumeration;

public enum SpecialiteMainOeuvre {
    Monteur_Monteuse_en_pneumatique("Monteur / Monteuse en pneumatique"),
    Electricien_Electricienne_de_maintenance_automobile("Electricien / Electricienne de maintenance automobile"),
    Controleur_Controleuse_technique_de_vehicules_automobiles("Controleur / Controleuse technique de vehicules automobiles"),
    Mecanicien_Mecanicienne_de_maintenance_automobile_et_de_vehicules_industriels("Mecanicien / Mecanicienne de maintenance automobile et de vehicules industriels"),
    Expert_Experte_technique_en_automobile("Expert / Experte technique en automobile"),
    Garagiste("Garagiste"),
    Mecanicien_Mecanicienne_de_garage_automobile("Mecanicien / Mecanicienne de garage automobile"),
    Dieseliste("Dieseliste"),
    Preparateur_Preparatrice_de_vehicules_neufs_et_ou_doccasion("Preparateur / Preparatrice de vehicules neufs et/ou d occasion"),
    Technicien_Technicienne_en_diagnostic_et_reparation_automobile("Technicien / Technicienne en diagnostic et reparation automobile"),
    Preparateur_Preparatrice_de_voitures_de_competition_automobile("Preparateur / Preparatrice de voitures de competition automobile"),
    Mecanicien_Mecanicienne_dentretien_en_automobile("Mecanicien / Mecanicienne d entretien en automobile"),
    Technicien_Technicienne_service_rapide_en_automobile("Technicien / Technicienne service rapide en automobile"),
    Poseur_Poseuse_de_films_de_protection_de_vitrage_de_vehicules("Poseur / Poseuse de films de protection de vitrage de vehicules"),
    Electricien_Electricienne_automobile("Electricien / Electricienne automobile"),
    Contremaitre_Contremaitresse_en_reparation_automobile("Contremaitre / Contremaitresse en reparation automobile"),
    Mecanicien_Mecanicienne_de_maintenance_automobile("Mecanicien / Mecanicienne de maintenance automobile"),
    Demonteur_Demonteuse_automobile("Demonteur / Demonteuse automobile"),
    Mecanicien_Mecanicienne_service_rapide_en_automobile("Mecanicien / Mecanicienne service rapide en automobile"),
    Chef_mecanicien_mecanicienne_automobile("Chef mecanicien / mecanicienne automobile"),
    Mecanicien_Mecanicienne_de_vehicules_de_transport_en_commun("Mecanicien / Mecanicienne de vehicules de transport en commun"),
    Electricien_Electricienne_poids_lourds("Electricien / Electricienne poids lourds"),
    Garagiste_mecanicien_Garagiste_mecanicienne("Garagiste-mecanicien / Garagiste-mecanicienne"),
    Mecanicien_reparateur_Mecanicienne_reparatrice_automobile("Mecanicien-reparateur / Mecanicienne-reparatrice automobile"),
    Preparateur_Preparatrice_de_vehicules_automobiles("Preparateur / Preparatrice de vehicules automobiles"),
    Mecanicien_Mecanicienne_de_vehicules_militaires("Mecanicien / Mecanicienne de vehicules militaires"),
    Technicien_Technicienne_en_maintenance_automobile("Technicien / Technicienne en maintenance automobile"),
    Depanneur_remorqueur_Depanneuse_remorqueuse_de_vehicules_automobiles("Depanneur-remorqueur / Depanneuse-remorqueuse de vehicules automobiles"),
    Essayeur_metteur_Essayeuse_metteuse_au_point_automobile("Essayeur-metteur / Essayeuse-metteuse au point automobile"),
    Mecanicien_Mecanicienne_automobile("Mecanicien / Mecanicienne automobile"),
    Receptionnaire_en_atelier_mecanique_automobile("Receptionnaire en atelier mecanique automobile"),
    Technicien_electricien_electronicien_Technicienne_electricienne_electronicienne_automobile("Technicien electricien-electronicien / Technicienne electricienne-electronicienne automobile"),
    Technicien_Technicienne_de_maintenance_de_vehicules_industriels("Technicien / Technicienne de maintenance de vehicules industriels"),
    Mecanicien_Mecanicienne_de_vehicules_industriels("Mecanicien / Mecanicienne de vehicules industriels"),
    Mecanicien_Mecanicienne_poids_lourds("Mecanicien / Mecanicienne poids lourds"),
    Mecanicien_Mecanicienne_motoriste_automobile("Mecanicien / Mecanicienne motoriste automobile"),
    Controleur_Controleuse_technique_automobile("Controleur / Controleuse technique automobile"),
    Motoriste_metteur_metteuse_au_point("Motoriste metteur / metteuse au point"),
    Mecanicien_Mecanicienne_dieseliste("Mecanicien / Mecanicienne dieseliste"),
    Laveur_Laveuse_de_vehicules_automobiles("Laveur / Laveuse de vehicules automobiles"),
    Technicien_poseur_Technicienne_poseuse_de_pare_brise("Technicien poseur / Technicienne poseuse de pare-brise"),
    Preparateur_reparateur_Preparatrice_reparatrice_vehicules_de_loisirs("Preparateur reparateur / Preparatrice reparatrice vehicules de loisirs"),
    Controleur_Controleuse_technique_poids_lourds("Controleur / Controleuse technique poids lourds");

    private String label;

    SpecialiteMainOeuvre(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
