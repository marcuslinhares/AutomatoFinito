public class Main {
    public static void main(String[] args) {
        State q0 = new State("q0");
        State q1 = new State("q1");
        State q2 = new State("q2");
        State qf = new State("qf");
        qf.setFinal();

        q0.addTransition(q1, 'y');
        q0.addTransition(q2, 'x');

        q1.addTransition(q1, 'y');
        q1.addTransition(qf, 'x');

        q2.addTransition(q2, 'y');
        q2.addTransition(q2, 'x');

        qf.addTransition(qf, 'x');
        qf.addTransition(q1, 'y');

        String w = "yyyyyyxxxyx";
        AFD afd = new AFD(q0, w);
        System.out.println("Palavra("+w+"): " + afd.run());
    }
}