/*
Navicat MySQL Data Transfer

Source Server         : 源杰的服务器
Source Server Version : 50724
Source Host           : 47.94.174.82:3306
Source Database       : j2ee

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2018-11-22 20:56:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `administrator`
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `AdminAccount` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  PRIMARY KEY (`AdminAccount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of administrator
-- ----------------------------

-- ----------------------------
-- Table structure for `classes`
-- ----------------------------
DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes` (
  `ClassId` int(3) NOT NULL,
  `CourseId` int(4) NOT NULL,
  `ClassName` varchar(200) DEFAULT NULL,
  `ClassTime` varchar(100) DEFAULT NULL,
  `ClassPosition` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ClassId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classes
-- ----------------------------

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `CourseId` int(4) NOT NULL,
  `CourseName` varchar(40) DEFAULT NULL,
  `CourseIntroduction` varchar(200) DEFAULT NULL,
  `TeacherId` int(20) DEFAULT NULL,
  `PresentationProportion` float(4,2) DEFAULT NULL,
  `QuestionProportion` float(4,2) DEFAULT NULL,
  `ReportProportion` float(4,2) DEFAULT NULL,
  `TeamStartTime` date DEFAULT NULL,
  `TeamEndTime` date DEFAULT NULL,
  `TeamMinMember` int(2) DEFAULT NULL,
  `TeamMaxMember` int(2) DEFAULT NULL,
  `ShareTeamStatus` int(5) DEFAULT NULL,
  `ShareSeminarStatus` int(5) DEFAULT NULL,
  PRIMARY KEY (`CourseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for `notice`
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `NoticeId` int(5) NOT NULL,
  `Type` int(2) DEFAULT NULL,
  `Topic` varchar(50) DEFAULT NULL,
  `Content` text,
  `Status` int(2) DEFAULT NULL,
  `TeamId` int(5) DEFAULT NULL,
  `CourseId` int(5) DEFAULT NULL,
  `OtherCourseId` int(5) DEFAULT NULL,
  PRIMARY KEY (`NoticeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------

-- ----------------------------
-- Table structure for `presentation`
-- ----------------------------
DROP TABLE IF EXISTS `presentation`;
CREATE TABLE `presentation` (
  `PresentationId` int(11) NOT NULL,
  `TeamOrder` int(2) DEFAULT NULL,
  `PptFileName` varchar(50) DEFAULT NULL,
  `PptPath` varchar(50) DEFAULT NULL,
  `PresentationScore` float(3,1) DEFAULT NULL,
  `ReportFileName` varchar(50) DEFAULT NULL,
  `ReportPath` varchar(50) DEFAULT NULL,
  `ReportScore` float(3,1) DEFAULT NULL,
  `TeamId` int(5) DEFAULT NULL,
  `ClassId` int(5) DEFAULT NULL,
  `SeminarId` int(5) DEFAULT NULL,
  `STATUS` int(2) DEFAULT NULL,
  PRIMARY KEY (`PresentationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of presentation
-- ----------------------------

-- ----------------------------
-- Table structure for `question`
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `QuestionId` int(3) NOT NULL,
  `PresentationTeamOrder` int(5) DEFAULT NULL,
  `QuestionOrder` int(5) DEFAULT NULL,
  `QuestionScore` int(5) DEFAULT NULL,
  `StudentId` varchar(20) DEFAULT NULL,
  `TeamId` int(5) DEFAULT NULL,
  `SeminarId` int(5) DEFAULT NULL,
  `Status` int(1) DEFAULT NULL,
  PRIMARY KEY (`QuestionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------

-- ----------------------------
-- Table structure for `round`
-- ----------------------------
DROP TABLE IF EXISTS `round`;
CREATE TABLE `round` (
  `RoundId` int(3) NOT NULL,
  `SeminarCount` int(3) DEFAULT NULL,
  `RoundOrder` int(3) DEFAULT NULL,
  `CourseId` int(5) DEFAULT NULL,
  PRIMARY KEY (`RoundId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of round
-- ----------------------------

-- ----------------------------
-- Table structure for `round_class`
-- ----------------------------
DROP TABLE IF EXISTS `round_class`;
CREATE TABLE `round_class` (
  `RoundId` int(3) NOT NULL,
  `ClassId` int(3) NOT NULL,
  `PresentationScoreSet` int(3) DEFAULT NULL,
  `QuestionScoreSet` int(3) DEFAULT NULL,
  `ReportScoreSet` int(3) DEFAULT NULL,
  `TotalScoreSet` int(3) DEFAULT NULL,
  PRIMARY KEY (`RoundId`,`ClassId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of round_class
-- ----------------------------

-- ----------------------------
-- Table structure for `round_score`
-- ----------------------------
DROP TABLE IF EXISTS `round_score`;
CREATE TABLE `round_score` (
  `RoundId` int(5) NOT NULL,
  `TeamId` int(5) NOT NULL,
  `PresentationScore` float(3,1) DEFAULT NULL,
  `QuestionScore` float(3,1) DEFAULT NULL,
  `ReportScore` float(3,1) DEFAULT NULL,
  `RoundScore` float(3,1) DEFAULT NULL,
  `CourseId` int(5) DEFAULT NULL,
  PRIMARY KEY (`RoundId`,`TeamId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of round_score
-- ----------------------------

-- ----------------------------
-- Table structure for `seminar`
-- ----------------------------
DROP TABLE IF EXISTS `seminar`;
CREATE TABLE `seminar` (
  `SeminarId` int(10) NOT NULL,
  `Topic` varchar(225) DEFAULT NULL,
  `Content` text,
  `TeamNumber` int(5) DEFAULT NULL COMMENT '团队数量限制',
  `SeminarOrder` int(2) DEFAULT NULL,
  `IsVisible` int(2) DEFAULT NULL,
  `Time` date DEFAULT NULL,
  `ReportEndTime` date DEFAULT NULL,
  `CourseId` int(5) DEFAULT NULL,
  `RoundId` int(5) DEFAULT NULL,
  PRIMARY KEY (`SeminarId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seminar
-- ----------------------------

-- ----------------------------
-- Table structure for `seminar_class`
-- ----------------------------
DROP TABLE IF EXISTS `seminar_class`;
CREATE TABLE `seminar_class` (
  `ClassId` int(5) NOT NULL,
  `SeminarId` int(10) NOT NULL,
  `Status` int(2) DEFAULT NULL,
  PRIMARY KEY (`ClassId`,`SeminarId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seminar_class
-- ----------------------------

-- ----------------------------
-- Table structure for `seminar_score`
-- ----------------------------
DROP TABLE IF EXISTS `seminar_score`;
CREATE TABLE `seminar_score` (
  `SeminarId` int(5) NOT NULL,
  `TeamId` int(5) NOT NULL,
  `PresentationScore` float(3,1) DEFAULT NULL,
  `QuestionScore` float(3,1) DEFAULT NULL,
  `ReportScore` float(3,1) DEFAULT NULL,
  `CourseId` int(5) DEFAULT NULL,
  PRIMARY KEY (`SeminarId`,`TeamId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seminar_score
-- ----------------------------

-- ----------------------------
-- Table structure for `seminar_share`
-- ----------------------------
DROP TABLE IF EXISTS `seminar_share`;
CREATE TABLE `seminar_share` (
  `ShareCourseId` int(5) DEFAULT NULL,
  `SharedCourseId` int(5) DEFAULT NULL,
  `ShareId` int(5) NOT NULL,
  PRIMARY KEY (`ShareId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seminar_share
-- ----------------------------

-- ----------------------------
-- Table structure for `student_class_team`
-- ----------------------------
DROP TABLE IF EXISTS `student_class_team`;
CREATE TABLE `student_class_team` (
  `StudentId` varchar(20) NOT NULL,
  `ClassId` int(4) NOT NULL,
  `TeamId` int(10) DEFAULT NULL,
  `isTeamLeader` int(1) DEFAULT NULL,
  PRIMARY KEY (`StudentId`,`ClassId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_class_team
-- ----------------------------

-- ----------------------------
-- Table structure for `team`
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team` (
  `TeamId` int(5) NOT NULL,
  `TeamName` varchar(20) DEFAULT NULL,
  `MemberNumber` int(3) DEFAULT NULL,
  `TeamLeaderId` int(20) DEFAULT NULL,
  `ClassId` int(10) DEFAULT NULL,
  PRIMARY KEY (`TeamId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of team
-- ----------------------------

-- ----------------------------
-- Table structure for `team_share`
-- ----------------------------
DROP TABLE IF EXISTS `team_share`;
CREATE TABLE `team_share` (
  `TeamShareCourseId` int(5) DEFAULT NULL,
  `TeamSharedCourseId` int(5) DEFAULT NULL,
  `TeamShareId` int(5) NOT NULL,
  PRIMARY KEY (`TeamShareId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of team_share
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `USERID` int(20) NOT NULL COMMENT '老师和学生的主键，不是学号或教工号，自增，不会变',
  `ACCOUNT` varchar(20) DEFAULT NULL,
  `PASSWORD` varchar(20) DEFAULT NULL COMMENT '用户密码',
  `NAME` varchar(20) DEFAULT NULL,
  `ROLE` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(30) DEFAULT NULL,
  `TIMEINTERVAL` date DEFAULT NULL,
  `CODE` varchar(10) DEFAULT NULL,
  `STATUS` int(2) DEFAULT NULL,
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('123', '123', '123', null, 'Teacher', null, null, null, null);
