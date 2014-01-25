package clojure;

import clojure.lang.*;

public final class core_re_matches extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "re-matcher");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "re-groups");
 }
 public core_re_matches() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object re1, java.lang.Object s2) {
  {
   Object m3 = ((IFn)const__0.getRawRoot()).invoke(re1, s2);
   if (((java.util.regex.Matcher)m3).matches()) {
    return ((IFn)const__1.getRawRoot()).invoke(m3);
   } else {
    return null;
   }
  }
 }
}
