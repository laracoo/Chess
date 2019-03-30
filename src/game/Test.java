package game;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String s = "Программная платформа Java — ряд программных продуктов и спецификаций компании Sun Microsystems, ранее независимой компании, а ныне дочерней компании корпорации Oracle, которые совместно предоставляют систему для разработки прикладного программного обеспечения и встраивания её в любое кросс-платформенное программное обеспечение. Java используется в самых разных компьютерных платформах от встраиваемых устройств и мобильных телефонов в нижнем ценовом сегменте, до корпоративных серверов и суперкомпьютеров в высшем ценовом сегменте. Хотя Java-апплеты редко используются в настольных компьютерах, однако они в них иногда используются для улучшения функциональности и повышения безопасности при просмотре всемирной паутины.\n";


        StringBuilder newString = new StringBuilder(); //final text

        int countTm = 0;

        Pattern pattern = Pattern.compile("[^a-zA-Zа-яА-ЯёЁ]([a-zA-Zа-яА-ЯёЁ]{4})[^a-zA-Zа-яА-ЯёЁ]+");

        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {


            MatchResult matchResult = matcher.toMatchResult();

            int start = matchResult.start(1);
            int end = matcher.end(1);


            String substring = s.substring(newString.length() - countTm, start); // строка от последней найденой группы до новой

            newString.append(substring);

            String word = s.substring(start, end);

            newString.append(word).append("™");
            countTm++;

        }
        newString.append(s.substring(newString.length()-countTm));

        System.out.println(s);
        System.out.println(newString.toString());

    }
}
