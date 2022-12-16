package jalau.at18.katas.bankocr.joser;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
    @Test
    public void testInit() {
        Converter conv;
        Format form;
        Main main;
        String[] zeros = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       "| || || || || || || || || |",
                                       "|_||_||_||_||_||_||_||_||_|" };
        conv = new Converter(zeros);
        assertEquals("000000000", conv.getNumberScaned());

        String[] ones = new String[] {"                           ",
                                      "  |  |  |  |  |  |  |  |  |",
                                      "  |  |  |  |  |  |  |  |  |" };
        conv = new Converter(ones);
        assertEquals("111111111", conv.getNumberScaned());

        String[] two = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                     " _| _| _| _| _| _| _| _| _|",
                                     "|_ |_ |_ |_ |_ |_ |_ |_ |_ " };
        conv = new Converter(two);
        assertEquals("222222222", conv.getNumberScaned());

        String[] three = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       " _| _| _| _| _| _| _| _| _|",
                                       " _| _| _| _| _| _| _| _| _|" };
        conv = new Converter(three);
        assertEquals("333333333", conv.getNumberScaned());

        String[] four = new String[] {"                           ",
                                      "|_||_||_||_||_||_||_||_||_|",
                                      "  |  |  |  |  |  |  |  |  |" };
        conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());

        String[] five = new String[]{" _  _  _  _  _  _  _  _  _ ",
                                     "|_ |_ |_ |_ |_ |_ |_ |_ |_ ",
                                     " _| _| _| _| _| _| _| _| _|" };
        conv = new Converter(five);
        assertEquals("555555555", conv.getNumberScaned());
        String[] six = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                     "|_ |_ |_ |_ |_ |_ |_ |_ |_ ",
                                     "|_||_||_||_||_||_||_||_||_|" };
        conv = new Converter(six);
        assertEquals("666666666", conv.getNumberScaned());
        String[] seven = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       "  |  |  |  |  |  |  |  |  |",
                                       "  |  |  |  |  |  |  |  |  |" };
        conv = new Converter(seven);
        assertEquals("777777777", conv.getNumberScaned());
        String[] eight = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       "|_||_||_||_||_||_||_||_||_|",
                                       "|_||_||_||_||_||_||_||_||_|" };
        conv = new Converter(eight);
        assertEquals("888888888", conv.getNumberScaned());
        String[] nine = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                      "|_||_||_||_||_||_||_||_||_|",
                                      " _| _| _| _| _| _| _| _| _|" };
        conv = new Converter(nine);
        assertEquals("999999999", conv.getNumberScaned());
        String[] scale = new String[] {"    _  _     _  _  _  _  _ ",
                                       "  | _| _||_||_ |_   ||_||_|",
                                       "  ||_  _|  | _||_|  ||_| _|" };
        conv = new Converter(scale);
        assertEquals("123456789", conv.getNumberScaned());
        String[] test1 = new String[] {" _  _  _  _  _  _  _  _    ",
                                       "| || || || || || || ||_   |",
                                       "|_||_||_||_||_||_||_| _|  |" };
        conv = new Converter(test1);
        assertEquals("000000051", conv.getNumberScaned());
        String[] test2 = new String[] {"    _  _  _  _  _  _     _ ",
                                       "|_||_|| || ||_   |  |  | _ ",
                                       "  | _||_||_||_|  |  |  | _|" };
        conv = new Converter(test2);
        form = new Format(conv.getNumberScaned());
        assertEquals("49006771? ILL", form.formated());


        String[] test3 = new String[] {"    _  _     _  _  _  _  _ ",
                                       "  | _| _||_| _ |_   ||_||_|",
                                       "  ||_  _|  | _||_|  ||_| _ " };
        conv = new Converter(test3);
        String value = conv.getNumberScaned();
        form = new Format(value);

        assertEquals("1234?678? ILL", form.formated());
        String[] test4 = new String[] {"                           ",
                                       "  |  |  |  |  |  |  |  |  |",
                                       "  |  |  |  |  |  |  |  |  |" };
        main = new Main();
        assertEquals("711111111", Main.init(test4));
        String[] test5 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       "  |  |  |  |  |  |  |  |  |",
                                       "  |  |  |  |  |  |  |  |  |" };
        assertEquals("777777177", Main.init(test5));
        String[] test6 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       " _|| || || || || || || || |",
                                       "|_ |_||_||_||_||_||_||_||_|" };
        assertEquals("200800000", Main.init(test6));
        String[] test7 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       " _| _| _| _| _| _| _| _| _|",
                                       " _| _| _| _| _| _| _| _| _|" };
//  conv = new Converter(four);
        assertEquals("333393333", Main.init(test7));
        String[] test8 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       "|_||_||_||_||_||_||_||_||_|",
                                       "|_||_||_||_||_||_||_||_||_|" };
//  conv = new Converter(four);
        assertEquals("888888888 AMB ['888886888', '888888988', '888888880']", Main.init(test8));
        String[] test9 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       "|_ |_ |_ |_ |_ |_ |_ |_ |_ ",
                                       " _| _| _| _| _| _| _| _| _|" };
//  conv = new Converter(four);
        assertEquals("555555555 AMB ['559555555', '555655555']", Main.init(test9));
        String[] test10 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                        "|_ |_ |_ |_ |_ |_ |_ |_ |_ ",
                                        "|_||_||_||_||_||_||_||_||_|" };
//  conv = new Converter(four);
        assertEquals("666666666 AMB ['686666666', '666566666']", Main.init(test10));
        String[] test11 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                        "|_||_||_||_||_||_||_||_||_|",
                                        " _| _| _| _| _| _| _| _| _|" };
//  conv = new Converter(four);
        assertEquals("999999999 AMB ['899999999', '993999999', '999959999']", Main.init(test11));
        String[] test12 = new String[] {"    _  _  _  _  _  _     _ ",
                                        "|_||_|| || ||_   |  |  ||_ ",
                                        "  | _||_||_||_|  |  |  | _|" };
//  conv = new Converter(four);
        assertEquals("490067715 AMB ['490867715', '490067115', '490067719']", Main.init(test12));
        String[] test13 = new String[] {"    _  _     _  _  _  _  _ ",
                                        " _| _| _||_||_ |_   ||_||_|",
                                        "  ||_  _|  | _||_|  ||_| _|" };
//  conv = new Converter(four);
        assertEquals("123456789", Main.init(test13));
        String[] test14 = new String[] {" _     _  _  _  _  _  _    ",
                                        "| || || || || || || ||_   |",
                                        "|_||_||_||_||_||_||_| _|  |" };
//  conv = new Converter(four);
        assertEquals("000000051", Main.init(test14));
        String[] test15 = new String[] {"    _  _  _  _  _  _     _ ",
                                        "|_||_|| ||_||_   |  |  | _ ",
                                        "  | _||_||_||_|  |  |  | _|" };
        assertEquals("490867715", Main.init(test15));

    }
}
