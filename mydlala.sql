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
(18,	17,	'Remplacement de la camera arriere',	'2023-11-19',	'0',	'Remplacement de la pièce à partir d''un iphone xr brisé 
donc la pièce est d''origine.'),
(19,	17,	'Remplacement de ecran ',	'2023-11-19',	'19',	'Activation de true tone et conservation du face ID .'),
(42,	41,	'Changement d''écran',	'2023-11-26',	'30',	'Problème au niveau du touch screen qui par moment commence à déconner'),
(45,	44,	'Surpirse à l''ouverture',	'2023-11-26',	'0',	'- j''ai trouvé des nappes coller avec du scotch. 
- manque le métal qui sécurise les nappes
- j''ai en inventaire les pièces nécessaire pour une optimisation des nappes'),
(40,	39,	'Note sur l''état de l''iphone',	'2023-11-26',	'0',	'- Vitre arrière brisée
- Face ID non fonctionnel
- Vitre avant brisée + true tone non disponible
 - Maj: activation du true tone');

DROP TABLE IF EXISTS "phones";
DROP SEQUENCE IF EXISTS phones_id_phone_seq;
CREATE SEQUENCE phones_id_phone_seq INCREMENT 1 MINVALUE 1 MAXVALUE 2147483647 START 48 CACHE 1;

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
(41,	'Apple',	'iphone X/256go',	'NEUF',	'85',	'Aucun',	'75',	'0',	NULL,	NULL,	'2023-11-20',	NULL,	'2023-11-26',	'DISPONIBLE',	'354860096143952',	'A1901'),
(44,	'Apple',	'Iphone XR red /64go',	'MOYEN',	'84',	'Aucun',	'90',	'0',	NULL,	NULL,	'2023-11-16',	NULL,	'2023-11-26',	'DISPONIBLE',	'356422106333608',	'A1984'),
(39,	'Apple',	'Iphone XR blanc /64 go',	'MAUVAISE_ÉTAT',	'84',	'Aucun',	'50',	'0',	NULL,	NULL,	'2023-11-15',	NULL,	'2023-11-26',	'DISPONIBLE',	'356430102650545',	'A1984'),
(46,	'Apple',	'Iphone 11 black /64go',	'NEUF',	'81',	'Aucun',	'90',	'0',	NULL,	NULL,	'2023-11-27',	NULL,	'2023-11-27',	'DISPONIBLE',	'352903112113732',	'A2111'),
(17,	'Apple',	'Iphone XR noir/64go',	'NEUF',	'92%',	'Aucun',	'80',	'0',	NULL,	NULL,	'2023-11-14',	'2023-11-14',	'2023-11-27',	'DISPONIBLE',	'353073598079853',	'NT302LL/A');

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

-- 2023-11-27 22:31:48.91996-05
