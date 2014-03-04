public class WritePoem
{
    public static void main(String[] args)
    {
        Poem bombadil = new Poem("Old Tom Bombadil");

        bombadil.addLine("Old Tom Bombadil was a merry fellow!");
        bombadil.addLine("Bright blue his jacket was, "
            + "and his boots were yellow.");
        bombadil.addLine("Green was his girdle, "
            + "and his breeches all of leather.");
        bombadil.addLine("He wore in his tall hat a swan wing feather.");
        bombadil.addLine("He lived up Underhill, where the Withywindle");
        bombadil.addLine("Ran from a grassy well down into the dingle.");

        bombadil.print();
    }
}
