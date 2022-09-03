package oopExam;

public interface Pager {
	// create a method
	public default void pagerMethod0() {
		System.out.println("This a default type method from pager method 0. ");
	}

	public void pagerMethod1();

	public void pagerMethod2();
}
