package com.example.homework3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
public class Fragment2 extends Fragment {
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //---Inflate the layout for this fragment---
        return inflater.inflate(R.layout.fragment2, container, false);
    }
    public void onStart()
    {
        super.onStart();
       final TextView textView = getActivity().findViewById(R.id.textView);
        Button button1 = getActivity().findViewById(R.id.for1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText()+"1");
            }
        });
        Button button2 = getActivity().findViewById(R.id.for2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"2");
            }
        });
        Button button3 = getActivity().findViewById(R.id.for3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"3");
            }
        });
        Button button4 = getActivity().findViewById(R.id.for4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"4");
            }
        });
        Button button5 = getActivity().findViewById(R.id.for5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"5");
            }
        });
        Button button6 = getActivity().findViewById(R.id.for6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"6");
            }
        });
        Button button7 = getActivity().findViewById(R.id.for7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"7");
            }
        });
        Button button8 = getActivity().findViewById(R.id.for8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"8");
            }
        });
        Button button9 = getActivity().findViewById(R.id.for9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"9");
            }
        });
        Button button0 = getActivity().findViewById(R.id.for0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"0");
            }
        });
        Button buttonQ = getActivity().findViewById(R.id.forQ);
        buttonQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"Q");
            }
        });
        Button buttonW = getActivity().findViewById(R.id.forW);
        buttonW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"W");
            }
        });
        Button buttonE = getActivity().findViewById(R.id.forE);
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"E");
            }
        });
        Button buttonR = getActivity().findViewById(R.id.forR);
        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"R");
            }
        });
        Button buttonT = getActivity().findViewById(R.id.forT);
        buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"T");
            }
        });
        Button buttonY = getActivity().findViewById(R.id.forY);
        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"Y");
            }
        });
        Button buttonU = getActivity().findViewById(R.id.forU);
        buttonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"U");
            }
        });
        Button buttonI = getActivity().findViewById(R.id.forI);
        buttonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"I");
            }
        });
        Button buttonO = getActivity().findViewById(R.id.forO);
        buttonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"O");
            }
        });
        Button buttonP = getActivity().findViewById(R.id.forP);
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"P");
            }
        });
        Button buttonA = getActivity().findViewById(R.id.forA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"A");
            }
        });
        Button buttonS = getActivity().findViewById(R.id.forS);
        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"S");
            }
        });
        Button buttonD = getActivity().findViewById(R.id.forD);
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"D");
            }
        });
        Button buttonF = getActivity().findViewById(R.id.forF);
        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"F");
            }
        });
        Button buttonG = getActivity().findViewById(R.id.forG);
        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"G");
            }
        });
        Button buttonH = getActivity().findViewById(R.id.forH);
        buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"H");
            }
        });
        Button buttonJ = getActivity().findViewById(R.id.forJ);
        buttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"J");
            }
        });
        Button buttonK = getActivity().findViewById(R.id.forK);
        buttonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"K");
            }
        });
        Button buttonL = getActivity().findViewById(R.id.forL);
        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"L");
            }
        });
        Button buttonZ = getActivity().findViewById(R.id.forZ);
        buttonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"Z");
            }
        });
        Button buttonX = getActivity().findViewById(R.id.forX);
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"X");
            }
        });
        Button buttonC = getActivity().findViewById(R.id.forC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"C");
            }
        });
        Button buttonV = getActivity().findViewById(R.id.forV);
        buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"V");
            }
        });
        Button buttonB = getActivity().findViewById(R.id.forB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"B");
            }
        });
        Button buttonN = getActivity().findViewById(R.id.forN);
        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"N");
            }
        });
        Button buttonM = getActivity().findViewById(R.id.forM);
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"M");
            }
        });
        Button buttonSpace = getActivity().findViewById(R.id.forSpace);
        buttonSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+" ");
            }
        });
        Button buttonBackSpace=getActivity().findViewById(R.id.forBackSpace);
        buttonBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView.getText().toString();
                if(str.length()>=1){
                    str=str.substring(0,str.length()-1);
                    textView.setText(str);
                }
            }
        });
        buttonBackSpace.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                textView.setText("");
                return true;
            }
        });
        Button buttoncomma = getActivity().findViewById(R.id.forComma);
        buttoncomma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+",");
            }
        });
        Button buttonStop = getActivity().findViewById(R.id.forStop);
        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+".");
            }
        });
    }
}
