package clojure;

import clojure.lang.*;

public final class string_re_quote_replacement extends clojure.lang.AFunction {
 static {
 }
 public string_re_quote_replacement() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object replacement1) {
  return ((java.lang.String)java.util.regex.Matcher.quoteReplacement((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.Object)replacement1).toString()))));
 }
}
