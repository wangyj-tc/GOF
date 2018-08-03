package gof.creator.factory.simpleFactory;

/**
 * @author yongjian.wang
 * @create 02 16:34
 **/
public class DbFactory {
  
  
  public DBHelper createDB(int a){
    switch (a){
      case 1:return new MysqlDB();
      case 2:return new OracleDB();
      default:return null;
    }
    
  }
  
  public static void main(String[] args){
    DbFactory db = new DbFactory();
    System.out.println(db.createDB(2));

  }
  
  

}
