public class JustSomeProgram
{
    public static void main(String[] args)
    {
        JustSomeClass jsc = new JustSomeClass();
        jsc.setName("First");
        
        JustSomeSubclass jss = new JustSomeSubclass();
        jss.setName("Second");
        jss.setNumber(42);

        jsc.print();
        jss.print();
    }
}
