package gof.action.Chain;

/**
 * @author yongjian.wang
 * @create 03 11:26
 **/
public class ConsoleLogger extends AbstractLogger {

  public ConsoleLogger(int level){
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("Standard Console::Logger: " + message);
  }
}
