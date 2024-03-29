-- 创建数据库
--  create database if not exists small_everything;
--  创建数据库表(Thing类创建的对象)
drop table if exists file_index;
create table if not exists file_index(
  name      varchar(256) not null comment '文件名称',
  path      varchar(1024) not null comment '文件路径',
  depth     int not null comment '文件路径长度',
  file_type varchar(32) not null comment '文件类型'
);
create index file_name on file_index(name);

