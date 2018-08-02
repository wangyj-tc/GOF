package gof.action.factory.abstractfactory;

import java.security.Key;

/**
 * @author yongjian.wang
 * @create 02 21:21
 **/
public abstract class PcFactory {

  abstract Mouse createMouse();

  abstract KeyBo createKeyBo();

}
