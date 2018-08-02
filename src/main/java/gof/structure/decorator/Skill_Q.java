package gof.structure.decorator;

/**
 * @author yongjian.wang
 * @create 02 18:08
 **/
public class Skill_Q extends Skills {

  private String skillName;

  public Skill_Q(Hero hero, String skillName) {
    super(hero);
    this.skillName = skillName;
  }

  @Override
  public void learnSkills() {
    System.out.println("学习了技能Q:" + skillName);
    super.learnSkills();
  }

}
