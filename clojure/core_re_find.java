package clojure;

import clojure.lang.*;

public final class core_re_find extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "re-groups");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "re-matcher");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "re-find");
 }
 public core_re_find() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object re1, java.lang.Object s2) {
  {
   Object m3 = ((IFn)const__1.getRawRoot()).invoke(re1, s2);
   return ((IFn)const__2.getRawRoot()).invoke(m3);
  }
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  if (((java.util.regex.Matcher)m1).find()) {
   return ((IFn)const__0.getRawRoot()).invoke(m1);
  } else {
   return null;
  }
 }
}
