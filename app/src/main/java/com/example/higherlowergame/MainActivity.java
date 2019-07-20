package com.example.higherlowergame;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    int randnum;
    EditText e;

    public void guess(View view)
    {


        int guessnum= Integer.parseInt ( e.getText ().toString () );

        if(guessnum > randnum)
        {
            Toast.makeText ( this , "Guess Lower Number" , Toast.LENGTH_SHORT ).show ();
        }
        else if (guessnum < randnum)
        {
            Toast.makeText ( this , "Guess Upper Number" , Toast.LENGTH_SHORT ).show ();
        }
        else
        {
            Toast.makeText ( this , "Yehh, That's the right num ! and try again for new number" , Toast.LENGTH_LONG ).show ();

            Random random=new Random (  );
            randnum=random.nextInt (20)+ 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        e=(EditText)findViewById ( R.id.et );





        Random random=new Random (  );
        randnum=random.nextInt (20) + 1;

    }


}
