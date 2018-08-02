package gof.structure.decorator;

/**
 * @author yongjian.wang
 * @create 02 18:07
 **/
public class Skills implements Hero {
  //持有一个英雄对象接口
  private Hero hero;

  public Skills(Hero hero) {
    this.hero = hero;
  }

  public void learnSkills() {
    if(hero != null)
      hero.learnSkills();
  }
}
