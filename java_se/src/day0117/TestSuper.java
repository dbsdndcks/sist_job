package day0117;
/*
 * 부모 클래스가 seald였다면 자식 클래스는 상속을 받더라도 none-sealed를 클래스앞에 명시해야한다.
 */
public sealed class TestSuper permits Test1,Test2{

}
