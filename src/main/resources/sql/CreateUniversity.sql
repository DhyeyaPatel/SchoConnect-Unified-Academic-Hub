create table if not exists users(id bigserial primary key, 
				  first_name varchar(25) default null,
				  last_name varchar(25) default null,
				  email varchar(25) not null,
				  username varchar(25) not null,
				  password varchar(300) not null
				 );
				 
insert into users VALUES (1,'John','Smith','john@gmail.com','john','$2a$10$F8sB/g1Ye6e/bi8ZeYig.OSYyFUDCPjDgo.1lvyiiQ8Fcr8gnbhbG'),
				  (2,'Sachin','Dave','sachin@gmail.com','sachin','$2a$10$ScVCKTI48YezLftvZIyOculWARv/ros/isElYZyqpT1ftVJ4g/zai');

create table if not exists roles(id bigserial primary key not null, 
				  role varchar(45) not null,
				  users_id bigint default null,
				  constraint fk_user_id
			      FOREIGN KEY(users_id)
				  references users(id)
				 );

INSERT INTO roles VALUES (1,'STUDENT',1),(2,'PROFESSOR',2);