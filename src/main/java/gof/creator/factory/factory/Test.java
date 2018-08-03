package gof.creator.factory.factory;

/**
 * @author yongjian.wang
 * @create 02 16:47
 **/
public class Test {

  public static void main(String[] args){
      Factory f = new MysqlFactory();

      System.out.println(f.getDB());
  }



}
