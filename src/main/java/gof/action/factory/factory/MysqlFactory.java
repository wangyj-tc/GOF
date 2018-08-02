package gof.action.factory.factory;

/**
 * @author yongjian.wang
 * @create 02 16:45
 **/
public class MysqlFactory implements Factory{

  public DBHelper getDB() {
    return new MysqlDB();
  }
}
