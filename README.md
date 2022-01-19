# GreenDay220119

DaterBase

데이터베이스의 정의

- 데이터의 집합
- 여러명의 사용자, 응용프로그램이 공유
- 동시 접근이 가능해야 함
- 특히 MariaDB에서는 데이터의 저장공간 자체를 의미하기도 함
* DBMS - 데이터베이스를 대용량으로 저장


﻿
DB 기본 명령어 문법

주석 - #, 오라클 --

# 행 데이터 검색
select 속성 from 테이블 where 속성=값;

# 데이터 입력
insert into 테이블(속성) values(값);

# 데이터 삭제
delete from 테이블 where 속성=값;

# 데이터 수정
update 테이블 set 속성=값 where 속성=값;

# mysql 클라이언트 실행
#DOS> mysql -u계정 -p비밀번호 데이터베이스
#DOS> mysql -uroot -p1234

# 소스 .sql 파일 실행
source employees.sql;

# 데이터베이스 목록
show databases;

# 데이터베이스 변경
use employees;

# 테이블 목록
show tables;

## 새 데이터 베이스 추가
#create database DB명;
create database comstudy21;

## 새로운 계정 생성
#create user '계정명'@'호스명' identified by '비밀번호';
-> create user 'comstudy21'@'localhost' identified by 'comstudy21';

## 새 계정에 모든 권한 부여
grant all privileges on DB명.* to '계정명'@'호스트명'
-> grant all privileges on comstudy21.* to 'comstudy21'@'localhost';

# 새 계정으로 접속하기
#mysql -u계정명 -p비밀번호
USER> mysql -ucomstudy21 -pcomstudy21
MySQL> show databases
MySQL> use comstudy21
MySQL> show tables
