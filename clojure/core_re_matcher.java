package clojure;

import clojure.lang.*;

public final class core_re_matcher extends clojure.lang.AFunction {
 static {
 }
 public core_re_matcher() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object re1, java.lang.Object s2) {
  return ((java.util.regex.Matcher)((java.util.regex.Pattern)re1).matcher((java.lang.CharSequence)((java.lang.CharSequence)s2)));
 }
}
