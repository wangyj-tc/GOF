package gof.action.factory.abstractfactory;

import sun.nio.cs.ext.PCK;
import sun.security.smartcardio.SunPCSC.Factory;

/**
 * @author yongjian.wang
 * @create 02 21:26
 **/
public class Test {

  public static void main(String[] args){
    PcFactory factory = new HPFactory();
    factory.createKeyBo();
    factory.createMouse();

  }

}
