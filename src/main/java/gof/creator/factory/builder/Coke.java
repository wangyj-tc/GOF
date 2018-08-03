package gof.creator.factory.builder;

/**
 * @author yongjian.wang
 * @create 03 9:59
 **/
public class Coke extends ColdDrink {

  @Override
  public float price() {
    return 30.0f;
  }

  public String name() {
    return "Coke";
  }

}
