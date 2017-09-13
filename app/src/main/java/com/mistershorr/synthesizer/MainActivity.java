package com.mistershorr.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.mistershorr.synthesizer.R.id.b;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MediaPlayer aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote,
            fNote, fsNote, gNote, gsNote, ahNote, ashNote, bhNote, chNote, cshNote, dhNote;
   private MediaPlayer dshNote, ehNote, fhNote, fshNote, ghNote, gshNote;

    private Button aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton,
            fButton, fsButton, gButton, gsButton, eScaleButton, song, funk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
        setListeners();
        createMediaPlayers();
    }

    private void createMediaPlayers() {
        aNote = MediaPlayer.create(this, R.raw.scalea);
        asNote = MediaPlayer.create(this, R.raw.scalebb);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dsNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fsNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gsNote = MediaPlayer.create(this, R.raw.scalegs);
        ahNote = MediaPlayer.create(this, R.raw.scalehigha);
        ashNote = MediaPlayer.create(this, R.raw.scalehighbb);
        bhNote = MediaPlayer.create(this, R.raw.scalehighb);
        chNote = MediaPlayer.create(this, R.raw.scalehighc);
        cshNote = MediaPlayer.create(this, R.raw.scalehighcs);
        dhNote = MediaPlayer.create(this, R.raw.scalehighd);
        dshNote = MediaPlayer.create(this, R.raw.scalehighds);
        ehNote = MediaPlayer.create(this, R.raw.scalehighe);
        fhNote = MediaPlayer.create(this, R.raw.scalehighf);
        fshNote = MediaPlayer.create(this, R.raw.scalehighfs);
        ghNote = MediaPlayer.create(this, R.raw.scalehighg);
        gshNote = MediaPlayer.create(this, R.raw.scalehighgs);

    }
    private void a(int milliseconds)
    {
        aNote.seekTo(0);
        aNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    private void as(int milliseconds) {
        asNote.seekTo(0);
        asNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void b(int milliseconds) {
        bNote.seekTo(0);
        bNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void c(int milliseconds) {
        cNote.seekTo(0);
        cNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void cs(int milliseconds) {
        csNote.seekTo(0);
        csNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void d(int milliseconds) {
        dNote.seekTo(0);
        dNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void ds(int milliseconds) {
        dsNote.seekTo(0);
        dsNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void e(int milliseconds) {
        eNote.seekTo(0);
        eNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void f(int milliseconds) {
        fNote.seekTo(0);
        fNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void fs(int milliseconds) {
        fsNote.seekTo(0);
        fsNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void g(int milliseconds) {
        gNote.seekTo(0);
        gNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void gs(int milliseconds) {
        gsNote.seekTo(0);
        gsNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void ah(int milliseconds) {
        ahNote.seekTo(0);
        ahNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void ash(int milliseconds) {
        ashNote.seekTo(0);
        ashNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void bh(int milliseconds) {
        bhNote.seekTo(0);
        bhNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void ch(int milliseconds) {
        chNote.seekTo(0);
        chNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void csh(int milliseconds) {
        cshNote.seekTo(0);
        cshNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void dh(int milliseconds) {
        dhNote.seekTo(0);
        dhNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void dsh(int milliseconds) {
        dshNote.seekTo(0);
        dshNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void eh(int milliseconds) {
        ehNote.seekTo(0);
        ehNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void fh(int milliseconds) {
        fhNote.seekTo(0);
        fhNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void fsh(int milliseconds) {
        fshNote.seekTo(0);
        fshNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void gh(int milliseconds) {
        ghNote.seekTo(0);
        ghNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void gsh(int milliseconds) {
        gshNote.seekTo(0);
        gshNote.start();
        try {
            delayPlaying(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        eScaleButton.setOnClickListener(this);
        song.setOnClickListener(this);
        funk.setOnClickListener(this);
        }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.a);
        asButton = (Button) findViewById(R.id.a_s);
        bButton = (Button) findViewById(b);
        cButton = (Button) findViewById(R.id.c);
        csButton = (Button) findViewById(R.id.c_s);
        dButton = (Button) findViewById(R.id.d);
        dsButton = (Button) findViewById(R.id.d_s);
        eButton = (Button) findViewById(R.id.e);
        fButton = (Button) findViewById(R.id.f);
        fsButton = (Button) findViewById(R.id.f_s);
        gButton = (Button) findViewById(R.id.g);
        gsButton = (Button) findViewById(R.id.g_s);
        eScaleButton = (Button) findViewById(R.id.e_scale);
        song = (Button) findViewById(R.id.song);
        funk = (Button) findViewById(R.id.funk);


    }
    private void littleStar()
    {
        cNote.seekTo(0);
        cNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cNote.seekTo(0);
        cNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gNote.seekTo(0);
        gNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gNote.seekTo(0);
        gNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ahNote.seekTo(0);
        ahNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ahNote.seekTo(0);
        ahNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gNote.seekTo(0);
        gNote.start();
        try {
            delayPlaying(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fNote.seekTo(0);
        fNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fNote.seekTo(0);
        fNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        eNote.seekTo(0);
        eNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        eNote.seekTo(0);
        eNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dNote.seekTo(0);
        dNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dNote.seekTo(0);
        dNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cNote.seekTo(0);
        cNote.start();
        try {
            delayPlaying(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gNote.seekTo(0);
        gNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gNote.seekTo(0);
        gNote.start();
        try {
            delayPlaying(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cNote.seekTo(0);
        cNote.start();
        try {
            delayPlaying(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fNote.seekTo(0);
        fNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fNote.seekTo(0);
        fNote.start();
        try {
            delayPlaying(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cNote.seekTo(0);
        cNote.start();
        try {
            delayPlaying(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        eNote.seekTo(0);
        eNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        eNote.seekTo(0);
        eNote.start();
        try {
            delayPlaying(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cNote.seekTo(0);
        cNote.start();
        try {
            delayPlaying(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dNote.seekTo(0);
        dNote.start();
        try {
            delayPlaying(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gNote.seekTo(0);
        gNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gNote.seekTo(0);
        gNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fNote.seekTo(0);
        fNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fNote.seekTo(0);
        fNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        eNote.seekTo(0);
        eNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gNote.seekTo(0);
        gNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dNote.seekTo(0);
        dNote.start();
        try {
            delayPlaying(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }





        cNote.seekTo(0);
        cNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cNote.seekTo(0);
        cNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gNote.seekTo(0);
        gNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gNote.seekTo(0);
        gNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ahNote.seekTo(0);
        ahNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ahNote.seekTo(0);
        ahNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gNote.seekTo(0);
        gNote.start();
        try {
            delayPlaying(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fNote.seekTo(0);
        fNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fNote.seekTo(0);
        fNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        eNote.seekTo(0);
        eNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        eNote.seekTo(0);
        eNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dNote.seekTo(0);
        dNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dNote.seekTo(0);
        dNote.start();
        try {
            delayPlaying(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cNote.seekTo(0);
        cNote.start();
        try {
            delayPlaying(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.a:
                Toast.makeText(this, "A clicked", Toast.LENGTH_SHORT );
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.a_s:
                Toast.makeText(this, "A# clicked", Toast.LENGTH_SHORT );
                asNote.seekTo(0);
                asNote.start();
                break;
            case b:
                Toast.makeText(this, "B clicked", Toast.LENGTH_SHORT );
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.c:
                Toast.makeText(this, "C clicked", Toast.LENGTH_SHORT );
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.c_s:
                Toast.makeText(this, "C# clicked", Toast.LENGTH_SHORT );
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.d:
                Toast.makeText(this, "D clicked", Toast.LENGTH_SHORT );
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.d_s:
                Toast.makeText(this, "D# clicked", Toast.LENGTH_SHORT );
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.e:
                Toast.makeText(this, "E clicked", Toast.LENGTH_SHORT );
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.f:
                Toast.makeText(this, "F clicked", Toast.LENGTH_SHORT );
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.f_s:
                Toast.makeText(this, "F# clicked", Toast.LENGTH_SHORT );
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.g:
                Toast.makeText(this, "G clicked", Toast.LENGTH_SHORT );
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.g_s:
                Toast.makeText(this, "G# clicked", Toast.LENGTH_SHORT );
                gsNote.seekTo(0);
                gsNote.start();
                break;
            case R.id.e_scale:
                Toast.makeText(this, "INTERRUPTED", Toast.LENGTH_SHORT);
                eNote.seekTo(0);
                eNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fNote.seekTo(0);
                fNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fsNote.seekTo(0);
                fsNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gNote.seekTo(0);
                gNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ahNote.seekTo(0);
                ahNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bhNote.seekTo(0);
                bhNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cshNote.seekTo(0);
                cshNote.start();
                try {
                    delayPlaying(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dhNote.seekTo(0);
                dhNote.start();
                try {
                    delayPlaying(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ehNote.seekTo(0);
                ehNote.start();
            case R.id.song:
                Toast.makeText(this, "Tinkle Tinkle In My Car", Toast.LENGTH_SHORT).show();
               littleStar();
                break;


            case R.id.funk:
                Toast.makeText(this, "HOO-RAH!", Toast.LENGTH_SHORT).show();
                cNote.seekTo(0);
                cNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dsNote.seekTo(0);
                dsNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cNote.seekTo(0);
                cNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fNote.seekTo(0);
                fNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fNote.seekTo(0);
                fNote.start();
                try {
                    delayPlaying(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cNote.seekTo(0);
                cNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                asNote.seekTo(0);
                asNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cNote.seekTo(0);
                cNote.start();
                try {
                    delayPlaying(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }cNote.seekTo(0);
                cNote.start();
                try {
                    delayPlaying(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gNote.seekTo(0);
                gNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cNote.seekTo(0);
                cNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gsNote.seekTo(0);
                gsNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gNote.seekTo(0);
                gNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dsNote.seekTo(0);
                dsNote.start();
                try {
                    delayPlaying(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cNote.seekTo(0);
                cNote.start();
                try {
                    delayPlaying(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gNote.seekTo(0);
                gNote.start();
                try {
                    delayPlaying(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ch(200);
                c(200);
                c(200);
                c(200);
                c(200);
                as(200);
                ds(200);
                c(600);
                as(200);
                b(200);
                c(0);
                ds(0);
                g(0);
                ch(0);

                c(0);
                ds(0);
                g(0);
                ch(0);








        }
    }
}
