CREATE TABLE account (
username varchar(45) NOT NULL,
password varchar(45) NOT NULL,
name varchar(45) NOT NULL,
create_time bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
ALTER TABLE account
ADD PRIMARY KEY (username);

CREATE TABLE `pocket` (
  `username` varchar(45) NOT NULL,
  `current_money` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
ALTER TABLE `pocket`
  ADD PRIMARY KEY (`username`);

  
  
  