package gof.creator.factory.builder;

/**
 * @author yongjian.wang
 * @create 03 9:57
 **/
public abstract class Burger implements Item {

  public Packing packing() {
    return new Wrapper();
  }

  public abstract float price();

}
