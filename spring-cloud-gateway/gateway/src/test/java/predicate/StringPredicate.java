package predicate;

import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-11-11
 * Time: 21:44
 */

/**
 * 判断字符串是否为空
 * 空 - true
 * 非空 - false
 */
public class StringPredicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s == null || s.isEmpty();
    }
}
