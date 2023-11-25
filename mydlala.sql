-- Adminer 4.7.7 PostgreSQL dump

\connect "mydlala";

DROP TABLE IF EXISTS "fiche_phone";
DROP SEQUENCE IF EXISTS fiche_phone_id_seq;
CREATE SEQUENCE fiche_phone_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 2147483647 START  CACHE 1;

CREATE TABLE "public"."fiche_phone" (
    "id" integer DEFAULT nextval('fiche_phone_id_seq') NOT NULL,
    "id_phone" integer NOT NULL,
    "titre_fiche" character varying,
    "date_fiche" character varying,
    "cout_fiche" character varying,
    "details_fiche" text,
    CONSTRAINT "fiche_phone_pkey" PRIMARY KEY ("id"),
    CONSTRAINT "fk_phone" FOREIGN KEY (id_phone) REFERENCES phones(id_phone) NOT DEFERRABLE
) WITH (oids = false);

INSERT INTO "fiche_phone" ("id", "id_phone", "titre_fiche", "date_fiche", "cout_fiche", "details_fiche") VALUES
(1,	2,	'Vérification GS 23',	'2023-07-22',	'20',	'changement cover glass + nettoayeg de poussières'),
(2,	2,	'Remplacement de batterie',	'2023-07-23',	'50',	'rien a signaler'),
(15,	2,	'test troits',	'2023-11-12',	'5',	''),
(18,	17,	'Remplacement de la camera arriere',	'2023-11-19',	'0',	'Remplacement de la pièce à partir d''un iphone xr brisé 
donc la pièce est d''origine.'),
(19,	17,	'Remplacement de ecran ',	'2023-11-19',	'19',	'Activation de true tone et conservation du face ID .');

DROP TABLE IF EXISTS "phones";
DROP SEQUENCE IF EXISTS phones_id_phone_seq;
CREATE SEQUENCE phones_id_phone_seq INCREMENT 1 MINVALUE 1 MAXVALUE 2147483647 START 19 CACHE 1;

CREATE TABLE "public"."phones" (
    "id_phone" integer DEFAULT nextval('phones_id_phone_seq') NOT NULL,
    "marque_phone" character varying,
    "model_phone" character varying,
    "etat_phone" character varying,
    "batterie_phone" character varying,
    "accessoires_phone" character varying,
    "prix_achat_phone" character varying,
    "prix_vente_phone" character varying,
    "cout_rep_article" character varying,
    "cote_phone" character varying,
    "date_achat_phone" character varying,
    "date_vente_phone" character varying,
    "date_maj_phone" character varying,
    "statut_phone" character varying,
    "imei_phone" character varying,
    "nomodel_phone" character varying,
    CONSTRAINT "phones_id_phone" PRIMARY KEY ("id_phone")
) WITH (oids = false);

INSERT INTO "phones" ("id_phone", "marque_phone", "model_phone", "etat_phone", "batterie_phone", "accessoires_phone", "prix_achat_phone", "prix_vente_phone", "cout_rep_article", "cote_phone", "date_achat_phone", "date_vente_phone", "date_maj_phone", "statut_phone", "imei_phone", "nomodel_phone") VALUES
(12,	'Alcatel',	'Test',	'neuf',	'50%',	'Boite',	'100',	'0',	'50',	'',	'2023-07-16',	'2023-07-16',	'2023-07-16',	'disponible',	NULL,	NULL),
(2,	'Samsung',	'Galaxy S23',	'Neuf',	'90 %',	'Aucun',	'150',	'280',	'50',	'Bonne affaire',	'2023-07-09',	'2023-07-10',	'2023-11-07',	'DISPONIBLE',	'555555',	'4521542'),
(17,	'Apple',	'Iphone XR',	NULL,	'92%',	'Aucun',	'80',	'0',	NULL,	NULL,	'2023-11-14',	'2023-11-14',	'2023-11-19',	'DISPONIBLE',	'353073598079853',	'NT302LL/A');

DROP TABLE IF EXISTS "utilisateurs";
DROP SEQUENCE IF EXISTS utilisateurs_id_utilisateur_seq;
CREATE SEQUENCE utilisateurs_id_utilisateur_seq INCREMENT 1 MINVALUE 1 MAXVALUE 2147483647 START  CACHE 1;

CREATE TABLE "public"."utilisateurs" (
    "id_utilisateur" integer DEFAULT nextval('utilisateurs_id_utilisateur_seq') NOT NULL,
    "nom_utilisateur" character varying(100),
    "prenom_utilisateur" character varying(100),
    "courriel_utilisateur" character varying(100),
    "password_utilisateur" character varying(100),
    "role_utilisateur" character varying(100)
) WITH (oids = false);

CREATE INDEX "utilisateurs_id_utilisateur" ON "public"."utilisateurs" USING btree ("id_utilisateur");

INSERT INTO "utilisateurs" ("id_utilisateur", "nom_utilisateur", "prenom_utilisateur", "courriel_utilisateur", "password_utilisateur", "role_utilisateur") VALUES
(27,	'hbibti',	'dj',	'zak@dj.test',	'test',	NULL),
(39,	'zak',	'dj',	'zak@dj.test',	'test',	NULL),
(43,	'Samw Gamgee',	'ring bearer',	'zak@dj.test',	'test',	NULL),
(45,	NULL,	NULL,	NULL,	NULL,	NULL);

-- 2023-11-24 21:09:35.934247-05
