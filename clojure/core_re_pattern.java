package clojure;

import clojure.lang.*;

public final class core_re_pattern extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)java.util.regex.Pattern.class;
 }
 public core_re_pattern() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  if ((s1 instanceof java.util.regex.Pattern)) {
   return s1;
  } else {
   return ((java.util.regex.Pattern)java.util.regex.Pattern.compile((java.lang.String)((java.lang.String)s1)));
  }
 }
}
