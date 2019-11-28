USE student_records;

--
-- Table structure for table `student`
--
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`
(
    `id`            int(11)  NOT NULL,
    `home_room`     char(35) NOT NULL default '',
    `name`          char(35) NOT NULL default '',
    `dob`           char(40) NOT NULL default '',
    `gender`        char(5)  NOT NULL default 'other',
    `contact_num`   char(35) NOT NULL default '',
    `email_address` char(40) NOT NULL default '',
    PRIMARY KEY (id)
) ENGINE = MyISAM
  AUTO_INCREMENT = 4080
  DEFAULT CHARSET = utf8mb4;

--
-- Table structure for table `student_records`
--

DROP TABLE IF EXISTS `student_records`;
CREATE TABLE `student_records`
(
    `student_id` int(11) NOT NULL,
    `date`       date    NOT NULL,
    `attendance` BOOLEAN,
    `behavior`   text    NOT NULL,
    `comments`   text    NOT NULL,
    PRIMARY KEY (student_id),
    FOREIGN KEY (student_id) REFERENCES student (id)
) ENGINE = MyISAM
  DEFAULT CHARSET = utf8mb4;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`
(
    `username` varchar(100) NOT NULL,
    `password` varchar(76)  NOT NULL,
    `division` varchar(45) NOT NULL
) ENGINE = MyISAM
  DEFAULT CHARSET = utf8mb4;

INSERT INTO users (username, password, division) VALUES ('lorne', '12345', 'Admin');
--
-- Table structure for table `teacher`
--
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`
(
    `id`            int(11)  NOT NULL,
    `firstname`     char(35) NOT NULL default '',
    `lastname`      char(35) NOT NULL default '',
    `email_address` char(40) NOT NULL default '',
    `dob`           char(40) NOT NULL default '',
    `home_room`     char(35) NOT NULL default '',
    PRIMARY KEY (id)
) ENGINE = MyISAM
  AUTO_INCREMENT = 4080
  DEFAULT CHARSET = utf8mb4;