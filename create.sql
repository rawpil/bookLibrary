create sequence hibernate_sequence start 1 increment 1
create table author (id int8 not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id int8 not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create sequence hibernate_sequence start 1 increment 1
create table author (id int8 not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id int8 not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create sequence hibernate_sequence start 1 increment 1
create table author (id int8 not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id int8 not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create sequence hibernate_sequence start 1 increment 1
create table author (id int8 not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id int8 not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create sequence hibernate_sequence start 1 increment 1
create table author (id int8 not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id int8 not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create sequence hibernate_sequence start 1 increment 1
create table author (id int8 not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id int8 not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create sequence hibernate_sequence start 1 increment 1
create table author (id int8 not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id int8 not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create sequence hibernate_sequence start 1 increment 1
create table author (id int8 not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id int8 not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create sequence hibernate_sequence start 1 increment 1
create table author (id int8 not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id int8 not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create sequence hibernate_sequence start 1 increment 1
create table author_bck (id int8 not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books_bck (id int8 not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKmxlkpwa05hwu12r0w4tfrek3d foreign key (author_id) references author_bck
alter table book_author add constraint FKh76so4rl669jxa30tuicrd5e3 foreign key (book_id) references books_bck
create sequence hibernate_sequence start 1 increment 1
create table author (id int8 not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id int8 not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create sequence hibernate_sequence start 1 increment 1
create table author (id int8 not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id  bigserial not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create sequence hibernate_sequence start 1 increment 1
create table author (id  bigserial not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id  bigserial not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id int8 not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create table author (id  bigserial not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id  bigserial not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id  bigserial not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create table author (id  bigserial not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id  bigserial not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id  bigserial not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create table author (id  bigserial not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id  bigserial not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id  bigserial not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create table author (id  bigserial not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id  bigserial not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id  bigserial not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create table author (id  bigserial not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id  bigserial not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id  bigserial not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create table author (id  bigserial not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id  bigserial not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id  bigserial not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
create table author (id  bigserial not null, birth_date timestamp, first_name varchar(255), last_name varchar(255), primary key (id))
create table book_author (book_id int8 not null, author_id int8 not null)
create table books (id  bigserial not null, book_name varchar(255), isbn int4, primary key (id))
create table users (id  bigserial not null, password varchar(255), username varchar(255), primary key (id))
alter table book_author add constraint FKbjqhp85wjv8vpr0beygh6jsgo foreign key (author_id) references author
alter table book_author add constraint FK91ierknt446aaqnjl4uxjyls3 foreign key (book_id) references books
