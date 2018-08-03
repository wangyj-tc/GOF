package gof.creator.factory.builder;

/**
 * @author yongjian.wang
 * @create 03 10:02
 **/
public class VegBurger extends Burger {

  @Override
  public float price() {
    return 25.0f;
  }

  public String name() {
    return "Veg Burger";
  }

}
