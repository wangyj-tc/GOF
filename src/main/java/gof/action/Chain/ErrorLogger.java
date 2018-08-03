package gof.action.Chain;

/**
 * @author yongjian.wang
 * @create 03 11:27
 **/
public class ErrorLogger extends AbstractLogger {

  public ErrorLogger(int level){
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("Error Console::Logger: " + message);
  }
}