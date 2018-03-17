package com.cuzzo.latricecalco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //
    private TextView textViewTitolo;
    private TextView textViewCalcolo;

    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    private Button btnCE;
    private Button btnDecimal;

    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnMultiplication;
    private Button btnDivision;
    private Button btnUgual;

    private String s="";
    private String n="";

    private int numeroCifre=0;
    private boolean isDecimal=false;
    private boolean inseritoNumero=false;
    private int nOperation=1;
    private boolean finish=false;

    ArrayList<Float> numeri = new ArrayList<Float>();
    ArrayList<String> operation =  new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null) {
            ArrayList<String> numeriString = savedInstanceState.getStringArrayList("Numeri");
            operation = savedInstanceState.getStringArrayList("Operazioni");
            for(int i=0;i<numeriString.size();i++)
                numeri.add(Float.parseFloat(numeriString.get(i)));
            s=savedInstanceState.getString("Calcolo");
            numeroCifre=savedInstanceState.getInt("numeroCifre");
            isDecimal=savedInstanceState.getBoolean("isDecimal");
            inseritoNumero=savedInstanceState.getBoolean("inseritoNumero");
            nOperation=savedInstanceState.getInt("nOperation");
            finish=savedInstanceState.getBoolean("Finish");
            n=savedInstanceState.getString("n");
        }

        textViewTitolo = findViewById(R.id.textViewTitolo);
        textViewCalcolo = findViewById(R.id.textViewCalcolo);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnCE = findViewById(R.id.btnCE);
        btnDecimal = findViewById(R.id.btnDecimal);

        btnAddition = findViewById(R.id.btnAddition);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnDivision = findViewById(R.id.btnDivision);
        btnUgual = findViewById(R.id.btnUgual);

        textViewTitolo.setOnClickListener(this);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnCE.setOnClickListener(this);
        btnDecimal.setOnClickListener(this);

        btnAddition.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnUgual.setOnClickListener(this);

        textViewCalcolo.setText(s);
    }

    @Override
    protected void onResume() {
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        super.onResume();
    }

    @Override
    public void onClick(View view) {
        if(finish) {
            textViewCalcolo.setText("");
            finish=false;
        }
        switch (view.getId()) {
            case R.id.textViewTitolo:
                Intent i = new Intent(MainActivity.this, ThanksActivity.class);
                startActivity(i);
                break;

            case R.id.btn0:
                if(numeroCifre<=10 && !n.equals("0")) {
                    n = n + "0";
                    s = textViewCalcolo.getText()+"0";
                    textViewCalcolo.setText(s);
                    numeroCifre++;
                    inseritoNumero=true;
                }
                break;

            case R.id.btn1:
                if(numeroCifre<=10) {
                    n = n + "1";
                    s = textViewCalcolo.getText() + "1";
                    textViewCalcolo.setText(s);
                    numeroCifre++;
                    inseritoNumero=true;
                }
                break;

            case R.id.btn2:
                if(numeroCifre<=10) {
                    n = n + "2";
                    s = textViewCalcolo.getText()+"2";
                    textViewCalcolo.setText(s);
                    numeroCifre++;
                    inseritoNumero=true;
                }
                break;

            case R.id.btn3:
                if(numeroCifre<=10) {
                    n = n + "3";
                    s = textViewCalcolo.getText() + "3";
                    textViewCalcolo.setText(s);
                    numeroCifre++;
                    inseritoNumero=true;
                }
                break;

            case R.id.btn4:
                if(numeroCifre<=10) {
                    n = n + "4";
                    s = textViewCalcolo.getText() + "4";
                    textViewCalcolo.setText(s);
                    numeroCifre++;
                    inseritoNumero=true;
                }
                break;

            case R.id.btn5:
                if(numeroCifre<=10) {
                    n = n + "5";
                    s = textViewCalcolo.getText() + "5";
                    textViewCalcolo.setText(s);
                    numeroCifre++;
                    inseritoNumero=true;
                }
                break;

            case R.id.btn6:
                if(numeroCifre<=10) {
                    n = n + "6";
                    s = textViewCalcolo.getText() + "6";
                    textViewCalcolo.setText(s);
                    numeroCifre++;
                    inseritoNumero=true;
                }
                break;

            case R.id.btn7:
                if(numeroCifre<=10) {
                    n = n + "7";
                    s = textViewCalcolo.getText() + "7";
                    textViewCalcolo.setText(s);
                    numeroCifre++;
                    inseritoNumero=true;
                }
                break;

            case R.id.btn8:
                if(numeroCifre<=10) {
                    n = n + "8";
                    s = textViewCalcolo.getText() + "8";
                    textViewCalcolo.setText(s);
                    numeroCifre++;
                    inseritoNumero=true;
                }
                break;

            case R.id.btn9:
                if(numeroCifre<=10) {
                    n = n + "9";
                    s = textViewCalcolo.getText() + "9";
                    textViewCalcolo.setText(s);
                    numeroCifre++;
                    inseritoNumero=true;
                }
                break;

            case R.id.btnCE:
                n = "";
                textViewCalcolo.setText("");
                numeroCifre=0;
                isDecimal=false;
                inseritoNumero=false;
                nOperation=1;
                numeri = new ArrayList<Float>();
                operation =  new ArrayList<String>();
                break;

            case R.id.btnDecimal:
                if(!isDecimal) {
                    n = n + ".";
                    s = textViewCalcolo.getText() + ",";
                    textViewCalcolo.setText(s);
                    isDecimal=true;
                }
                break;

            case R.id.btnAddition:
                if(inseritoNumero && nOperation<3) {
                    numeri.add(Float.parseFloat(n));
                    operation.add("+");
                    s = textViewCalcolo.getText()+" +\n";
                    numeroCifre=0;
                    inseritoNumero=false;
                    isDecimal=false;
                    nOperation++;
                    n = "";
                    textViewCalcolo.setText(s);
                }
                break;

            case R.id.btnSubtraction:
                if(inseritoNumero && nOperation<3) {
                    numeri.add(Float.parseFloat(n));
                    operation.add("−");
                    s = textViewCalcolo.getText()+" −\n";
                    numeroCifre=0;
                    inseritoNumero=false;
                    isDecimal=false;
                    nOperation++;
                    n = "";
                    textViewCalcolo.setText(s);
                }
                break;

            case R.id.btnMultiplication:
                if(inseritoNumero && nOperation<3) {
                    numeri.add(Float.parseFloat(n));
                    operation.add("X");
                    s = textViewCalcolo.getText()+" X\n";
                    numeroCifre=0;
                    inseritoNumero=false;
                    isDecimal=false;
                    nOperation++;
                    n = "";
                    textViewCalcolo.setText(s);
                }
                break;

            case R.id.btnDivision:
                if(inseritoNumero && nOperation<3) {
                    numeri.add(Float.parseFloat(n));
                    operation.add("÷");
                    s = textViewCalcolo.getText() + " ÷\n";
                    numeroCifre=0;
                    inseritoNumero=false;
                    isDecimal=false;
                    nOperation++;
                    n = "";
                    textViewCalcolo.setText(s);
                }
                break;

            case R.id.btnUgual:
                float ris=0;
                if(inseritoNumero) {
                    numeri.add(Float.parseFloat(n));
                    operation.add("=");
                    Log.i("numeri",numeri.toString());
                    Log.i("operation",operation.toString());
                    if(numeri.size()==1)
                        ris = numeri.get(0);
                    else if(numeri.size()==2) {
                        if(operation.get(0).equals("+")) {
                            ris = numeri.get(0) + numeri.get(1);
                        } else if(operation.get(0).equals("−")) {
                            ris = numeri.get(0) - numeri.get(1);
                        } else if(operation.get(0).equals("X")) {
                            ris = numeri.get(0) * numeri.get(1);
                        } else if(operation.get(0).equals("÷")) {
                            ris = numeri.get(0) / numeri.get(1);
                        }
                    } else if(numeri.size()==3) {
                        if(operation.get(0).equals("X") || operation.get(0).equals("÷")) {
                            if(operation.get(0).equals("X")) {
                                ris = numeri.get(0) * numeri.get(1);
                            } else if(operation.get(0).equals("÷")) {
                                ris = numeri.get(0) / numeri.get(1);
                            }

                            if(operation.get(1).equals("+")) {
                                ris = ris + numeri.get(2);
                            } else if(operation.get(1).equals("−")) {
                                ris = ris - numeri.get(2);
                            } else if(operation.get(1).equals("X")) {
                                ris = ris * numeri.get(2);
                            } else if(operation.get(1).equals("÷")) {
                                ris = ris / numeri.get(2);
                            }
                        } else if(operation.get(1).equals("X") || operation.get(1).equals("÷")) {
                            if(operation.get(1).equals("X")) {
                                ris = numeri.get(1) * numeri.get(2);
                            } else if(operation.get(1).equals("÷")) {
                                ris = numeri.get(1) / numeri.get(2);
                            }

                            if(operation.get(0).equals("+")) {
                                ris =  numeri.get(0) + ris;
                            } else if(operation.get(0).equals("−")) {
                                ris = numeri.get(0) - ris;
                            }
                        } else {
                            if(operation.get(0).equals("+")) {
                                ris = numeri.get(0) + numeri.get(1);
                            } else if(operation.get(0).equals("−")) {
                              ris = numeri.get(0) - numeri.get(1);
                            }
                            if(operation.get(1).equals("+")) {
                                ris =  ris + numeri.get(2);
                            } else if(operation.get(0).equals("−")) {
                                ris = ris - numeri.get(2);
                            }
                        }
                    }
                    s = textViewCalcolo.getText() + " =\n" + ris + "   ";
                    textViewCalcolo.setText(s);
                    finish=true;
                    numeroCifre=0;
                    isDecimal=false;
                    inseritoNumero=false;
                    nOperation=1;
                    n="";
                    numeri=new ArrayList<Float>();
                    operation=new ArrayList<String>();
                }
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        ArrayList<String> numeriString = new ArrayList<String>();
        for(int i=0;i<numeri.size();i++)
            numeriString.add(""+numeri.get(i));
        outState.putStringArrayList("Numeri", numeriString);
        outState.putStringArrayList("Operazioni", operation);
        outState.putString("Calcolo",""+textViewCalcolo.getText());
        outState.putInt("numeroCifre",numeroCifre);
        outState.putBoolean("isDecimal",isDecimal);
        outState.putBoolean("inseritoNumero",inseritoNumero);
        outState.putInt("nOperation",nOperation);
        outState.putBoolean("Finish",finish);
        outState.putString("n",n);
        super.onSaveInstanceState(outState);
    }
}

