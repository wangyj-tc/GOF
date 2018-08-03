package gof.creator.factory.abstractfactory;

/**
 * @author yongjian.wang
 * @create 02 21:23
 **/
public class DellFactory extends PcFactory {

  Mouse createMouse() {
    return new DellMouse();
  }

  KeyBo createKeyBo() {
    return new DellKeyBo();
  }
}
