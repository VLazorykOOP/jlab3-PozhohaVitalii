import Task1.*;
import Task2.*;
import Task3.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Lab 3");
  /*  Transport [] Ar = new Transport[4];
    Ar[0] = new Transport();
    Ar[1] = new Car();
    Ar[2] = new Train();
    Ar[3] = new Express();
    Ar[0].Show();
    System.out.println();
    Ar[1].Show();
    System.out.println();
    Ar[2].Show();
    System.out.println();
    Ar[3].Show();*/
//Task2
        /*
        Conteiner Conteiner;
        Conteiner Conteiner1;
        Conteiner Conteiner2;
        Conteiner = new Bubble();
        Conteiner1 = new Choice();
        Conteiner1.Add(9);
        Conteiner1.Add(8);
        Conteiner1.Add(7);
        Conteiner1.Add(6);
        Conteiner1.Add(5);
        Conteiner1.Add(123);
        Conteiner1.Add(92);
        Conteiner1.Add(94);
        Conteiner1.Add(31);
        Conteiner1.Show();
        Conteiner1.sort();
        Conteiner1.norm();
        Conteiner1.Show();
        System.out.println("Part 2: ");
        Conteiner.Add(29);
        Conteiner.Add(38);
        Conteiner.Add(17);
        Conteiner.Add(6);
        Conteiner.Add(55);
        Conteiner.Add(123);
        Conteiner.Add(932);
        Conteiner.Add(94);
        Conteiner.Add(31);
        Conteiner.Show();
        Conteiner.sort();
        Bubble Bubble = (Task2.Bubble) Conteiner;
        Bubble Bubblq = new Bubble();
        Choice ChoIce = (Task2.Choice) Conteiner1;
        Bubble.foreach();
        Conteiner.Show();
        System.out.println(Bubble.equals(Bubblq));
        System.out.println(ChoIce);
        System.out.println("end"); */
//Task3
        ConteinerINTER H,F;
        H = new Task3.Bubble();
        F = new Task3.Choice();
        H.Add(43);
        H.Add(1);
        H.Add(434);
        H.Add(32);
        H.Add(124);
        F.Add(12);
        F.Add(141);
        F.Add(24);
        F.Add(144);
        F.Add(94);

        F.Show();
        H.Show();

        H.sort();
        F.sort();

        F.Show();
        H.Show();

        F.norm();
        H.norm();

        Task3.Bubble B1 = (Task3.Bubble)H;
        Task3.Choice C1 = (Task3.Choice)F;

        B1.foreach();
        //B1.equals();

        System.out.println(C1.toString());
    }
}
