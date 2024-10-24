package TaskOne;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Flow flows = new Flow();

        //   System.out.println("flows.methodA(\"Hello, world\");");
        //   flows.methodA("Hello, world");
        System.out.println("flows.methodA(\"start\");");
        flows.methodA("start");
        System.out.println("flows.methodB(\"Hello, world\");");
        flows.methodB("Hello, world");
        System.out.println("flows.methodC(\"Hello, world\");");
        flows.methodC("Hello, world");
        System.out.println("flows.methodD(25);");
        flows.methodD(25);

    }
}