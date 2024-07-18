INSERT INTO riad (nom) VALUES ('Riad A');
INSERT INTO riad (nom) VALUES ('Riad B');

INSERT INTO chambre (nom, riad_id, nombre_d_occupation, etage, etat) VALUES ('Chambre 101', 1, 2, 1, 'Disponible');
INSERT INTO chambre (nom, riad_id, nombre_d_occupation, etage, etat) VALUES ('Chambre 102', 1, 3, 1, 'Disponible');
INSERT INTO chambre (nom, riad_id, nombre_d_occupation, etage, etat) VALUES ('Chambre 201', 2, 2, 2, 'Disponible');
INSERT INTO chambre (nom, riad_id, nombre_d_occupation, etage, etat) VALUES ('Chambre 202', 2, 4, 2, 'Disponible');

INSERT INTO client (nom, prenom, numero_de_telephone) VALUES ('John', 'Doe', '0123456789');
INSERT INTO client (nom, prenom, numero_de_telephone) VALUES ('Jane', 'Smith', '0987654321');

INSERT INTO user (username, password, role) VALUES ('admin', 'admin_password', 'ADMIN');
INSERT INTO user (username, password, role) VALUES ('user', 'user_password', 'USER');
