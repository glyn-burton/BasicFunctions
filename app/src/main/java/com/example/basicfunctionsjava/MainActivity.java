package com.example.basicfunctionsjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.nio.file.FileStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> fillit = new ArrayList<>();
        fillit.add("cake");
        fillit.add("cookies");
        fillit.add("cake");
        fillit.add("doughnut");
        fillit.add("waffle");
        fillit.add("cookies");
        String Pword = "eve";
        Integer BuzzNum = 15;
        String Ana1 = "taco";
        String Ana2 = "coat";

        FindDuplicates dupies = new FindDuplicates();
        dupies.DuplicateFinder(fillit);
        if (PalindromeFinder.PalindromeChecker(Pword)){
            Log.d("TAG","This is a Palindrome");
        }
        else{
            Log.d("TAG","This is not a Palindrome");

        }
        if (Anagrams.AnaChecker(Ana1,Ana2)){
            Log.d("TAG","This is a Anagram");
        }
        else{
            Log.d("TAG","This is not a Anagram");

        }

        FizzBuzzy fb = new FizzBuzzy();
        fb.FizzyChecker();

        MultipleNumbers multi = new MultipleNumbers();
        multi.printTables();



    }
}

class FindDuplicates {

    void DuplicateFinder(List<String> dupes)
    {

        for(int i = 0; i < dupes.size(); i++)
        {
            for(int j = (i+1); j < dupes.size(); j++)
            {
                if (dupes.get(i) == dupes.get(j))
                {
                    Log.v("DUPES",dupes.get(i));
                }
            }


        }
    }


    }


class PalindromeFinder {

    static boolean PalindromeChecker(String word) {

        int i = 0, j = word.length() - 1;


        while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}

class FizzBuzzy {

        static String FizzyChecker() {

            for (int i = 0; i <= 100; i++) {

                if (i % 15 == 0) {
                    Log.v("F","Fizzbuzz");
                }

                if (i % 3 == 0) {

                    Log.v("F","Fizz");

                }
                if (i % 5 == 0) {
                    Log.v("F","Buzz");

                }


            }
            return "Done";

        }
}

class Anagrams {

    static boolean AnaChecker(String str1, String str2) {
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        System.out.println(char1);
        System.out.println(char2);

        return Arrays.equals(char1, char2);

    }
}

class MultipleNumbers{

        public void printTables(){
            int [] [] Multables = new int [10] [10];

            for (int i = 0; i < 10; i++){

                for (int j = 0; j < 10; j++){

                    Multables[i][j] = (i+1) * (j+1);
                }
            }
            System.out.println("Multiple Chart");
            for(int a = 0; a < 10; a++){

                for (int b = 0; b <10; b++)
                {

                    System.out.print(Multables[a][b] + "\t");
                }
                System.out.print("\n");
            }

        }



}