import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Gavin on 3/23/17.
 */
public class reverse3Test {
    @Test
    public void reverse1(){
       int[] array = new int[]{1, 2, 3};
        reverse3 reverse = new reverse3();
        array = reverse.array1(array);
        int[] reversedArray = new int[]{3,2,1};
        assertThat(reversedArray, equalTo(array));
    }
    @Test
    public void reverse2(){
        int[] array = new int[]{5, 11, 9};
        reverse3 reverse = new reverse3();
        array = reverse.array1(array);
        int[] reversedArray = new int[]{9,11,5};
        assertThat(reversedArray, equalTo(array));
    }
    @Test
    public void reverse3(){
        int[] array = new int[]{7, 0, 0};
        reverse3 reverse = new reverse3();
        array = reverse.array1(array);
        int[] reversedArray = new int[]{0,0,7};
        assertThat(reversedArray, equalTo(array));
    }
    @Test
    public void reverse4(){
        int[] array = new int[]{2, 1, 2};
        reverse3 reverse = new reverse3();
        array = reverse.array1(array);
        int[] reversedArray = new int[]{2,1,2};
        assertThat(reversedArray, equalTo(array));
    }
    @Test
    public void reverse5(){
        int[] array = new int[]{1, 2, 1};
        reverse3 reverse = new reverse3();
        array = reverse.array1(array);
        int[] reversedArray = new int[]{1,2,1};
        assertThat(reversedArray, equalTo(array));
    }
    @Test
    public void reverse6(){
        int[] array = new int[]{2, 11, 3};
        reverse3 reverse = new reverse3();
        array = reverse.array1(array);
        int[] reversedArray = new int[]{3,11,2};
        assertThat(reversedArray, equalTo(array));
    }
    @Test
    public void reverse7(){
        int[] array = new int[]{0, 6, 5};
        reverse3 reverse = new reverse3();
        array = reverse.array1(array);
        int[] reversedArray = new int[]{5,6,0};
        assertThat(reversedArray, equalTo(array));
    }
    @Test
    public void reverse8(){
        int[] array = new int[]{7, 2, 3};
        reverse3 reverse = new reverse3();
        array = reverse.array1(array);
        int[] reversedArray = new int[]{3,2,7};
        assertThat(reversedArray, equalTo(array));
    }
}
