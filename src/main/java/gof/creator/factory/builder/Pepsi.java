package gof.creator.factory.builder;

/**
 * @author yongjian.wang
 * @create 03 10:00
 **/
public class Pepsi extends ColdDrink {

  @Override
  public float price() {
    return 35.0f;
  }

  public String name() {
    return "Pepsi";
  }

}
