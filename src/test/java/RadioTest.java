import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void testSetNextChannelMiddle(){
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setChannel(5); // устанавливаем текущий канал в серединку
        myRadio.setNextChannel(); // нажали на кнопочку следующий канал
        int actual = myRadio.getCurrentChannel(); // получили текущей номер канала после нажатия на нопку
        int expected = 6; // в теории должны получить 5+1 = 6
        assertEquals(expected, actual);
    }

    @Test
    void testSetNextChannelMax(){
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setChannel(9); // устанавливаем текущий канал в максимальное значение
        myRadio.setNextChannel(); // нажали на кнопочку следующий канал
        int actual = myRadio.getCurrentChannel(); // получили текущей номер канала после нажатия на нопку
        int expected = 0; // в теории должны получить переброс канала в начало т.е. на ноль
        assertEquals(expected, actual);
    }

    @Test
    void testSetPreviosChannelMiddle(){
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setChannel(5); // устанавливаем текущий канал в серединку
        myRadio.setPreviosChannel(); // нажали на кнопочку предыдущий канал
        int actual = myRadio.getCurrentChannel(); // получили текущей номер канала после нажатия на нопку
        int expected = 4; // в теории должны получить 5-1 = 4
        assertEquals(expected, actual);
    }

    @Test
    void testSetPreviosChannelMin(){
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setChannel(0); // устанавливаем текущий канал в минимальное значение
        myRadio.setPreviosChannel(); // нажали на кнопочку предыдущий канал
        int actual = myRadio.getCurrentChannel(); // получили текущей номер канала после нажатия на нопку
        int expected = 9; // в теории должны получить переброс канала в конец т.е. на девять
        assertEquals(expected, actual);
    }

    @Test
    void testSetChannelCorrect(){
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setChannel(6); // устанавливаем текущий канал в нормальное значение
        int actual = myRadio.getCurrentChannel(); // получили текущей номер канала
        int expected = 6; // в теории должны получить то же самое
        assertEquals(expected, actual);
    }

    @Test
    void testSetChannelMoreThanMax(){
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setChannel(6); // устанавливаем текущий канал в нормальное значение
        myRadio.setChannel(55); // пробуем устанавить текущий канал в ненормальное значение
        int actual = myRadio.getCurrentChannel(); // получили текущей номер канала
        int expected = 6; // в теории должны получить то же самое
        assertEquals(expected, actual);
    }

    @Test
    void testSetChannelLessThanMin(){
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setChannel(6); // устанавливаем текущий канал в нормальное значение
        myRadio.setChannel(-55); // пробуем устанавить текущий канал в ненормальное значение
        int actual = myRadio.getCurrentChannel(); // получили текущей номер канала
        int expected = 6; // в теории должны получить то же самое
        assertEquals(expected, actual);
    }

    @Test
    void testSetMoreSound(){
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setSoundLevel(5); // устанавливаем громкость в середину
        myRadio.setMoreLoud(); // повышаем тукущую громкость на единицу
        int actual = myRadio.getCurrentLoud(); // получили текущей номер громкости
        int expected = 6; // в теории должны получить 5+1 = 6
        assertEquals(expected, actual);
    }

    @Test
    void testSetLessSound(){
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setSoundLevel(5); // устанавливаем громкость в середину
        myRadio.setLessLoud(); // понижаем тукущую громкость на единицу
        int actual = myRadio.getCurrentLoud(); // получили текущей номер громкости
        int expected = 4; // в теории должны получить 5-1 = 4
        assertEquals(expected, actual);
    }

    @Test
    void testSetLessThanMinSound(){
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setSoundLevel(0); // устанавливаем громкость в минимум
        myRadio.setLessLoud(); // понижаем тукущую громкость на единицу
        int actual = myRadio.getCurrentLoud(); // получили текущей номер громкости
        int expected = 0; // в теории должны получить опять ноль
        assertEquals(expected, actual);
    }

    @Test
    void testSetMoreThanMaxSound(){
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setSoundLevel(10); // устанавливаем громкость в максимум
        myRadio.setMoreLoud(); // повышаем тукущую громкость на единицу
        int actual = myRadio.getCurrentLoud(); // получили текущей номер громкости
        int expected = 10; // в теории должны получить опять десятку
        assertEquals(expected, actual);
    }

    @Test
    void testSetCurrentSound(){ // проверяем второй сеттер. по заданию он не нужен но пришлось его использовать и проверять для 100% проверок
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setSoundLevel(7); // устанавливаем громкость
        int actual = myRadio.getCurrentLoud(); // получили текущей номер громкости
        int expected = 7; // в теории должны получить то же самое что и установили
        assertEquals(expected, actual);
    }

    @Test
    void testSetCurrentSoundMoreThanMax(){ // проверяем второй сеттер. по заданию он не нужен но пришлось его использовать и проверять для 100% проверок
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setSoundLevel(7); // устанавливаем громкость в нормальное значение
        myRadio.setSoundLevel(77); // устанавливаем громкость в ненормальное значение
        int actual = myRadio.getCurrentLoud(); // получили текущей номер громкости
        int expected = 7; // в теории должны получить то же самое что и установили в нормальном значении
        assertEquals(expected, actual);
    }

    @Test
    void testSetCurrentSoundLessThanMin(){ // проверяем второй сеттер. по заданию он не нужен но пришлось его использовать и проверять для 100% проверок
        Radio myRadio = new Radio(); // создаем объект типа радио
        myRadio.setSoundLevel(7); // устанавливаем громкость в нормальное значение
        myRadio.setSoundLevel(-7); // устанавливаем громкость в ненормальное значение
        int actual = myRadio.getCurrentLoud(); // получили текущей номер громкости
        int expected = 7; // в теории должны получить то же самое что и установили в нормальном значении
        assertEquals(expected, actual);
    }
}
