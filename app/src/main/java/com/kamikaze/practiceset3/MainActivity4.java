package com.kamikaze.practiceset3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity4 extends AppCompatActivity {
    private final String[]  questions={" Can we reduce the visibility of the overridden method ?","Does Java provides default copy constructor ?","Can constructors be synchronized in Java ?","can we create a null as a key for a map collection ?","Can we override static methods ?","Can we reduce the visibility of the inherited or overridden method ?"," Can we have multiple servlets in a web application and How can we do that ?","Can we overload constructors ?","Will static block for Test Class execute in the following code ? \n" +
            "\n" +
            "class Test\n" +
            "{\n" +
            "  static\n" +
            "  {\n" +
            "     System.out.println(\"Executing Static Block.\");\n" +
            "   }\n" +
            "   public final int param=20;\n" +
            "   \n" +
            "   public int getParam(){\n" +
            "    return param; \n" +
            "   }\n" +
            "}\n" +
            "\n" +
            "public class Demo \n" +
            "{\n" +
            "   public static void main(String[] args) \n" +
            "   {\n" +
            "      System.out.println(new Test().param);\n" +
            "    }\n" +
            "}"," Will this code work fine if BuggyBread2 doesn't implement Serializable ?\n" +
            "\n" +
            "class BuggyBread1 extends BuggyBread2 implements Serializable{\n" +
            " \n" +
            " private int x = 5;\n" +
            " \n" +
            " public static void main(String[] args){\n" +
            "  try {\n" +
            "   BuggyBread1 buggybread1 = new BuggyBread1();\n" +
            "      ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(\"newFile.txt\")));\n" +
            "      objectOutputStream.writeObject(buggybread1);\n" +
            "  } catch (Exception e) {\n" +
            "   // TODO Auto-generated catch block\n" +
            "   e.printStackTrace();\n" +
            "  }\n" +
            "  \n" +
            " }\n" +
            "}\n"};
     private final boolean[] answer={false,false,false,true,false,false,true,true,true,true};
     private int score =0;
     private int index =0;
    TextView question;
     Button button;
     Button butto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
question=findViewById(R.id.textView9);
button=findViewById(R.id.button6);
butto=findViewById(R.id.button7);
question.setText(questions[index]);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        //with this command my answer does not go out of bound
        if (index<=questions.length-1){
            //if my answer is right then this program give me one point
            if(answer[index]){
                score++;

            }
            //then i have to go to next question
            index++;
            if(index<=questions.length-1){
                question.setText(questions[index]);

            }
            //this command is to show score after the condition leaves
            else{
                Toast.makeText(MainActivity4.this, "Your score is "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
            }
        }
        // i want to show toast that make it navigation for quiz again
        else{
            Toast.makeText(MainActivity4.this, "please restart the app", Toast.LENGTH_SHORT).show();

        }

    }
});
 butto.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         if (index <=questions.length-1){
             if (!answer[index]){
                 score++;

             }
             index++;
             if(index<=questions.length-1){
                 question.setText(questions[index]);

             }
             else{
                 Toast.makeText(MainActivity4.this, "your score is "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                 sendscore();
             }
         }else {
             Toast.makeText(MainActivity4.this, "Restart your app", Toast.LENGTH_SHORT).show();
         }
     }
 });
    }

    public void  sendscore(){
FirebaseDatabase database =FirebaseDatabase.getInstance();
        DatabaseReference myref = database.getReference( "quizescore");
        myref.setValue(score);
    }
}