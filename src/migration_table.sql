use adlister_db;


CREATE TABLE users(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  username varchar (25) NOT NULL,
  email varchar (30) NOT NULL,
  password varchar (30) NOT NULL,
  PRIMARY KEY(id)
);

CREATE TABLE ads (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id INT UNSIGNED NOT NULL,
  title varchar (25) NOT NULL,
  description  varchar (100) NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY (user_id) REFERENCES users (id)
);


