use webtest;
drop table address;
CREATE TABLE address(
 addressnum INT      NOT NULL AUTO_INCREMENT PRIMARY KEY, -- 번호
 name         VARCHAR(10)     NULL , -- 이름
 handphone  VARCHAR(14)     NULL , -- 핸드폰번호
 zipcode    varchar(6)      ,
 address      VARCHAR(500)     NULL,   -- 주소
 address2      VARCHAR(500)     NULL   -- 상세주소
);

INSERT INTO address(name, handphone, address, zipcode, address2)
VALUES('개발자1', '000-123-1234', '대한민국', '12345','12-1' );
INSERT INTO address(name, handphone, address, zipcode, address2)
VALUES('개발자2', '111-123-1234', '일본', '12345', '34-1');
INSERT INTO address(name, handphone, address, zipcode, address2)
VALUES('개발자3', '222-123-1234', '러시아', '12345', '100-1');

-- read
SELECT addressnum, name, handphone, address, zipcode ,address2
FROM address WHERE addressnum=1;

UPDATE address
SET handphone='555-555-5555',
    address='터키'  ,
    zipcode = '11111',
    address2 = '12-7'
WHERE addressnum=1;

DELETE FROM address WHERE addressnum=3;

-- list
SELECT addressnum, name, handphone, address
FROM address ORDER BY name DESC -- 오름차순은 ASC
limit 0, 3;

DELETE FROM address;


DATE_ADD(sysdate(), INTERVAL 1 DAY)
