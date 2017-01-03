CREATE DATABASE webtool DEFAULT CHARACTER SET utf8;

CREATE TABLE web_user(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
user_name VARCHAR(18) NOT NULL,
user_password VARCHAR(30) NOT NULL,
user_status TINYINT NOT NULL DEFAULT 1,
create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
