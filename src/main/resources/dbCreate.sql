CREATE TABLE account (
username varchar(45) NOT NULL,
password varchar(45) NOT NULL,
name varchar(45) NOT NULL,
create_time bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
ALTER TABLE account
ADD PRIMARY KEY (username);