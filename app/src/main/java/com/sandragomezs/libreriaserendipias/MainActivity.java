package com.sandragomezs.libreriaserendipias;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get access to our TextView
        TextView iconoPhone = (TextView) findViewById(R.id.textViewIconoPhone_txt);
        TextView iconoMail = (TextView) findViewById(R.id.textViewIconoMail);
        TextView iconoHorario = (TextView) findViewById(R.id.textViewIconoHorario);
        TextView iconoDireccion = (TextView) findViewById(R.id.textViewIconoDireccion);
        TextView iconoFb = (TextView) findViewById(R.id.textViewIconoFb);
        TextView iconoInstagram = (TextView) findViewById(R.id.textViewIconoInstagram);
        TextView iconoWeb = (TextView) findViewById(R.id.textViewIconoWeb);
        TextView addressMap = (TextView) findViewById(R.id.textViewDireccion);

        // Create the TypeFace from the TTF asset
        Typeface myFonAwesomeFont = Typeface.createFromAsset(getAssets(), "fonts/fontawesome-webfont.ttf");

        // Assign the typeface to the view

        iconoPhone.setTypeface(myFonAwesomeFont);
        iconoMail.setTypeface(myFonAwesomeFont);
        iconoHorario.setTypeface(myFonAwesomeFont);
        iconoDireccion.setTypeface(myFonAwesomeFont);
        iconoFb.setTypeface(myFonAwesomeFont);
        iconoInstagram.setTypeface(myFonAwesomeFont);
        iconoWeb.setTypeface(myFonAwesomeFont);

        // text2 has links specified by putting <a> tags in the string
        // resource.  By default these links will appear but not
        // respond to user input.  To make them active, you need to
        // call setMovementMethod() on the TextView object.


        iconoFb.setMovementMethod(LinkMovementMethod.getInstance());
        iconoInstagram.setMovementMethod(LinkMovementMethod.getInstance());
        iconoWeb.setMovementMethod(LinkMovementMethod.getInstance());
        addressMap.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
