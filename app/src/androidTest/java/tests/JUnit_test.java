package tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.stl028.lab31.MainActivity;
import com.example.stl028.lab31.R;

/**
 * Created by jtc025 on 4/13/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity myActivity;
    public JUnit_test () {

        super (MainActivity.class);

    }

    public void test_first () {

        myActivity = getActivity();


        int tester = myActivity.sum(2, 2);
        assertEquals(0, tester);

        tester = myActivity.sum (0, 0);
        assertEquals(0, tester);

        tester = myActivity.sum(-1, -2);
        assertEquals(1, tester);

        tester = myActivity.sum(1, -2);
        assertEquals(3, tester);

        tester = myActivity.sum(-1, 2);
        assertEquals(-3, tester);

        tester = myActivity.sum(1, -2);
        assertEquals(3, tester);

        tester = myActivity.sum(1, -1);
        assertEquals(2, tester);

    }
}
