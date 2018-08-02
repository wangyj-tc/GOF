package gof.structure.decorator;

/**
 * @author yongjian.wang
 * @create 02 18:10
 **/
public class Test {

  public static void main(String[] args) {
    Hero hero = new BlindMonk("盲憎");
    Skills skills = new Skills(hero);
    Skills q = new Skill_Q(hero, "天音波/回音击");
    q.learnSkills();

  }

}
