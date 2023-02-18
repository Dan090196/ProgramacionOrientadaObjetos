package Java_Basic.Ciclos;

public class For
{
    public static void main(String[] args)
    {
        /*for (int i = 0; i < 10; i++) // Este incremento se usa de uno a uno
        {
            System.out.println("For 1: " + i);
        }

        for (int i = 0; i < 10; i+=3) // Está sintaxis se usa para decidir el incremento
        {
            System.out.println("For 2: " + i);
        }*/

        for (int i = 0; i < 10; i++)
        {
            if(i==7)
            {
                break;
            }
            System.out.println("For 3: " + " " + i);
        }

        for (int i = 0; i <= 10; i++)
        {
            if(i==7)
            {
                continue;
            }
            System.out.println("For 4: " + " " + i);
        }



    }
}
