# CODE POUR CRÉER UNE PAGE DE LOGIN + WELCOME SOUS SPRING + BDD MySQL

## PREMIER LANCEMENT - SPRING VA CREER LES TABLES - BIEN METTRE DANS 
APPLICATION-PROPERTIES --> CREATE

spring.jpa.hibernate.ddl-auto=create

## PUIS SECOND LANCEMENT METTRE "update" à la place de "create" 

spring.jpa.hibernate.ddl-auto=update

(mettre les données manuellement avec PHPMYADMIN ou autre)


### PENSER A METTRE EN BASE DE DONNEES MANUELLEMENT : 

TABLE ROLE

INSERT INTO role (id, role_name) VALUES (1, 'ROLE_ADMIN');

INSERT INTO role (id, role_name) VALUES (2, 'ROLE_USER');

TABLE USER

INSERT INTO user (id, password, username, role_id) VALUES (1, '$2y$12$zRcUApFsej/Ph3il3/4dN.LSDKxDFMluMorJicMwP0MRtkDhhgQJa', 'admin', 1);

INSERT INTO user (id, password, username, role_id) VALUES (2, '$2y$12$L3vgt7kgKMK8sTszQUkjP.zOnC2PcPK3R9znVR0UoDKl8lb9wPvGq', 'user', 2);

#### enfin se connecter avec :

admin / admin
OU
user / user