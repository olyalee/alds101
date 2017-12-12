package part16;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task168Test {

    @Test
    public void testMinus() throws Exception {

    }

    @Test
    public void testGetAsTextMillions() throws Exception {
        String number = Task168.getAsText(1234567).toString();

        assertEquals("один миллион двести тридцать четыре тысячи пятьсот шестьдесят семь", number.trim());
    }

    @Test
    public void testGetAsTextTenHundreds() throws Exception {
        String number = Task168.getAsText(33345).toString();

        assertEquals("тридцать три тысячи триста сорок пять", number.trim());
    }

    @Test
    public void testGetAsTextHundreds() throws Exception {
        String number = Task168.getAsText(233).toString();

        assertEquals("двести тридцать три", number.trim());
    }

    @Test
    public void testGetAsTextTeens() throws Exception {
        String number = Task168.getAsText(19).toString();

        assertEquals("девятнадцать", number.trim());
    }

    @Test
    public void testGetAsTextTeens12() throws Exception {
        String number = Task168.getAsText(12).toString();

        assertEquals("двенадцать", number.trim());
    }

    @Test
    public void testGetAsTextUnit() throws Exception {
        String number = Task168.getAsText(9).toString();

        assertEquals("девять", number.trim());
    }

    @Test
    public void getAsTextHundreds() throws Exception {
        String number = Task168.getAsText(172).toString();

        assertEquals("сто семьдесят два", number);
    }

    @Test
    public void testChooseHundreds() throws Exception {
        String sevenHundred = Task168.chooseHundreds("7").toString();

        assertEquals("семьсот", sevenHundred);
    }

    @Test
    public void testChooseTens() throws Exception {
        String forty = Task168.chooseTens("4").toString();

        assertEquals("сорок", forty);
    }

    @Test
    public void testChooseTeens() throws Exception {
        String eighteen = Task168.chooseTens("1", "8").toString();

        assertEquals("восемнадцать", eighteen);
    }

    @Test
    public void testCooseUnits() throws Exception {
        String five = Task168.chooseUnits("5").toString();

        assertEquals("пять", five);
    }
}