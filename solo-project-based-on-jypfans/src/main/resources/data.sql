insert into user_type(type) values ('FAN'), ('ARTIST'), ('ADMIN');

insert into category(category) values('FAN'),('ARTIST'), ('NOTICE'), ('ADMIN');

insert team(name, debut) value('XDinary Heroes', '2021-12-06');

insert into user(user_id, team_id, password, name, nick_name, type_id, birth_day)
value('Drum901', 1, 'DrumPassword', '구건일', '901', '2', '1998-07-24');

insert into post(writer_id, title, content, category_id, team_id)
value(1, "Hello World", "안녕 빌런즈", 2, 1);