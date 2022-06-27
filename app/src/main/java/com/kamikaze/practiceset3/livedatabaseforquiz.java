package com.kamikaze.practiceset3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class livedatabaseforquiz extends ViewModel {
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
MutableLiveData<String> mutableLiveData = new MutableLiveData<>();

}
