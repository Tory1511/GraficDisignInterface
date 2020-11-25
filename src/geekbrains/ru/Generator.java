package geekbrains.ru;


import java.util.Random;

public class Generator
{

    int userLength;
    public String password;

    Generator(String userLength)
    {

        this.userLength = Integer.parseInt(userLength);
    }


    public void generate()
    {
        this.password = "";
        for (int i = 0; i < this.userLength; i++)
        {
            switch (new Random().nextInt(3))
            {
                case 1:
                    this.password += (char)(new Random().nextInt(26) + 'a');
                case 2:
                    this.password += (char)(new Random().nextInt(26) + 'A');
                case 3:
                    this.password += (char)(new Random().nextInt(10) + '0');
            }

        }


    }
}
