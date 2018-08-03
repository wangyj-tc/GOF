package gof.creator.factory.builder;

/**
 * @author yongjian.wang
 * @create 03 9:59
 **/
public class ChickenBurger extends Burger {

  @Override
  public float price() {
    return 50.5f;
  }

  public String name() {
    return "Chicken Burger";
  }

}
