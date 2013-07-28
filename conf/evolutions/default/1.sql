# --- First Database Schema

# -- !Ups

-- table declarations :
create table "poems" (
    "id" bigint DEFAULT nextval('s_poems_id') primary key not null,
    "text" varchar(128) not null
  );
create sequence "s_poems_id";

# -- !Downs

DROP TABLE IF EXISTS "poems";
DROP SEQUENCE IF EXISTS "s_poems_id";

