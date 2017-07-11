package tset07;

public class NestedClassTest {
	
	public NestedClassTest() { System.out.println("NestedClassTest ������"); }
	
	//�ν��Ͻ� ��� Ŭ����
	class B {
		B() { System.out.println("B ��ü ������");}
		int field1;
		void method1() {
			System.out.println(field1);
		}
		
		void method2() {
			/*
			 * ���� Ŭ����
			 * - ����Ŭ������ ���������� �� static ��� �Ұ� -> �޼ҵ� ���ο����� ����ϱ� ������
			 */
			class D {
				D() {System.out.println("D ��ü ������");}
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
	
	//���� ��� Ŭ����
	static class C {
		C() {System.out.println("C ��ü ������");}
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
						System.out.println("�ǵ����ǻ���");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NestedClassTest ��ü�� ���� �� B ��ü ����
		NestedClassTest nest = new NestedClassTest();
		NestedClassTest.B b = nest.new B();
		
		b.field1 = 3;
		b.method1();
		b.method2();
		
		
		
		//static Ŭ���� C�� ��ü�� �����ϱ� ���ؼ��� NestedClassTest ��ü�� ������ �ʿ䰡 ����
		NestedClassTest.C c = new NestedClassTest.C();
		
		NestedClassTest.C.field2 = 10;
		NestedClassTest.C.method2();
		
		NestedClassTest.C.C2.C3.C4.method();
	}

}
