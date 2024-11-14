package predicate;

import org.junit.Test;

import java.time.ZonedDateTime;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-11-11
 * Time: 21:46
 */
public class PredicateTest {
    @Test
    public void test() {
        Predicate<String> predicate = new StringPredicate();
        System.out.println("predicate.test(\"\") = " + predicate.test(""));
    }

    @Test
    public void test2() {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s == null || s.isEmpty();
            }
        };
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("1"));
    }

    @Test
    public void test3() {
        Predicate<String> predicate = s -> s == null || s.isEmpty();
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("1"));
    }

    @Test
    public void test4() {
        Predicate<String> predicate = s -> s == null || s.isEmpty();
        System.out.println(predicate.negate().test(""));
        System.out.println(predicate.negate().test("1"));
    }

    @Test
    public void test5() {
        Predicate<String> predicate = s -> "aa".equals(s);
        Predicate<String> predicate2 = s -> "bb".equals(s);
        System.out.println(predicate.or(predicate2).test(""));
        System.out.println(predicate.or(predicate2).test("aa"));
    }

    @Test
    public void test6() {
        Predicate<String> predicate = s -> s != null && !s.isEmpty();
        Predicate<String> predicate2 = s -> s != null && s.chars().allMatch(Character::isDigit);
        System.out.println(predicate.and(predicate2).test(""));
        System.out.println(predicate.and(predicate2).test("123"));
    } 

    @Test
    public void test7() {
        System.out.println(ZonedDateTime.now());
    }

}
