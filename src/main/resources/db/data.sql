INSERT INTO USERS (EMAIL, FIRST_NAME, LAST_NAME, PASSWORD)
VALUES ('user@gmail.com', 'User_First', 'User_Last', '{noop}password'),
       ('admin@javaops.ru', 'Admin_First', 'Admin_Last', '{noop}admin');

INSERT INTO USER_ROLE (ROLE, USER_ID)
VALUES ('USER', 1),
       ('ADMIN', 2),
       ('USER', 2);
/*create extension uuid-ossp;*/
/*create table user_details (
                              id text primary key  ,
                              name text not null,
                              email text,
                              mobile_number text,
                              created_at timestamp not null default now(),
                              updated_at timestamp
);

create table address (
                         id text primary key ,
                         address1 text,
                         address2 text,
                         street text,
                         city text,
                         state text,
                         country text,
                         user_id text,
                         created_at timestamp not null default now(),
                         updated_at timestamp

);*/

/*
alter table address add constraint fk_address_1 foreign key (user_id) references user_details;

insert into user_details (name, email, mobile_number) values ('John', 'john_1@gmail.com', '_919876543219');
insert into user_details (name, email, mobile_number) values ('John Carter', 'john_carter@gmail.com', '_919876543218');

select * from user_details;

insert into address (address1, address2, street, city, state, country, user_id) values
('address1_john', 'address2_john', 'street_john', 'Hyderabad', 'Telangana', 'India', '8d962e74-44c2-4aa7-a440-7436d1950d18');

insert into address (address1, address2, street, city, state, country, user_id) values
('address1_john_1', 'address2_john_1', 'street_john_1', 'Hyderabad', 'Telangana', 'India', '8d962e74-44c2-4aa7-a440-7436d1950d18');

insert into address (address1, address2, street, city, state, country, user_id) values
('address1_john_carter', 'address2_john_carter', 'street_john_carter', 'Hyderabad', 'Telangana', 'India', 'c2ed3241-4d2b-4fcb-a3aa-a69a9cb4601d');*/
