CREATE TABLE `db2020`.`payment`
(
    `id`     BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `serial` VARCHAR(200) DEFAULT '',
    PRIMARY KEY (`id`)
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  CHARACTER SET = utf8;