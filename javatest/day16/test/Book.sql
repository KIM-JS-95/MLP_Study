create schema book;

use book;
create table book(
isbn int primary key auto_increment not null,
title varchar(50) not null,
author varchar(250) not null,
publisher varchar(50) not null,
price int not null,
`desc` varchar(200) not null,
publish_date  DATETIME DEFAULT CURRENT_TIMESTAMP
);
