package com.core.dao.impl;

import com.core.dao.FileIndexDao;
import com.core.model.Condition;
import com.core.model.FileType;
import com.core.model.Thing;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FileIndexDaoImpl implements FileIndexDao {

    private DataSource dataSource;

    public FileIndexDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insert(Thing thing) {
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            //1.获取数据库连接
            connection = dataSource.getConnection();
            //2.准备SQL语句
            String sql = "insert into file_index(name, path, depth, file_type) values (?,?,?,?)";
            //3.准备命令
            statement = connection.prepareStatement(sql);
            //4.设置参数
            statement.setString(1,thing.getName());
            statement.setString(2,thing.getPath());
            statement.setInt(3,thing.getDepth());
            statement.setString(4,thing.getFileType().name());
            //5.执行命令
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            releaseResource(null,statement,connection);
        }
    }

    @Override
    public void delete(Thing thing) {
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            //1.获取数据库连接
            connection = dataSource.getConnection();
            //2.准备SQL语句
            String sql = "delete from file_index where path like '" + thing.getPath() + "%'";
            //3.准备命令
            statement = connection.prepareStatement(sql);
            //4.设置参数
            //5.执行命令
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            releaseResource(null,statement,connection);
        }
    }

    @Override
    public List<Thing> search(Condition condition) {
        List<Thing> things = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            //1.获取数据库连接
            connection = dataSource.getConnection();
            //2.准备SQL语句
            //String sql = "select name,path,depth,file_type from file_index";

            //name       : like
            //filetype   : =
            //深度由浅到深
            //limit      : limit offset
            //orderbyAsc : order by

            //TODO StringBuilder与StringBuffer的区别

            //StringBuffer 不会被多线程共享

            StringBuilder sqlBuilder = new StringBuilder();
            sqlBuilder.append(" select name,path,depth,file_type from file_index ");

            //name匹配：前模糊，后模糊，前后模糊
            sqlBuilder.append("where ")
                    .append("name like '%")
                    .append(condition.getName())
                    .append("%'");

            if(condition.getFileType() != null){
                sqlBuilder.append(" and file_type = '")
                        .append(condition.getFileType().toUpperCase())
                        .append("' ");
            }

            //limit,order必选的
            if(condition.getOrderByAsc() != null){
                sqlBuilder.append(" order by depth ")
                        .append(condition.getOrderByAsc() ? "asc":"desc");
            }

            if(condition.getLimit() != null){
                sqlBuilder.append(" limit ")
                        .append(condition.getLimit())
                        .append(" offset 0");
            }

            //System.out.println(sqlBuilder.toString());
            //3.准备命令
            statement = connection.prepareStatement(sqlBuilder.toString());
            //4.设置参数
            //5.执行命令
            resultSet = statement.executeQuery();
            //6.处理结果集
            while(resultSet.next()){
                //数据库中的行记录 --> Java中的对象Thing
                Thing thing = new Thing();
                thing.setName(resultSet.getString("name"));
                thing.setPath(resultSet.getString("path"));
                thing.setDepth(resultSet.getInt("depth"));
                String fileType = resultSet.getString("file_type");
                thing.setFileType(FileType.lookupByName(fileType));
                things.add(thing);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            releaseResource(resultSet,statement,connection);
        }
        return things;
    }

    //解决内部代码大量重复问题：重构
    private void releaseResource(ResultSet resultSet, PreparedStatement statement, Connection connection){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
