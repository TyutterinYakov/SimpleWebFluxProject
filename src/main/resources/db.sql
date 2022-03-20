create table person (
	person_id serial CONSTRAINT id PRIMARY KEY,
	name varchar(255) not null
)