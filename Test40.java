public class JdbcDemo {

    private  static final String CONN_URL = "jdbc:mysql://localhost:3306/memo?user=root&password=xing0529&useUnicode=true&characterEncoding=UTF-8";

    private static final String QUERY_SQL =
            "select id,group_id,title,content,is_protected,background,is_remind,remind_time,created_time,modify_time from memo_info";

    public static void main(String[] args) throws ClassNotFoundException {
        //很早之前已经不需要，DriverManager会自动加载
        //Class.forName("com.mysql.jdbc.Driver");

        try (
                Connection connection = DriverManager.getConnection(CONN_URL);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(QUERY_SQL);){

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String content = resultSet.getString("content");
                Date createTime = resultSet.getDate("created_time");
                System.out.println(String.format("Memo: id=%d, title=%s, content=%s, createTime=%s",
                        id, title, content, createTime.toString()));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
