DROP TABLE IF EXISTS subscribe;
DROP TABLE IF EXISTS post;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS user_type;
DROP TABLE IF EXISTS team;
DROP TABLE IF EXISTS category;

create table category
(
  id int(50) not null auto_increment primary key,
  category varchar(30) not null
);
create table user_type
(
  id int(50) not null auto_increment primary key,
  type varchar(10) not null
);

create table team
(
  id int(50) not null auto_increment primary key,
  name varchar(30) not null,
  debut TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

create table user
(
  id int(50) not null auto_increment primary key,
  team_id int(50),
  type_id int(50) not null,

  user_id varchar(30) not null,
  password varchar(30) not null,
  name varchar(30) not null,
  nick_name varchar(30) not null,

  birth_day TIMESTAMP DEFAULT CURRENT_TIMESTAMP not null,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP not null,
  updated_at TIMESTAMP,
  is_deleted boolean  DEFAULT 0,

  foreign key(team_id) references team(id),
  foreign key(type_id) references user_type(id)
);

create table post
(
  id int(50) not null auto_increment primary key,
  team_id int(50) not null,
  category_id int(50) not null,
  writer_id int(50) not null,

  title varchar(50),
  content varchar(255) not null,

  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP not null,
  updated_at TIMESTAMP,
  is_deleted boolean  DEFAULT 0,

  foreign key(category_id) references category(id),
  foreign key(team_id) references team(id),
  foreign key(writer_id) references user(id)
);


create table subscribe
(
  id int(50) not null auto_increment primary key,
  fan_id int(50) not null,
  team_id int(50) not null,

  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP not null,
  updated_at TIMESTAMP,
  is_deleted boolean  DEFAULT 0,

  foreign key(team_id) references team(id),
  foreign key(fan_id) references user(id)
);