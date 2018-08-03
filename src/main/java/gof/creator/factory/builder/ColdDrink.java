package gof.creator.factory.builder;

/**
 * @author yongjian.wang
 * @create 03 9:58
 **/
public abstract class ColdDrink implements Item {

  public Packing packing() {
    return new Bottle();
  }

  public abstract float price();

}
