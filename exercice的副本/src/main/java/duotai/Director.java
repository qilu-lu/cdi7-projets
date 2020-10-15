package duotai;
//导演类不是actor，相当于核心业务类，主要功能让演员就位开始表演
public class Director {
	//导演的action方法,让演员开始表演！多态
public void action(Actor actor) {
	actor.performs();
}
}
