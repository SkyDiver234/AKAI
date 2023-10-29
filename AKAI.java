package Sekcja8.polyChallange2;

import java.util.Arrays;

public class AKAI {

    private static String[] sentences = {
            "Taki mamy klimat",
            "Wszędzie dobrze ale w domu najlepiej",
            "Wyskoczył jak Filip z konopii",
            "Gdzie kucharek sześć tam nie ma co jeść",
            "Nie ma to jak w domu",
            "Konduktorze łaskawy zabierz nas do Warszawy",
            "Jeżeli nie zjesz obiadu to nie dostaniesz deseru",
            "Bez pracy nie ma kołaczy",
            "Kto sieje wiatr ten zbiera burzę",
            "Być szybkim jak wiatr",
            "Kopać pod kimś dołki",
            "Gdzie raki zimują",
            "Gdzie pieprz rośnie",
            "Swoją drogą to gdzie rośnie pieprz?",
            "Mam nadzieję, że poradzisz sobie z tym zadaniem bez problemu",
            "Nie powinno sprawić żadnego problemu, bo Google jest dozwolony"
    };

    public static void main(String[] args) {
        /* TODO Twoim zadaniem jest wypisanie na konsoli trzech najczęściej występujących słów
                w tablicy 'sentences' wraz z ilością ich wystąpień..

                Przykładowy wynik:
                1. "mam" - 12
                2. "tak" - 5
                3. "z" - 2
        */
        String sentences2 = "";
        String a;

        for (String s : sentences) {
            a = s.toLowerCase();
            sentences2 += a + " ";
        }

        String[] splited = sentences2.split(" ");
        Arrays.sort(splited);
        System.out.println(Arrays.toString(splited));
        int max = 0;
        int max1 = 0;
        int max2 = 0;
        int count= 1;
        String word = splited[0];
        String word1;
        String word2 = splited[0];
        String word3 = splited[0];

        String curr = splited[0];
        for(int i = 1; i<splited.length; i++){
            if(splited[i].equals(curr)){
                count++;
            }
            else{
                count =1;
                curr = splited[i];
            }
            if(max<count){
                max = count;
                word = splited[i];
            }
            if (max1<max){
                max1 = count;
                word2=splited[i];

            }
            if (max2<max1){
                max2 = count;
                word3 = splited[i];
            }
        }
        System.out.println(word + " - " + max);
        System.out.println(word2 + " - " + max1);
        System.out.println(word3 + " - " + max2);




        /*int count = 0;
        String word = "";
        for (int i=0;i<sentences.length;i++){
            int x = 0;
            for (int j =i+1;j<sentences.length;j++){
                if (sentences[j].equals(sentences[i])){
                    x++;
                }
            }
            if (x>=count){
                word = sentences[i];
                count = x;
            }
        }
        System.out.println(word + " - "  + count);

         */
        /*String phrase = "gdzie";
        String sentences2 = "";
        String a;
        String word = "";
        int count = 0;
        int c=0;

        /*for (String s : sentences) {
            a = s.toLowerCase();
            sentences2 += a + " ";
        }*/
       // System.out.println(sentences2);

           // for (String s: sentences){

            //    System.out.println(s);
           // }
            /*int phraseLength = phrase.length();
            int index = sentences2.indexOf(phrase);
            count = 0;
            while (index >= 0) {
                count++;
                index = sentences2.indexOf(phrase, index + phraseLength);
            }*/

        /*sentences2 = sentences2.replace(phrase, "");
        sentences2 = sentences2.substring(1);
        System.out.println(sentences2);*/



        //System.out.println(phrase + " - " +count);
    }
}
