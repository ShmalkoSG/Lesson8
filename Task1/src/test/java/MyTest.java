import org.junit.Before;
import org.junit.Test;
import ru.sbertech.test.Lesson8.MyIterator;
import ru.sbertech.test.Lesson8.Person;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * Created by svetlanashmalko on 07.08.16.
 */
public class MyTest {
    public ArrayList<Person> persons =new ArrayList<Person>();
   @Before
    public void setUp() {


                persons.add(new Person(1L,"Байда Илья Вадимович","79185551234"));
                persons.add(new Person(2L,"Истамов Аскар Зохитович","79185551233"));
                persons.add(new Person(3L,"Кириловский Сергей Владимирович","79185551232"));
                persons.add(new Person(5L,"Коджаев Шамиль Амил оглы","79185551231"));
                persons.add(new Person(4L,"Нешин Антон Сергеевич","79185551230"));
                persons.add(new Person(6L,"Орловский Николай Михайлович","79185551229"));
                persons.add(new Person(7L,"Павлов Иван Геннадьевич","79185551228"));
                persons.add(new Person(8L,"Романюта Александр Сергеевич","79185551227"));
                persons.add(new Person(9L,"Комягин Денис Михайлович","79185551226"));
                persons.add(new Person(9L,"Комягин Денис Михайлович","79185551226"));
                persons.add(new Person(10L,"Чернявский Александр Игоревич","79185551225"));
                persons.add(new Person(11L,"Шмалько Светлана Григорьевна","79185551224"));
                persons.add(new Person(12L,"Малеванный Михаил Сергеевич","79185551223"));
                persons.add(new Person(13L,"Малахова Елена Александровна","79185551222"));
                persons.add(new Person(14L,"Плешаков Владимир Владимирович","79185551221"));
                persons.add(new Person(15L,"Жовнир Екатерина Юрьевна","79185551220"));
                persons.add(new Person(16L,"Смолянинова Дарья Дмитриевна","79185551219"));

            }



    @Test
    public void array15(){
        assertNotNull(persons.get(15));
    }

    @Test
    public void hasNextTest(){
        MyIterator myIterator = new MyIterator(persons);
        assertNotNull(myIterator.hasNext());

    }
    @Test
    public void hasNextTest1(){
        MyIterator  myIterator = new MyIterator(persons);
        while (myIterator.hasNext()==true){
            myIterator.next();
        }
        assertFalse(myIterator.hasNext());

    }

    @Test
    public void myNextTest(){
        MyIterator  myIterator = new MyIterator(persons);
        assertNotNull(myIterator.next());

    }

}
