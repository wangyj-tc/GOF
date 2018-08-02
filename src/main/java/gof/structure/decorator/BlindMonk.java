package gof.structure.decorator;

/**
 * @author yongjian.wang
 * @create 02 18:06
 **/
public class BlindMonk implements Hero {

  private String name;

  public BlindMonk(String name) {
    this.name = name;
  }


  public void learnSkills() {
    System.out.println(name + "学习了以上技能！");
  }
}
