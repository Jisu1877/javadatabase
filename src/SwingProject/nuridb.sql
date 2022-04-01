show tables;

create table manage(
	mIdx int not null auto_increment primary key,
	mName varchar(20) not null,
	mMid varchar(20) not null,
	mPwd int not null,
	mHint varchar(50) not null,
	mHintAns varchar(50) not null);
	
desc manage;

create table books(
	isbn int not null,
	bookName varchar(50) not null,
	author varchar(50) default '미입력',
	publish varchar(20) default '미입력',
	bookPosition varchar(50) default '미입력',
	toLend boolean default false);
	
desc books;