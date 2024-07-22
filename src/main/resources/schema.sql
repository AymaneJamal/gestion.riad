CREATE TABLE riad (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      nom VARCHAR(255) NOT NULL
);

CREATE TABLE chambre (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         nom VARCHAR(255) NOT NULL,
                         riad_id BIGINT NOT NULL,
                         nombre_d_occupation INT NOT NULL,
                         etage INT NOT NULL,
                         etat VARCHAR(50) NOT NULL,
                         FOREIGN KEY (riad_id) REFERENCES riad(id)
);

CREATE TABLE client (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        nom VARCHAR(255) NOT NULL,
                        prenom VARCHAR(255) NOT NULL,
                        numero_de_telephone VARCHAR(20) NOT NULL
);

CREATE TABLE reservation (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             date_depart DATE NOT NULL,
                             date_arrivee DATE NOT NULL,
                             chambre_id BIGINT NOT NULL,
                             client_id BIGINT NOT NULL,
                             tarif DECIMAL(10, 2) NOT NULL,
                             FOREIGN KEY (chambre_id) REFERENCES chambre(id),
                             FOREIGN KEY (client_id) REFERENCES client(id)
);

CREATE TABLE prix (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      chambre_id BIGINT NOT NULL,
                      occupation INT NOT NULL,
                      valeur DECIMAL(10, 2) NOT NULL,
                      FOREIGN KEY (chambre_id) REFERENCES chambre(id)
);

CREATE TABLE historique_reservation (
                                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                        client_id BIGINT NOT NULL,
                                        reservation_id BIGINT NOT NULL,
                                        date DATE NOT NULL,
                                        statut VARCHAR(50) NOT NULL,
                                        FOREIGN KEY (client_id) REFERENCES client(id),
                                        FOREIGN KEY (reservation_id) REFERENCES reservation(id)
);

CREATE TABLE user (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      firstname VARCHAR(50) NOT NULL,
                      lastname VARCHAR(50) NOT NULL,
                      email VARCHAR(100) NOT NULL,
                      password VARCHAR(100) NOT NULL,
                      role VARCHAR(50) NOT NULL
);
CREATE TABLE revoked_token (
                               id BIGINT AUTO_INCREMENT PRIMARY KEY,
                               token VARCHAR(255) NOT NULL,
                               revoked_at TIMESTAMP NOT NULL
);
