package tset07;

public class NestedClassTest {
	
	public NestedClassTest() { System.out.println("NestedClassTest 생성자"); }
	
	//인스턴스 멤버 클래스
	class B {
		B() { System.out.println("B 객체 생성자");}
		int field1;
		void method1() {
			System.out.println(field1);
		}
		
		void method2() {
			/*
			 * 로컬 클래스
			 * - 로컬클래스는 접근제한자 및 static 사용 불가 -> 메소드 내부에서만 사용하기 때문에
			 */
			class D {
				D() {System.out.println("D 객체 생성자");}
				int field1;
				void method3() {
					System.out.println(field1);
				}
			}
			D d = new D();
			d.field1 = 25;
			d.method3();
		}
		

	}
	
	//정적 멤버 클래스
	static class C {
		C() {System.out.println("C 객체 생성자");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {
			System.out.println(field2);
		}
		
		static class C2 {
			static class C3 {
				static class C4 {
					static void method() {
						System.out.println("판도라의상자");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NestedClassTest 객체를 생성 후 B 객체 생성
		NestedClassTest nest = new NestedClassTest();
		NestedClassTest.B b = nest.new B();
		
		b.field1 = 3;
		b.method1();
		b.method2();
		
		
		
		//static 클래스 C의 객체를 생성하기 위해서는 NestedClassTest 객체를 생성할 필요가 없음
		NestedClassTest.C c = new NestedClassTest.C();
		
		NestedClassTest.C.field2 = 10;
		NestedClassTest.C.method2();
		
		NestedClassTest.C.C2.C3.C4.method();
	}

}
