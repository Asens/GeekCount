import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestS {
   // @Test
    public void testSayHello() throws SQLException {
        String sqlDB = "show databases";//查询数据库
        String sqlTab = "show tables";//查看表
        //String sqlCount = "select stock_no,count(*) from stock_daily where view_date > '2012-01-01' and view_date < '2013-01-01' group by stock_no order by count(stock_no) desc";
        String sqlCount = "select count(*) from view_log";
        //String sqlInsert = "insert into ck_local (UnixDate,Year)values('2010-03-21',2011);";
        exeSql(sqlDB);
        exeSql(sqlTab);
        //exeSql(sqlInsert);
        exeSql(sqlCount);
    }

    public void exeSql(String sql){
        String address = "jdbc:clickhouse://39.100.69.192:8123/default";
        Connection connection = null;
        Statement statement = null;
        ResultSet results = null;
        try {
            Class.forName("ru.yandex.clickhouse.ClickHouseDriver");
            connection = DriverManager.getConnection(address);
            statement = connection.createStatement();
            long begin = System.currentTimeMillis();
            results = statement.executeQuery(sql);
            long end = System.currentTimeMillis();
            System.out.println("执行（"+sql+"）耗时："+(end-begin)+"ms");
            ResultSetMetaData rsmd = results.getMetaData();
            List<Map> list = new ArrayList();
            while(results.next()){
                Map map = new HashMap();
                for(int i = 1;i<=rsmd.getColumnCount();i++){
                    map.put(rsmd.getColumnName(i),results.getString(rsmd.getColumnName(i)));
                }
                list.add(map);
            }
            for(Map map : list){
                System.err.println(map);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {//关闭连接
            try {
                if(results!=null){
                    results.close();
                }
                if(statement!=null){
                    statement.close();
                }
                if(connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
