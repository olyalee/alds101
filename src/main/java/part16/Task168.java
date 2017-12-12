package part16;

import java.util.ArrayList;
import java.util.List;

/**
 * [WIP] didn't implement decline of thousands and millions yet
 */
public class Task168 {

    public static StringBuilder getAsText(int number) {
        StringBuilder result = new StringBuilder();
        StringBuilder num = new StringBuilder(String.valueOf(number));
        if (num.charAt(0) == '-') {
            minus = true;
            num.deleteCharAt(0);
        }

        List<StringBuilder> splitted = split(num);

        setBooleans(splitted);

        for (int i = 0; i < splitted.size(); i++) {
            result = result.append(getUnits(splitted.get(i)));

            if (withMillions) {
                if (i == 0) {
                    result.append(million);
                } else if (i == 1) {
                    result.append(thousand2);
                }
            } else if (withThousands & i == 0) {
                result.append(thousand2);
            }
        }

        if (minus) {
            result.insert(0, "минус ");
        }

        withThousands = false;
        withMillions = false;

        return result;
    }

    private static void setBooleans(List<StringBuilder> splitted) {
        if (splitted.size() > 1) {
            withThousands = true;
        }
        if (splitted.size() > 2) {
            withMillions = true;
        }
    }

    private static List<StringBuilder> split(StringBuilder num) {
        List<StringBuilder> numbersByThree = new ArrayList<>();
        StringBuilder three;
        int len = num.length();
        int pos = 0;

        if (len <= 3) {
            numbersByThree.add(num);
        } else {
            if (len % 3 == 1) {
                numbersByThree.add(new StringBuilder(num.substring(pos, 1)));
                pos = 1;
            } else if (len % 3 == 2) {
                numbersByThree.add(new StringBuilder(num.substring(pos, 2)));
                pos = 2;
            }
            for (; pos < len; pos += 3) {
                three = new StringBuilder(num.substring(pos, pos + 3));
                numbersByThree.add(three);
            }
        }

        return numbersByThree;
    }

    private static StringBuilder getUnits(StringBuilder num) {
        StringBuilder result = new StringBuilder();

        int len = num.length();
        num.reverse();

        String one = (len > 2) ? num.substring(2, 3) : "";
        String two = (len > 1) ? num.substring(1, 2) : "";
        String three = (len > 0) ? num.substring(0, 1) : "";

        if (!one.equals("") && !one.equals("0")) {
            result.append(chooseHundreds(one)).append(" ");
        }

        if (two.equals("1")) {
            result.append(chooseTens(two, three)).append(" ");
        } else if (!two.equals("") && !two.equals("0")) {
            result.append(chooseTens(two)).append(" ");
        }

        if (!two.equals("1")) {
            result.append(chooseUnits(three));
        }

        return result;
    }

    static StringBuilder chooseUnits(String unit) {
        switch (unit) {
            case "1":
                return new StringBuilder(unit1);
            case "2":
                return new StringBuilder(unit2);
            case "3":
                return new StringBuilder(unit3);
            case "4":
                return new StringBuilder(unit4);
            case "5":
                return new StringBuilder(unit5);
            case "6":
                return new StringBuilder(unit6);
            case "7":
                return new StringBuilder(unit7);
            case "8":
                return new StringBuilder(unit8);
            case "9":
                return new StringBuilder(unit9);
            default:
                return new StringBuilder("");
        }
    }

    static StringBuilder chooseTens(String tens, String units) {
        StringBuilder result;
        switch (units) {
            case "1":
                result = new StringBuilder(unit1);
                break;
            case "2":
                result = new StringBuilder(tenUnit2);
                break;
            case "3":
                result = new StringBuilder(unit3);
                break;
            case "4":
                result = new StringBuilder(unit4).deleteCharAt(unit5.length() - 1);
                break;
            case "5":
                result = new StringBuilder(unit5).deleteCharAt(unit5.length() - 1);
                break;
            case "6":
                result = new StringBuilder(unit6).deleteCharAt(unit6.length() - 1);
                break;
            case "7":
                result = new StringBuilder(unit7).deleteCharAt(unit7.length() - 1);
                break;
            case "8":
                result = new StringBuilder(unit8).deleteCharAt(unit8.length() - 1);
                break;
            case "9":
                result = new StringBuilder(unit9).deleteCharAt(unit9.length() - 1);
                break;
            default:
                result = new StringBuilder("");
                break;
        }

        return result.append(teenSuffix);
    }

    static StringBuilder chooseTens(String tens) {
        StringBuilder result;
        switch (tens) {
            case "0":
                result = new StringBuilder(unit10);
                break;

            case "2":
                result = new StringBuilder(unit2).append(tySuffix);
                break;
            case "3":
                result = new StringBuilder(unit3).append(tySuffix);
                break;
            case "4":
                result = new StringBuilder(tensUnit4);
                break;
            case "5":
                result = new StringBuilder(unit5).append(tySuffix2);
                break;
            case "6":
                result = new StringBuilder(unit6).append(tySuffix2);
                break;
            case "7":
                result = new StringBuilder(unit7).append(tySuffix2);
                break;
            case "8":
                result = new StringBuilder(unit8).append(tySuffix2);
                break;
            case "9":
                result = new StringBuilder(tensUnit9);
                break;
            default:
                result = new StringBuilder("");
                break;
        }
        return result;
    }

    static StringBuilder chooseHundreds(String hundreds) {
        StringBuilder result;
        switch (hundreds) {
            case "1":
                result = new StringBuilder(hundredUnit1);
                break;
            case "2":
                result = new StringBuilder(tenUnit2).append(hunSuffix2);
                break;
            case "3":
                result = new StringBuilder(unit3).append(hunSuffix);
                break;
            case "4":
                result = new StringBuilder(unit4).append(hunSuffix);
                break;
            case "5":
                result = new StringBuilder(unit5).append(hunSuffix3);
                break;
            case "6":
                result = new StringBuilder(unit6).append(hunSuffix3);
                break;
            case "7":
                result = new StringBuilder(unit7).append(hunSuffix3);
                break;
            case "8":
                result = new StringBuilder(unit8).append(hunSuffix3);
                break;
            case "9":
                result = new StringBuilder(unit9).append(hunSuffix3);
                break;
            default:
                result = new StringBuilder("");
                break;
        }
        return result;
    }

    private static String unit1 = "один";
    private static String unit2 = "два";
    private static String unit3 = "три";
    private static String unit4 = "четыре";
    private static String unit5 = "пять";
    private static String unit6 = "шесть";
    private static String unit7 = "семь";
    private static String unit8 = "восемь";
    private static String unit9 = "девять";

    private static String unit10 = "десять";

    private static String tenUnit2 = "две";
    private static String teenSuffix = "надцать";

    private static String tySuffix = "дцать";
    private static String tySuffix2 = "десят";

    private static String tensUnit4 = "сорок";
    private static String tensUnit9 = "девяносто";

    private static String hundredUnit1 = "сто";

    private static String hunSuffix = "ста";
    private static String hunSuffix2 = "сти";
    private static String hunSuffix3 = "сот";

    private static String thousand = " тысяча ";
    private static String thousand2 = " тысячи ";
    private static String thousand3 = " тысяч ";

    private static String million = " миллион ";
    private static String million2 = " миллиона ";
    private static String million3 = " миллионов ";

    private static boolean minus = false;
    private static boolean withThousands = false;
    private static boolean withMillions = false;
}
