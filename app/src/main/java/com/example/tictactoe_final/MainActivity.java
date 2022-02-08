package com.example.tictactoe_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button
            BTNa1, BTNa2, BTNa3,
            BTNb1, BTNb2, BTNb3,
            BTNc1, BTNc2, BTNc3,
            BTNresetGame,BTNresetSession;

    int XorO = 0; /** even - O, odd - X */

    int HowManyXwins = 0, HowManyOwins = 0;
    TextView XWinsTV, OWinsTV;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //startActivity(new Intent(MainActivity.this,Pop.class)); X2

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        BTNa1 = findViewById(R.id.BTNa1);
        BTNa2 = findViewById(R.id.BTNa2);
        BTNa3 = findViewById(R.id.BTNa3);
        BTNb1 = findViewById(R.id.BTNb1);
        BTNb2 = findViewById(R.id.BTNb2);
        BTNb3 = findViewById(R.id.BTNb3);
        BTNc1 = findViewById(R.id.BTNc1);
        BTNc2 = findViewById(R.id.BTNc2);
        BTNc3 = findViewById(R.id.BTNc3);
        BTNresetGame  = findViewById(R.id.resetGame);
        BTNresetSession = findViewById(R.id.resetSession);
        XWinsTV = findViewById(R.id.XsWins);
        OWinsTV = findViewById(R.id.OsWins);


        BTNa1.setOnClickListener(this);
        BTNa2.setOnClickListener(this);
        BTNa3.setOnClickListener(this);

        BTNb1.setOnClickListener(this);
        BTNb2.setOnClickListener(this);
        BTNb3.setOnClickListener(this);

        BTNc1.setOnClickListener(this);
        BTNc2.setOnClickListener(this);
        BTNc3.setOnClickListener(this);

        BTNresetGame.setOnClickListener(this);
        BTNresetSession.setOnClickListener(this);






    }


    public void onClick (View v)
    {
        if (v == BTNresetGame)
        {
            reset();
            Toast.makeText(this, "YOU HAVE RESET THE CURRENT GAME", Toast.LENGTH_SHORT).show();
        }
        else
            if (v == BTNresetSession)
            {
                reset();
                HowManyXwins = 0;
                HowManyOwins = 0;
                XWinsTV.setText("0");
                OWinsTV.setText("0");

                Toast.makeText(this, "YOU HAVE RESET THE WHOLE SESSION", Toast.LENGTH_SHORT).show();
            }


            //////////////////////////////////////////// BUTTONS START HERE
                else
                if (v == BTNa1)
                {
                    if (BTNa1.getText().toString() == "")
                    {
                        if (XorO % 2 == 0)
                            BTNa1.setText("O");
                        else
                            BTNa1.setText("X");

                        XorO++;

                        win();
                    }
                }

                else
                if (v == BTNa2)
                {
                    if (BTNa2.getText().toString() == "")
                    {
                        if (XorO % 2 == 0)
                            BTNa2.setText("O");
                        else
                            BTNa2.setText("X");

                        XorO++;
                        win();
                    }
                }

                else
                if (v == BTNa3)
                {
                    if (BTNa3.getText().toString() == "")
                    {
                        if (XorO % 2 == 0)
                            BTNa3.setText("O");
                        else
                            BTNa3.setText("X");

                        XorO++;
                        win();
                    }
                }

                else
                if (v == BTNb1)
                {
                    if (BTNb1.getText().toString() == "")
                    {
                        if (XorO % 2 == 0)
                            BTNb1.setText("O");
                        else
                            BTNb1.setText("X");

                        XorO++;
                        win();
                    }
                }

                else
                if (v == BTNb2)
                {
                    if (BTNb2.getText().toString() == "")
                    {
                        if (XorO % 2 == 0)
                            BTNb2.setText("O");
                        else
                            BTNb2.setText("X");

                        XorO++;
                        win();
                    }
                }

                else
                if (v == BTNb3)
                {
                    if (BTNb3.getText().toString() == "")
                    {
                        if (XorO % 2 == 0)
                            BTNb3.setText("O");
                        else
                            BTNb3.setText("X");

                        XorO++;
                        win();
                    }
                }

                else
                if (v == BTNc1)
                {
                    if (BTNc1.getText().toString() == "")
                    {
                        if (XorO % 2 == 0)
                            BTNc1.setText("O");
                        else
                            BTNc1.setText("X");

                        XorO++;
                        win();
                    }
                }

                else
                if (v == BTNc2)
                {
                    if (BTNc2.getText().toString() == "" )
                    {
                        if (XorO % 2 == 0)
                            BTNc2.setText("O");
                        else
                            BTNc2.setText("X");

                        XorO++;
                        win();
                    }
                }

                else
                if (v == BTNc3)
                {
                    if (BTNc3.getText().toString() == "")
                    {
                        if (XorO % 2 == 0)
                            BTNc3.setText("O");
                        else
                            BTNc3.setText("X");

                        XorO++;
                        win();
                    }
                }





    }

    private void win()
    {
        if ( (BTNa1.getText().toString() == "O" ) && (BTNb1.getText().toString() == "O" ) && (BTNc1.getText().toString() == "O" )  )
        {
            startActivity(new Intent(MainActivity.this,PopO.class));

            reset();
            HowManyOwins++;

            OWinsTV.setText("" + HowManyOwins);
        }

        else
        if ( (BTNa2.getText().toString() == "O" ) && (BTNb2.getText().toString() == "O" ) && (BTNc2.getText().toString() == "O" )  )
        {
            startActivity(new Intent(MainActivity.this,PopO.class));

            reset();
            HowManyOwins++;
            OWinsTV.setText("" + HowManyOwins);

        }

        else
        if ( (BTNa3.getText().toString() == "O" ) && (BTNb3.getText().toString() == "O" ) && (BTNc3.getText().toString() == "O" )  )
        {
            startActivity(new Intent(MainActivity.this,PopO.class));

            reset();
            HowManyOwins++;
            OWinsTV.setText("" + HowManyOwins);

        }


        else
        if ( (BTNa2.getText().toString() == "O" ) && (BTNb2.getText().toString() == "O" ) && (BTNc2.getText().toString() == "O" )  )
        {
            startActivity(new Intent(MainActivity.this,PopO.class));

            reset();
            HowManyOwins++;
            OWinsTV.setText("" + HowManyOwins);

        }

        else
        if ( (BTNa1.getText().toString() == "O" ) && (BTNa2.getText().toString() == "O" ) && (BTNa2.getText().toString() == "O" )  )
        {
            startActivity(new Intent(MainActivity.this,PopO.class));

            reset();
            HowManyOwins++;
            OWinsTV.setText("" + HowManyOwins);

        }

        else
        if ( (BTNb1.getText().toString() == "O" ) && (BTNb2.getText().toString() == "O" ) && (BTNb3.getText().toString() == "O" )  )
        {
            startActivity(new Intent(MainActivity.this,PopO.class));

            reset();
            HowManyOwins++;
            OWinsTV.setText("" + HowManyOwins);

        }

        else
        if ( (BTNc1.getText().toString() == "O" ) && (BTNc2.getText().toString() == "O" ) && (BTNc3.getText().toString() == "O" )  )
        {
            startActivity(new Intent(MainActivity.this,PopO.class));

            reset();
            HowManyOwins++;
            OWinsTV.setText("" + HowManyOwins);

        }

        else
        if ( (BTNa1.getText().toString() == "O" ) && (BTNb2.getText().toString() == "O" ) && (BTNc3.getText().toString() == "O" )  )
        {
            startActivity(new Intent(MainActivity.this,PopO.class));

            reset();
            HowManyOwins++;
            OWinsTV.setText("" + HowManyOwins);

        }

        else
        if ( (BTNa3.getText().toString() == "O" ) && (BTNb2.getText().toString() == "O" ) && (BTNc1.getText().toString() == "O" )  )
        {
            startActivity(new Intent(MainActivity.this,PopO.class));

            reset();
            HowManyOwins++;
            OWinsTV.setText("" + HowManyOwins);

        }


        //////////////////////////////////////////////////////////////////////////////////////////// OOOOOOOOOOOOOOOOOOO







        if ( (BTNa1.getText().toString() == "X" ) && (BTNb1.getText().toString() == "X" ) && (BTNc1.getText().toString() == "X" )  )
        {
            startActivity(new Intent(MainActivity.this,Pop.class));

            reset();

            HowManyXwins++;
            XWinsTV.setText("" + HowManyXwins);
        }

        else
        if ( (BTNa2.getText().toString() == "X" ) && (BTNb2.getText().toString() == "X" ) && (BTNc2.getText().toString() == "X" )  )
        {
            startActivity(new Intent(MainActivity.this,Pop.class));
            HowManyXwins++;

            reset();
            XWinsTV.setText("" + HowManyXwins);

        }

        else
        if ( (BTNa3.getText().toString() == "X" ) && (BTNb3.getText().toString() == "X" ) && (BTNc3.getText().toString() == "X" )  )
        {
            startActivity(new Intent(MainActivity.this,Pop.class));
            HowManyXwins++;

            reset();
            XWinsTV.setText("" + HowManyXwins);

        }


        else
        if ( (BTNa2.getText().toString() == "X" ) && (BTNb2.getText().toString() == "X" ) && (BTNc2.getText().toString() == "X" )  )
        {
            startActivity(new Intent(MainActivity.this,Pop.class));
            HowManyXwins++;

            reset();
            XWinsTV.setText("" + HowManyXwins);

        }

        else
        if ( (BTNa1.getText().toString() == "X" ) && (BTNa2.getText().toString() == "X" ) && (BTNa2.getText().toString() == "X" )  )
        {
            startActivity(new Intent(MainActivity.this,Pop.class));
            HowManyXwins++;

            reset();
            XWinsTV.setText("" + HowManyXwins);


        }

        else
        if ( (BTNb1.getText().toString() == "X" ) && (BTNb2.getText().toString() == "X" ) && (BTNb3.getText().toString() == "X" )  )
        {
            startActivity(new Intent(MainActivity.this,Pop.class));
            HowManyXwins++;

            reset();
            XWinsTV.setText("" + HowManyXwins);

        }

        else
        if ( (BTNc1.getText().toString() == "X" ) && (BTNc2.getText().toString() == "X" ) && (BTNc3.getText().toString() == "X" )  )
        {
            startActivity(new Intent(MainActivity.this,Pop.class));
            HowManyXwins++;

            reset();
            XWinsTV.setText("" + HowManyXwins);

        }

        else
        if ( (BTNa1.getText().toString() == "X" ) && (BTNb2.getText().toString() == "X" ) && (BTNc3.getText().toString() == "X" )  )
        {
            startActivity(new Intent(MainActivity.this,Pop.class));
            HowManyXwins++;

            reset();
            XWinsTV.setText("" + HowManyXwins);

        }

        else
        if ( (BTNa3.getText().toString() == "X" ) && (BTNb2.getText().toString() == "X" ) && (BTNc1.getText().toString() == "X" )  )
        {
            startActivity(new Intent(MainActivity.this,Pop.class));
            HowManyXwins++;

            reset();
            XWinsTV.setText("" + HowManyXwins);

        }


        //////////////////////////////////////////////////////////////////////////////////////////// XXXXXXXXXXXXXXXXXXXXXXXX

    }





    public void reset()
    {
        BTNa1.setText("");
        BTNa2.setText("");
        BTNa3.setText("");

        BTNb1.setText("");
        BTNb2.setText("");
        BTNb3.setText("");

        BTNc1.setText("");
        BTNc2.setText("");
        BTNc3.setText("");
    }


}