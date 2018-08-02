package gof.action.factory.factory;

/**
 * @author yongjian.wang
 * @create 02 16:46
 **/
public class OracleFactory implements Factory {

  public DBHelper getDB() {
    return new OracleDB();
  }
}
