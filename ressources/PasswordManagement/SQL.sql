#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Person
#------------------------------------------------------------

CREATE TABLE Person(
        person_email    Varchar (50) NOT NULL ,
        person_pseudo   Varchar (50) ,
        person_password Varchar (50)
	,CONSTRAINT Person_PK PRIMARY KEY (person_email)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Site
#------------------------------------------------------------

CREATE TABLE Site(
        site_id       Int  Auto_increment  NOT NULL ,
        site_name     Varchar (50) ,
        site_url      Varchar (50) ,
        site_login    Varchar (50) ,
        site_password Varchar (50) ,
        person_email  Varchar (50) NOT NULL
	,CONSTRAINT Site_PK PRIMARY KEY (site_id)

	,CONSTRAINT Site_Person_FK FOREIGN KEY (person_email) REFERENCES Person(person_email)
)ENGINE=InnoDB;

