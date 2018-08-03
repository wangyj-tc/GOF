package gof.action.Chain;

/**
 * @author yongjian.wang
 * @create 03 11:27
 **/
public class FileLogger extends AbstractLogger {

  public FileLogger(int level){
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("Debug::Logger: " + message);
  }
}