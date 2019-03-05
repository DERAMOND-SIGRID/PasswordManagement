#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: User
#------------------------------------------------------------

CREATE TABLE User(
        user_email    Varchar (50) NOT NULL ,
        user_pseudo   Varchar (50) ,
        user_password Varchar (50)
	,CONSTRAINT User_PK PRIMARY KEY (user_email)
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
        user_email    Varchar (50) NOT NULL
	,CONSTRAINT Site_PK PRIMARY KEY (site_id)

	,CONSTRAINT Site_User_FK FOREIGN KEY (user_email) REFERENCES User(user_email)
)ENGINE=InnoDB;

