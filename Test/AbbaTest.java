import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Gavin on 3/23/17.
 */
public class AbbaTest {
    @Test
    public void HiByeByeHi() {
        assertThat(Abba.makeAbba("Hi", "Bye"), equalTo("HiByeByeHi"));
    }

    @Test
    public void YoAliceAliceYo() {
        assertThat(Abba.makeAbba("Yo", "ALice"), equalTo("YoALiceALiceYo"));
    }

    @Test
    public void WhatUpUpWhat() {
        assertThat(Abba.makeAbba("What", "Up"), equalTo("WhatUpUpWhat"));
    }

    @Test
    public void aaabbbbbbaaa() {
        assertThat(Abba.makeAbba("aaa", "bbb"), equalTo("aaabbbbbbaaa"));
    }
    @Test
    public void xyyx(){
        assertThat(Abba.makeAbba("x","y"), equalTo("xyyx"));
    }
    @Test
    public void xx(){
        assertThat(Abba.makeAbba("x",""), equalTo("xx"));
    }
    @Test
    public void yy(){
        assertThat(Abba.makeAbba("","y"), equalTo("yy"));
    }
    @Test
    public void BoYaYaBo(){
        assertThat(Abba.makeAbba("Bo","Ya"), equalTo("BoYaYaBo"));
    }
    @Test
    public void YaYaYaYa(){
        assertThat(Abba.makeAbba("Ya","Ya"), equalTo("YaYaYaYa"));
    }
}