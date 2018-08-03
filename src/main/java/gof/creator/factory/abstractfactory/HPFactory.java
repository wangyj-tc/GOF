package gof.creator.factory.abstractfactory;

import sun.security.smartcardio.SunPCSC.Factory;

/**
 * @author yongjian.wang
 * @create 02 21:24
 **/
public class HPFactory extends PcFactory{

  Mouse createMouse() {
    return new HPMouse();
  }

  KeyBo createKeyBo() {
    return new HPKeyBo();
  }
}
